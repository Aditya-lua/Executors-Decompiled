/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x940884..0x9408ec (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d20;
extern char g_f00d28;
extern unsigned int g_f0c948;

long long sub_940884(void)
{
    unsigned long v1;  // x0

    if ((-(((g_f00d28 + ~g_f00d28 * 2 + 1 | 1) & ~(g_f00d28 + ~g_f00d28 * 2)) * 2) & 254) == ((g_f00d28 + ~g_f00d28 * 2 ^ ~(g_f00d28 + ~g_f00d28 * 2 + 1 | 1)) & 0xff))
    {
        g_f00d28 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00d20 = g_f0c948;
    }
    return v1;
}
