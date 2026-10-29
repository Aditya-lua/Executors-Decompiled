/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4931c..0x49350 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f90;
extern char g_f00f98;
extern unsigned int g_f0c94c;

long long sub_4931c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f98 & 1))
    {
        g_f00f98 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f90 = g_f0c94c;
    }
    return v0;
}
