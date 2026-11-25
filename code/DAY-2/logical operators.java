class LogicalOperators {
    public static void main(String[] args) {
        boolean hasRegistration = true;
        boolean hasPaidFees = true;

        System.out.println("Can attend exam: " + (hasRegistration && hasPaidFees));
    }
}
