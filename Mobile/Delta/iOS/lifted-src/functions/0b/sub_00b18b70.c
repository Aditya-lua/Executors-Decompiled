/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb18b70..0xb18c04 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b238c4;
extern unsigned long long g_b239b8;

unsigned long long sub_b18b70(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long long a6)
{
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a3 && a4 & 1)
    {
        v1 = &g_b238c4;
        v2 = &g_b239b8;
        v0 = a6;
        return (unsigned int)sub_b22848();
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1532, "dhx_to_PrivateKeyInfo_der_encode");
    sub_a36abc(57, 0x80106, 0);
    return 0;
}
