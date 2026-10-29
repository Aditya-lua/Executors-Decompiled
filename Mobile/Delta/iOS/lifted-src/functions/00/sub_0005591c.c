/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5591c..0x55950 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d80;
extern char g_f00d88;
extern unsigned int g_f0c948;

long long sub_5591c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d88 & 1))
    {
        g_f00d88 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d80 = g_f0c948;
    }
    return v0;
}
