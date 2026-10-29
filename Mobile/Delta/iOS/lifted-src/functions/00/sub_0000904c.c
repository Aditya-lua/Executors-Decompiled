/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x904c..0x9080 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00df0;
extern char g_f00df8;
extern unsigned int g_f0c948;

long long sub_904c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00df8 & 1))
    {
        g_f00df8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00df0 = g_f0c948;
    }
    return v0;
}
