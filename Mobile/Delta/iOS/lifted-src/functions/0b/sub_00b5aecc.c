/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5aecc..0xb5af9c (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfe75c;
extern long long g_dfe767;
extern long long g_dfe772;

unsigned long long sub_b5aecc(long long a0, long long a1, long long a2)
{
    long long v2;  // x21
    long long v3;  // x21
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a80970(a2);
    if (!sub_a6e200(v2, "ML-DSA-44"))
    {
        v3 = &g_dfe75c;
    }
    else if (sub_a6e200(v2, "ML-DSA-65"))
    {
        if (sub_a6e200(v2, "ML-DSA-87"))
            return 0;
        v3 = &g_dfe772;
    }
    else
    {
        v3 = &g_dfe767;
    }
    v4 = sub_c68640(a0, a1);
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_c68354(a0, 0xffffffff, v3, 11);
    if (!(unsigned int)v5)
        return v5;
    return sub_a69b58(a0, a1) != 0;
}
