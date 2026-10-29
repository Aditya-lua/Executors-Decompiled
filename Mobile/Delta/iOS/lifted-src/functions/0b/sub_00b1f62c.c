/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1f62c..0xb1f6b4 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b1f62c(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long long a6)
{
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a3 && a4 & 1)
    {
        v1 = 0;
        v2 = "B";
        v0 = a6;
        return (unsigned int)sub_b22848();
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1680, "ml_kem_1024_to_PrivateKeyInfo_pem_encode");
    sub_a36abc(57, 0x80106, 0);
    return 0;
}
