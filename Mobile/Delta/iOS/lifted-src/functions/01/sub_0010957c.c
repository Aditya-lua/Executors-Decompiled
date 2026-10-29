/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10957c..0x1095b0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d50;
extern char g_f00d58;
extern unsigned int g_f0c948;

long long sub_10957c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d58 & 1))
    {
        g_f00d58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d50 = g_f0c948;
    }
    return v0;
}
