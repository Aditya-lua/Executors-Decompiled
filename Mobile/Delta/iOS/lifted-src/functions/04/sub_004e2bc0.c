/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e2bc0..0x4e2d4c (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f03918;
extern char g_f03920;
extern unsigned short g_f04720;
extern unsigned short g_f04722;
extern unsigned short g_f04724;
extern unsigned short g_f04726;
extern unsigned short g_f04728;
extern unsigned short g_f0472a;
extern unsigned short g_f0472c;
extern unsigned short g_f0472e;
extern unsigned long long g_f04730;

long long sub_4e2bc0(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned int v2;  // w15
    unsigned long long v3;  // x11
    unsigned long long v4;  // x8
    unsigned long v5;  // x0

    if (g_f03920 & 1)
        return v5;
    g_f03920 = 1;
    v0 = 0xff51afd7ed558ccd * ((char *)&g_f04720 + ~(~&g_f04720 + &g_f04720));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f04722 = v1;
    g_f04724 = (((unsigned short)(v1 >> 16) ^ 0xffff) + (unsigned short)(v1 >> 16) ^ (unsigned short)(v1 >> 16) + 1) + (((unsigned short)(v1 >> 16) ^ 0xffff) + (unsigned short)(v1 >> 16) & (unsigned short)(v1 >> 16) + 1) * 2;
    g_f04726 = ((unsigned short)(__ROL__((unsigned int)(v1 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v1 >> 32) + 0xffff ^ 1);
    g_f04728 = v1 >> 48;
    v2 = g_f04720 + ~g_f04720 * 2 + 1;
    g_f04720 = g_f04720 - g_f04722 + ((unsigned short)v2 + (g_f04722 | (unsigned short)~v2)) * 2 + 2;
    g_f0472a = (g_f04724 | g_f0472a) + (unsigned short)~((g_f04724 | ~g_f0472a) + g_f0472a);
    g_f0472c = (g_f04726 | g_f0472c) + (unsigned short)~((g_f04726 | ~g_f0472c) + g_f0472c);
    g_f0472e = g_f0472e - g_f04728 + (g_f0472e + ~g_f0472e * 2 + 1 & g_f04728) * 2;
    v3 = g_f04730 | v1;
    v4 = -(g_f04730 & v1);
    g_f04730 = (v3 ^ v4) + (v3 & v4) * 2;
    *(unsigned int *)&g_f03918 = 0;
    return v5;
}
