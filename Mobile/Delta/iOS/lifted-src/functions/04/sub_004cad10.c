/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4cad10..0x4cad70 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c90;
extern char g_f00c98;
extern unsigned int g_f0c948;

long long sub_4cad10(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00c98 + 1;
    if ((-(((v0 + ~g_f00c98 * 2 ^ 1) + (v0 & 1) & v0) * 2) & 254) == (((v0 + ~g_f00c98 * 2 ^ 1) + (v0 & 1) ^ v0) & 0xff))
    {
        g_f00c98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c90 = g_f0c948;
    }
    return v2;
}
