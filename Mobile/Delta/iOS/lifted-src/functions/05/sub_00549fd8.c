/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x549fd8..0x54a14c (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_549fd8_0 {
    char field_0;
} st_549fd8_0;


unsigned int sub_549fd8(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w9
    unsigned int v13;  // w8
    char v14;  // x9
    char v15;  // x10
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w10
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w9
    unsigned int v10;  // w9
    unsigned int v11;  // w8
    st_549fd8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_549fd8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (v2 ^ -v3) + (unsigned int)(v2 - v3 - (v2 | -v3)) * 2;
    v5 = ((v2 * 2 + ~v2 * 4 + (v2 ^ 1) + (v2 * 2 & 2) + 0x80000002 | ~v3) + v3) * 2;
    v6 = ((unsigned int)(0xfffffffd - v5) & v4) + v5 + 2 + (v5 + 2 & v4);
    v7 = (~v3 & ~v2) - (v3 & v2) + (v2 | v3) * 2;
    v8 = v7 + 1;
    v9 = v8 + ~v8 * 2 + 2 | ~v6;
    v10 = (v9 & v6 + 1) * 4 + (v9 ^ v6 + 1) * 2;
    v11 = v6 + v8 + (unsigned int)((v6 & v7) - (v6 + v8)) * 2 + ~v10 + v10 * 2 + 2;
    v12 = ~v11 + v11 * 2;
    v0 = (1 & ~v11) + v12 + (v12 | 1) + (~v12 | 0xffffffbf) + (0xffffffbf & ~v12) + 129;
    v1 = v12 + 117;
    v13 = a1 * (v1 + v0);
    v14 = (char)v13 + (char)a0;
    v15 = -(v13 | a0);
    return a0 - v13 + (v13 & a0) + (v14 ^ v15) + ((v14 & v15) + (v13 & ~a0)) * 2 & 0xff;
}
