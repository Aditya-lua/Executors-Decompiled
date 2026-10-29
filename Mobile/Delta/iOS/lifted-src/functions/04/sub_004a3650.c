/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a3650..0x4a390c (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a3650_0 {
    char field_0;
} st_4a3650_0;

extern unsigned long long g_4341fc;

void sub_4a3650(void)
{
    unsigned long long v8;  // x30
    st_4a3650_0 *v9;  // x9
    unsigned long long v18;  // x12
    unsigned long long v19;  // x10
    unsigned long long v20;  // x10
    unsigned long long v21;  // x9
    unsigned long long v22;  // x8
    st_4a3650_0 *v23;  // x9
    st_4a3650_0 **v24;  // x10
    st_4a3650_0 **v25;  // x11
    unsigned long long v26;  // x14
    unsigned long long v27;  // x13
    st_4a3650_0 **v10;  // x10
    unsigned long long v28;  // x9
    unsigned long long v29;  // x9
    unsigned long long v30;  // x11
    unsigned long long v31;  // x9
    unsigned long long v32;  // x10
    unsigned long long v33;  // x13
    unsigned long v34;  // x9
    unsigned long long v35;  // x10
    unsigned long long v36;  // x9
    unsigned long long v37;  // x9
    unsigned long long v11;  // x11
    unsigned long long v12;  // x13
    unsigned long long v13;  // x9
    unsigned long long v14;  // x13
    unsigned long long v15;  // x10
    unsigned long long v16;  // x9
    unsigned long long v17;  // x11
    st_4a3650_0 **v1;  // [bp-0x30], Other Possible Types: char
    st_4a3650_0 *v2;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x20]
    unsigned long long *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v2 = &v1;
    v1 = &v2;
    v3 = &g_4341fc;
    v9 = v2;
    v10 = v1;
    v11 = (-((v10 + v9 ^ -(v10 | v9)) + (v10 + v9 & -(v10 | v9)) * 2) ^ (v10 | v9)) + (-((v10 + v9 ^ -(v10 | v9)) + (v10 + v9 & -(v10 | v9)) * 2) & (v10 | v9)) * 2;
    v12 = &v9[v11 & (char *)v9 + 0x2 * ~v9 + 1];
    v13 = (v12 & ~&v9[v11 | ~v9]) * 2 - (&v9[v11 | ~v9] ^ v12);
    v14 = v13 - 1;
    v15 = v11 + (char *)v10 - (v11 & v10) + (v11 + 1 ^ ~(st_4a3650_0 **)((char *)v10 + ~(v11 | v10))) + -2 * ((char *)v10 + ~(v11 | v10) & v11 + 1) + 1;
    v16 = (v14 & ~v15) - v13 + (v14 | v15);
    v17 = v16 + 1;
    v18 = (v15 ^ 1) + ~v15 * 2 + ((v15 * 2 | v15 >> 63) & 2 & 3);
    v19 = (v15 - v14 | ((v14 | ~v18) & v18 + 1) * 4 + ((v14 | ~v18) ^ v18 + 1) * 2) + (((v14 | ~v18) & v18 + 1) * 4 + ((v14 | ~v18) ^ v18 + 1) * 2 & v15 - v14);
    v20 = (v19 ^ v17) + ((v19 & v17) + ~v16 - v19 + (v19 - 1 & v17)) * 2;
    v21 = ((0x7ffffffffffffffe - v16 | -v19) + v17) * 2 + 3;
    v22 = (char *)&g_4341fc + (v20 ^ v21) + 2 * (v20 & v21) - 1;
    v23 = v2;
    v24 = v1;
    v25 = -v24;
    v26 = v24 + v23;
    v27 = v26 + ((v25 & ~v23) + v23 - v24 - (v23 | v25)) * 2;
    v28 = v26 + (-v23 & ~v24) * 2 + ((char *)v24 + (-v23 | ~v24)) * 2;
    v29 = v28 + (((v24 | v23) & v25) * 4 + ((v24 | v23) ^ v25) * 2 | ~(v28 + 2)) + (v28 + 2 | ((v24 | v23) & v25) * 4 + ((v24 | v23) ^ v25) * 2) + 3;
    v30 = v27 + ((v24 & ~v23) * 2 | ~v27) + (v27 | (v24 & ~v23) * 2) + (v29 ^ 1) + 1;
    v31 = v30 + ~v29 * 2 + ((v29 * 2 | v29 >> 63) & 2 & 3) & 0xfffffffffffffffe | v30 & 1;
    v32 = v31 + 2;
    v33 = v32 - v32 * 2 + v32 + (21 | ~(v32 - v32 * 2));
    v1 = (0xfffffffffffffffe - v31 | 21) + v32 + v33 + (~v32 - (0xfffffffffffffffe - v31 | 21) | ~v33) + (v33 & (0xfffffffffffffffe - v31 | 21) + v32) + 1;
    v2 = v31 + 12;
    v34 = v1;
    v35 = v2;
    v36 = v34 + 1 + v35 + (v34 + 1 + ~v34 * 2 | ~v35);
    v37 = (v35 | ~v34) + v34 + (0xfffffffffffffffe - ((v35 | ~v34) + v34) | v36) + ((v35 | ~v34) + v34 + 1 | v36) + 3;
    v4 = (v22 ^ v37) + (v22 & v37) * 2 - 1;
    v4();
}
