package app.mappers.dto;

public class OrganizationRoleDTO {
    private String id;
    private String description;

    public OrganizationRoleDTO(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("•%s", this.description);
    }
}
