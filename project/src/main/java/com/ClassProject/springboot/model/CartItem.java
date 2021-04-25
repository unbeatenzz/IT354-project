package com.ClassProject.springboot.model;

public class CartItem {
    private Integer id;

    private Integer cartid;

    private Integer productid;

    private Integer productquantity;

    private Double val;

    private String image;

    private String itemtitle;

    public String getItemtitle(){return itemtitle;}

    public void setItemTitle(String itemTitle){this.itemtitle = itemTitle;}

    public String getImage(){return image;}

    public void setImage(String image){
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getProductquantity() {
        return productquantity;
    }

    public void setProductquantity(Integer productquantity) {
        this.productquantity = productquantity;
    }

    public Double getVal() {
        return val;
    }

    public void setVal(Double val) {
        this.val = val;
    }
}