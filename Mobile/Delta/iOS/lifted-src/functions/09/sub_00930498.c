/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x930498..0x9305d0 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f049f8;
extern unsigned short g_f049fa;
extern unsigned short g_f049fc;
extern unsigned short g_f049fe;
extern unsigned long long g_f04a00;
extern unsigned short g_f1266c;
extern unsigned short g_f1266e;
extern unsigned short g_f12670;
extern unsigned short g_f12672;

long long sub_930498(void)
{
    unsigned long long v0;  // x8
    unsigned short v1;  // x15
    unsigned short v2;  // x10
    unsigned short v3;  // x12
    unsigned short v4;  // x10
    unsigned long long v5;  // x11
    unsigned long long v6;  // x8
    unsigned long v7;  // x0

    v0 = 9460536640379438109 + ((8986207444513774488 + ~8986207444513774488 * 2 + 1 & 16738115706) + 8986207430552886144) * 2;
    g_f1266c = ((unsigned short)(__ROL__((unsigned int)v0 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v0 + 0xffff ^ 1);
    g_f1266e = v0 >> 16;
    g_f12670 = v0 >> 32;
    g_f12672 = v0 >> 48;
    v1 = g_f1266c | g_f049f8;
    v2 = -(g_f1266c & g_f049f8);
    g_f049f8 = (v1 ^ v2) + (v1 & v2) * 2;
    g_f049fa = (g_f049fa | g_f1266e) + (unsigned short)~((g_f1266e | ~g_f049fa) + g_f049fa);
    g_f049fc = g_f12670 ^ g_f049fc;
    v3 = g_f049fe | g_f12672;
    v4 = -(g_f12672 & g_f049fe);
    g_f049fe = (v3 ^ v4) + (v3 & v4) * 2;
    v5 = g_f04a00 | v0;
    v6 = ~g_f04a00 - (v0 | ~g_f04a00);
    g_f04a00 = (v6 ^ v5) + (v6 & v5) * 2;
    return v7;
}
