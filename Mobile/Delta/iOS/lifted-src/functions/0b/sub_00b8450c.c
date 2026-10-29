/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8450c..0xb8456c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b7df8c;
extern unsigned long long g_b7e020;
extern long long g_cb8aa1;

long long sub_b8450c(unsigned long long *a0, long long *a1)
{
    unsigned long v12;  // x8
    unsigned long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = *a0;
    v0 = v12 + 128;
    v1 = &g_b7df8c;
    v2 = v12 + 152;
    v3 = &g_b7e020;
    v4 = v12 + 64;
    v5 = &g_b7e020;
    v6 = v0;
    v7 = &g_b7df8c;
    v8 = v12;
    v9 = &g_b7e020;
    return sub_be769c(*a1, a1[1], &g_cb8aa1, &v0);
}
