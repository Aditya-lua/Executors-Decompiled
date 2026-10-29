/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b0378..0x8b06c4 (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b0378_0 {
    char field_0;
} st_8b0378_0;

extern unsigned long long g_8f20dc;

void sub_8b0378(void)
{
    unsigned long long v8;  // x30
    st_8b0378_0 *v9;  // x9
    unsigned long long v18;  // x9
    unsigned long long v19;  // x15
    unsigned long long v20;  // x10
    unsigned long long v21;  // x11
    unsigned long long v22;  // x10
    unsigned long long v23;  // x11
    unsigned long long v24;  // x9
    unsigned long long v25;  // x12
    unsigned long long v26;  // x10
    unsigned long long v27;  // x10
    st_8b0378_0 **v10;  // x10
    unsigned long long v28;  // x13
    unsigned long long v29;  // x9
    unsigned long long v30;  // x11
    unsigned long long v31;  // x9
    unsigned long long v32;  // x10
    st_8b0378_0 *v33;  // x15
    st_8b0378_0 **v34;  // x16
    unsigned long long v35;  // x17
    unsigned long long v36;  // x2
    unsigned long long v37;  // x15
    unsigned long long v11;  // x12
    unsigned long long v38;  // x17
    unsigned long long v39;  // x15
    unsigned long long v40;  // x17
    unsigned long long v41;  // x15
    unsigned long long v42;  // x13
    unsigned long long v12;  // x13
    unsigned long long v13;  // x15
    unsigned long long v14;  // x12
    unsigned long long v15;  // x13
    unsigned long long v16;  // x14
    unsigned long long v17;  // x12
    st_8b0378_0 **v1;  // [bp-0x30], Other Possible Types: char
    st_8b0378_0 *v2;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v3;  // [bp-0x20]
    unsigned long long *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v2 = &v1;
    v1 = &v2;
    v3 = &g_8f20dc;
    v9 = v2;
    v10 = v1;
    v11 = v10 + v9;
    v12 = (char *)v9 + 0x2 * ~v9 + 1;
    v13 = (v11 ^ -(v10 | v9)) + (v11 & -(v10 | v9)) * 2;
    v14 = v12 - (char *)v10 + v11 + (v10 | ~v12) + v13 + 2 * ~v13;
    v15 = v14 + 2;
    v16 = v14 + 3;
    v17 = 0xfffffffffffffffc - v14;
    v18 = ((((v9 | ~(v15 + v17 * 2 + 2)) & v15 + v17 * 2 + 3) * 4 + ((v9 | ~(v15 + v17 * 2 + 2)) ^ v15 + v17 * 2 + 3) * 2 | 1) ^ v16 - (char *)v9) + ((((v9 | ~(v15 + v17 * 2 + 2)) & v15 + v17 * 2 + 3) * 4 + ((v9 | ~(v15 + v17 * 2 + 2)) ^ v15 + v17 * 2 + 3) * 2 | 1) & v16 - (char *)v9) * 2;
    v19 = ~v18 + v18 * 2;
    v20 = v16 + (char *)v10 + 2 * (v17 & -v10) + 2 * v16 + -0x2 * v10 + -2 * (v16 | -v10);
    v21 = ((v16 | v10) & ~v15) * 4 + (v15 ^ ~(v16 | v10)) * 2;
    v22 = v20 + v21 + (v20 & ~v21) + (v21 | ~v20);
    v23 = v22 + 1;
    v24 = -v18;
    v25 = ~v23;
    v26 = v22 + 2 + (v22 + 2 + v25 * 2 | v24) + v19;
    v27 = (v19 & v23) + v26 + (-(v19 & v23) & ~v26) * 2 + (v26 - ((v19 & v23) + (v26 | -(v19 & v23)))) * 2;
    v28 = v27 + 1;
    v29 = ((v23 & v24) + 1 & v19 + v25) * 4 + ((v23 & v24) + 1 ^ v19 + v25) * 2;
    v30 = ~(v23 - v19 + ~v29 + v29 * 2 + 2) + (v23 - v19 + ~v29 + v29 * 2 + 2) * 2;
    v31 = (v30 - 1 & v27) - v30 + (v30 - 1 & v27) - v28;
    v32 = ((-v30 | ~v27) & v28) * 4 + ((-v30 | ~v27) ^ v28) * 2;
    v33 = v2;
    v34 = v1;
    v35 = &(~v33)[(v33 & ~v34) + (v34 | v33)];
    v36 = (char *)v34 + (0xffffffffffffffff ^ v34 * 2) & v33;
    v37 = v36 * 2 - (v33 + v34 + v36 * 4) + v33 * 2;
    v38 = 0xfffffffffffffffe - (v35 + (v37 | 0xfffffffffffffffe - v35));
    v39 = ((v38 ^ (v37 | v35 + 1)) + (v38 & (v37 | v35 + 1)) * 2 | (v37 & v35 + 1) * 2) + ((v38 ^ (v37 | v35 + 1)) + (v38 & (v37 | v35 + 1)) * 2 & (v37 & v35 + 1) * 2);
    v40 = (v39 + ~v39 * 2 + 1 | 9) + v39;
    v41 = v39 + (v39 & 9) + ((0xffffffff ^ (unsigned int)v39 * 2) & 18) - 9;
    v1 = v39 + 24 + ~(v39 & 23) + (v39 ^ 0xffffffffffffffe8) + v39 + (v39 & 23 ^ 23) + (0xfffffffffffffffe - ((v39 ^ 0xffffffffffffffe8) + v39 + (v39 & 23 ^ 23)) | v39 + 24 + ~(v39 & 23)) + ((v39 ^ 0xffffffffffffffe8) + v39 + (v39 & 23 ^ 23) + 1 & (v39 & 23) - (v39 + 24)) + 2;
    v2 = v40 + v41 + (0xfffffffffffffffe - v40 | v41) + (v40 + 1 & ~v41) + 2;
    v42 = v1 + 1 + v2 + (0xffffffffffffffff ^ v2 * 2) + (-(v2 + (0xffffffffffffffff ^ v2 * 2)) & ~v1) * 2 + (v1 + 1 + (-(v2 + (0xffffffffffffffff ^ v2 * 2)) | ~v1)) * 2;
    v4 = (char *)&g_8f20dc - v42 + v32 + (0xfffffffffffffffe - v31 | v32) - (v31 + 1 & v32) + 2 * v31 + 2 * v42 + 1;
    v4();
}
