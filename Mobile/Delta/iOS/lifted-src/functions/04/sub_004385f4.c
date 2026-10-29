/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4385f4..0x438814 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4385f4_0 {
    char field_0;
} st_4385f4_0;


void sub_4385f4(void)
{
    unsigned long long v7;  // x30
    st_4385f4_0 *v8;  // x9
    unsigned long long v17;  // x11
    unsigned long long v18;  // x12
    unsigned long long v19;  // x12
    unsigned long long v20;  // x10
    unsigned long long v21;  // x10
    unsigned long long v22;  // x9
    unsigned long long v23;  // x9
    unsigned long long v24;  // x10
    unsigned long long v25;  // x8
    st_4385f4_0 **v9;  // x11
    unsigned long long v10;  // x12
    unsigned long long v11;  // x13
    unsigned long long v12;  // x12
    unsigned long long v13;  // x15
    unsigned long long v14;  // x9
    unsigned long long v15;  // x9
    unsigned long long v16;  // x10
    st_4385f4_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_4385f4_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = 4043824;
    v8 = v1;
    v9 = v0;
    v10 = ((v9 | v8) - 1 ^ v9 + v8) - (v9 + v8 & -(v9 | v8)) * 2 + (v9 | v8);
    v11 = v10 + 1;
    v12 = 0xfffffffffffffffe - v10;
    v13 = v11 - (char *)&v8[v11 | ~v8];
    v14 = (v11 ^ -v8) + (v11 - (char *)&v8[v11 | -v8]) * 2;
    v15 = v14 + (v13 & &v8[v12]) * 4 + (v13 ^ &v8[v12]) * 2 + ((v13 & &v8[v12]) * 4 + (v13 ^ &v8[v12]) * 2 | ~v14) + (v14 & ~((v13 & &v8[v12]) * 4 + (v13 ^ &v8[v12]) * 2)) + 1;
    v16 = (v11 & ~v9) + v12 + (v11 | v9);
    v17 = v16 + 1;
    v18 = ~v15;
    v19 = v15 + v17 + (v18 & ~v16) * 2 + (v15 & ~v16) * 2;
    v20 = (v17 ^ 1) - v16 * 2 + ((v17 * 2 | v17 >> 63) & 2 & 3);
    v21 = v20 + v15 + ~(v20 + 0x7ffffffffffffffc | v15) - 3;
    v22 = v19 + ~(v21 * 2) + v17 - v15 + v21 * 4 + 1 + (v21 * 2 - (v17 - v15 + v21 * 4 + 1)) * 2 + (v15 + v18 * 2 + 1 + v17 & -(v15 + v18 * 2 + 1 | v17)) * 4 + (v15 + v18 * 2 + 1 + v17 ^ -(v15 + v18 * 2 + 1 | v17)) * 2 + (v19 & ~((v15 + v18 * 2 + 1 + v17 & -(v15 + v18 * 2 + 1 | v17)) * 4 + (v15 + v18 * 2 + 1 + v17 ^ -(v15 + v18 * 2 + 1 | v17)) * 2)) + ((v15 + v18 * 2 + 1 + v17 & -(v15 + v18 * 2 + 1 | v17)) * 4 + (v15 + v18 * 2 + 1 + v17 ^ -(v15 + v18 * 2 + 1 | v17)) * 2 | ~v19) + 2;
    v23 = (v0 & v1) + (-(v0 & v1) & ~(v0 | v1)) + (v0 ^ v1) - (v0 | v1 | -(v0 & v1));
    v24 = v23 * 2;
    v0 = ~(v24 + (v23 * 4 & 8) + (v23 * 4 & 8 ^ 10) - 5) + (v24 + (v23 * 4 & 8) + (v23 * 4 & 8 ^ 10) - 5) * 2;
    v1 = v24 + 28;
    v25 = (((v22 * 2 & 4) + (v22 ^ 2) ^ 4043824) + ((v22 * 2 & 4) + (v22 ^ 2) & 4043824) * 2 - 1 ^ v0 + v1 + 1) + (((v22 * 2 & 4) + (v22 ^ 2) ^ 4043824) + ((v22 * 2 & 4) + (v22 ^ 2) & 4043824) * 2 - 1 & v0 + v1 + 1) * 2;
    v3 = ~v25 + v25 * 2;
    v3();
}
