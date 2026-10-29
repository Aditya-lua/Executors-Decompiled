/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50a370..0x50a3d8 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b00;
extern char g_f00b08;
extern unsigned int g_f0c948;

long long sub_50a370(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00b08 + ~g_f00b08 * 2 + 1 | 1) + g_f00b08))
    {
        g_f00b08 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 1) + (~g_f0c948 | 0xfffffffe) + 2;
        g_f00b00 = g_f0c948;
        return v1;
    }
    return v1;
}
