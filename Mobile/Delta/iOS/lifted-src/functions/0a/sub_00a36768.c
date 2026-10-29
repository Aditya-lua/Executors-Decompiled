/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36768..0xa36784 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a36768(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v1;  // 4106
    unsigned long long v2;  // 4106

    if (*a1 < *a0)
    {
        v1 = arm64g_calculate_condition(4, *a0, *a1, 0);
        if (!(v1 & 1))
            return 1;
    }
    else
    {
        v2 = arm64g_calculate_condition(4, *a0, *a1, 0);
        if (!(v2 & 1))
            return 0xfffffffe;
    }
    return 0;
}
