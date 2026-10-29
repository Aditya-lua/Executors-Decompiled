/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd2220..0xd22b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f012ce;
extern unsigned short g_f012d0;
extern unsigned short g_f012d2;
extern unsigned short g_f012d4;
extern unsigned long long g_f01300;
extern unsigned short g_f0dc92;
extern unsigned short g_f0dc94;
extern unsigned short g_f0dc96;
extern unsigned short g_f0dc98;

long long sub_d2220(void)
{
    unsigned long v0;  // x0

    g_f0dc92 = 50129;
    g_f0dc94 = 39636;
    g_f0dc96 = 11940;
    g_f0dc98 = 3207;
    g_f012ce = g_f0dc92 ^ g_f012ce;
    g_f012d0 = g_f0dc94 ^ g_f012d0;
    g_f012d2 = g_f0dc96 ^ g_f012d2;
    g_f012d4 = g_f0dc98 ^ g_f012d4;
    g_f01300 = g_f01300 ^ 902741534818223057;
    return v0;
}
