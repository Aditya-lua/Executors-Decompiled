/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5215f4..0x521790 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f04838;
extern char g_f04840;
extern unsigned short g_f04860;
extern unsigned short g_f04862;
extern unsigned short g_f04864;
extern unsigned short g_f04866;
extern unsigned short g_f04868;
extern unsigned short g_f0486a;
extern unsigned short g_f0486c;
extern unsigned short g_f0486e;
extern unsigned long long g_f04870;

long long sub_5215f4(void)
{
    unsigned long long v1;  // x8
    unsigned long long v2;  // x8
    unsigned short v3;  // x12
    unsigned short v4;  // x10
    unsigned short v5;  // x12
    unsigned short v6;  // x10
    unsigned short v7;  // x11
    unsigned long v8;  // x0

    if (!~(char)(g_f04840 - (g_f04840 | 1)))
    {
        g_f04840 = 1;
        v1 = 0xff51afd7ed558ccd * (0xffffffffff0fb79f + (0 & ~&g_f04860 | 15747168) * 2);
        v2 = (~v1 - (v1 >> 29 | ~v1) ^ (v1 >> 29 | v1)) + (~v1 - (v1 >> 29 | ~v1) & (v1 >> 29 | v1)) * 2;
        g_f04862 = v2;
        g_f04864 = v2 >> 16;
        g_f04866 = (((unsigned short)(v2 >> 32) ^ 0xffff) + (unsigned short)(v2 >> 32) ^ (unsigned short)(v2 >> 32) + 1) + (((unsigned short)(v2 >> 32) ^ 0xffff) + (unsigned short)(v2 >> 32) & (unsigned short)(v2 >> 32) + 1) * 2;
        g_f04868 = v2 >> 48;
        g_f04860 = g_f04860 - g_f04862 + (g_f04860 + ~g_f04860 * 2 + 1 & g_f04862) * 2;
        v3 = g_f04864 | g_f0486a;
        v4 = ~g_f0486a - (g_f04864 | ~g_f0486a);
        g_f0486a = (v4 ^ v3) + (v4 & v3) * 2;
        v5 = g_f04866 | g_f0486c;
        v6 = -(g_f04866 & g_f0486c);
        g_f0486c = (v5 ^ v6) + (v5 & v6) * 2;
        v7 = -g_f04868;
        g_f0486e = (v7 ^ g_f0486e) + ((g_f0486e + ~g_f0486e * 2 + 1 & g_f04868) + (v7 & g_f0486e)) * 2;
        g_f04870 = g_f04870 - v2 + (v2 & ~g_f04870) * 2;
        g_f04838 = 0;
        return v8;
    }
    return v8;
}
