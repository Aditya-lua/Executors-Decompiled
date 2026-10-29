/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0275c..0xb02784 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_eccca0;
extern char g_ecccb8;
extern char g_f0d568;

long long sub_b0275c(void)
{
    if (g_f0d568 & 4)
        return &g_eccca0;
    return &g_ecccb8;
}
