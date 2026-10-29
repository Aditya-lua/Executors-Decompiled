/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x951e84..0x951ee0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d00;
extern char g_f00d08;
extern unsigned int g_f0c948;

long long sub_951e84(void)
{
    unsigned int v1;  // w9
    unsigned long v2;  // x0

    if (!~(char)(g_f00d08 - (g_f00d08 | 1)))
    {
        g_f00d08 = 1;
        v1 = (g_f0c948 * 2 & 4) + (g_f0c948 ^ 2);
        g_f0c948 = ~v1 + v1 * 2;
        g_f00d00 = g_f0c948;
        return v2;
    }
    return v2;
}
