/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52e9c0..0x52eb78 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52e9c0_0 {
    char field_0;
} st_52e9c0_0;


unsigned int sub_52e9c0(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v14;  // w8
    char v15;  // x9
    char v16;  // x11
    unsigned int v4;  // w10
    unsigned int v5;  // w15
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w12
    unsigned int v10;  // w11
    unsigned int v11;  // w8
    st_52e9c0_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_52e9c0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (~v2 & ~v3) + (v3 | v2) * 2 + (v3 + ~(v3 | v2) ^ v2 + ~v2 * 2) - (v3 + ~(v3 | v2) & v2 + 1) * 2 + 2;
    v5 = v3 + 1;
    v6 = v3 - v2 + (v2 | ~v3) + v5 + (v2 & ~v3) * 2;
    v7 = v3 + v2 + (v5 + ~v3 * 2 & ~v2);
    v8 = (v6 & ~v7) * 2 - (v7 ^ v6);
    v9 = v4 + ~v4 * 2 + 1;
    v10 = v4 + v8 + (v9 + ((unsigned int)(1 - v8) | ~v9)) * 2;
    v11 = (v8 - 1 - (v8 - 2 & v4) & v4 - (v8 - 1)) * 4 + (v8 - 1 - (v8 - 2 & v4) ^ v4 - (v8 - 1)) * 2;
    v12 = v10 + (v11 | (unsigned int)(0xfffffffe - v10)) + (v10 + 1 | v11);
    v13 = v12 + 2;
    v0 = (unsigned int)(v12 + 3 + ~v13 * 2 + v13 - (v12 + 3 + ~v13 * 2 & 0xffffff74)) + ((139 & ~v13) + (v13 ^ 0xffffff74) ^ v12 + 3) + ((139 & ~v13) + (v13 ^ 0xffffff74) & v12 + 3) * 2;
    v1 = (v12 + 44 ^ -(v13 | 42)) + (v13 | 42) + (v12 + 44 & -(v13 | 42)) * 2;
    v14 = a1 * ((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2 - 1);
    v15 = (char)v14 + (char)a0;
    v16 = -(a0 | v14);
    return (v14 + ~v14 * 2 + 1 & a0) + v14 + (v15 ^ v16) + (v15 & v16) * 2 & 0xff;
}
