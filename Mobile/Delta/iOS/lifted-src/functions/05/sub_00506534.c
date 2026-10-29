/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x506534..0x506598 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d10;
extern char g_f00d18;
extern unsigned int g_f0c948;

long long sub_506534(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00d18 + ~g_f00d18 * 2 + 1 | 1) + g_f00d18))
    {
        g_f00d18 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00d10 = g_f0c948;
        return v1;
    }
    return v1;
}
