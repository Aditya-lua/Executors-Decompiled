/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d9c38..0x4d9c8c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bc0;
extern char g_f00bc8;
extern unsigned int g_f0c948;

long long sub_4d9c38(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = ~g_f00bc8 | 1;
    if ((-((g_f00bc8 + 1 & v0) * 2) & 254) == ((g_f00bc8 + 1 ^ v0) & 0xff))
    {
        g_f00bc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bc0 = g_f0c948;
    }
    return v2;
}
