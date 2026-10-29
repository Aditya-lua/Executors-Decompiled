/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50bee0..0x50c02c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04758;
extern unsigned short g_f0475a;
extern unsigned short g_f0475c;
extern unsigned short g_f0475e;
extern unsigned short g_f04760;
extern unsigned short g_f04762;
extern unsigned short g_f04764;
extern unsigned short g_f04766;
extern unsigned long long g_f04768;

int sub_50bee0(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned short v2;  // x10
    unsigned short v3;  // x12
    unsigned short v4;  // x10
    unsigned long long v5;  // x11
    unsigned long long v6;  // x8

    v0 = 0xff51afd7ed558ccd * (0xffffffffff0fb8a7 + (0 & ~&g_f04758 | 15746904) * 2);
    v1 = (v0 ^ -(v0 >> 29)) + (v0 >> 29 & ~v0) * 2 + (v0 & -(v0 >> 29)) * 2;
    g_f0475a = v1;
    g_f0475c = v1 >> 16;
    g_f0475e = ((unsigned short)(__ROL__((unsigned int)(v1 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v1 >> 32) + 0xffff ^ 1);
    g_f04760 = v1 >> 48;
    v2 = -g_f0475a;
    g_f04758 = (v2 ^ g_f04758) + (g_f0475a & ~g_f04758) * 2 + (v2 & g_f04758) * 2;
    g_f04762 = (g_f04762 | g_f0475c) + (unsigned short)~((g_f0475c | ~g_f04762) + g_f04762);
    g_f04764 = g_f0475e ^ g_f04764;
    v3 = g_f04766 | g_f04760;
    v4 = ~g_f04766 - (g_f04760 | ~g_f04766);
    g_f04766 = (v3 ^ v4) + (v3 & v4) * 2;
    v5 = g_f04768 | v1;
    v6 = ~g_f04768 - (v1 | ~g_f04768);
    g_f04768 = (v6 ^ v5) + (v6 & v5) * 2;
    return 0;
}
