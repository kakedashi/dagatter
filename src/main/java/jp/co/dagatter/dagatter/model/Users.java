package jp.co.dagatter.dagatter.model;

public class Users {
    private String id;
    private String name;
    private String imageUrl;

    public Users(String id, String name, String imageUrl) {
        setId(id);
        setName(name);
        setImageUrl(imageUrl);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
