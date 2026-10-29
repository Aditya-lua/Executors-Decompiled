/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb84c48..0xb84d40 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b84c48(long long a0, long long a1)
{
    unsigned long long v21;  // x21
    unsigned long long v22;  // x10
    unsigned long long v23;  // x9
    unsigned long v0;  // [bp-0x100]
    uint128_t v1;  // [bp-0xf8]
    uint128_t v2;  // [bp-0xe8]
    uint128_t v3;  // [bp-0xd8]
    uint128_t v4;  // [bp-0xc8]
    unsigned long long v5;  // [bp-0xb8]
    unsigned long long v6;  // [bp-0xb0]
    unsigned long long v7;  // [bp-0xa8]
    unsigned long long v8;  // [bp-0xa0]
    char v9;  // [bp-0x98], Other Possible Types: unsigned long
    uint128_t v10;  // [bp-0x98]
    unsigned long long v11;  // [bp-0x90]
    unsigned long v12;  // [bp-0x88]
    uint128_t v13;  // [bp-0x88]
    uint128_t v14;  // [bp-0x78]
    uint128_t v15;  // [bp-0x68]
    char v16;  // [bp-0x58], Other Possible Types: unsigned long long
    unsigned long long v17;  // [bp-0x50]
    unsigned long v18;  // [bp-0x48]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    sub_bcc71c(&v9, a1 + 152);
    v21 = v11;
    sub_bcc71c(&v9, a1 + 64);
    v22 = v11;
    v10 = CONCAT(v21, v21);
    v13 = CONCAT(v21 + v12 * 8, v9);
    v14 = CONCAT(v22, v22);
    v15 = CONCAT(v22 + v12 * 8, v9);
    sub_bcc71c(&v16, a1);
    v1 = v10;
    v2 = v13;
    v3 = v14;
    v23 = v17;
    v0 = 1;
    v4 = v15;
    v5 = v23;
    v6 = v23;
    v7 = v16;
    v8 = v23 + v18 * 8;
    sub_b76eb4(a0, &v0);
    return (unsigned long long)v14;
}
