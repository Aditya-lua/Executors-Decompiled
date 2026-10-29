/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e14d8..0x4e1538 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d70;
extern char g_f00d78;
extern unsigned int g_f0c948;

long long sub_4e14d8(void)
{
    unsigned int v0;  // w11
    unsigned long v2;  // x0

    v0 = g_f00d78 + 1;
    if ((-((v0 + ~g_f00d78 * 2 + (g_f00d78 | 0xfffffffe) + 2 & v0) * 2) & 254) == ((char)v0 + ~g_f00d78 * 2 + (g_f00d78 | 254) + 2 ^ (char)v0))
    {
        g_f00d78 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d70 = g_f0c948;
    }
    return v2;
}
