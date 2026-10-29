/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x934f74..0x934fbc (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ba0;
extern char g_f00ba8;
extern unsigned int g_f0c948;

long long sub_934f74(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00ba8 - (g_f00ba8 | 1)))
    {
        g_f00ba8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ba0 = g_f0c948;
        return v1;
    }
    return v1;
}
