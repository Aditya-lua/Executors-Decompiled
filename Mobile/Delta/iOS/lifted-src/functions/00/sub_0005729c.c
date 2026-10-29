/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5729c..0x572d0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e10;
extern char g_f00e18;
extern unsigned int g_f0c948;

long long sub_5729c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e18 & 1))
    {
        g_f00e18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e10 = g_f0c948;
    }
    return v0;
}
