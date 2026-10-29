/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ab12c..0x6ab41c (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ab12c_0 {
    char field_0;
} st_6ab12c_0;

extern unsigned long long g_e82a10;
extern char g_f04970;

unsigned int sub_6ab12c(void)
{
    unsigned int v4;  // w11
    unsigned int v5;  // w11
    unsigned int v14;  // w14
    unsigned int v15;  // w13
    unsigned int v16;  // w14
    unsigned int v17;  // w13
    unsigned int v18;  // w17
    unsigned int v19;  // w15
    unsigned int v20;  // w16
    char v21;  // x12
    char v22;  // x9
    unsigned int v23;  // w9
    unsigned int v6;  // w12
    unsigned int v24;  // w10
    unsigned int v25;  // w10
    unsigned int v26;  // w11
    unsigned int v27;  // w10
    unsigned int v28;  // w10
    unsigned int v29;  // w10
    unsigned int v30;  // w12
    unsigned int v31;  // w14
    unsigned int v32;  // w9
    unsigned int v33;  // w9
    unsigned int v34;  // w9
    unsigned int v8;  // w12
    unsigned int v9;  // w13
    unsigned int v10;  // w14
    unsigned int v11;  // w15
    unsigned int v12;  // w12
    unsigned int v13;  // w16
    st_6ab12c_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_6ab12c_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = ((char)v0 + 94 ^ ((char)v0 + 93 | (char)v0) - (char)v0) + ((char)v0 + 93 | (char)v0);
    v5 = (v4 | (unsigned int)(1 - (v4 + 1 ^ 1))) + ~((v4 + 1 ^ 1) + v4 + 5) + ((v4 + 1 ^ 1) & v4 + 5) & 1;
    v6 = g_f04970 + ~g_f04970 * 2;
    v8 = (char)v1;
    v9 = (char)v0;
    v10 = ((v9 | v8) - 1 ^ v9 + v8) - (v9 + v8 & -(v9 | v8)) * 2 + (v9 | v8);
    v11 = v10 + 1;
    v12 = (v8 - v11 + (v11 | ~v8) ^ (unsigned int)(0xfffffffd - v10)) - (v8 - v11 + (v11 | ~v8) & v10 + 2) * 2 + (v11 | v8);
    v13 = v12 + 1;
    v14 = ((unsigned int)(126 - v10) & v9) * 2;
    v15 = v11 - v9 + (v14 | ~(v11 - v9)) + (v14 | v11 - v9);
    v16 = v15 + 1;
    v17 = v15 + 2;
    v18 = 0xfffffffe - v12;
    v19 = (v17 + ~v16 * 2 & v13) + v16 + ((v12 + 2 + v18 * 2 | v16) ^ (unsigned int)(0xfffffffd - v12)) - ((v12 + 2 + v18 * 2 | v16) & v12 + 2) * 2;
    v20 = v13 + v16;
    v21 = v20 + (v13 - v16 + (v18 & v16)) * 4 - (v13 - v16 + (v18 & v16)) * 2 - ((v12 & v16) - v17 + (v12 | v16)) * 2;
    v22 = (char)(((1 | (v20 * 2 | v20 >> 31) & 2) & 3) - v21 * 2) + (v21 ^ 1);
    if (((v6 ^ ~(v6 + 1 + (v5 | ~(v6 + 1)) + (v5 ^ v6 + 1) + 1)) + (v6 + 1 + (v5 | ~(v6 + 1)) + (v5 ^ v6 + 1) + ((unsigned int)(0xfffffffe - (v6 + 1 + (v5 | ~(v6 + 1)) + (v5 ^ v6 + 1))) | ~v6)) * 2 + 4 & 0xff) != ((unsigned int)(v22 + v19 + v19 + 1 - (v22 + 1 & v19 + 1)) + (v22 + 1 | (unsigned int)(0xfffffffe - v19)) + 4 & 0xff))
        return v19 + 1;
    v23 = (char)v0;
    v24 = v23 + (0xffffffde | ~v23) + 0x22;
    v25 = (__ROL__(v24, 1) & 62 & 63) + (v24 ^ 95);
    v26 = v23 + ~v23 * 2;
    v27 = (0xffffffff ^ v25 * 2) + v25 * 4 + 2;
    v28 = (v27 ^ v26 + 35) + (v27 & v26 + 35) * 2;
    v29 = ~v28 + v28 * 2;
    v30 = v29 * 2;
    v31 = v29 + v23;
    v32 = v30 - (v31 + (v29 | ~v23));
    v33 = (v32 & v31 + ~v30) * 4 + (v32 ^ v31 + ~v30) * 2 | 1;
    v34 = (v33 ^ ~(v26 + v29 + 2) | 0xfffffffe) + (((v33 ^ v26 + v29 + 2) + (v33 & v26 + v29 + 2) * 2) * 2 - 1 & 0xfffffffc) + ~((((v33 ^ v26 + v29 + 2) + (v33 & v26 + v29 + 2) * 2) * 2 & 4) + ((v33 ^ v26 + v29 + 2) + (v33 & v26 + v29 + 2) * 2 ^ 2)) + ((((v33 ^ v26 + v29 + 2) + (v33 & v26 + v29 + 2) * 2) * 2 & 4) + ((v33 ^ v26 + v29 + 2) + (v33 & v26 + v29 + 2) * 2 ^ 2) - ((v33 ^ v26 + v29 + 2) + (v33 & v26 + v29 + 2) * 2)) * 2;
    g_f04970 = (char)v34 + 4 + ((char)v34 + 4 + (char)~(v34 + 3) * 2 | 1);
    (g_e82a10 - 0x8deea800)();
}
