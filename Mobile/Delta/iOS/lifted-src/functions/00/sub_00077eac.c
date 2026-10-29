/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77eac..0x77eb8 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_77eac(unsigned long long a0)
{
    unsigned long long v0;  // 4111

    v0 = arm64g_calculate_condition(50, a0, 0x77, 0);
    if (!(v0 & 1))
        return -(unsigned int)a0;
    return 0;
}
