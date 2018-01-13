package io.thirdplanet.reservation_monster.repo_interfaces;

/**
 * Created by mikeyb on 1/13/18.
 */
public interface Repository<TE,T> extends ReadOnlyRepository {
    void add(TE entity);
    void remove(T id);
    void update(TE entity);
}
