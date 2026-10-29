/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93d3a4..0x93d3ec (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e40;
extern char g_f00e48;
extern unsigned int g_f0c948;

long long sub_93d3a4(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00e48 - (g_f00e48 | 1)))
    {
        g_f00e48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e40 = g_f0c948;
        return v1;
    }
    return v1;
}
