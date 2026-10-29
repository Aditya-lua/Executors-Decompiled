/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x934330..0x9343a4 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b00;
extern char g_f00b08;
extern unsigned int g_f0c948;

long long sub_934330(void)
{
    unsigned int v0;  // w11
    unsigned long v2;  // x0

    v0 = g_f00b08 + 1;
    if ((-((v0 + ~g_f00b08 * 2 + (g_f00b08 | 0xfffffffe) + 2 & v0) * 2) & 254) == ((char)v0 + ~g_f00b08 * 2 + (g_f00b08 | 254) + 2 ^ (char)v0))
    {
        g_f00b08 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00b00 = g_f0c948;
    }
    return v2;
}
