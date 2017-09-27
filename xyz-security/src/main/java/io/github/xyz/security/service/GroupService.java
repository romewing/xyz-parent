package io.github.xyz.security.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.provisioning.GroupManager;

import java.util.List;

public class GroupService implements GroupManager {
    @Override
    public List<String> findAllGroups() {
        return null;
    }

    @Override
    public List<String> findUsersInGroup(String groupName) {
        return null;
    }

    @Override
    public void createGroup(String groupName, List<GrantedAuthority> authorities) {

    }

    @Override
    public void deleteGroup(String groupName) {

    }

    @Override
    public void renameGroup(String oldName, String newName) {

    }

    @Override
    public void addUserToGroup(String username, String group) {

    }

    @Override
    public void removeUserFromGroup(String username, String groupName) {

    }

    @Override
    public List<GrantedAuthority> findGroupAuthorities(String groupName) {
        return null;
    }

    @Override
    public void addGroupAuthority(String groupName, GrantedAuthority authority) {

    }

    @Override
    public void removeGroupAuthority(String groupName, GrantedAuthority authority) {

    }
}
