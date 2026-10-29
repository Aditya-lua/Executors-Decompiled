/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb81a2c..0xb81a68 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b81964;
extern long long g_cba0a6;

long long sub_b81a2c(unsigned long long *a0, long long *a1)
{
    unsigned long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = *a0;
    v1 = &g_b81964;
    return sub_be769c(*a1, a1[1], &g_cba0a6, &v0);
}
