/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x549b5c..0x549d3c (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_549b5c_0 {
    char field_0;
} st_549b5c_0;


unsigned int sub_549b5c(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v14;  // w11
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w12
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w10
    unsigned int v9;  // w10
    unsigned int v10;  // w9
    unsigned int v11;  // w8
    st_549b5c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_549b5c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v2 * 2;
    v5 = v3 + v2;
    v6 = v4 - (v5 + (v2 | ~v3));
    v7 = ~v3 * 2;
    v8 = (v6 & v5 + ~v4) * 4 + (v6 ^ v5 + ~v4) * 2 | 1;
    v9 = (v8 ^ v5 + v7 + 2) + (v8 & v5 + v7 + 2) * 2;
    v10 = (__ROL__(v3, 1) & 2 & 3) + (v3 ^ 1) + v7;
    v11 = v5 + ~v2 * 2 + (((v2 | ~v10) & v10 + 1) * 4 + ((v2 | ~v10) ^ v10 + 1) * 2 | (unsigned int)(0xfffffffd - (v5 + ~v2 * 2))) + (((v2 | ~v10) & v10 + 1) * 4 + ((v2 | ~v10) ^ v10 + 1) * 2 | v5 + ~v2 * 2 + 2);
    v12 = (~v9 + v9 * 2 ^ (unsigned int)(0xfffffffd - v11)) + ((v9 - 1 & (unsigned int)(0xfffffffd - v11)) - (~v9 + v9 * 2 - (v11 + 1) - 2) & ~v9 + v9 * 2 - (v11 + 1) - 2) * 4 + ((v9 - 1 & (unsigned int)(0xfffffffd - v11)) - (~v9 + v9 * 2 - (v11 + 1) - 2) ^ ~v9 + v9 * 2 - (v11 + 1) - 2) * 2 + ((~v9 + v9 * 2 ^ (unsigned int)(0xfffffffd - v11)) & ~(((v9 - 1 & (unsigned int)(0xfffffffd - v11)) - (~v9 + v9 * 2 - (v11 + 1) - 2) & ~v9 + v9 * 2 - (v11 + 1) - 2) * 4 + ((v9 - 1 & (unsigned int)(0xfffffffd - v11)) - (~v9 + v9 * 2 - (v11 + 1) - 2) ^ ~v9 + v9 * 2 - (v11 + 1) - 2) * 2)) + (((v9 - 1 & (unsigned int)(0xfffffffd - v11)) - (~v9 + v9 * 2 - (v11 + 1) - 2) & ~v9 + v9 * 2 - (v11 + 1) - 2) * 4 + ((v9 - 1 & (unsigned int)(0xfffffffd - v11)) - (~v9 + v9 * 2 - (v11 + 1) - 2) ^ ~v9 + v9 * 2 - (v11 + 1) - 2) * 2 | ~(~v9 + v9 * 2 ^ (unsigned int)(0xfffffffd - v11)));
    v13 = v12 + 1;
    v14 = v13 + (131 | ~v13) + 1;
    v0 = v13 + (0xffffffcd | ~v13) + (v12 + 0x33 ^ -(v13 | 50)) + (v12 + 0x33 & -(v13 | 50)) * 2 + 0x33;
    v1 = (v14 | v13 | 131) + (v14 & (v13 | 131));
    v15 = a1 * ((v0 + ~v0 * 2 ^ ~(v0 + ~v0 * 2 + 1 | v1)) + (v1 | v0) + ((v0 + ~v0 * 2 + 1 | v1) & ~(v0 + ~v0 * 2)) * 2);
    v16 = (a0 + ~a0 * 2 ^ ~(a0 + ~a0 * 2 + 1 | v15)) + ((a0 + ~a0 * 2 + 1 | v15) & ~(a0 + ~a0 * 2)) * 2;
    v17 = a0 - v15 + (v15 & a0) + (v15 & ~a0) * 2;
    return v17 + v16 + (v17 | ~v16) + (v16 & ~v17) + 1 & 0xff;
}
