/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb027ac..0xb027d4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eccd00;
extern char g_eccd18;
extern char g_f0d568;

long long sub_b027ac(void)
{
    if (g_f0d568 & 4)
        return &g_eccd00;
    return &g_eccd18;
}
