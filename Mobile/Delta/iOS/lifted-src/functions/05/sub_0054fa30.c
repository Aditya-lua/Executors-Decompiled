/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54fa30..0x54fb94 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54fa30_0 {
    char field_0;
} st_54fa30_0;


int sub_54fa30(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w12
    unsigned int v13;  // w11
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w10
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w11
    st_54fa30_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_54fa30_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (v2 ^ -v3) + (unsigned int)(v2 - v3 - (v2 | -v3)) * 2;
    v5 = ((v3 | v2) & -v2) * 4 + ((v3 | v2) ^ -v2) * 2;
    v6 = v4 + (v5 | ~v4) + (v4 | v5) + 1;
    v7 = v2 + ~v2 * 2 + v3;
    v8 = (v2 - v3 + (v3 & ~v2)) * 2;
    v9 = v7 + v8 + ((unsigned int)(0xfffffffd - v7) | v8) + (v7 + 2 & ~v8);
    v10 = v9 + 3;
    v11 = (v9 + 4 + ~v10 * 2 | 1) + (v9 + 4 & 1);
    v12 = v6 + ~v6 * 2;
    v13 = (v6 ^ -v11) + (v11 & v12 + 1) * 2 + (v6 & -v11) * 2 + 1;
    v14 = ((v9 + 2 & ~v6) - v10 & ~v12) * 4 + (v12 ^ ~((v9 + 2 & ~v6) - v10)) * 2;
    v15 = v14 + ~v14 * 2 | 1;
    v16 = v15 - v13 + (v13 + ~v15) * 2;
    v0 = v16 + 3590402097;
    v1 = v16 + 425048715;
    return (~v0 & ~v1 | v1 & v0) + (v1 | v0) * 2 + 1;
}
