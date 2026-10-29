/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50b930..0x50ba8c (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04770;
extern unsigned short g_f04772;
extern unsigned short g_f04774;
extern unsigned short g_f04776;
extern unsigned short g_f04778;
extern unsigned short g_f0477a;
extern unsigned short g_f0477c;
extern unsigned short g_f0477e;
extern unsigned long long g_f04780;

int sub_50b930(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned short v10;  // x13
    unsigned short v11;  // x11
    long long v2;  // x9
    unsigned long long v3;  // x12
    unsigned long long v4;  // x9
    unsigned long long v5;  // x8
    unsigned short v6;  // x16
    unsigned short v7;  // x11
    unsigned short v8;  // x13
    unsigned short v9;  // x11

    v0 = 0xff51afd7ed558ccd * (0xffffffffff0fb88f + (0 & ~&g_f04770 | 15746928) * 2);
    v1 = v0 >> 29;
    v2 = -v1;
    v3 = (v0 ^ v2) + 1;
    v4 = v3 + (v1 & ~v0) * 2 + (v0 & v2) * 2;
    v5 = v4 - 1;
    g_f04772 = ((unsigned short)v4 ^ 1) + ((unsigned short)(__ROL__((unsigned int)v3, 1)) & 2 & 3) + 0xfffe;
    g_f04774 = v5 >> 16;
    g_f04776 = v5 >> 32;
    g_f04778 = v5 >> 48;
    v6 = g_f04772 | g_f04770;
    v7 = ~g_f04770 - (g_f04772 | ~g_f04770);
    g_f04770 = (v7 ^ v6) + (v7 & v6) * 2;
    v8 = g_f04774 | g_f0477a;
    v9 = -(g_f04774 & g_f0477a);
    g_f0477a = (v8 ^ v9) + (v8 & v9) * 2;
    g_f0477c = g_f0477c - g_f04776 + (g_f04776 & ~g_f0477c) * 2;
    v10 = g_f04778 | g_f0477e;
    v11 = ~g_f0477e - (g_f04778 | ~g_f0477e);
    g_f0477e = (v11 ^ v10) + (v11 & v10) * 2;
    g_f04780 = (g_f04780 & -v4) + v5 - (g_f04780 & v5);
    return 0;
}
