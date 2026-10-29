/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c71a0..0x9c7260 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9c71a0(void* a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned int a4, long long a5)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4112
    long long v4;  // x1
    unsigned int v5;  // w10
    void* v6;  // x9
    unsigned long long v7;  // 4133
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)a0;
    if (!a5 && !(v3 = arm64g_calculate_condition(1, v2, 1, 0), v3 & 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/asn1_gen.c", 475, "append_exp");
        v4 = 179;
    }
    else
    {
        v5 = (int)a0[504];
        if (v5 == 20)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/asn1_gen.c", 480, "append_exp");
            v4 = 174;
        }
        else
        {
            v6 = a0 + v5 * 24;
            *(unsigned int *)&a0[504] = v5 + 1;
            v7 = arm64g_calculate_condition(1, v2, 1, 0);
            if (!(v7 & 1))
            {
                a2 = (int)a0[4];
                *(unsigned long *)a0 = 0xffffffffffffffff;
                a1 = v2;
            }
            *(unsigned int *)&v6[24] = a1;
            *(unsigned int *)&v6[28] = a2;
            *(unsigned int *)&v6[32] = a3;
            *(unsigned int *)&v6[36] = a4;
            return 1;
        }
    }
    sub_a36abc(13, v4, 0);
    return 0;
}
