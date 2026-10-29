/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe867c..0xe86b0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ba0;
extern char g_f00ba8;
extern unsigned int g_f0c948;

long long sub_e867c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ba8 & 1))
    {
        g_f00ba8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ba0 = g_f0c948;
    }
    return v0;
}
