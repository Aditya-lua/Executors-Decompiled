/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93e7d0..0x93e83c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c20;
extern char g_f00c28;
extern unsigned int g_f0c948;

long long sub_93e7d0(void)
{
    unsigned int v0;  // w11
    unsigned long v2;  // x0

    v0 = (1 & ~g_f00c28) + (g_f00c28 ^ 0xfffffffe);
    if ((-((v0 & g_f00c28 + 1) * 2) & 254) == ((v0 ^ g_f00c28 + 1) & 0xff))
    {
        g_f00c28 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 1) + (~g_f0c948 | 0xfffffffe) + 2;
        g_f00c20 = g_f0c948;
    }
    return v2;
}
