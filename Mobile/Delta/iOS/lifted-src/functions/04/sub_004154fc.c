/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4154fc..0x4157b0 (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4154fc_0 {
    char field_0;
} st_4154fc_0;

extern unsigned long long g_40ef84;
extern char g_fffffffffffffffc;

void sub_4154fc(void)
{
    unsigned long long v7;  // x30
    st_4154fc_0 *v8;  // x10
    unsigned long long v17;  // x10
    unsigned long long v18;  // x14
    unsigned long long v19;  // x15
    unsigned long long v20;  // x14
    unsigned long long v21;  // x15
    unsigned long long v22;  // x14
    unsigned long long v23;  // x10
    unsigned long long v24;  // x11
    unsigned long long v25;  // x10
    unsigned long long v26;  // x9
    st_4154fc_0 **v9;  // x11
    st_4154fc_0 *v27;  // x11
    st_4154fc_0 **v28;  // x12
    st_4154fc_0 **v29;  // x15
    unsigned long long v30;  // x14
    unsigned long long v31;  // x12
    unsigned long long v32;  // x11
    unsigned long long v33;  // x11
    unsigned long long v34;  // x12
    unsigned long long v35;  // x11
    unsigned long long v36;  // x8
    st_4154fc_0 *v10;  // x12
    unsigned long long v37;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // x12
    unsigned long long v13;  // x13
    unsigned long long v14;  // x15
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    st_4154fc_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_4154fc_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_40ef84;
    v8 = v1;
    v9 = v0;
    v10 = v8 + 1;
    v11 = (char *)v10 + 0x2 * ~v8 & v9;
    v12 = (v9 + v8 + (-v9 & ~v8) * 2 + &v10[-v9 | ~v8] * 2 ^ (0xffffffffffffffff ^ v11 * 2) + v11 * 4 + 2) + (v9 + v8 + (-v9 & ~v8) * 2 + &v10[-v9 | ~v8] * 2 & (0xffffffffffffffff ^ v11 * 2) + v11 * 4 + 2) * 2;
    v13 = ~v12 + v12 * 2;
    v14 = (v13 ^ 1) + ((1 & ~v12) - v12) * 2;
    v15 = (v13 ^ -v8) + ((-v12 | -v8) + v12) * 2 + ~((&v8[v14] & -(v14 | v8)) * 4 + (&v8[v14] ^ -(v14 | v8)) * 2) + ((&v8[v14] & -(v14 | v8)) * 4 + (&v8[v14] ^ -(v14 | v8)) * 2) * 2;
    v16 = (v13 | v9) - (v13 & v9);
    v17 = v15 + 1;
    v18 = (v17 & v16 + ~v16 * 2 + 1) + v16;
    v19 = -((v17 + v16 ^ -(v17 | v16)) + (v17 + v16 & -(v17 | v16)) * 2);
    v20 = (v19 ^ v18) + (v18 + (v19 | ~v18)) * 2;
    v21 = v20 + 3;
    v22 = v20 + 2;
    v23 = &(&g_fffffffffffffffc)[-1 * (v17 & v16) + -1 * v17 + -1 * (v16 & 0xfffffffffffffffe - v15) + -2 * (-(v17 & v16) & ~((v16 & 0xfffffffffffffffe - v15) + v17)) + -2 * (-(v17 & v16) | ~((v16 & 0xfffffffffffffffe - v15) + v17)) + -2 * (v16 & 0xfffffffffffffffe - v15) + -2 * v15];
    v24 = ((v22 | v23) ^ -v21 - (v23 | ~v22)) + ((v22 | v23) & -v21 - (v23 | ~v22)) * 2;
    v25 = ((v21 - v21 * 2 | v23) + v22) * 2 + 3;
    v26 = (v25 ^ v24) + 2 * (v25 & v24) + (char *)&g_40ef84;
    v27 = v1;
    v28 = v0;
    v29 = (char *)v28 + 1;
    v30 = (char *)v29 + 0x2 * ~v28 & v27;
    v31 = v30 * 2;
    v32 = (v28 ^ -v27) + ((char *)v29 + (-v27 | ~v28)) * 2 + v30 * 4;
    v33 = v32 - v31;
    v34 = (v33 ^ 1) - (v32 + ~v31) * 4;
    v35 = (v34 + v33 * 2 + (v33 * 2 & 2) - 5 ^ ((v28 | v27) ^ (v28 | v27) - (v28 + v27)) + ((v28 | v27) - (v28 + v27) & (v28 | v27)) * 2) + (v34 + v33 * 2 + (v33 * 2 & 2) - 5 & ((v28 | v27) ^ (v28 | v27) - (v28 + v27)) + ((v28 | v27) - (v28 + v27) & (v28 | v27)) * 2) * 2;
    v36 = ((~v35 + v35 * 2 ^ 1) + (1 & ~v35) + v35 - (~v35 + v35 * 2 | 1) | 1) + ((~v35 + v35 * 2 ^ 1) + (1 & ~v35) + v35 - (~v35 + v35 * 2 | 1) & 1);
    v0 = v36 + 2;
    v1 = v36 + 28;
    v37 = (v1 | ~v0) + (v0 | ~v1) + (v1 | v0) * 2 + 2;
    v3 = v26 + (v37 | -v26) + (v26 - 1 | v37);
    v3();
}
