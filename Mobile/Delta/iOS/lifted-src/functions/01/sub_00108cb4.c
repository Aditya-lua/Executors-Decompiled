/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108cb4..0x108d4c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01618;
extern unsigned short g_f0161a;
extern unsigned short g_f0161c;
extern unsigned short g_f0161e;
extern unsigned long long g_f01758;
extern unsigned short g_f0e130;
extern unsigned short g_f0e132;
extern unsigned short g_f0e134;
extern unsigned short g_f0e136;

long long sub_108cb4(void)
{
    unsigned long v0;  // x0

    g_f0e130 = 34692;
    g_f0e132 = 58322;
    g_f0e134 = 35537;
    g_f0e136 = 53043;
    g_f01618 = g_f0e130 ^ g_f01618;
    g_f0161a = g_f0e132 ^ g_f0161a;
    g_f0161c = g_f0e134 ^ g_f0161c;
    g_f0161e = g_f0e136 ^ g_f0161e;
    g_f01758 = g_f01758 ^ 14930429823738349444;
    return v0;
}
