/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb96074..0xb960d0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_be766c;
extern long long g_cba67f;
extern unsigned long long g_e0dff0[4];
extern unsigned long long g_efd8d0[4];

long long sub_b96074(char *a0, long long *a1)
{
    unsigned long idx;  // x8
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    idx = *a0;
    v0 = g_efd8d0[idx];
    v1 = g_e0dff0[idx];
    v2 = &v0;
    v3 = &g_be766c;
    return sub_be769c(*a1, a1[1], &g_cba67f, &v2);
}
