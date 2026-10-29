/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a57c0..0x4a5928 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f043a0;
extern unsigned short g_f043a2;
extern unsigned short g_f043a4;
extern unsigned short g_f043a6;
extern unsigned long long g_f043a8;
extern unsigned short g_f11fb8;
extern unsigned short g_f11fba;
extern unsigned short g_f11fbc;
extern unsigned short g_f11fbe;

long long sub_4a57c0(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned short v2;  // x10
    unsigned int v3;  // w10
    unsigned int v4;  // w12
    unsigned short v5;  // x12
    unsigned short v6;  // x10
    unsigned short v7;  // x11
    unsigned long v8;  // x0

    v0 = 0xff51afd7ed558ccd * ((char *)&g_f043a0 + ~(~&g_f043a0 + &g_f043a0));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f11fb8 = v1;
    g_f11fba = v1 >> 16;
    g_f11fbc = v1 >> 32;
    g_f11fbe = v1 >> 48;
    v2 = -g_f11fb8;
    g_f043a0 = (v2 ^ g_f043a0) + ((g_f043a0 + ~g_f043a0 * 2 + 1 & g_f11fb8) + (v2 & g_f043a0)) * 2;
    v3 = g_f043a2 + 1;
    v4 = v3 + ~g_f043a2 * 2;
    g_f043a2 = (unsigned short)(v3 - g_f11fba) + ((unsigned short)v4 + (g_f11fba | (unsigned short)~v4)) * 2 + 1;
    v5 = g_f11fbc | g_f043a4;
    v6 = ~g_f043a4 - (g_f11fbc | ~g_f043a4);
    g_f043a4 = (v6 ^ v5) + (v6 & v5) * 2;
    v7 = -g_f11fbe;
    g_f043a6 = (v7 ^ g_f043a6) + (g_f11fbe & ~g_f043a6 | v7 & g_f043a6) * 2;
    g_f043a8 = (g_f043a8 ^ -v1) + ((g_f043a8 + ~g_f043a8 * 2 + 1 & v1) + (g_f043a8 & -v1)) * 2;
    return v8;
}
