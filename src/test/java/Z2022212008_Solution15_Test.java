public class Z2022212008_Solution15_Test {

    public static void main(String[] args) {
        Solution15 solution = new Solution15();

        // 测试用例1：版本1大于版本2  
        String version1 = "1.2.3.4";
        String version2 = "1.2.3";
        int result = solution.compareVersion(version1, version2);
        System.out.println("Test Case 1: " + (result == 1 ? "Passed" : "Failed")); // 预期结果为1  

        // 测试用例2：版本1小于版本2  
        version1 = "1.0";
        version2 = "1.0.1";
        result = solution.compareVersion(version1, version2);
        System.out.println("Test Case 2: " + (result == -1 ? "Passed" : "Failed")); // 预期结果为-1  

        // 测试用例3：版本1等于版本2
        version1 = "1.2.3";
        version2 = "1.2.3";
        result = solution.compareVersion(version1, version2);
        System.out.println("Test Case 3: " + (result == 0 ? "Passed" : "Failed")); // 预期结果为0  

        // 测试用例4：版本1的段数少于版本2，但前面的段都相等且后面的段（版本1视为0）小于版本2  
        version1 = "1.0";
        version2 = "1.0.0.1";
        result = solution.compareVersion(version1, version2);
        System.out.println("Test Case 4: " + (result == -1 ? "Passed" : "Failed")); // 预期结果为-1  

        // 测试用例5：版本1的段数多于版本2，但前面的段都相等且版本1多出的段大于0（版本2视为0的段）  
        version1 = "1.2.3.4";
        version2 = "1.2.3";
        result = solution.compareVersion(version1, version2);
        System.out.println("Test Case 5: " + (result == 1 ? "Passed" : "Failed")); // 预期结果为1（与测试用例1重复，但为了完整性再次列出）  

        // 可以添加更多测试用例以覆盖更多情况  
    }

}
