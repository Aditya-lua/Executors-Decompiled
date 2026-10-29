/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e2c4..0x98e304 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_98e2c4(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v0;  // 4102

    if (*a1 > *a0)
        return 0xffffffff;
    v0 = arm64g_calculate_condition(148, *a0, *a1, 0);
    if (!(v0 & 1))
    {
        return 1;
    }
    else if (a0[1] < a1[1])
    {
        return 0xffffffff;
    }
    else
    {
        return a0[1] > a1[1];
    }
}
