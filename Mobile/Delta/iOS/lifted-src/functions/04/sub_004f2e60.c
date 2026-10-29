/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f2e60..0x4f2ea8 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ae0;
extern char g_f00ae8;
extern unsigned int g_f0c948;

long long sub_4f2e60(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00ae8 - (g_f00ae8 | 1)))
    {
        g_f00ae8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ae0 = g_f0c948;
        return v1;
    }
    return v1;
}
