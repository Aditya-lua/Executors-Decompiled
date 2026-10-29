/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40e1e0..0x40e520 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40e1e0_0 {
    char field_0;
} st_40e1e0_0;

extern unsigned long long g_41ff28;

void sub_40e1e0(void)
{
    unsigned long long v7;  // x30
    st_40e1e0_0 *v8;  // x9
    unsigned long long v17;  // x16
    unsigned long long v18;  // x9
    unsigned long long v19;  // x9
    unsigned long long v20;  // x13
    unsigned long long v21;  // x10
    unsigned long long v22;  // x12
    unsigned long long v23;  // x14
    unsigned long long v24;  // x10
    unsigned long long v25;  // x9
    unsigned long long v26;  // x10
    st_40e1e0_0 **v9;  // x10
    unsigned long long v27;  // x9
    unsigned long long v28;  // x9
    unsigned long long v29;  // x10
    unsigned long long v30;  // x11
    unsigned long long v31;  // x11
    unsigned long long v32;  // x9
    st_40e1e0_0 *v33;  // x9
    st_40e1e0_0 **v34;  // x10
    unsigned long long v35;  // x11
    unsigned long long v36;  // x9
    unsigned long long v10;  // x12
    unsigned long long v37;  // x10
    unsigned long long v38;  // x9
    unsigned long long v39;  // x9
    unsigned long long v40;  // x9
    unsigned long long v41;  // x10
    unsigned long long v42;  // x10
    unsigned long long v43;  // x9
    unsigned long long v44;  // x8
    unsigned long long v11;  // x11
    unsigned long v12;  // x13
    unsigned long long v13;  // x11
    unsigned long long v14;  // x12
    unsigned long long v15;  // x14
    unsigned long long v16;  // x15
    st_40e1e0_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_40e1e0_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_41ff28;
    v8 = v1;
    v9 = v0;
    v10 = v8 - v9;
    v11 = (((v8 ^ 1) + v8 * 2 + ~v8 * 4 + (v8 * 2 & 2) + 2 | ~v9) + (char *)v9) * 2 + 3;
    v12 = v11 ^ v10;
    v13 = v11 & v10;
    v14 = v12 + v13 * 2;
    v15 = ~v14 + v14 * 2;
    v16 = -v14;
    v17 = v15 - (char *)v8 + 2 * (v8 & v16) + (v15 & v8);
    v18 = (v12 + (v13 - v14) * 2 | v8) + v15;
    v19 = (v17 & ~v18) * 2;
    v20 = v19 + (v17 ^ ~v18);
    v21 = v15 - (char *)v9 + 2 * (v9 & v16) + (v15 & v9) + (0xfffffffffffffffe - v15 ^ (v9 | v16)) + -2 * ((v9 | v16) & v14);
    v22 = v21 + 1;
    v23 = v20 + v22 + (-(v20 & v22) & ~(v20 | v22)) * 2 + ((v20 ^ v22) - (v20 | v22 | -(v20 & v22))) * 2;
    v24 = (v22 ^ 0xfffffffffffffffe) + v21 * 2 - ((v22 * 2 | v22 >> 63) & 2 & 3);
    v25 = (v24 + 4 & (v17 ^ v18) - v19) + v20;
    v26 = (v22 ^ -v20) + (v22 - v20 - (v22 | -v20)) * 2;
    v27 = (v25 & 0xfffffffffffffffc - v24) * 4 + (v25 ^ 0xfffffffffffffffc - v24) * 2 | 1;
    v28 = ~((v27 ^ v26) + (v27 & v26) * 2) + ((v27 ^ v26) + (v27 & v26) * 2) * 2;
    v29 = -v28;
    v30 = v23 + ~v23 * 2 + 1;
    v31 = (v28 ^ v23) + (v28 & v23) * 2 + (v30 + (v29 | ~v30)) * 2;
    v32 = (v23 - v28 & -(v23 | v29)) * 4 + (v23 - v28 ^ -(v23 | v29)) * 2;
    v33 = v1;
    v34 = v0;
    v35 = ((v33 ^ 1) + ~v33 * 2 + ((v33 * 2 | v33 >> 63) & 2 & 3) & v34) * 2;
    v36 = v34 & v33;
    v37 = v34 - v33 + v36 + (v33 & ~v34) * 2;
    v38 = (v37 ^ -v36) + (v37 + (-v36 | ~v37)) * 2 + 2;
    v39 = (v35 + (v33 + v34 + ~v34 * 2) * 2 + (v35 | 0xfffffffffffffffd - (v33 + v34 + ~v34 * 2)) + (0xfffffffffffffffd - (v33 + v34 + ~v34 * 2) | ~v35) + 6 | v38 + ~v38 * 2 + 1) + (v38 + ~v38 * 2 + 1 & v35 + (v33 + v34 + ~v34 * 2) * 2 + (v35 | 0xfffffffffffffffd - (v33 + v34 + ~v34 * 2)) + (0xfffffffffffffffd - (v33 + v34 + ~v34 * 2) | ~v35) + 6);
    v40 = (v39 * 2 & 4) + (v39 ^ 2);
    v41 = ~v40 + v40 * 2;
    v0 = v41 + 2;
    v1 = v41 + (v41 & 30) + ((0xffffffff ^ (unsigned int)v41 * 2) & 60) + ((v41 & 30 ^ 30) + (v41 ^ 0xffffffffffffffe1) ^ v40) + ((v41 & 30 ^ 30) + (v41 ^ 0xffffffffffffffe1) & v40) * 2 - 30;
    v42 = (v1 ^ 0xfffffffffffffffe) + v1 * 4 - (v1 * 2 + (v1 * 2 & 2)) + 3;
    v43 = (v42 ^ v0) + (v0 + (v42 | ~v0)) * 2 + 2;
    v44 = (v31 + (char *)&g_41ff28 + v32 + (v32 | ~(v31 + 2)) + (v31 + 2 & ~v32) + 3 ^ v43 * 3 + ~v43 * 2 + 2) + (v31 + (char *)&g_41ff28 + v32 + (v32 | ~(v31 + 2)) + (v31 + 2 & ~v32) + 3 & v43 * 3 + ~v43 * 2 + 2) * 2;
    v3 = ~v44 + v44 * 2;
    v3();
}
