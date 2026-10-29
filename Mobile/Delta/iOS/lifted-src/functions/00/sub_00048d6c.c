/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48d6c..0x48da0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ce0;
extern char g_f00ce8;
extern unsigned int g_f0c948;

long long sub_48d6c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ce8 & 1))
    {
        g_f00ce8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ce0 = g_f0c948;
    }
    return v0;
}
