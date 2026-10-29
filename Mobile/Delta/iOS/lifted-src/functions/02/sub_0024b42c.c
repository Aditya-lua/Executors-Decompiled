/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24b42c..0x24b460 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d10;
extern char g_f00d18;
extern unsigned int g_f0c948;

long long sub_24b42c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d18 & 1))
    {
        g_f00d18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d10 = g_f0c948;
    }
    return v0;
}
