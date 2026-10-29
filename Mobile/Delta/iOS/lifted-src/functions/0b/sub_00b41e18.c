/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41e18..0xb41e2c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_eeb3e0;

unsigned int sub_b41e18(unsigned int a0)
{
    if (a0 & 3)
        return &g_eeb3e0;
    return 0;
}
