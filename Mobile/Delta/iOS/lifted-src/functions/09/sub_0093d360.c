/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93d360..0x93d3a4 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c30;
extern char g_f00c38;
extern unsigned int g_f0c948;

long long sub_93d360(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c38 & 1))
    {
        g_f00c38 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00c30 = g_f0c948;
    }
    return v0;
}
