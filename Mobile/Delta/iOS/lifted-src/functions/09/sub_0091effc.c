/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91effc..0x91f17c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04c40;
extern unsigned short g_f04c42;
extern unsigned short g_f04c44;
extern unsigned short g_f04c46;
extern unsigned long long g_f04c48;
extern unsigned short g_f12784;
extern unsigned short g_f12786;
extern unsigned short g_f12788;
extern unsigned short g_f1278a;

long long sub_91effc(void)
{
    unsigned long long v0;  // x8
    unsigned int v1;  // w15
    unsigned short v2;  // x10
    unsigned short v3;  // x11
    unsigned short v4;  // x11
    unsigned short v5;  // x12
    unsigned short v6;  // x10
    unsigned long v7;  // x0

    v0 = 1220879415943853466 + ((17225864661931396928 + ~17225864661931396928 * 2 + 1 & 32085673253) + 17225864643805710912) * 2;
    g_f12784 = v0;
    g_f12786 = ((unsigned short)(__ROL__((unsigned int)(v0 >> 16) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v0 >> 16) + 0xffff ^ 1);
    g_f12788 = ((unsigned short)(__ROL__((unsigned int)(v0 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v0 >> 32) + 0xffff ^ 1);
    g_f1278a = v0 >> 48;
    v1 = g_f04c40 + ~g_f04c40 * 2 + 1;
    v2 = -g_f12784;
    g_f04c40 = (v2 ^ g_f04c40) + ((unsigned short)v1 + (v2 & g_f04c40) + (g_f12784 | (unsigned short)~v1)) * 2 + 2;
    v3 = -g_f12786;
    g_f04c42 = (v3 ^ g_f04c42) + ((g_f04c42 + ~g_f04c42 * 2 + 1 & g_f12786) + (v3 & g_f04c42)) * 2;
    v4 = -g_f12788;
    g_f04c44 = (v4 ^ g_f04c44) + (g_f12788 & ~g_f04c44 | v4 & g_f04c44) * 2;
    v5 = g_f1278a | g_f04c46;
    v6 = ~g_f04c46 - (g_f1278a | ~g_f04c46);
    g_f04c46 = (v6 ^ v5) + (v6 & v5) * 2;
    g_f04c48 = g_f04c48 - v0 + (g_f04c48 + ~g_f04c48 * 2 + 1 & v0) * 2;
    return v7;
}
