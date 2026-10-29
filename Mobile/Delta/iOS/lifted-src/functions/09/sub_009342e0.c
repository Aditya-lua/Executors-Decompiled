/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9342e0..0x934330 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b50;
extern char g_f00b58;
extern unsigned int g_f0c948;

long long sub_9342e0(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00b58 ^ 254) + g_f00b58 + (~g_f00b58 & 1)))
    {
        g_f00b58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b50 = g_f0c948;
        return v1;
    }
    return v1;
}
