/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb027fc..0xb02824 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eccd60;
extern char g_eccd78;
extern char g_f0d568;

long long sub_b027fc(void)
{
    if (g_f0d568 & 4)
        return &g_eccd60;
    return &g_eccd78;
}
