/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9442c8..0x94433c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b90;
extern char g_f00b98;
extern unsigned int g_f0c948;

long long sub_9442c8(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00b98 + 1;
    if ((-(((v0 + ~g_f00b98 * 2 ^ 1) + (v0 & 1) & -(v0 + ~g_f00b98 * 2)) * 2) & 254) == (((v0 + ~g_f00b98 * 2 ^ 1) + (v0 & 1) ^ -(v0 + ~g_f00b98 * 2)) & 0xff))
    {
        g_f00b98 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00b90 = g_f0c948;
    }
    return v2;
}
