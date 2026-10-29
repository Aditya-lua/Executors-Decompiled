/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02784..0xb027ac (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_ecccd0;
extern char g_eccce8;
extern char g_f0d568;

long long sub_b02784(void)
{
    if (g_f0d568 & 4)
        return &g_ecccd0;
    return &g_eccce8;
}
