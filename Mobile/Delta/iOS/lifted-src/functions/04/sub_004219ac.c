/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4219ac..0x421cf4 (840 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4219ac_0 {
    char field_0;
} st_4219ac_0;

extern unsigned long long g_497ee4;

void sub_4219ac(void)
{
    unsigned long long v7;  // x30
    st_4219ac_0 *v8;  // x9
    unsigned long long v17;  // x14
    unsigned long long v18;  // x10
    unsigned long long v19;  // x12
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    unsigned long long v22;  // x10
    unsigned long long v23;  // x11
    unsigned long long v24;  // x13
    unsigned long long v25;  // x13
    unsigned long long v26;  // x12
    st_4219ac_0 **v9;  // x10
    st_4219ac_0 *v27;  // x13
    st_4219ac_0 **v28;  // x14
    st_4219ac_0 *v29;  // x16
    unsigned long long v30;  // x1
    unsigned long long v31;  // x15
    unsigned long long v32;  // x17
    unsigned long long v33;  // x13
    unsigned long long v34;  // x14
    unsigned long long v35;  // x13
    unsigned long long v36;  // x13
    st_4219ac_0 **v10;  // x11
    unsigned long long v37;  // x14
    unsigned long long v38;  // x15
    unsigned long long v39;  // x9
    unsigned long long v11;  // x12
    unsigned long long v12;  // x12
    unsigned long long v13;  // x14
    unsigned long long v14;  // x15
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    st_4219ac_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_4219ac_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_497ee4;
    v8 = v1;
    v9 = v0;
    v10 = -v9;
    v11 = (v8 ^ 1) + ~v8 * 2 + ((v8 * 2 | v8 >> 63) & 2 & 3);
    v12 = (v8 ^ v10) + (v8 - ((char *)v9 + (v8 | v10))) * 2 + ((v9 | ~v11) & v11 + 1) * 4 + ((v9 | ~v11) ^ v11 + 1) * 2;
    v13 = (v12 ^ -v8) + ((v12 | v8) + (-v8 | ~v12)) * 2;
    v14 = v13 + 2;
    v15 = (v12 ^ v10) + ((char *)v9 - v12 + (v12 & ~v9) + (v10 | ~v12) + v12) * 2;
    v16 = v15 + 2;
    v17 = 0xfffffffffffffffe - v13;
    v18 = v15 + 3;
    v19 = v18 + v14 + (0xfffffffffffffffe - v15 & ~v14) * 2 + (v14 - (v16 + (v14 | 0xfffffffffffffffe - v15))) * 2;
    v20 = (((v14 | v16) & v17) * 4 + ((v14 | v16) ^ v17) * 2 | -v19) + ((v14 | v16) & v17) * 4 + ((v14 | v16) ^ v17) * 2 + (-v19 | ~(((v14 | v16) & v17) * 4 + ((v14 | v16) ^ v17) * 2)) + v19 * 2;
    v21 = (v16 ^ 1) + v16 * 2 + ~v16 * 4 + (v16 * 2 & 2) + 2;
    v22 = (v16 ^ v17) + (v18 + (v17 | ~v16)) * 2 + (v21 + v14 ^ -(v21 | v14)) * 2 + (v21 + v14 & -(v21 | v14)) * 4;
    v23 = -v22;
    v24 = ~v20;
    v25 = ((v22 - 1 & v20) - v22 ^ v24 - (v23 | ~v20)) + ((v22 - 1 & v20) - v22 & v24 - (v23 | ~v20)) * 2;
    v26 = ((v23 | v20 + v24 * 2 + 1) + v20) * 2;
    v27 = v1;
    v28 = v0;
    v29 = -v27;
    v30 = (v27 ^ -v28) + &v27[-v28 | ~v27] * 2 + 2;
    v31 = v30 + (((v28 | v27) & v29) * 4 + ((v28 | v27) ^ v29) * 2 | ~v30) + (v30 | ((v28 | v27) & v29) * 4 + ((v28 | v27) ^ v29) * 2) + 1;
    v32 = (v28 ^ 1) + ~v28 * 2 + ((v28 * 2 | v28 >> 63) & 2 & 3);
    v33 = (&v27[v32] & -(v32 | v27)) * 4 + (&v27[v32] ^ -(v32 | v27)) * 2;
    v34 = (v28 ^ v29) + ((char *)v28 + (v29 | ~v28)) * 2 + ~v33;
    v35 = ~(v34 + v33 * 2 + 4) + (v34 + v33 * 2 + 4) * 2;
    v36 = v35 + ~v31 + (v31 - v35 & -(v31 | -v35)) * 4 + ((v31 - v35 ^ -(v31 | -v35)) + (v31 | -v35)) * 2;
    v37 = v36 + 1;
    v38 = (((v37 & 31 ^ 31) + (v37 ^ 0xffffffffffffffe0) ^ v36 + 2) + ((v37 & 31 ^ 31) + (v37 ^ 0xffffffffffffffe0) & v36 + 2) * 2 ^ v36 + (v37 & 31) - (v37 * 2 | 0xffffffffffffffc1) - 30) + (((v37 & 31 ^ 31) + (v37 ^ 0xffffffffffffffe0) ^ v36 + 2) + ((v37 & 31 ^ 31) + (v37 ^ 0xffffffffffffffe0) & v36 + 2) * 2 & v36 + (v37 & 31) - (v37 * 2 | 0xffffffffffffffc1) - 30) * 2;
    v0 = ~v38 + v38 * 2;
    v1 = v36 + (0xfffffffffffffffe - (v37 - (v37 | 1)) | v37 | 1) + (v37 - (v37 | 1) + 1 & ~(v37 | 1)) + 3;
    v39 = (~v1 + v1 * 2 + 2 ^ v0) + (~v1 + v1 * 2 + 2 & v0) * 2;
    v3 = ~v39 + (char *)&g_497ee4 + 2 * v39 + v26 + (v25 & 0xfffffffffffffffd - v26) + (v25 & v26 + 2) + 2;
    v3();
}
