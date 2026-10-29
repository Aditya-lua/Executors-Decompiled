/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfc140..0xbfc164 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bfc140(unsigned long a0, unsigned long a1)
{
    unsigned long long v0;  // 4112

    if (!a1)
        return;
    v0 = arm64g_calculate_condition(2, a1 * 0x11, 25, 0);
    if (v0 & 1)
        return;
}
