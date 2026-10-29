/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d92d8..0x4d9320 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bf0;
extern char g_f00bf8;
extern unsigned int g_f0c948;

long long sub_4d92d8(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00bf8 - (g_f00bf8 | 1)))
    {
        g_f00bf8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bf0 = g_f0c948;
        return v1;
    }
    return v1;
}
