/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9341f4..0x934268 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ab0;
extern char g_f00ab8;
extern unsigned int g_f0c948;

long long sub_9341f4(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00ab8 + 1;
    if ((-(((v0 + ~g_f00ab8 * 2 ^ 1) + (v0 & 1) & v0) * 2) & 254) == (((char)v0 + ~g_f00ab8 * 2 ^ 1) + ((char)v0 & 1) ^ (char)v0))
    {
        g_f00ab8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00ab0 = g_f0c948;
    }
    return v2;
}
