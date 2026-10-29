/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e0c4..0xb3e0d8 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_ee9c70;

unsigned int sub_b3e0c4(unsigned int a0)
{
    if (a0 & 3)
        return &g_ee9c70;
    return 0;
}
