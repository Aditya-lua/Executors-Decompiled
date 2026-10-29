/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x932d84..0x932de0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b40;
extern char g_f00b48;
extern unsigned int g_f0c948;

long long sub_932d84(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00b48 - (g_f00b48 | 1)))
    {
        g_f00b48 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00b40 = g_f0c948;
        return v1;
    }
    return v1;
}
