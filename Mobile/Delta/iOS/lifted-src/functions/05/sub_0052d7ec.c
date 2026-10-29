/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d7ec..0x52d96c (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d7ec_0 {
    char field_0;
} st_52d7ec_0;


unsigned int sub_52d7ec(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v4;  // w11
    unsigned int v5;  // w10
    unsigned int v6;  // w9
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w11
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    st_52d7ec_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52d7ec_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = ~v3;
    v5 = v2 + v3 + v4 * 2 + ((unsigned int)(0xfffffffd - (v2 + v3 + v4 * 2)) | (v3 & ~v2) * 2) + (v2 + v3 + v4 * 2 + 2 | (v3 & ~v2) * 2);
    v6 = ((v3 ^ 1) + v3 * 2 + v4 * 4 + (v3 * 2 & 2) + 2 & v2) * 2;
    v7 = v3 - v2 + (v6 | ~(v3 - v2)) + (v6 | v3 - v2);
    v8 = v5 + 4 + v7 + 1 + ((unsigned int)((v7 | v5 + 3) - (v5 + 4 + ((unsigned int)(0xfffffffc - v5) | ~v7))) - (v7 + 1) * 2) * 2 + 1;
    v9 = v8 * 2;
    v0 = (73 | ~v8) + (v8 & 73) + v9 + (146 & ~v9) - 72;
    v1 = (v9 & 218) + v8 + (v9 & 218 ^ 218) - 110;
    v10 = v1 * 3 + ~v1 * 4 + v0 + ((unsigned int)(0x7ffffffd - (v1 * 3 + ~v1 * 4)) & ~v0) * 2 + ((unsigned int)(0x7ffffffd - (v1 * 3 + ~v1 * 4)) & v0) * 2 + 3;
    v11 = a1 + (v10 * 3 + ~v10 * 2) * a1;
    v12 = v11 | a0;
    v13 = (v11 + a0 ^ -v12) + (v11 + a0 & -v12) * 2;
    return v13 + (v12 | ~v13) + (v13 | v12) + 1 & 0xff;
}
