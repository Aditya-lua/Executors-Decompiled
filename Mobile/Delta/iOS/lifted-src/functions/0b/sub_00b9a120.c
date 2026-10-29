/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9a120..0xb9a148 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b9a120(unsigned long a0, unsigned long a1)
{
    unsigned long long v0;  // 4118

    if (!a1)
        return;
    v0 = arm64g_calculate_condition(2, a1 + (a1 * 4 + 11 & 0xfffffffffffffff8), 9, 0);
    if (v0 & 1)
        return;
}
