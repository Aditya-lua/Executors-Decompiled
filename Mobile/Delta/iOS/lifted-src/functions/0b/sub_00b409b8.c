/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb409b8..0xb409cc (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_eeab30;

unsigned int sub_b409b8(unsigned int a0)
{
    if (a0 & 3)
        return &g_eeab30;
    return 0;
}
