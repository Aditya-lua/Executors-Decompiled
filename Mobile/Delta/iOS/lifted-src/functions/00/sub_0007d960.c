/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d960..0x7d994 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7d960(unsigned long long a0, unsigned int *a1)
{
    unsigned long long v0;  // 4124

    if ((unsigned int)a0)
        return a0;
    v0 = arm64g_calculate_condition(33, a1[6] - 6, 3, 0);
    if (!(v0 & 1))
    {
        return 2;
    }
    else if (14 < *a1)
    {
        return 1;
    }
    else
    {
        return 2;
    }
}
