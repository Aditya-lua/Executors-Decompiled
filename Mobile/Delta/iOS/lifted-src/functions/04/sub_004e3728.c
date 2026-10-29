/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e3728..0x4e3770 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e50;
extern char g_f00e58;
extern unsigned int g_f0c948;

long long sub_4e3728(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00e58 - (g_f00e58 | 1)))
    {
        g_f00e58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e50 = g_f0c948;
        return v1;
    }
    return v1;
}
