/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a61c4..0x4a64a4 (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a61c4_0 {
    char field_0;
} st_4a61c4_0;

extern unsigned int g_f03908;
extern char g_f03910;
extern unsigned short g_f043c0;
extern unsigned short g_f043c2;
extern unsigned short g_f043c4;
extern unsigned short g_f043c6;
extern unsigned short g_f043c8;
extern unsigned short g_f043ca;
extern unsigned short g_f043cc;
extern unsigned short g_f043ce;
extern unsigned long long g_f043d0;

long long sub_4a61c4(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w10
    unsigned int v13;  // w9
    unsigned int v14;  // w10
    unsigned int v15;  // w9
    char v16;  // x10
    unsigned long long v17;  // x8
    unsigned long long v18;  // x8
    unsigned short v19;  // x15
    unsigned short v20;  // x10
    unsigned short v21;  // x11
    unsigned int v4;  // w10
    unsigned long long v22;  // x11
    unsigned long long v23;  // x8
    unsigned long v24;  // x0
    unsigned long v25;  // x0
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w12
    unsigned int v8;  // w13
    unsigned int v9;  // w10
    unsigned int v10;  // w11
    unsigned int v11;  // w12
    st_4a61c4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4a61c4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v0;
    v3 = ((v2 | 31) ^ -(v2 & 31)) + ((v2 | 31) & -(v2 & 31)) * 2;
    v4 = (v3 ^ -v2) + (v2 & ~v3 | v3 & -v2) * 2;
    v5 = (char)v1;
    v6 = (char)v0;
    v7 = (v5 + ~v5 * 2 + 1 & v6) * 2;
    v8 = v7 + v5 - v6;
    v9 = v7 - v6 + (v5 & ~v8) * 2;
    v10 = (v8 | v6) - (v8 & v6);
    v11 = (v9 ^ -v10) + (v9 & -v10 | v10 & ~v9) * 2;
    v12 = (v10 ^ -v9) + (v9 & ~v10) * 2 + (v10 & -v9) * 2;
    if (((~v4 * 2 | 3) + (v4 * 2 | 2) & g_f03910) != (char)v12 + 1 + (char)v11 + ((char)-v12 & (char)~v11) * 2 + (char)(v11 - (v12 + 1) - (-v12 | v11)) * 2 + 1)
        return v25;
    v13 = (char)v0;
    v14 = (-(v13 * 2) & 38) + (-v13 ^ 19) + (v13 * 2 & 0xffffffd8);
    v15 = (2 & ~((v14 - v13) * 2)) + (v14 - v13 & 1 | __ROL__(v13 & ~v14, 1) & 0xfffffffe) + v14 - v13;
    v16 = -(v15 - 1 | 1);
    g_f03910 = ((char)v15 ^ v16) + ((char)v15 & v16) * 2;
    v17 = 0xff51afd7ed558ccd * ((char *)&g_f043c0 + ~(~&g_f043c0 + &g_f043c0));
    v18 = ((v17 | v17 >> 29) ^ ~v17 - (v17 >> 29 | ~v17)) + ((v17 | v17 >> 29) & ~v17 - (v17 >> 29 | ~v17)) * 2;
    g_f043c2 = v18;
    g_f043c6 = ((unsigned short)(__ROL__((unsigned int)(v18 >> 16) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v18 >> 16) + 0xffff ^ 1);
    g_f043ca = ((unsigned short)(__ROL__((unsigned int)(v18 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v18 >> 32) + 0xffff ^ 1);
    g_f043ce = v18 >> 48;
    v19 = g_f043c2 | g_f043c0;
    v20 = ~g_f043c0 - (g_f043c2 | ~g_f043c0);
    g_f043c0 = (v20 ^ v19) + (v20 & v19) * 2;
    g_f043c4 = (g_f043c4 | g_f043c6) - (g_f043c6 & g_f043c4);
    v21 = -g_f043ca;
    g_f043c8 = (v21 ^ g_f043c8) + ((g_f043c8 + ~g_f043c8 * 2 + 1 & g_f043ca) + (v21 & g_f043c8)) * 2;
    g_f043cc = g_f043cc - g_f043ce + (g_f043ce & ~g_f043cc) * 2;
    v22 = g_f043d0 | v18;
    v23 = -(g_f043d0 & v18);
    g_f043d0 = (v22 ^ v23) + (v22 & v23) * 2;
    g_f03908 = 0;
    return v24;
}
