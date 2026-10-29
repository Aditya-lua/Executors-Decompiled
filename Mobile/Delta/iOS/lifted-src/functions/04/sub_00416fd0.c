/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x416fd0..0x4172a8 (728 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_416fd0_0 {
    char field_0;
} st_416fd0_0;


void sub_416fd0(void)
{
    unsigned long long v7;  // x30
    st_416fd0_0 *v8;  // x9
    unsigned long long v17;  // x10
    unsigned long long v18;  // x11
    unsigned long long v19;  // x13
    unsigned long long v20;  // x12
    unsigned long long v21;  // x9
    unsigned long long v22;  // x9
    unsigned long long v23;  // x8
    st_416fd0_0 *v24;  // x9
    st_416fd0_0 **v25;  // x10
    unsigned long long v26;  // x11
    st_416fd0_0 **v9;  // x11
    unsigned long long v27;  // x12
    st_416fd0_0 *v28;  // x16
    unsigned long long v29;  // x12
    unsigned long long v30;  // x13
    unsigned long long v31;  // x9
    unsigned long long v32;  // x10
    unsigned long long v33;  // x9
    unsigned long long v34;  // x9
    unsigned long long v10;  // x12
    unsigned long long v11;  // x13
    unsigned long long v12;  // x14
    unsigned long long v13;  // x16
    unsigned long long v14;  // x10
    unsigned long long v15;  // x9
    unsigned long long v16;  // x9
    st_416fd0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_416fd0_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = 4103444;
    v8 = v1;
    v9 = v0;
    v10 = (char *)v9 + 0x2 * ~v9 + 1;
    v11 = (char *)v9 + v10 + (v8 | ~v10) + (((char *)v8 + 0x2 * ~v8 + 1 | v9) ^ 0x2 * ~v8 + (char *)v8) + -2 * (((char *)v8 + 0x2 * ~v8 + 1 | v9) & v8 + 1);
    v12 = v11 + 2;
    v13 = v11 + 3;
    v14 = (v12 ^ -v8) + (v13 + (-v8 | ~v12)) * 2;
    v15 = (0xffffffffffffffff ^ (v8 & ~v12) * 2) + (v8 & ~v12) * 4 + 2;
    v16 = ~((v14 ^ v15) + (v14 & v15) * 2) + ((v14 ^ v15) + (v14 & v15) * 2) * 2;
    v17 = ((((v12 | v9) & 0xfffffffffffffffe - v11) * 4 + ((v12 | v9) ^ 0xfffffffffffffffe - v11) * 2 | 1) ^ v13 + v10) + ((((v12 | v9) & 0xfffffffffffffffe - v11) * 4 + ((v12 | v9) ^ 0xfffffffffffffffe - v11) * 2 | 1) & v13 + v10) * 2;
    v18 = ~v17 + v17 * 2;
    v19 = v16 | -v17;
    v20 = ((v18 | v16) - (v18 + v19) | 1) + ((v18 | v16) - (v18 + v19) & 1) - 2;
    v21 = v18 - v16 + ((v16 - v17 & -v19) * 4 + (v16 - v17 ^ -v19) * 2 | ~(v18 - v16)) + ((v16 - v17 & -v19) * 4 + (v16 - v17 ^ -v19) * 2 | v18 - v16);
    v22 = ((v21 & v20) - (v21 + 1) ^ (v21 & v20) - v20) + ((v21 | v20) - (v21 + 1) + ((v21 & v20) - (v21 + 1) & (v21 & v20) - v20)) * 2 + 3;
    v23 = ~((v22 ^ 4103444) + (v22 & 4103444) * 2) + ((v22 ^ 4103444) + (v22 & 4103444) * 2) * 2;
    v24 = v1;
    v25 = v0;
    v26 = ~v24 * 2;
    v27 = v26 + (v24 ^ 1) + ((v24 * 2 | v24 >> 63) & 2 & 3);
    v28 = v24 + 1;
    v29 = (((v27 + (char *)v25 & -(v27 | v25)) * 4 + (v27 + (char *)v25 ^ -(v27 | v25)) * 2 | 1) ^ (v24 ^ -v25) + &v28[-v25 | ~v24] * 2) + (((v27 + (char *)v25 & -(v27 | v25)) * 4 + (v27 + (char *)v25 ^ -(v27 | v25)) * 2 | 1) & (v24 ^ -v25) + &v28[-v25 | ~v24] * 2) * 2;
    v30 = ~v29 + v29 * 2;
    v31 = (char *)&v24[(&v28[v26] & v25) + (v25 & v24) + 2 * (-(v25 & v24) & ~&v24[&v28[v26] & v25])] + 0x2 * &v24[(&v28[v26] & v25) + -1 * (v25 & v24) + -1 * (&v24[&v28[v26] & v25] | -(v25 & v24))];
    v32 = ~v31 + (v30 & v31 - 1) + (v30 & v31 - 1) - v29;
    v33 = v32 + (0xfffffffffffffffd - v32 | (v30 & -v31) * 2) + (v32 + 2 | (v30 & -v31) * 2);
    v34 = v33 + 3;
    v0 = (v34 | 0xfffffffffffffffe) + (v33 + 1 + (v34 * 2 & 8) + (v34 * 2 & 8 ^ 8) - 2 & 0xfffffffffffffffe) + 1;
    v1 = (v34 | 1) + (v34 & 1) + 28;
    v3 = (v23 ^ v0 + v1 + 1) + (v23 & v0 + v1 + 1) * 2 - 1;
    v3();
}
