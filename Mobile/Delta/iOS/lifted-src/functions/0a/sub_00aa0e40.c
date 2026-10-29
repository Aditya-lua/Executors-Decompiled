/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0e40..0xaa0f38 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa0e40(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, unsigned long a8, unsigned long long a9, unsigned long long a10)
{
    long long v6;  // x0
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    long long v3;  // [bp-0x4c]
    long long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]

    v5 = &a8;
    if (!a0)
    {
        v4 = 0;
        v3 = 0;
    }
    else if (!sub_aa23b4())
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_key.c", 62, "PKCS12_key_gen_utf8_ex");
        sub_a36abc(35, 0x80023, 0);
        return 0;
    }
    v1 = a9;
    v2 = a10;
    v0 = a8;
    v6 = sub_aa0c5c();
    sub_a6c4e8(v4, v3, "crypto/pkcs12/p12_key.c", 67);
    return v6;
}
