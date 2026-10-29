/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c460c..0x1c4648 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_1c460c(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4102

    v0 = 12297829382473034411 * ((long long)(a0[1] - *a0) >> 3);
    if (a1 <= v0)
    {
        v1 = arm64g_calculate_condition(36, a1, v0, 0);
        if (v1 & 1)
            return a0;
    }
}
