/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40ccf0..0x40ce48 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04400;
extern unsigned short g_f04402;
extern unsigned short g_f04404;
extern unsigned short g_f04406;
extern unsigned long long g_f04408;
extern unsigned short g_f11fd0;
extern unsigned short g_f11fd2;
extern unsigned short g_f11fd4;
extern unsigned short g_f11fd6;

int sub_40ccf0(void)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x8
    unsigned int v2;  // w10
    unsigned int v3;  // w15
    unsigned short v4;  // x13
    unsigned short v5;  // x10

    v0 = 0xff51afd7ed558ccd * ((char *)&g_f04400 + ~(~&g_f04400 + &g_f04400));
    v1 = ((v0 | v0 >> 29) ^ ~v0 - (v0 >> 29 | ~v0)) + ((v0 | v0 >> 29) & ~v0 - (v0 >> 29 | ~v0)) * 2;
    g_f11fd0 = ((unsigned short)(__ROL__((unsigned int)v1 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v1 + 0xffff ^ 1);
    g_f11fd2 = v1 >> 16;
    g_f11fd4 = ((unsigned short)(__ROL__((unsigned int)(v1 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v1 >> 32) + 0xffff ^ 1);
    g_f11fd6 = v1 >> 48;
    v2 = g_f04400 + 1;
    v3 = v2 + ~g_f04400 * 2;
    g_f04400 = (unsigned short)(v2 - g_f11fd0) + ((unsigned short)v3 + (g_f11fd0 | (unsigned short)~v3)) * 2 + 1;
    v4 = g_f11fd2 | g_f04402;
    v5 = -(g_f11fd2 & g_f04402);
    g_f04402 = (v4 ^ v5) + (v4 & v5) * 2;
    g_f04404 = (g_f11fd4 | g_f04404) + (unsigned short)~((g_f11fd4 | ~g_f04404) + g_f04404);
    g_f04406 = (g_f11fd6 | g_f04406) + (unsigned short)~((g_f11fd6 | ~g_f04406) + g_f04406);
    g_f04408 = g_f04408 ^ v1;
    return 0;
}
