/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9305d0..0x930634 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bf0;
extern char g_f00bf8;
extern unsigned int g_f0c948;

long long sub_9305d0(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00bf8 ^ 254) + g_f00bf8 + (~g_f00bf8 & 1)))
    {
        g_f00bf8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 1) + (~g_f0c948 | 0xfffffffe) + 2;
        g_f00bf0 = g_f0c948;
        return v1;
    }
    return v1;
}
