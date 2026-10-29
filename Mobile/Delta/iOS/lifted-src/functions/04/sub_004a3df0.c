/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3df0..0x4a3e54 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b80;
extern char g_f00b88;
extern unsigned int g_f0c948;

long long sub_4a3df0(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00b88 ^ 254) + g_f00b88 + (~g_f00b88 & 1)))
    {
        g_f00b88 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00b80 = g_f0c948;
        return v1;
    }
    return v1;
}
