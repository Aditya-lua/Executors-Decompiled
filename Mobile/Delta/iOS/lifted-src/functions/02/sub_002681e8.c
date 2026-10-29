/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2681e8..0x26821c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00de0;
extern char g_f00de8;
extern unsigned int g_f0c948;

long long sub_2681e8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00de8 & 1))
    {
        g_f00de8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00de0 = g_f0c948;
    }
    return v0;
}
