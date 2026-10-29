/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa8097c..0xa809e8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_7fc001;

unsigned long long sub_a8097c(unsigned long long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w12
    unsigned int v2;  // w10
    unsigned long long v3;  // 4135
    unsigned int v4;  // w11

    *a1 = (unsigned int)a0 >> 13;
    v0 = (unsigned int)a0 & 0x1fff;
    *a2 = v0;
    if (0x1000 < v0)
        v1 = 0;
    else
        v1 = 0xffffffff;
    v2 = *a1;
    v3 = arm64g_calculate_condition(147, v0, 0x1000, 0);
    if (v3 & 1)
        v4 = 0;
    else
        v4 = 0xffffffff;
    *a2 = v1 & v0 | v4 & (0 & ((unsigned int)a0 | 0xffffe000) | 0xffffffff & &(&g_7fc001)[v0]);
    *a1 = *a1 & v1 | v4 & v2 + 1;
    return a0;
}
