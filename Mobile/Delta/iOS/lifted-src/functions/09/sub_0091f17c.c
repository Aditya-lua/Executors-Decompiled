/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91f17c..0x91f1c4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00dc0;
extern char g_f00dc8;
extern unsigned int g_f0c948;

long long sub_91f17c(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00dc8 - (g_f00dc8 | 1)))
    {
        g_f00dc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00dc0 = g_f0c948;
        return v1;
    }
    return v1;
}
