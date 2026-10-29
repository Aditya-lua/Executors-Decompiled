/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x521488..0x5215f4 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f04828;
extern char g_f04830;
extern unsigned short g_f04848;
extern unsigned short g_f0484a;
extern unsigned short g_f0484c;
extern unsigned short g_f0484e;
extern unsigned short g_f04850;
extern unsigned short g_f04852;
extern unsigned short g_f04854;
extern unsigned short g_f04856;
extern unsigned long long g_f04858;

long long sub_521488(void)
{
    unsigned int v0;  // w10
    unsigned long long v2;  // x9
    unsigned long long v3;  // x9
    unsigned short v4;  // x11
    unsigned long v5;  // x0

    v0 = g_f04830 + 1;
    if ((-((v0 & -(g_f04830 | 1)) * 2) & 254) != ((char)v0 ^ (char)-(g_f04830 | 1)))
        return v5;
    g_f04830 = 1;
    v2 = 0xff51afd7ed558ccd * (0xffffffffff0fb7b7 + (0 & ~&g_f04848 | 15747144) * 2);
    v3 = (~v2 - (v2 >> 29 | ~v2) ^ (v2 >> 29 | v2)) + (~v2 - (v2 >> 29 | ~v2) & (v2 >> 29 | v2)) * 2;
    g_f0484a = v3;
    g_f0484c = (((unsigned short)(v3 >> 16) ^ 0xffff) + (unsigned short)(v3 >> 16) ^ (unsigned short)(v3 >> 16) + 1) + (((unsigned short)(v3 >> 16) ^ 0xffff) + (unsigned short)(v3 >> 16) & (unsigned short)(v3 >> 16) + 1) * 2;
    g_f0484e = v3 >> 32;
    g_f04850 = v3 >> 48;
    g_f04848 = g_f0484a ^ g_f04848;
    v4 = -g_f0484c;
    g_f04852 = (v4 ^ g_f04852) + ((g_f04852 + ~g_f04852 * 2 + 1 & g_f0484c) + (v4 & g_f04852)) * 2;
    g_f04854 = g_f0484e ^ g_f04854;
    g_f04856 = g_f04850 ^ g_f04856;
    g_f04858 = (g_f04858 ^ -v3) + (v3 & ~g_f04858 | g_f04858 & -v3) * 2;
    g_f04828 = 0;
    return v5;
}
