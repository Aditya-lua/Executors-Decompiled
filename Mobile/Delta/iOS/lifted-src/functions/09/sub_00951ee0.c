/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x951ee0..0x952050 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f049d8;
extern char g_f049e0;
extern unsigned short g_f04c50;
extern unsigned short g_f04c52;
extern unsigned short g_f04c54;
extern unsigned short g_f04c56;
extern unsigned short g_f04c58;
extern unsigned short g_f04c5a;
extern unsigned short g_f04c5c;
extern unsigned short g_f04c5e;
extern unsigned long long g_f04c60;

long long sub_951ee0(void)
{
    unsigned long long v1;  // x8
    unsigned int v2;  // w11
    unsigned int v3;  // w15
    unsigned short v4;  // x12
    unsigned short v5;  // x10
    unsigned short v6;  // x11
    unsigned long v7;  // x0

    if (!~(char)(g_f049e0 - (g_f049e0 | 1)))
    {
        g_f049e0 = 1;
        v1 = 2005915870761276147 + ((16440828198095739920 + ~16440828198095739920 * 2 + 1 & 30623428892) + 0xe4298e2090b08c00) * 2;
        g_f04c52 = v1;
        g_f04c54 = v1 >> 16;
        g_f04c56 = v1 >> 32;
        g_f04c58 = v1 >> 48;
        v2 = g_f04c50 + 1;
        v3 = v2 + ~g_f04c50 * 2;
        g_f04c50 = (unsigned short)(v2 - g_f04c52) + ((unsigned short)v3 + (g_f04c52 | (unsigned short)~v3)) * 2 + 1;
        v4 = g_f04c54 | g_f04c5a;
        v5 = ~g_f04c5a - (g_f04c54 | ~g_f04c5a);
        g_f04c5a = (v5 ^ v4) + (v5 & v4) * 2;
        g_f04c5c = (g_f04c5c | g_f04c56) - (g_f04c56 & g_f04c5c);
        v6 = -g_f04c58;
        g_f04c5e = (v6 ^ g_f04c5e) + (v6 & g_f04c5e | g_f04c58 & ~g_f04c5e) * 2;
        g_f04c60 = g_f04c60 - v1 + (g_f04c60 + ~g_f04c60 * 2 + 1 & v1) * 2;
        g_f049d8 = 0;
        return v7;
    }
    return v7;
}
