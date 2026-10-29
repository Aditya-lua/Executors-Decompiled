/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x536704..0x536974 (624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_536704_0 {
    char field_0;
} st_536704_0;

extern unsigned long long g_52eb78;

void sub_536704(void)
{
    unsigned long long v7;  // x30
    st_536704_0 *v8;  // x10
    unsigned long long v17;  // x14
    unsigned long long v18;  // x2
    unsigned long long v19;  // x16
    st_536704_0 *v20;  // x1
    st_536704_0 **v21;  // x3
    unsigned long long v22;  // x4
    unsigned long long v23;  // x5
    unsigned long long v24;  // x4
    unsigned long long v25;  // x1
    unsigned long long v26;  // x9
    st_536704_0 **v9;  // x12
    unsigned long long v27;  // x1
    unsigned long long v10;  // x13
    unsigned long long v11;  // x14
    unsigned long long v12;  // x15
    unsigned long long v13;  // x10
    unsigned long long v14;  // x16
    unsigned long long v15;  // x13
    unsigned long long v16;  // x14
    st_536704_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_536704_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_52eb78;
    v8 = v1;
    v9 = v0;
    v10 = (~(v8 + v9 + (0xffffffffffffffff ^ v8 * 2)) - (v8 | ~v9) & v8 + v9 + (0xffffffffffffffff ^ v8 * 2)) * 4 + (~(v8 + v9 + (0xffffffffffffffff ^ v8 * 2)) - (v8 | ~v9) ^ v8 + v9 + (0xffffffffffffffff ^ v8 * 2)) * 2;
    v11 = v10 + v8 - v9;
    v12 = (char *)&v8[v11 + 4 * (&v8[(0xffffffffffffffff ^ v11 * 2) + v11] & -(v11 + (0xffffffffffffffff ^ v11 * 2) | v8))] + 2 * v11 + -0x2 * v8 + -2 * (v11 | -v8) + 2 * (-v8 & ~v11) + 2 * (&v8[(0xffffffffffffffff ^ v11 * 2) + v11] ^ -(v11 + (0xffffffffffffffff ^ v11 * 2) | v8));
    v13 = &v8[v10 + 2 * (-(v11 & v9) & ~(v11 | v9)) + 2 * (-(v11 & v9) | ~(v11 | v9)) + 2 * (v11 | v9)];
    v14 = v13 + 2;
    v15 = v12 + 1;
    v16 = v15 + ~v12 * 2 | v14;
    v17 = v12 | v14;
    v18 = v14 - v12;
    v19 = v18 + (v17 ^ 0xfffffffffffffffe - v13) * 2 + (v17 & 0xfffffffffffffffe - v13) * 4;
    v20 = v1;
    v21 = v0;
    v22 = v21 | v20;
    v23 = -((v21 + v20 ^ -v22) + (v21 + v20 & -v22) * 2);
    v24 = (v23 ^ v22) + (v22 + (v23 | ~v22)) * 2 + 2;
    v25 = ((((char *)v21 + (0xffffffffffffffff ^ v21 * 2) + v20 & -((char *)v21 + (0xffffffffffffffff ^ v21 * 2) | v20)) * 4 + ((char *)v21 + (0xffffffffffffffff ^ v21 * 2) + v20 ^ -((char *)v21 + (0xffffffffffffffff ^ v21 * 2) | v20)) * 2 | 1) ^ (v21 ^ -v20) + (v21 - v20 - (v21 | -v20)) * 2) + ((((char *)v21 + (0xffffffffffffffff ^ v21 * 2) + v20 & -((char *)v21 + (0xffffffffffffffff ^ v21 * 2) | v20)) * 4 + ((char *)v21 + (0xffffffffffffffff ^ v21 * 2) + v20 ^ -((char *)v21 + (0xffffffffffffffff ^ v21 * 2) | v20)) * 2 | 1) & (v21 ^ -v20) + (v21 - v20 - (v21 | -v20)) * 2) * 2;
    v26 = ((v25 + 0x7ffffffffffffffe & v24) * 2 - (v24 + v25) + 1 ^ (0xffffffffffffffff ^ (1 - v25 & v24) * 2) + (1 - v25 & v24) * 4 + 2) + ((v25 + 0x7ffffffffffffffe & v24) * 2 - (v24 + v25) + 1 & (0xffffffffffffffff ^ (1 - v25 & v24) * 2) + (1 - v25 & v24) * 4 + 2) * 2;
    v27 = ~v26 + v26 * 2;
    v0 = (v27 ^ 29) + ((-v26 | 29) + v26) * 2 - 1;
    v1 = v27 + (10 & v27 * 2) + (10 & v27 * 2 ^ 10) - 6;
    v3 = (char *)&g_52eb78 + v0 + v1 - v13 + (v14 | ~v12) + ((v18 * 2 | v18 >> 63) & 2 & 3) + 2 * v17 + (v16 ^ 0xfffffffffffffffe - v12) + -2 * (v16 & v15) + 2 * ~v19 + (v19 ^ 1) + 1;
    v3();
}
