/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e1538..0x4e1580 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e10;
extern char g_f00e18;
extern unsigned int g_f0c948;

long long sub_4e1538(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00e18 - (g_f00e18 | 1)))
    {
        g_f00e18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e10 = g_f0c948;
        return v1;
    }
    return v1;
}
