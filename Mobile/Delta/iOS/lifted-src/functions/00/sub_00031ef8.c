/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31ef8..0x31f20 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_31ef8(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4102

    v0 = a0[1] - *a0;
    if (a1 <= v0)
    {
        v1 = arm64g_calculate_condition(36, a1, v0, 0);
        if (v1 & 1)
            return a0;
    }
}
