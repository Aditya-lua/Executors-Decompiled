/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0102c..0xb01058 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_ecc810;
extern char g_ecc840;
extern unsigned int g_f0d568;

long long sub_b0102c(void)
{
    if (~g_f0d568 & 36)
        return &g_ecc840;
    return &g_ecc810;
}
