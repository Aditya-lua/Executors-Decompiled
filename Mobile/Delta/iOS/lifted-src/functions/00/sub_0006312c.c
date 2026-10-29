/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6312c..0x63138 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_6312c(unsigned int a0)
{
    unsigned long long v0;  // 4116

    v0 = arm64g_calculate_condition(1, a0, 1, 0);
    if (!(v0 & 1))
        return a0;
    return 0;
}
