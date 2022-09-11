package com.app.integrations.entities;

public class Wand
{
    private String wood;
    private String core;
    private Integer length;

    public Wand() {}

    public Wand( String wood, String core, Integer length )
    {
        this.wood = wood;
        this.core = core;
        this.length = length;
    }

    public String getWood()
    {
        return wood;
    }

    public void setWood( String wood )
    {
        this.wood = wood;
    }

    public String getCore()
    {
        return core;
    }

    public void setCore( String core )
    {
        this.core = core;
    }

    public Integer getLength()
    {
        return length;
    }

    public void setLength( Integer length )
    {
        this.length = length;
    }
}
