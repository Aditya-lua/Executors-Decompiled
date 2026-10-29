/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e428..0x1e44c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_1e428(unsigned int *a0)
{
    unsigned long long v0;  // 4118
    unsigned long long v1;  // 4121

    v0 = arm64g_calculate_condition(1, *a0, 1, 0);
    if (v0 & 1)
    {
        v1 = arm64g_calculate_condition(1, a0[1], 1, 0);
        return !(v1 & 1);
    }
    return 1;
}
