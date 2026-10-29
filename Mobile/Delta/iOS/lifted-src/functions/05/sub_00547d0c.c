/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x547d0c..0x547ec0 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_547d0c_0 {
    char field_0;
} st_547d0c_0;


unsigned int sub_547d0c(unsigned int a0, char a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w10
    unsigned int v12;  // w10
    unsigned int v13;  // w12
    unsigned int v14;  // w8
    unsigned int v15;  // w9
    unsigned int v16;  // w8
    unsigned int v17;  // w9
    unsigned int v18;  // w9
    unsigned int v19;  // w10
    char v21;  // x10
    unsigned int v4;  // w12
    char v22;  // x9
    unsigned int v5;  // w11
    unsigned int v6;  // w12
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    st_547d0c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    char *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = ((v3 | ~v2) ^ v2 + 1) + ((v3 | ~v2) & v2 + 1) * 2;
    v5 = v4 + (v3 | v2) + (-v4 & ~(v3 | v2)) * 2 + (unsigned int)((v3 | v2) - v4 - (v3 | v2 | -v4)) * 2;
    v6 = v3 + ~v3 * 2 + 1;
    v7 = (v3 ^ -v2) + (unsigned int)(v3 - v2 - (v3 | -v2)) * 2;
    v8 = (v6 + v2 & -(v6 | v2)) * 4 + (v6 + v2 ^ -(v6 | v2)) * 2;
    v9 = v7 + (v8 | ~v7) + (v8 | v7);
    v10 = v9 + 1;
    v11 = v5 + ~v5 * 2 + 1;
    v12 = (v10 ^ v5) + (v10 & v5) * 2 + (v11 + (~v11 | ~v9)) * 2;
    v13 = v12 + 2;
    v14 = (v5 - v10 + (v9 & ~v5)) * 2;
    v15 = v14 + 2;
    v16 = v12 + v15 + ((unsigned int)(0xfffffffd - v14) | ~v13) + 3;
    v17 = (v13 & v15) + v16;
    v0 = ((9 & ~v17) + (v17 ^ 0xfffffff6) ^ v17 + 1) + (v17 | 9) + ((9 & ~v17) + (v17 ^ 0xfffffff6) & v17 + 1) * 2;
    v1 = (v17 | 1) + (v16 & 1) + 171;
    v18 = v1;
    v19 = v18 + (0xffffffff ^ v18 * 2);
    v21 = (char)a0 + 1;
    v22 = a1 + ((char)v0 + (char)v19 + ((char)v0 + ((char)v18 + 1 | (char)~v0)) * 2 + ((char)-v19 & (char)~v0) * 2) * a1 | v21 + (char)~a0 * 2;
    return (v22 ^ v21) + (a1 + ((char)v0 + (char)v19 + ((char)v0 + ((char)v18 + 1 | (char)~v0)) * 2 + ((char)-v19 & (char)~v0) * 2) * a1 | a0) + (v22 & v21) * 2 & 0xff;
}
