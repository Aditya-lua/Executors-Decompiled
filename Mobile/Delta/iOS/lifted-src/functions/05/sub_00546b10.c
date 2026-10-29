/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x546b10..0x546c94 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_546b10_0 {
    char field_0;
} st_546b10_0;


int sub_546b10(void)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w8
    unsigned int v18;  // w8
    unsigned int v19;  // w9
    unsigned int v20;  // w8
    unsigned int v21;  // w9
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w11
    unsigned int v10;  // w8
    unsigned int v11;  // w10
    unsigned int v12;  // w11
    unsigned int v13;  // w9
    st_546b10_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned short
    char v1;  // [bp-0xe]
    st_546b10_0 *v2;  // [bp-0x8], Other Possible Types: unsigned short
    char v3;  // [bp-0x6]

    v2 = &v0;
    v0 = &v2;
    v4 = (unsigned short)v2 | *(char *)((void*)&v2 + 2) * 0x10000;
    v5 = (unsigned short)v0 | *(char *)((void*)&v0 + 2) * 0x10000;
    v6 = v5 | v4;
    v7 = (v4 + ~v4 * 2 + 1 | v5) + v4;
    v8 = v7 ^ v6;
    v9 = (v6 & ~v7) * 2;
    v10 = (v6 ^ -(v5 & v4)) + (unsigned int)(v6 - (v5 & v4) - (v6 | -(v5 & v4))) * 2;
    v11 = v8 - v9;
    v12 = v9 - v8;
    v13 = v12 + v10 + (unsigned int)(v12 + v11 * 2 - v10 - (v12 + v11 * 2 | -v10)) * 2;
    v14 = v11 - v10 + (v10 - 1 | v9 + (v7 ^ ~v6)) + 1;
    v15 = (v14 & v12) * 4 + (v14 ^ v12) * 2 + v13 * 2 - ((v14 & v12) * 4 + (v14 ^ v12) * 2 & v13 - 1) + ((v14 & v12) * 4 + (v14 ^ v12) * 2 | -v13);
    v16 = v15 - 1;
    v17 = (v16 ^ 870416) + ((-v15 | 870416) + v15) * 2 - 1;
    v0 = (((unsigned short)(v15 - v15 * 2) | 0xdfeb) ^ (unsigned short)v15) + ((unsigned short)v16 | 0xdfeb) + (((unsigned short)(v15 - v15 * 2) | 0xdfeb) & (unsigned short)v15) * 2;
    v1 = 0;
    v3 = v17 >> 16;
    v2 = v17;
    v18 = v0 | v1 * 0x10000;
    v19 = v2 | v3 * 0x10000;
    v20 = v19 | v18;
    v21 = (v19 + v18 ^ -v20) + (v19 + v18 & -v20) * 2;
    return v21 + (v20 | ~v21) + (v21 | v20) + 1;
}
