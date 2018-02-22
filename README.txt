Based on microservice principles, we nee to have
separate micro services for each functionality
that can function independently.

    *   Booking Service
    *   User Service
    *   Restaurant service

The idea is to make them independent,
in


We can summariae the functionalities of thse services as:

    *   Restaurant service: This service provides the functionality
        for the Restaurant resource - CRUD opration and
        searching based on criteria.  It provides the
        association between restarurants and tables.
        Restauran would also provide the access to
        the Table entity.

    *   User service:  This service, as the name suggests, allows
        the end user to perform CRUD operations on booking.
        It would use the Restaurant searching, its
        associated tables lookup and allocation based on
        table availablility for a specific time duration.
        It creates the relationshp between the Restuarant
        /Table and the user


        Service Registration and Discovery
        |
        |
        |
        |<------> RestaurantService
        |
        |
        |<------> User Service
        |
        |
        |
        |<-------> Booking Service






