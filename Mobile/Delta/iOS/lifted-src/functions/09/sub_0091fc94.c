/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91fc94..0x91fd00 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e10;
extern char g_f00e18;
extern unsigned int g_f0c948;

long long sub_91fc94(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00e18 + 1;
    if ((-(((v0 + ~g_f00e18 * 2 | 1) & v0) * 2) & 254) == (((char)v0 + ~g_f00e18 * 2 | 1) ^ (char)v0))
    {
        g_f00e18 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00e10 = g_f0c948;
    }
    return v2;
}
