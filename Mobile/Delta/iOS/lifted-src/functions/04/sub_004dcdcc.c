/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dcdcc..0x4dd24c (1152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dcdcc_0 {
    char field_0;
} st_4dcdcc_0;

extern unsigned short g_f043b0;
extern unsigned short g_f043b2;
extern unsigned short g_f043b4;
extern unsigned short g_f043b6;
extern unsigned long long g_f043b8;
extern unsigned short g_f11fc0;
extern unsigned short g_f11fc2;
extern unsigned short g_f11fc4;
extern unsigned short g_f11fc6;

unsigned long long sub_4dcdcc(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x8
    unsigned long long v14;  // x12
    unsigned int v15;  // w12
    unsigned long long v16;  // x12
    unsigned long long v17;  // x14
    unsigned int v18;  // w12
    unsigned long long v19;  // x13
    unsigned long long v20;  // x13
    unsigned long long v21;  // x14
    unsigned long long v22;  // x15
    unsigned long long v23;  // x15
    unsigned long long v6;  // x10
    unsigned long long v24;  // x13
    unsigned long v25;  // x14
    unsigned int v26;  // w15
    unsigned short v27;  // x10
    unsigned int v28;  // w12
    unsigned short v29;  // x11
    unsigned int v7;  // w10
    unsigned short v8;  // x10
    unsigned long long v9;  // x11
    unsigned long v10;  // x12
    unsigned long long v11;  // x13
    unsigned long long v12;  // x16
    unsigned long long v13;  // x14
    st_4dcdcc_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    unsigned long long v1;  // [bp-0x10]
    st_4dcdcc_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long
    unsigned long long v3;  // [bp-0x8]

    v2 = &v0;
    v0 = &v2;
    v4 = 0xff51afd7ed558ccd * ((char *)&g_f043b0 + ~(~&g_f043b0 + &g_f043b0));
    v5 = ((v4 | v4 >> 29) ^ ~v4 - (v4 >> 29 | ~v4)) + ((v4 | v4 >> 29) & ~v4 - (v4 >> 29 | ~v4)) * 2;
    v6 = v2 - v0 - (v0 ^ -v2) + (((char *)v2 + 0x2 * ~v2 + 1 & v0) - (v0 & -v2 | v2 & ~v0)) * 2;
    v0 = ~((128634 & v6 * 2) + (v6 ^ 64317)) + ((128634 & v6 * 2) + (v6 ^ 64317)) * 2;
    v2 = v6 + 1219;
    v7 = (unsigned int)v2 + (unsigned int)v0;
    v8 = -(v7 | (unsigned int)v5);
    g_f11fc0 = ((unsigned short)v7 + (unsigned short)v5 ^ v8) + ((unsigned short)v7 + (unsigned short)v5 & v8) * 2;
    v9 = (v0 ^ v2) - ((v0 ^ -v2) + (v0 & -v2) * 2) + (v0 - (v0 | v2)) * 2;
    v0 = v9 + 12;
    v2 = (~v9 | 4) - (v9 & 4) + v9 * 2 + 5;
    v10 = v2;
    v11 = v0;
    v12 = -v11;
    v13 = v10 + ~v10 * 2 + 1 + (v10 & v12) + (v11 | ~(v10 + ~v10 * 2 + 1));
    v14 = ((v10 ^ v12) + v13 * 2 + 2 ^ v11 + (v10 | ~v11) - (v11 | v10) + 1) + ((v10 ^ v12) + v13 * 2 + 2 & v11 + (v10 | ~v11) - (v11 | v10) + 1) * 2;
    v1 = v14 + 44649;
    v3 = v14 + 1 + (-((unsigned int)v14 + 1) | 0xffffffffffffae69) + ((unsigned int)v14 - 0 & 20886) + 20886;
    v15 = ((unsigned int)v3 + 1 ^ (unsigned int)v1) + ((unsigned int)v3 + 1 & (unsigned int)v1) * 2;
    g_f11fc2 = (unsigned short)~v15 + (unsigned short)v15 * 2 & (unsigned short)(v5 >> (((char)v0 | (char)v2) + ((char)v2 & (char)v0) & 63));
    v16 = v3 + 1 - v1 + (v3 ^ -v1) + (0xffffffffffffffff ^ (v3 & ~v1) * 2) + ((v3 + 1 + ~v3 * 2 & v1) + (v3 & -v1)) * 2;
    v17 = v16 * 2;
    v0 = ~((v17 & 8) + (v16 ^ 4)) + ((v17 & 8) + (v16 ^ 4)) * 2;
    v2 = (v16 ^ 30) + (v17 & 60) - 1;
    v18 = v5 >> ((char)v0 + ((char)v2 | (char)~v0) + ((char)v2 | (char)v0) + 1 & 63);
    v19 = ((v0 | v2) ^ -(v0 & v2)) + (v0 | v2) - ((v2 | ~v0) + v0) + ((v2 | ~v0) + v0 - (v0 | v2) + ((v0 | v2) & -(v0 & v2))) * 2;
    v0 = v19 + 557;
    v2 = v19 + 64980;
    g_f11fc4 = (((unsigned short)v2 + (unsigned short)v0 | (unsigned short)~v18) ^ (unsigned short)v18 + 1) + (((unsigned short)v2 + (unsigned short)v0 | (unsigned short)~v18) & (unsigned short)v18 + 1) * 2;
    v20 = v2;
    v21 = v0;
    v22 = v20 + ~v20 * 2 + 1;
    v23 = v20 - v21 + (v22 + (v21 | ~v22)) * 2 + 2;
    v24 = (v23 ^ -(v21 ^ v20)) + (v23 + (-(v21 ^ v20) | ~v23)) * 2;
    v25 = (88 & (v24 + 2) * 2) + (v24 + 2 ^ 44);
    v0 = v24 + 7;
    v2 = ~v25 + v25 * 2;
    g_f11fc6 = v5 >> ((char)v2 + (char)v0 & 63);
    v26 = g_f043b0 + ~g_f043b0 * 2 + 1;
    v27 = -g_f11fc0;
    g_f043b0 = (v27 ^ g_f043b0) + ((unsigned short)v26 + (v27 & g_f043b0) + (g_f11fc0 | (unsigned short)~v26)) * 2 + 2;
    g_f043b2 = (g_f043b2 | g_f11fc2) - (g_f11fc2 & g_f043b2);
    g_f043b4 = (g_f11fc4 | g_f043b4) + (unsigned short)~((g_f11fc4 | ~g_f043b4) + g_f043b4);
    v28 = g_f043b6 + ~g_f043b6 * 2 + 1;
    v29 = -g_f11fc6;
    g_f043b6 = (v29 ^ g_f043b6) + ((unsigned short)v28 + (v29 & g_f043b6) + (g_f11fc6 | (unsigned short)~v28)) * 2 + 2;
    g_f043b8 = g_f043b8 - v5 + (v5 & ~g_f043b8) * 2;
    return 0xffffffffffffffff;
}
