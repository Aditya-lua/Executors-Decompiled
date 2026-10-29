/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb1d4b4..0xb1d53c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b23e3c;

unsigned long long sub_b1d4b4(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long long a6)
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
        v2 = &g_b23e3c;
        v0 = a6;
        return (unsigned int)sub_b22848();
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1633, "slh_dsa_shake_192f_to_PrivateKeyInfo_pem_encode");
    sub_a36abc(57, 0x80106, 0);
    return 0;
}
