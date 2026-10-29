/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x942608..0x942748 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f049e8;
extern unsigned short g_f049ea;
extern unsigned short g_f049ec;
extern unsigned short g_f049ee;
extern unsigned long long g_f049f0;
extern unsigned short g_f12664;
extern unsigned short g_f12666;
extern unsigned short g_f12668;
extern unsigned short g_f1266a;

long long sub_942608(void)
{
    unsigned long long v0;  // x8
    unsigned short v1;  // x11
    unsigned short v2;  // x11
    unsigned long long v3;  // x11
    unsigned long long v4;  // x8
    unsigned long v5;  // x0

    v0 = 8675500149066335668 + ((9771243908349431496 + ~9771243908349431496 * 2 + 1 & 18200360067) + 9771243907396143688) * 2;
    g_f12664 = v0;
    g_f12666 = v0 >> 16;
    g_f12668 = ((unsigned short)(__ROL__((unsigned int)(v0 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v0 >> 32) + 0xffff ^ 1);
    g_f1266a = v0 >> 48;
    v1 = -g_f12664;
    g_f049e8 = (v1 ^ g_f049e8) + (g_f12664 & ~g_f049e8 | v1 & g_f049e8) * 2;
    g_f049ea = g_f12666 ^ g_f049ea;
    v2 = -g_f12668;
    g_f049ec = (v2 ^ g_f049ec) + ((g_f049ec + ~g_f049ec * 2 + 1 & g_f12668) + (v2 & g_f049ec)) * 2;
    g_f049ee = (g_f049ee | g_f1266a) - (g_f1266a & g_f049ee);
    v3 = g_f049f0 | v0;
    v4 = -(g_f049f0 & v0);
    g_f049f0 = (v3 ^ v4) + (v3 & v4) * 2;
    return v5;
}
