/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaba5f8..0xabaf10 (2328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aba5f8_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_aba5f8_0;

extern st_aba5f8_0 g_df6fa4;
extern st_aba5f8_0 g_df73a4;
extern st_aba5f8_0 g_df77a4;
extern st_aba5f8_0 g_df7ba4;
extern char g_1000000;

unsigned int sub_aba5f8(char *a0, unsigned int *a1)
{
    unsigned int v0;  // w16
    unsigned int v1;  // w17
    unsigned int v10;  // w16
    unsigned int v11;  // w0
    unsigned int v12;  // w13
    unsigned int v13;  // w12
    unsigned int v14;  // w15
    unsigned int v15;  // w16
    unsigned int v16;  // w13
    unsigned int v17;  // w17
    unsigned int v18;  // w12
    unsigned int v19;  // w15
    unsigned int v2;  // w2
    unsigned int v20;  // w14
    unsigned int v21;  // w16
    unsigned int v22;  // w13
    unsigned int v23;  // w15
    unsigned int v24;  // w12
    unsigned int v25;  // w16
    unsigned int v26;  // w14
    unsigned int v27;  // w15
    unsigned int v28;  // w13
    unsigned int v29;  // w16
    unsigned int v3;  // w3
    unsigned int v30;  // w12
    unsigned int v31;  // w15
    unsigned int v32;  // w14
    unsigned int v33;  // w16
    unsigned int v34;  // w13
    unsigned int v35;  // w12
    unsigned int v36;  // w15
    unsigned int v37;  // w14
    unsigned int v38;  // w17
    unsigned int v39;  // w0
    unsigned int v4;  // w12
    unsigned int v40;  // w13
    unsigned int v41;  // w12
    unsigned int v5;  // w14
    unsigned int v6;  // w13
    unsigned int v7;  // w15
    unsigned int v8;  // w11
    unsigned int v9;  // w0

    v0 = *a0 * &g_1000000 | a0[1] * 0x10000 | a0[2] * 0x100;
    v1 = a0[3];
    v2 = a0[4] * &g_1000000 | a0[5] * 0x10000 | a0[6] * 0x100;
    v3 = a0[7];
    v4 = a0[8];
    v5 = v4 * &g_1000000 | a0[9] * 0x10000 | a0[11] | a0[10] * 0x100;
    v6 = a0[12];
    v7 = v6 * &g_1000000 | a0[13] * 0x10000 | a0[15] | a0[14] * 0x100;
    v8 = (v0 | v1) + v5 + 1640531527;
    v9 = (v2 | v3) - v7 + 2654435769;
    *a1 = (&g_df73a4.field_0)[__ROL__(v8, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[(v0 | v1) + v5 + 1640531527 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v8, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[(v0 | v1) + v5 + 1640531527 >> 24];
    a1[1] = (&g_df73a4.field_0)[__ROL__(v9, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[(v2 | v3) - v7 + 2654435769 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v9, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[(v2 | v3) - v7 + 2654435769 >> 24];
    v10 = v3 * &g_1000000 | v0 >> 8;
    v11 = v1 * &g_1000000 | v2 >> 8;
    a1[2] = (&g_df73a4.field_0)[__ROL__(v10 + v5 + 3281063053, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v10 + v5 + 3281063053 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v10 + v5 + 3281063053, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v10 + v5 + 3281063053 >> 24];
    a1[3] = (&g_df73a4.field_0)[__ROL__(v11 - v7 + 1013904243, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v11 - v7 + 1013904243 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v11 - v7 + 1013904243, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v11 - v7 + 1013904243 >> 24];
    v12 = v6 & 0xff | __ROL__(v5, 8) & 0xffffff00;
    v13 = v4 & 0xff | __ROL__(v7, 8) & 0xffffff00;
    a1[4] = (&g_df73a4.field_0)[__ROL__(v10 + v12 + 2267158810, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v10 + v12 + 2267158810 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v10 + v12 + 2267158810, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v10 + v12 + 2267158810 >> 24];
    a1[5] = (&g_df73a4.field_0)[__ROL__(v11 - v13 + 2027808486, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v11 - v13 + 2027808486 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v11 - v13 + 2027808486, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v11 - v13 + 2027808486 >> 24];
    v14 = v11 * &g_1000000 | v10 >> 8;
    v15 = v10 * &g_1000000 | v11 >> 8;
    a1[6] = (&g_df73a4.field_0)[__ROL__(v14 + v12 + 239350324, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v14 + v12 + 239350324 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v14 + v12 + 239350324, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v14 + v12 + 239350324 >> 24];
    a1[7] = (&g_df73a4.field_0)[__ROL__(v15 - v13 + 4055616972, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v15 - v13 + 4055616972 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v15 - v13 + 4055616972, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v15 - v13 + 4055616972 >> 24];
    v16 = v12 * 0x100 | v7 * 0x100 >> 24;
    v17 = v13 * 0x100 | v5 * 0x100 >> 24;
    a1[8] = (&g_df73a4.field_0)[__ROL__(v14 + v16 + 478700647, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v14 + v16 + 478700647 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v14 + v16 + 478700647, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v14 + v16 + 478700647 >> 24];
    a1[9] = (&g_df73a4.field_0)[__ROL__(v15 - v17 + 3816266649, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v15 - v17 + 3816266649 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v15 - v17 + 3816266649, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v15 - v17 + 3816266649 >> 24];
    v18 = v15 * &g_1000000 | v14 >> 8;
    v19 = v14 * &g_1000000 | v15 >> 8;
    a1[10] = (&g_df73a4.field_0)[__ROL__(v18 + v16 + 957401293, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v18 + v16 + 957401293 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v18 + v16 + 957401293, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v18 + v16 + 957401293 >> 24];
    a1[11] = (&g_df73a4.field_0)[__ROL__(v19 - v17 + 3337566003, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v19 - v17 + 3337566003 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v19 - v17 + 3337566003, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v19 - v17 + 3337566003 >> 24];
    v20 = v16 * 0x100 | v17 >> 24;
    v21 = v17 * 0x100 | v16 >> 24;
    a1[12] = (&g_df73a4.field_0)[__ROL__(v18 + v20 + 1914802585, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v18 + v20 + 1914802585 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v18 + v20 + 1914802585, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v18 + v20 + 1914802585 >> 24];
    a1[13] = (&g_df73a4.field_0)[__ROL__(v19 - v21 + 2380164711, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v19 - v21 + 2380164711 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v19 - v21 + 2380164711, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v19 - v21 + 2380164711 >> 24];
    v22 = v19 * &g_1000000 | v18 >> 8;
    v23 = v18 * &g_1000000 | v19 >> 8;
    a1[14] = (&g_df73a4.field_0)[__ROL__(v22 + v20 + 3829605169, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v22 + v20 + 3829605169 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v22 + v20 + 3829605169, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v22 + v20 + 3829605169 >> 24];
    a1[15] = (&g_df73a4.field_0)[__ROL__(v23 - v21 + 465362127, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v23 - v21 + 465362127 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v23 - v21 + 465362127, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v23 - v21 + 465362127 >> 24];
    v24 = v20 * 0x100 | v21 >> 24;
    v25 = v21 * 0x100 | v20 >> 24;
    a1[16] = (&g_df73a4.field_0)[__ROL__(v22 + v24 + 3364243042, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v22 + v24 + 3364243042 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v22 + v24 + 3364243042, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v22 + v24 + 3364243042 >> 24];
    a1[0x11] = (&g_df73a4.field_0)[__ROL__(v23 - v25 + 930724254, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v23 - v25 + 930724254 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v23 - v25 + 930724254, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v23 - v25 + 930724254 >> 24];
    v26 = v23 * &g_1000000 | v22 >> 8;
    v27 = v22 * &g_1000000 | v23 >> 8;
    a1[18] = (&g_df73a4.field_0)[__ROL__(v26 + v24 + 2433518788, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v26 + v24 + 2433518788 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v26 + v24 + 2433518788, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v26 + v24 + 2433518788 >> 24];
    a1[19] = (&g_df73a4.field_0)[__ROL__(v27 - v25 + 1861448508, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v27 - v25 + 1861448508 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v27 - v25 + 1861448508, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v27 - v25 + 1861448508 >> 24];
    v28 = v24 * 0x100 | v25 >> 24;
    v29 = v25 * 0x100 | v24 >> 24;
    a1[20] = (&g_df73a4.field_0)[__ROL__(v26 + v28 + 572070280, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v26 + v28 + 572070280 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v26 + v28 + 572070280, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v26 + v28 + 572070280 >> 24];
    a1[21] = (&g_df73a4.field_0)[__ROL__(v27 - v29 + 3722897016, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v27 - v29 + 3722897016 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v27 - v29 + 3722897016, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v27 - v29 + 3722897016 >> 24];
    v30 = v27 * &g_1000000 | v26 >> 8;
    v31 = v26 * &g_1000000 | v27 >> 8;
    a1[22] = (&g_df73a4.field_0)[__ROL__(v30 + v28 + 1144140559, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v30 + v28 + 1144140559 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v30 + v28 + 1144140559, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v30 + v28 + 1144140559 >> 24];
    a1[23] = (&g_df73a4.field_0)[__ROL__(v31 - v29 + 3150826737, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v31 - v29 + 3150826737 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v31 - v29 + 3150826737, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v31 - v29 + 3150826737 >> 24];
    v32 = v28 * 0x100 | v29 >> 24;
    v33 = v29 * 0x100 | v28 >> 24;
    a1[24] = (&g_df73a4.field_0)[__ROL__(v30 + v32 + 2288281117, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v30 + v32 + 2288281117 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v30 + v32 + 2288281117, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v30 + v32 + 2288281117 >> 24];
    a1[25] = (&g_df73a4.field_0)[__ROL__(v31 - v33 + 2006686179, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v31 - v33 + 2006686179 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v31 - v33 + 2006686179, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v31 - v33 + 2006686179 >> 24];
    v34 = v31 * &g_1000000 | v30 >> 8;
    v35 = v30 * &g_1000000 | v31 >> 8;
    a1[26] = (&g_df73a4.field_0)[__ROL__(v34 + v32 + 281594938, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v34 + v32 + 281594938 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v34 + v32 + 281594938, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v34 + v32 + 281594938 >> 24];
    a1[27] = (&g_df73a4.field_0)[__ROL__(v35 - v33 + 4013372358, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v35 - v33 + 4013372358 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v35 - v33 + 4013372358, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v35 - v33 + 4013372358 >> 24];
    v36 = v32 * 0x100 | v33 >> 24;
    v37 = v33 * 0x100 | v32 >> 24;
    v38 = v35 - v37 + 3731777421;
    a1[28] = (&g_df73a4.field_0)[__ROL__(v34 + v36 + 563189875, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v34 + v36 + 563189875 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v34 + v36 + 563189875, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v34 + v36 + 563189875 >> 24];
    v39 = (&g_df77a4.field_0)[__ROL__(v38, 16) & 0xffff00ff & 0xff];
    a1[29] = (&g_df73a4.field_0)[__ROL__(v38, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v38 & 0xff] ^ v39 ^ (&g_df7ba4.field_0)[v38 >> 24];
    v40 = (v35 * &g_1000000 | v34 >> 8) + v36 + 1126379749;
    v41 = (v34 * &g_1000000 | v35 >> 8) - v37 + 3168587547;
    a1[30] = (&g_df73a4.field_0)[__ROL__(v40, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[(v35 * &g_1000000 | v34 >> 8) + v36 + 1126379749 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v40, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[(v35 * &g_1000000 | v34 >> 8) + v36 + 1126379749 >> 24];
    a1[31] = (&g_df73a4.field_0)[__ROL__(v41, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v41 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v41, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v41 >> 24];
    return v39;
}
