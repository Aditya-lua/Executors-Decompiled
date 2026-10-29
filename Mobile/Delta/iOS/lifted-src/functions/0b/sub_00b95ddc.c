/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb95ddc..0xb95e18 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_b7a7fc;
extern long long g_cb8c58;

long long sub_b95ddc(unsigned long long *a0, long long *a1)
{
    unsigned long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = *a0;
    v1 = &g_b7a7fc;
    return sub_be769c(*a1, a1[1], &g_cb8c58, &v0);
}
