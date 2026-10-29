/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5072c0..0x507408 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04380;
extern unsigned short g_f04382;
extern unsigned short g_f04384;
extern unsigned short g_f04386;
extern unsigned long long g_f04388;
extern unsigned short g_f11fa8;
extern unsigned short g_f11faa;
extern unsigned short g_f11fac;
extern unsigned short g_f11fae;

long long sub_5072c0(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned short v2;  // x15
    unsigned short v3;  // x10
    unsigned short v4;  // x12
    unsigned short v5;  // x10
    unsigned short v6;  // x12
    unsigned short v7;  // x10
    unsigned long v8;  // x0

    v0 = 0xff51afd7ed558ccd * ((char *)&g_f04380 + ~(~&g_f04380 + &g_f04380));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f11fa8 = ((unsigned short)(__ROL__((unsigned int)v1 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v1 + 0xffff ^ 1);
    g_f11faa = v1 >> 16;
    g_f11fac = v1 >> 32;
    g_f11fae = v1 >> 48;
    v2 = g_f11fa8 | g_f04380;
    v3 = -(g_f11fa8 & g_f04380);
    g_f04380 = (v2 ^ v3) + (v2 & v3) * 2;
    g_f04382 = g_f04382 - g_f11faa + (g_f11faa & ~g_f04382) * 2;
    v4 = g_f11fac | g_f04384;
    v5 = ~g_f04384 - (g_f11fac | ~g_f04384);
    g_f04384 = (v5 ^ v4) + (v5 & v4) * 2;
    v6 = g_f11fae | g_f04386;
    v7 = ~g_f04386 - (g_f11fae | ~g_f04386);
    g_f04386 = (v7 ^ v6) + (v7 & v6) * 2;
    g_f04388 = g_f04388 - v1 + (v1 & ~g_f04388) * 2;
    return v8;
}
