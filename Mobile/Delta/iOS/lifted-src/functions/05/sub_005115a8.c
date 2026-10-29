/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5115a8..0x5116ec (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04810;
extern unsigned short g_f04812;
extern unsigned short g_f04814;
extern unsigned short g_f04816;
extern unsigned short g_f04818;
extern unsigned short g_f0481a;
extern unsigned short g_f0481c;
extern unsigned short g_f0481e;
extern unsigned long long g_f04820;

int sub_5115a8(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned short v2;  // x15
    unsigned short v3;  // x10
    unsigned int v4;  // w12
    unsigned long long v5;  // x11
    unsigned long long v6;  // x8

    v0 = 0xff51afd7ed558ccd * &(&g_f04810)[0 & (char *)&g_f04810 + 0x2 * ~&g_f04810 + 1];
    v1 = (v0 >> 29 | v0) + ~((v0 >> 29 | ~v0) + v0);
    g_f04812 = ((unsigned short)(__ROL__((unsigned int)v1 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v1 + 0xffff ^ 1);
    g_f04814 = v1 >> 16;
    g_f04816 = v1 >> 32;
    g_f04818 = v1 >> 48;
    v2 = g_f04810 | g_f04812;
    v3 = -(g_f04812 & g_f04810);
    g_f04810 = (v2 ^ v3) + (v2 & v3) * 2;
    g_f0481a = g_f0481a - g_f04814 + (g_f04814 & ~g_f0481a) * 2;
    v4 = g_f0481c + ~g_f0481c * 2 + 1;
    g_f0481c = g_f0481c - g_f04816 + ((unsigned short)v4 + (g_f04816 | (unsigned short)~v4)) * 2 + 2;
    g_f0481e = g_f04818 ^ g_f0481e;
    v5 = g_f04820 | v1;
    v6 = ~g_f04820 - (v1 | ~g_f04820);
    g_f04820 = (v6 ^ v5) + (v6 & v5) * 2;
    return 0;
}
