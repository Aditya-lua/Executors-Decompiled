/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb027d4..0xb027fc (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eccd30;
extern char g_eccd48;
extern char g_f0d568;

long long sub_b027d4(void)
{
    if (g_f0d568 & 4)
        return &g_eccd30;
    return &g_eccd48;
}
