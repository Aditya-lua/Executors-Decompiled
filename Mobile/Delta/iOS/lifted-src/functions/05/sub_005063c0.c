/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5063c0..0x506500 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04390;
extern unsigned short g_f04392;
extern unsigned short g_f04394;
extern unsigned short g_f04396;
extern unsigned long long g_f04398;
extern unsigned short g_f11fb0;
extern unsigned short g_f11fb2;
extern unsigned short g_f11fb4;
extern unsigned short g_f11fb6;

long long sub_5063c0(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned short v2;  // x12
    unsigned long v3;  // x0

    v0 = 0xff51afd7ed558ccd * ((char *)&g_f04390 + ~(~&g_f04390 + &g_f04390));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f11fb0 = ((unsigned short)(__ROL__((unsigned int)v1 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v1 + 0xffff ^ 1);
    g_f11fb2 = v1 >> 16;
    g_f11fb4 = ((unsigned short)(__ROL__((unsigned int)(v1 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v1 >> 32) + 0xffff ^ 1);
    g_f11fb6 = v1 >> 48;
    g_f04390 = g_f11fb0 ^ g_f04390;
    v2 = -g_f11fb2;
    g_f04392 = (v2 ^ g_f04392) + (v2 & g_f04392 | g_f11fb2 & ~g_f04392) * 2;
    g_f04394 = (g_f04394 | g_f11fb4) - (g_f11fb4 & g_f04394);
    g_f04396 = (g_f11fb6 | g_f04396) + (unsigned short)~((g_f11fb6 | ~g_f04396) + g_f04396);
    g_f04398 = (g_f04398 | v1) + ~((v1 | ~g_f04398) + g_f04398);
    return v3;
}
