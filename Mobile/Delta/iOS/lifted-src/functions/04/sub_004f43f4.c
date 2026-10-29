/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f43f4..0x4f4520 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04410;
extern unsigned short g_f04412;
extern unsigned short g_f04414;
extern unsigned short g_f04416;
extern unsigned long long g_f04418;
extern unsigned short g_f11fd8;
extern unsigned short g_f11fda;
extern unsigned short g_f11fdc;
extern unsigned short g_f11fde;

long long sub_4f43f4(void)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x9
    unsigned short v2;  // x11
    unsigned long v3;  // x0

    v0 = 0xff51afd7ed558ccd * ((char *)&g_f04410 + ~(~&g_f04410 + &g_f04410));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f11fd8 = v1;
    g_f11fda = (unsigned short)((~(unsigned int)(v1 >> 16) + (unsigned int)(v1 >> 16) * 2) * 2 - (v1 >> 16)) + 2;
    g_f11fdc = v1 >> 32;
    g_f11fde = v1 >> 48;
    g_f04410 = g_f11fd8 ^ g_f04410;
    g_f04412 = g_f11fda ^ g_f04412;
    v2 = -g_f11fdc;
    g_f04414 = (v2 ^ g_f04414) + ((g_f04414 + ~g_f04414 * 2 + 1 & g_f11fdc) + (v2 & g_f04414)) * 2;
    g_f04416 = (g_f04416 | g_f11fde) - (g_f11fde & g_f04416);
    g_f04418 = g_f04418 - v1 + (v1 & ~g_f04418) * 2;
    return v3;
}
