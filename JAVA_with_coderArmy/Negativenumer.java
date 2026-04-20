public class Negativenumer {
    /**
     * ============================================================================================
     * 🚀 JAVA ADVANCED CORE: MEMORY ARCHITECTURE OF NEGATIVE NUMBERS, FLOAT &
     * DOUBLE
     * ============================================================================================
     * * * 🎓 REAL-WORLD ANALOGY:
     * Socho tum ek dukaan me ho.
     * 'int' wale items (biscuit, chocolate) poore-poore gine jate hain (1, 2, 3).
     * Lekin 'float' aur 'double' wale items (chini, dal) kilo aur grams me tulte
     * hain (1.5 kg).
     * Memory me "poore number" (integers) aur "point wale number" (floating-point)
     * ko store
     * karne ka dibba (format) aur machine (logic) ekdum alag hota hai!
     * *
     * ============================================================================================
     * 📌 TOPIC 1: NEGATIVE NUMBERS KAISE STORE HOTE HAIN? (The Sign Bit Magic)
     * ============================================================================================
     * Computer ko sirf 0 aur 1 samajh aata hai. Uske paas koi minus (-) ka sign
     * nahi hota.
     * Toh negative numbers ko pehchanne ke liye wo "Sign Bit" ka use karta hai.
     * * 👉 MSB (Most Significant Bit):
     * Kisi bhi binary number ka sabse pehla bit (left-most bit) uski 'Sign Bit'
     * hoti hai.
     * - Agar MSB '0' hai = Number POSITIVE (+) hai.
     * - Agar MSB '1' hai = Number NEGATIVE (-) hai.
     * * 👉 Example in byte (8 bits):
     * Positive 5 : [0]000 0101 (Pehla bit 0 hai)
     * Negative 5 : [1]111 1011 (Ye 5 ka Two's Complement hai, aur pehla bit 1 hai)
     * * Rule: Computer directly negative number store nahi karta. Wo us positive
     * number ka
     * "Two's Complement" (Invert bits + 1) nikal kar store karta hai.
     * *
     * ============================================================================================
     * 📌 TOPIC 2: FLOAT AUR DOUBLE KAISE STORE HOTE HAIN? (The IEEE 754 Standard)
     * ============================================================================================
     * Ye sabse mind-blowing concept hai. Float aur double normal binary ki tarah
     * store nahi hote!
     * Ye "IEEE 754 Standard" naam ka ek international formula use karte hain.
     * * 💡 ANALOGY (Scientific Notation):
     * Bachpan me math me padha tha: 1234.5 ko hum 1.2345 x 10^3 likh sakte hain.
     * Computer bhi decimal point ko "float" (tairna / shift karna) karwata hai.
     * Jise binary me likhte hain: 1.XXXX x 2^Y.
     * * Float (32 bits / 4 bytes) aur Double (64 bits / 8 bytes) ke dibbe ko 3
     * hisso me baanta jata hai:
     * * 1️⃣ SIGN BIT (1 bit):
     * Batata hai number positive (0) hai ya negative (1).
     * * 2️⃣ EXPONENT (Power of 2):
     * Float me 8 bits, Double me 11 bits.
     * Ye batata hai ki decimal point kitna aage ya pichhe shift hua hai (10^3 me
     * jaise '3' hai).
     * * 3️⃣ MANTISSA / FRACTION (Asli data):
     * Float me 23 bits, Double me 52 bits.
     * Ye point ke baad wali actual values ko store karta hai.
     * * 👉 Float (32 bit) ka structure:
     * [ 1 bit Sign ] + [ 8 bits Exponent ] + [ 23 bits Mantissa ]
     * * 👉 Double (64 bit) ka structure:
     * [ 1 bit Sign ] + [ 11 bits Exponent ] + [ 52 bits Mantissa ]
     * * (Note: Double ke paas Mantissa ke liye 52 bits hote hain, isliye double
     * 'float' se
     * zyada accurate aur precise hota hai).
     * *
     * ============================================================================================
     * 📌 TOPIC 3: THE BIGGEST INTERVIEW TRAP (Precision Loss)
     * ============================================================================================
     * Interviewer puchega: "Kya hum float ya double ko Bank ya Money calculation me
     * use kar sakte hain?"
     * TUMHARA ANSWER: "NO Sir! Bilkul nahi."
     * * 👉 Kyu? (The 0.1 + 0.2 Issue):
     * Math me 0.1 + 0.2 = 0.3 hota hai.
     * Par Java me double 0.1 + double 0.2 = 0.30000000000000004 hota hai! 🤯
     * * 👉 Reason (Memory Architecture Level):
     * Jaise 10 ko 3 se divide karne par decimal me 3.333333... aata hi rehta hai
     * (kabhi khatam nahi hota).
     * Waise hi, decimal ke kuch number (jaise 0.1) binary me fractions (1/2, 1/4,
     * 1/8) me perfectly
     * divide nahi ho paate. Unka binary representation infinite (chalta hi rehta)
     * hota hai.
     * Par computer ki memory (32-bit ya 64-bit) limited hai, to wo aage se usko
     * kaat deta hai (round off).
     * Isi rounding off ki wajah se exact calculation me gadbadi aati hai!
     * * (Tip: Banking calculations ke liye Java me hamesha 'BigDecimal' class use
     * karte hain, float/double nahi).
     * ============================================================================================
     */

    public static void main(String[] args) {

        System.out.println("\n=== 1. NEGATIVE NUMBER (Memory Representation) ===");
        int positiveNum = 5;
        int negativeNum = -5;
        // Integer.toBinaryString memory me store hue exact 0s and 1s dikhata hai
        System.out.println("Positive 5 Binary : 000000000000000000000000000" + Integer.toBinaryString(positiveNum));
        System.out.println("Negative 5 Binary : " + Integer.toBinaryString(negativeNum));
        System.out.println("(Dhyan se dekho, negative number 1 se start ho raha hai! Yahi MSB hai)");

        System.out.println("\n=== 2. FLOAT IN MEMORY (IEEE 754 Standard Proof) ===");
        float myFloat = 10.5f;
        // Ye function float ko memory me jis binary format me store kiya gaya hai, wo
        // nikalta hai
        int floatMemoryBits = Float.floatToIntBits(myFloat);
        String floatBinary = Integer.toBinaryString(floatMemoryBits);

        System.out.println("Float Number: " + myFloat);
        System.out.println("Raw Binary in Memory (Sign + Exponent + Mantissa): ");
        // Zero padding for 32 bit visual
        System.out.println(String.format("%32s", floatBinary).replace(' ', '0'));

        System.out.println("\n=== 3. THE INTERVIEW TRAP (Precision Loss) ===");
        double val1 = 0.1;
        double val2 = 0.2;
        double sum = val1 + val2;

        System.out.println("Math says: 0.1 + 0.2 = 0.3");
        System.out.println("Java says: 0.1 + 0.2 = " + sum);
        System.out.println(
                "Conclusion: Float/Double memory me rounding-off karte hain. Money ke liye inhe use mat karna!");
        System.out.println(
                "--------------------------------------------------------------------------------------\n");
    }
}
