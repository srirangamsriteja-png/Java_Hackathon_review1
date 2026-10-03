class Waterconsumptionmethod {
    int Calculatetotal(int morningusage, int eveningusage) {
        return morningusage + eveningusage;
    }

    public static void main(String args[]) {
        Waterconsumptionmethod obj = new Waterconsumptionmethod();
        int total = obj.Calculatetotal(20, 30);
        System.out.println(total);
    }
}