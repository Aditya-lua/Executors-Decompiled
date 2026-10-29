/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3e54..0x4a3ebc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e20;
extern char g_f00e28;
extern unsigned int g_f0c948;

long long sub_4a3e54(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = ~g_f00e28 | 1;
    if ((-((g_f00e28 + 1 & v0) * 2) & 254) == (g_f00e28 + 1 ^ (char)v0))
    {
        g_f00e28 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 1) + (~g_f0c948 | 0xfffffffe) + 2;
        g_f00e20 = g_f0c948;
    }
    return v2;
}
