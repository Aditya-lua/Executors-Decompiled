/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108f4c..0x108f80 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d70;
extern char g_f00d78;
extern unsigned int g_f0c948;

long long sub_108f4c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d78 & 1))
    {
        g_f00d78 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d70 = g_f0c948;
    }
    return v0;
}
