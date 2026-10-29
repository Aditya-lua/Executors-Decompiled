/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x543188..0x543358 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_543188_0 {
    char field_0;
} st_543188_0;


unsigned int sub_543188(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w12
    unsigned int v13;  // w10
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w11
    unsigned int v18;  // w8
    unsigned int v19;  // w8
    unsigned int v20;  // w12
    unsigned int v21;  // w8
    unsigned int v4;  // w14
    unsigned int v22;  // w8
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w12
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    st_543188_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_543188_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 + v2;
    v5 = v4 + (v2 + (-v3 | ~v2) + (-v3 & ~v2)) * 2 + 2;
    v6 = (v3 + ~v2 + (v2 & ~v3)) * 2 + 3;
    v7 = (v5 ^ v6) + (v5 & v6) * 2;
    v8 = v7 - 1;
    v9 = (v3 ^ 1) + ~v3 * 2 + (__ROL__(v3, 1) & 2 & 3);
    v10 = v4 + (v9 + v2 & -(v9 | v2)) * 4 + (v3 + (-v2 | ~v3) + (-v2 & ~v3) + (v9 + v2 ^ -(v9 | v2))) * 2;
    v11 = v10 + 2;
    v12 = (v10 + 3 + ~v11 * 2 | 1) + (v10 + 3 & 1);
    v13 = v8 - v12 + (v12 & -v7) * 2;
    v14 = (v11 - (v10 + 1 & v8) & v8 - v11) * 4 + (v11 - (v10 + 1 & v8) ^ v8 - v11) * 2;
    v15 = v13 + (v14 | ~v13) + (v13 | v14);
    v16 = v15 + 1;
    v17 = (v15 + 138 ^ -(v16 | 137)) + (v15 + 138 & -(v16 | 137)) * 2;
    v18 = v15 + 2 + v15 + 2 + ~v16 * 2 - (v15 + 2 + ~v16 * 2 & 0xffffff76);
    v0 = (v16 & 1) + (v16 | 1) + 43;
    v1 = ~((v17 ^ v18) + (v17 & v18) * 2) + ((v17 ^ v18) + (v17 & v18) * 2) * 2;
    v19 = a1 * (v1 + v0);
    v20 = v19 + ~v19 * 2 + 1;
    v21 = a0 + 1 + v19 + v20 + (a0 + 1 + ~a0 * 2 & ~v20) + 1;
    v22 = (v21 ^ v19 & a0) + (v21 & v19 & a0) * 2;
    return ~v22 + v22 * 2 & 0xff;
}
