/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb84f2c..0xb85020 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b84f2c(long long a0, long long a1)
{
    unsigned long long v20;  // x21
    unsigned long long v21;  // x10
    unsigned long long v22;  // x9
    unsigned long v0;  // [bp-0x100]
    uint128_t v1;  // [bp-0xf8]
    uint128_t v2;  // [bp-0xe8]
    uint128_t v3;  // [bp-0xd8]
    uint128_t v4;  // [bp-0xc8]
    unsigned long long v5;  // [bp-0xb8]
    unsigned long long v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0xa8]
    unsigned long long v8;  // [bp-0xa0]
    char v9;  // [bp-0x98], Other Possible Types: unsigned long
    uint128_t v10;  // [bp-0x98]
    unsigned long long v11;  // [bp-0x90]
    uint128_t v12;  // [bp-0x88], Other Possible Types: unsigned long
    uint128_t v13;  // [bp-0x78]
    uint128_t v14;  // [bp-0x68]
    char v15;  // [bp-0x58], Other Possible Types: unsigned long
    unsigned long long v16;  // [bp-0x50]
    unsigned long v17;  // [bp-0x48]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    sub_b83b40(&v9);
    v20 = v11;
    sub_b83b40(&v15, a1 + 64);
    v21 = v16;
    v10 = CONCAT(v20, v20);
    v12 = CONCAT(v20 + v12 * 8, v9);
    v13 = CONCAT(v21, v21);
    v14 = CONCAT(v21 + v17 * 8, v15);
    sub_b83b40(&v15, a1 + 128);
    v1 = v10;
    v2 = v12;
    v3 = v13;
    v22 = v16;
    v0 = 1;
    v4 = v14;
    v5 = v22;
    v6 = v22;
    v7 = v15;
    v8 = v22 + v17 * 8;
    sub_b76eb4(a0, &v0);
    return (unsigned long long)v13;
}
