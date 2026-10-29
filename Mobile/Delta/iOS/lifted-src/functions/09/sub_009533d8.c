/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9533d8..0x953430 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cb0;
extern char g_f00cb8;
extern unsigned int g_f0c948;

long long sub_9533d8(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00cb8 - (g_f00cb8 | 1)))
    {
        g_f00cb8 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00cb0 = g_f0c948;
        return v1;
    }
    return v1;
}
