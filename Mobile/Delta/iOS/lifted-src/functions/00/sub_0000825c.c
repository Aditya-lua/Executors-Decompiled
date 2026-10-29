/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x825c..0x828c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e40;
extern char g_f00e48;
extern unsigned int g_f0c948;

long long sub_825c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e48 & 1))
    {
        g_f00e48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e40 = g_f0c948;
    }
    return v0;
}
