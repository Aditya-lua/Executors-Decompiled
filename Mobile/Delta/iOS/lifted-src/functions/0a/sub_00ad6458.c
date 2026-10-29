/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad6458..0xad64b4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ad6458(unsigned long a0, unsigned long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/stack/stack.c", 250, "OPENSSL_sk_reserve");
        sub_a36abc(15, 0xc0102, 0);
        return 0;
    }
    else if (a1 >> 31 & 1)
    {
        return 1;
    }
}
