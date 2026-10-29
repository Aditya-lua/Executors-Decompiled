/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51d188..0x51d330 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f047d8;
extern char g_f047e0;
extern unsigned short g_f047f8;
extern unsigned short g_f047fa;
extern unsigned short g_f047fc;
extern unsigned short g_f047fe;
extern unsigned short g_f04800;
extern unsigned short g_f04802;
extern unsigned short g_f04804;
extern unsigned short g_f04806;
extern unsigned long long g_f04808;

long long sub_51d188(void)
{
    unsigned int v0;  // w10
    unsigned long long v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long v4;  // x8
    unsigned long v5;  // x10
    unsigned long long v6;  // x9
    unsigned int v7;  // w14
    unsigned short v8;  // x13
    unsigned long v9;  // x0

    v0 = g_f047e0 + ~g_f047e0 * 2;
    if ((-((v0 + (g_f047e0 & 1) + 1 & ~v0) * 2) & 254) != ((char)v0 ^ (char)~(v0 + (g_f047e0 & 1) + 1)))
        return v9;
    g_f047e0 = 1;
    v2 = 0xff51afd7ed558ccd * &(&g_f047f8)[0 & (char *)&g_f047f8 + 0x2 * ~&g_f047f8 + 1];
    v3 = v2 >> 29;
    v4 = v3 | v2;
    v5 = (v3 | ~v2) + v2;
    v6 = v4 + ~v5;
    g_f047fa = ((unsigned short)(__ROL__((unsigned int)v6 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v6 + 0xffff ^ 1);
    g_f047fc = v6 >> 16;
    g_f047fe = v6 >> 32;
    g_f04800 = v6 >> 48;
    g_f047f8 = g_f047f8 - g_f047fa + (g_f047f8 + ~g_f047f8 * 2 + 1 & g_f047fa) * 2;
    g_f04802 = g_f04802 - g_f047fc + (g_f04802 + ~g_f04802 * 2 + 1 & g_f047fc) * 2;
    g_f04804 = g_f04804 - g_f047fe + (g_f04804 + ~g_f04804 * 2 + 1 & g_f047fe) * 2;
    v7 = g_f04806 + ~g_f04806 * 2 + 1;
    v8 = -g_f04800;
    g_f04806 = (v8 ^ g_f04806) + ((unsigned short)v7 + (v8 & g_f04806) + (g_f04800 | (unsigned short)~v7)) * 2 + 2;
    g_f04808 = (g_f04808 & v5 - v4) + v6 - (g_f04808 & v6);
    g_f047d8 = 0;
    return v9;
}
