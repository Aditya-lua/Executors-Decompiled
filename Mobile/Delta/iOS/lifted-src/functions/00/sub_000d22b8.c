/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd22b8..0xd2350 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f012be;
extern unsigned short g_f012c0;
extern unsigned short g_f012c2;
extern unsigned short g_f012c4;
extern unsigned long long g_f012f0;
extern unsigned short g_f0dc82;
extern unsigned short g_f0dc84;
extern unsigned short g_f0dc86;
extern unsigned short g_f0dc88;

long long sub_d22b8(void)
{
    unsigned long v0;  // x0

    g_f0dc82 = 25367;
    g_f0dc84 = 37621;
    g_f0dc86 = 12582;
    g_f0dc88 = 5996;
    g_f012be = g_f0dc82 ^ g_f012be;
    g_f012c0 = g_f0dc84 ^ g_f012c0;
    g_f012c2 = g_f0dc86 ^ g_f012c2;
    g_f012c4 = g_f0dc88 ^ g_f012c4;
    g_f012f0 = g_f012f0 ^ 1687778002101166871;
    return v0;
}
