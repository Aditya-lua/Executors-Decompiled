/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b1f0..0xa7b248 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c7c2eb;

unsigned long long * sub_a7b1f0(unsigned long a0, unsigned long a1)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(200, "crypto/self_test_core.c", 92);
    if (!v2)
        return v2;
    v2[24] = a1;
    *v2 = &g_c7c2eb;
    v2[1] = &g_c7c2eb;
    v2[2] = &g_c7c2eb;
    v2[3] = a0;
    sub_a7b248();
    return v2;
}
