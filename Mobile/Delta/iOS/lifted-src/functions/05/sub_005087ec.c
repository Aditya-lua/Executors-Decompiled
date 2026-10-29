/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5087ec..0x50884c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e40;
extern char g_f00e48;
extern unsigned int g_f0c948;

long long sub_5087ec(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00e48 + 1;
    if ((-(((v0 + ~g_f00e48 * 2 ^ 1) + (v0 & 1) & v0) * 2) & 254) == (((v0 + ~g_f00e48 * 2 ^ 1) + (v0 & 1) ^ v0) & 0xff))
    {
        g_f00e48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e40 = g_f0c948;
    }
    return v2;
}
