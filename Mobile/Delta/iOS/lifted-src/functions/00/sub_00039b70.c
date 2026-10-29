/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39b70..0x39b9c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_39b70(unsigned long long *a0, long long a1)
{
    long long v0;  // x8
    unsigned long long v1;  // 4102

    v0 = (long long)(a0[1] - *a0) >> 4;
    if ((unsigned long long)a1 <= (unsigned long long)v0)
    {
        v1 = arm64g_calculate_condition(36, a1, v0, 0);
        if (v1 & 1)
            return a0;
    }
}
