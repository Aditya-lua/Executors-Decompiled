/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f2ea8..0x4f2f04 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c30;
extern char g_f00c38;
extern unsigned int g_f0c948;

long long sub_4f2ea8(void)
{
    unsigned int v1;  // w9
    unsigned long v2;  // x0

    if (!~(char)(g_f00c38 - (g_f00c38 | 1)))
    {
        g_f00c38 = 1;
        v1 = (g_f0c948 * 2 & 4) + (g_f0c948 ^ 2);
        g_f0c948 = ~v1 + v1 * 2;
        g_f00c30 = g_f0c948;
        return v2;
    }
    return v2;
}
