/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0284c..0xb02874 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eccdc0;
extern char g_eccdd8;
extern char g_f0d568;

long long sub_b0284c(void)
{
    if (g_f0d568 & 4)
        return &g_eccdc0;
    return &g_eccdd8;
}
