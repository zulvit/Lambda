public class Main {
    public static void main(String[] args) {
        //region ISqrt interface
        //Non lambda
        ISqrt iSqrt = new ISqrt() {
            @Override
            public double sqrt(int n) {
                return Math.sqrt(n);
            }
        };
        System.out.println("iSqrt = " + iSqrt.sqrt(64));

        //With lambda
        ISqrt iSqrt1 = Math::sqrt;
        System.out.println("iSqrt1 = " + iSqrt1.sqrt(64));
        //endregion

        //region ISum interface
        //Non lambda
        ISum iSum = new ISum() {
            @Override
            public int sum(int a, int b) {
                if (a == 5 && b == 5) return 0;
                return a + b;
            }
        };
        System.out.println("iSum = " + iSum.sum(5, 5));
        System.out.println("iSum = " + iSum.sum(11, 32));

        ISum iSum1 = (a, b) -> {
            if (a == 5 && b == 5) return 0;
            return a + b;
        };

        System.out.println("iSum1 = " + iSum1.sum(5, 5));
        System.out.println("iSum1 = " + iSum1.sum(11, 32));
        //endregion
    }
}

@FunctionalInterface
interface ISqrt {
    double sqrt(int n);
}

@FunctionalInterface
interface ISum {
    int sum(int a, int b);
}
