/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x941c64..0x941cd4 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00de0;
extern char g_f00de8;
extern unsigned int g_f0c948;

long long sub_941c64(void)
{
    unsigned int v0;  // w11
    unsigned int v2;  // w9
    unsigned long v3;  // x0

    v0 = g_f00de8 + 1;
    if (!~(((char)v0 & 1) + g_f00de8 + ((char)v0 + ~g_f00de8 * 2 ^ 1)))
    {
        g_f00de8 = 1;
        v2 = (g_f0c948 * 2 & 4) + (g_f0c948 ^ 2);
        g_f0c948 = ~v2 + v2 * 2;
        g_f00de0 = g_f0c948;
        return v3;
    }
    return v3;
}
