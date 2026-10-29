/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6dd0c..0xa6dd34 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_def588[4];

unsigned int sub_a6dd0c(unsigned int a0)
{
    if (54 < a0 - 48)
        return 0xffffffff;
    return g_def588[a0 - 48 & 0xff];
}
