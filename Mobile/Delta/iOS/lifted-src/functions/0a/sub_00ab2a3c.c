/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2a3c..0xab2acc (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab2a3c(unsigned long a0, unsigned int a1, unsigned long a2, unsigned int a3)
{
    long long v2;  // x1
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a3 > (int)a1)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_none.c", 24, "RSA_padding_add_none");
        v2 = 110;
    }
    else
    {
        v3 = arm64g_calculate_condition(163, a3, a1, 0);
        if (v3 & 1)
        {
            _memcpy();
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_none.c", 29, "RSA_padding_add_none");
        v2 = 122;
    }
    sub_a36abc(4, v2, 0);
    return 0;
}
