/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d884..0xb3d898 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_ee9818;

unsigned int sub_b3d884(unsigned int a0)
{
    if (a0 & 1)
        return &g_ee9818;
    return 0;
}
