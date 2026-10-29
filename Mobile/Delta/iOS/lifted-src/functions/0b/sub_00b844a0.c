/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb844a0..0xb8450c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b7df8c;
extern unsigned long long g_b7e020;
extern long long g_cb8a62;

long long sub_b844a0(unsigned long long *a0, long long *a1)
{
    unsigned long v14;  // x8
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = *a0;
    v0 = v14;
    v1 = &g_b7df8c;
    v2 = v14 + 88;
    v3 = &g_b7df8c;
    v4 = v14 + 176;
    v5 = &g_b7df8c;
    v6 = v14 + 24;
    v7 = &g_b7e020;
    v8 = v14 + 112;
    v9 = &g_b7e020;
    v10 = v14 + 200;
    v11 = &g_b7e020;
    return sub_be769c(*a1, a1[1], &g_cb8a62, &v0);
}
