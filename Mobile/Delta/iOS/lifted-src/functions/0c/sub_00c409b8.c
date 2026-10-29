/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc409b8..0xc40a18 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c409b8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_c409b8_0;

extern unsigned long long g_be766c;
extern unsigned long long g_bea8ec;
extern long long g_cbaf23;

long long sub_c409b8(st_c409b8_0 **a0, long long *a1)
{
    unsigned long long *v10;  // x8
    unsigned long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = &*a0->field_0;
    v0 = *v10;
    v1 = v10[1];
    v2 = &v0;
    v3 = &g_be766c;
    v4 = v10 + 2;
    v5 = &g_bea8ec;
    v6 = (char *)&v10[2] + 4;
    v7 = &g_bea8ec;
    return sub_be769c(*a1, a1[1], &g_cbaf23, &v2);
}
