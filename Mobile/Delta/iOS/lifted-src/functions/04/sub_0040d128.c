/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40d128..0x40d41c (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40d128_0 {
    char field_0;
} st_40d128_0;

extern unsigned long long g_422bbc;

void sub_40d128(void)
{
    unsigned long long v7;  // x30
    st_40d128_0 *v8;  // x9
    unsigned long long v17;  // x11
    unsigned long long v18;  // x12
    unsigned long long v19;  // x10
    unsigned long long v20;  // x13
    unsigned long long v21;  // x15
    unsigned long long v22;  // x13
    unsigned long long v23;  // x15
    unsigned long long v24;  // x9
    unsigned long long v25;  // x10
    unsigned long v26;  // x11
    st_40d128_0 **v9;  // x10
    unsigned long long v27;  // x9
    unsigned long long v28;  // x9
    unsigned long long v29;  // x12
    unsigned long long v30;  // x9
    st_40d128_0 *v31;  // x12
    st_40d128_0 **v32;  // x13
    unsigned long long v33;  // x14
    unsigned long long v34;  // x12
    unsigned long long v35;  // x12
    unsigned long long v36;  // x14
    unsigned long long v10;  // x12
    unsigned long long v37;  // x12
    unsigned long long v38;  // x12
    unsigned long v39;  // x13
    unsigned long long v40;  // x14
    unsigned long long v11;  // x13
    unsigned long long v12;  // x15
    unsigned long long v13;  // x9
    unsigned long long v14;  // x16
    unsigned long long v15;  // x14
    unsigned long long v16;  // x10
    st_40d128_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_40d128_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_422bbc;
    v8 = v1;
    v9 = v0;
    v10 = ((v8 | v9) - 1 ^ v9 + v8) - (v9 + v8 & -(v8 | v9)) * 2 + (v8 | v9);
    v11 = v10 + 1;
    v12 = v11 * 2;
    v13 = ((((3 - ((v11 ^ 1) - v10 * 2 + (v12 & 2)) | v8) & (v11 ^ 1) - v10 * 2 + (v12 & 2) - 3) * 4 + ((3 - ((v11 ^ 1) - v10 * 2 + (v12 & 2)) | v8) ^ (v11 ^ 1) - v10 * 2 + (v12 & 2) - 3) * 2 | 1) ^ v11 - (char *)v8) + ((((3 - ((v11 ^ 1) - v10 * 2 + (v12 & 2)) | v8) & (v11 ^ 1) - v10 * 2 + (v12 & 2) - 3) * 4 + ((3 - ((v11 ^ 1) - v10 * 2 + (v12 & 2)) | v8) ^ (v11 ^ 1) - v10 * 2 + (v12 & 2) - 3) * 2 | 1) & v11 - (char *)v8) * 2;
    v14 = v13 * 2;
    v15 = v14 + ~v13;
    v16 = (char *)v9 + v11 + 4 * (v10 - v12 + (char *)v9 & -(v10 - v12 | v9)) + 2 * (v10 - v12 + (char *)v9 ^ -(v10 - v12 | v9)) + 0x2 * ~v9;
    v17 = v16 + 2;
    v18 = ~v17;
    v19 = v16 + 3;
    v20 = (v15 & v19 + v18 * 2) + v17;
    v21 = (v17 - v15 + (v15 | ~v17) ^ v13) + (v17 - v15 + (v15 | ~v17) & v13) * 2;
    v22 = v20 + 1 + v21 + (-v21 & ~v20) * 2 + (v20 + 1 + (-v21 | ~v20)) * 2;
    v23 = v22 - 1;
    v24 = v19 + v13 - v14;
    v25 = ((v17 & -v13) + v18 + v15) * 2 + 3;
    v26 = v25 ^ v24;
    v27 = v26 + (v25 & v24) * 2;
    v28 = (v23 & v27 - 2) - v27 + 1;
    v29 = -(v22 + (1 - v27 | -v22));
    v30 = ((v28 ^ v29) + (v28 & v29) * 2 | (v23 + (-v27 | 1) + (v26 & 1) & -(v23 | (-v27 | 1) + (v26 & 1))) * 4 + (v23 + (-v27 | 1) + (v26 & 1) ^ -(v23 | (-v27 | 1) + (v26 & 1))) * 2) + ((v28 ^ v29) + (v28 & v29) * 2 & (v23 + (-v27 | 1) + (v26 & 1) & -(v23 | (-v27 | 1) + (v26 & 1))) * 4 + (v23 + (-v27 | 1) + (v26 & 1) ^ -(v23 | (-v27 | 1) + (v26 & 1))) * 2);
    v31 = v1;
    v32 = v0;
    v33 = v31 - v32 + ((v32 & ~v31) * 2 | ~(v31 - v32)) + ((v32 & ~v31) * 2 | v31 - v32) + 1;
    v34 = v32 - v31 + (v31 & ~v32) * 4 - (v31 & ~v32) * 2;
    v35 = (v33 ^ v34) + ((v33 + ~v33 * 2 + 1 | -v34) & ~(v33 + ~v33 * 2)) * 4 + ((v33 & v34 | -v34 & ~v33) + (v33 + ~v33 * 2 ^ ~(v33 + ~v33 * 2 + 1 | -v34))) * 2;
    v36 = v35 & 29;
    v37 = v35 + v36 + ((0xffffffff ^ (unsigned int)v35 * 2) & 58) - 29;
    v0 = ~((v35 | 3) + (v35 & 3) + 1) + ((v35 | 3) + (v35 & 3) + 1) * 2;
    v1 = v36 + v37 + (v37 | ~v36) + (v36 & ~v37) + 1;
    v38 = v0;
    v39 = v1;
    v40 = v38 + 1 + v39 + (v38 + 1 + ~v38 * 2 & ~v39);
    v3 = (char *)&g_422bbc - (v40 ^ (v39 | v38) + 1) + -2 * (v40 & (v39 | v38) + 1) + 2 * (v40 ^ (v39 | v38) + 1) + 4 * (v40 & (v39 | v38) + 1) + v30 + (v30 | ~&g_422bbc) + (4336572 & ~v30);
    v3();
}
