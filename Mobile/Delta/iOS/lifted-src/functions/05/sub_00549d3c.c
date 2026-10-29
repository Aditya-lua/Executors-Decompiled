/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x549d3c..0x549ed4 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_549d3c_0 {
    char field_0;
} st_549d3c_0;


int sub_549d3c(void)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v14;  // w9
    unsigned int v15;  // w9
    unsigned int v16;  // w8
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    unsigned int v12;  // w11
    unsigned int v13;  // w8
    st_549d3c_0 **v0;  // [bp-0x10], Other Possible Types: char
    char v1;  // [bp-0xe]
    st_549d3c_0 *v2;  // [bp-0x8], Other Possible Types: unsigned short
    char v3;  // [bp-0x6]

    v2 = &v0;
    v0 = &v2;
    v4 = (unsigned short)v2 | *(char *)((void*)&v2 + 2) * 0x10000;
    v5 = (unsigned short)v0 | *(char *)((void*)&v0 + 2) * 0x10000;
    v6 = v4 - v5 + (v5 & ~v4) * 2;
    v7 = (v5 ^ 1) + v5 * 2 + ~v5 * 4 + (v5 * 2 & 2) + 2;
    v8 = (v7 + v4 + (v7 + ~v7 * 2 + 1 & ~v4)) * 2;
    v9 = v5 - v4 + v8 + 2 + (v8 + 2 | ~(v5 - v4)) + ((unsigned int)(0xfffffffd - v8) & v5 - v4) + 1;
    v10 = v9 * 3 + ~v9 * 4 + 4;
    v11 = (-((v10 ^ v6) + (v10 & v6) * 2) | 1) + (v10 ^ v6) + (v10 & v6) * 2 + ((v10 ^ v6) + (v10 & v6) * 2 - 1 | 1);
    v12 = (v11 + 2283435 ^ -(v11 | 2283435)) + (v11 + 2283435 & -(v11 | 2283435)) * 2;
    v13 = v11 + (v11 & 2283435) + (4566870 & ~(v11 * 2)) - 2283435;
    v0 = (unsigned short)v11 + 12534;
    v1 = 0;
    v2 = (unsigned short)v12 + (unsigned short)v13 + ((unsigned short)v12 & (unsigned short)~v13) + ((unsigned short)v13 | (unsigned short)~v12) + 1;
    v3 = 0;
    v14 = v2 | v3 * 0x10000;
    v15 = v14 * 2;
    v16 = (v0 | v1 * 0x10000) - ((unsigned int)((v14 ^ 0xfffffffe) + v15 - (v15 & 2)) + 3);
    return (v16 | 0xfffffffe) + (v16 + ((unsigned int)((v14 ^ 0xfffffffe) + v15 - (v15 & 2)) + 3) * 2 & 0xfffffffe) + 1;
}
