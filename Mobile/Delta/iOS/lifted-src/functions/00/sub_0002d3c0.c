/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d3c0..0x2d3f4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_cbe860;

int sub_2d3c0(unsigned int a0)
{
    if (82 < a0 - 7)
        return 1;
    goto *((void *)(sub_2d3e8 + *(&(&g_cbe860)[a0] - 7) * 4));
}
