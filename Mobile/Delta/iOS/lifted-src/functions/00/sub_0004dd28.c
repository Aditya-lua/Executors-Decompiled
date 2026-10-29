/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dd28..0x4dd64 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_4dd28(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4102

    v0 = 14757395258967641293 * ((long long)(a0[1] - *a0) >> 3);
    if (a1 <= v0)
    {
        v1 = arm64g_calculate_condition(36, a1, v0, 0);
        if (v1 & 1)
            return a0;
    }
}
