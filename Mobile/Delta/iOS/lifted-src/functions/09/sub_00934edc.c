/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x934edc..0x934f40 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b60;
extern char g_f00b68;
extern unsigned int g_f0c948;

long long sub_934edc(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = ~g_f00b68 | 1;
    if ((-((g_f00b68 + 1 & v0) * 2) & 254) == ((g_f00b68 + 1 ^ v0) & 0xff))
    {
        g_f00b68 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00b60 = g_f0c948;
    }
    return v2;
}
