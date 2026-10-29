/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e37a4..0x4e38f8 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04370;
extern unsigned short g_f04372;
extern unsigned short g_f04374;
extern unsigned short g_f04376;
extern unsigned long long g_f04378;
extern unsigned short g_f11fa0;
extern unsigned short g_f11fa2;
extern unsigned short g_f11fa4;
extern unsigned short g_f11fa6;

long long sub_4e37a4(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned short v2;  // x10
    unsigned short v3;  // x11
    unsigned short v4;  // x11
    unsigned long v5;  // x0

    v0 = 0xff51afd7ed558ccd * ((char *)&g_f04370 + ~(~&g_f04370 + &g_f04370));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f11fa0 = v1;
    g_f11fa2 = v1 >> 16;
    g_f11fa4 = v1 >> 32;
    g_f11fa6 = v1 >> 48;
    v2 = -g_f11fa0;
    g_f04370 = (v2 ^ g_f04370) + ((g_f04370 + ~g_f04370 * 2 + 1 & g_f11fa0) + (v2 & g_f04370)) * 2;
    g_f04372 = (g_f11fa2 | g_f04372) + (unsigned short)~((g_f11fa2 | ~g_f04372) + g_f04372);
    v3 = -g_f11fa4;
    g_f04374 = (v3 ^ g_f04374) + ((g_f04374 + ~g_f04374 * 2 + 1 & g_f11fa4) + (v3 & g_f04374)) * 2;
    v4 = -g_f11fa6;
    g_f04376 = (v4 ^ g_f04376) + (g_f11fa6 & ~g_f04376 | v4 & g_f04376) * 2;
    g_f04378 = (g_f04378 | v1) - (g_f04378 & v1);
    return v5;
}
