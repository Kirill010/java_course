package mirea.seasons;

public enum seasons
{
    Summer(30) {
        @Override
        public String getDescription()
        {
            return "Теплое время года";
        }
    },
    Winter(-2),
    Autumn(10),
    Spring(17);
    private int temp;

    seasons(int temp)
    {
        this.temp = temp;
    }
    public int gettemp()
    {
        return temp;
    }

    public String getDescription()
    {
        return "Холодное время года";
    }
}