/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02824..0xb0284c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eccd90;
extern char g_eccda8;
extern char g_f0d568;

long long sub_b02824(void)
{
    if (g_f0d568 & 4)
        return &g_eccd90;
    return &g_eccda8;
}
