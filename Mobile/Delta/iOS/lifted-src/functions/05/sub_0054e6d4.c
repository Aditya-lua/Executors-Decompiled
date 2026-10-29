/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54e6d4..0x54e84c (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54e6d4_0 {
    char field_0;
} st_54e6d4_0;


unsigned int sub_54e6d4(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w10
    unsigned int v13;  // w11
    unsigned int v14;  // w12
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    unsigned int v4;  // w11
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    st_54e6d4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_54e6d4_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 + v2 + (-v3 & ~v2) * 2 + (v2 + (-v3 | ~v2)) * 2 + 2;
    v5 = v4 + ((v3 & ~v2) * 2 | ~v4) + (v4 | (v3 & ~v2) * 2) + 1;
    v6 = v3 + (v2 | ~v3) + (v3 ^ v2) + 1;
    v7 = v3 & v2;
    v8 = -v7;
    v9 = (unsigned int)(v6 - v7 - (v6 | v8)) * 2;
    v10 = (unsigned int)(v5 - ((v6 ^ v8) + v9)) + ((v6 ^ ~v8) - v9 & v5) + ((v6 ^ v8) + v9 | ~v5);
    v11 = v10 + 1;
    v12 = 0xfffffffe - v10;
    v13 = v10 + 2;
    v14 = v13 + v12 * 2;
    v0 = (v13 + (v14 | 108) ^ v10 - (v11 & 108) + 110) + (v13 + (v14 | 108) & v10 - (v11 & 108) + 110) * 2 - 1;
    v1 = ((v12 | 73) ^ -v14) + (v11 | 73) + ((v12 | 73) & -v14) * 2;
    v15 = a1 + (v0 + ~v1 + (v1 + 1 & ~v0) * 2 + (v0 + (v1 + 1 | ~v0)) * 2) * a1;
    v16 = (0xffffffff ^ ~v15 * 2) - v15;
    v17 = (v16 ^ a0) + (a0 + (v16 | ~a0)) * 2 + 2;
    return v17 * 3 + ~v17 * 2 + 1 & 0xff;
}
