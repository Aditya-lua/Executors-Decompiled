/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaae6d8..0xaae854 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f090a0;
extern long long g_f090f8;
extern long long g_f09150;

long long sub_aae6d8(unsigned long a0, long long a1, long long a2, unsigned int a3)
{
    unsigned long v5;  // x19
    unsigned long v6;  // x20
    unsigned long v7;  // x21
    unsigned long v8;  // x25
    unsigned long v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    v5 = sub_ad61b4();
    v6 = sub_ad61b4(v5);
    v7 = sub_ad61b4(v6);
    v8 = 0;
    if (a0 && v5 && v6 && v7)
    {
        sub_ab1ac4(a0, &v1, &v0, &v2);
        sub_ab1f90(a0, v5, v6, v7);
        if (sub_a6fa7c(a1, a2, "n", v1) && sub_a6fa7c(a1, a2, "e", v0) && (!a3 || !v2 || sub_a6fa7c(a1, a2, "d") && sub_a6fad0(a1, a2, &g_f090a0, v5) && sub_a6fad0(a1, a2, &g_f090f8, v6) && sub_a6fad0(a1, a2, &g_f09150, v7)))
            v8 = 1;
        else
            v8 = 0;
    }
    sub_ad6020(v5);
    sub_ad6020(v6);
    sub_ad6020(v7);
    return v8;
}
