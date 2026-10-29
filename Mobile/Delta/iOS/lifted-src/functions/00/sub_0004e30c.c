/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e30c..0x4e340 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bc0;
extern char g_f00bc8;
extern unsigned int g_f0c948;

long long sub_4e30c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00bc8 & 1))
    {
        g_f00bc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bc0 = g_f0c948;
    }
    return v0;
}
