/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb20270..0xb203bc (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b22c7c;
extern unsigned long long g_b22d98;
extern unsigned long long g_b22d9c;

unsigned int sub_b20270(long long *a0, unsigned long a1, unsigned int a2, unsigned long a3, unsigned long long a4, unsigned long a5, unsigned long long a6)
{
    long long v5;  // x1
    unsigned int v6;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a3)
    {
LABEL_b20288:
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1702, "dsa_to_DSA_der_encode");
        v5 = 524550;
    }
    else
    {
        if (a4 & 1)
        {
            v1 = &g_b22c7c;
            v2 = &g_b22d98;
            v0 = a6;
            return sub_b22848();
        }
        if (a4 >> 1 & 1)
        {
            v1 = &g_b22c7c;
            v2 = &g_b22d9c;
            v0 = a6;
            return sub_b22848();
        }
        if (!((unsigned int)a4 & 132))
            goto LABEL_b20288;
        if (a2)
        {
            if (sub_afd760(*a0))
                v6 = sub_b229b8();
            else
                v6 = 0;
            sub_9d3c28();
            return v6;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1214, "key2any_encode");
        v5 = 786690;
    }
    sub_a36abc(57, v5, 0);
    return 0;
}
