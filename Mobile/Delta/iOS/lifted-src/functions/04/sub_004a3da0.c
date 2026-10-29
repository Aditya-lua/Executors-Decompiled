/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3da0..0x4a3df0 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e30;
extern char g_f00e38;
extern unsigned int g_f0c948;

long long sub_4a3da0(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00e38 ^ 254) + g_f00e38 + (~g_f00e38 & 1)))
    {
        g_f00e38 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e30 = g_f0c948;
        return v1;
    }
    return v1;
}
