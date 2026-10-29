/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42186c..0x4219ac (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_42186c_0 {
    char field_0;
} st_42186c_0;


char * sub_42186c(char *a0)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v14;  // w8
    unsigned int v15;  // w9
    unsigned int v16;  // w10
    unsigned int v17;  // w11
    unsigned int v18;  // w10
    unsigned int v19;  // w9
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w12
    unsigned int v7;  // w13
    unsigned int v8;  // w10
    unsigned int v9;  // w8
    unsigned int v10;  // w11
    unsigned int v11;  // w9
    st_42186c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_42186c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v1;
    v3 = (char)v0;
    v4 = v3 | v2;
    v5 = (v3 | ~v2) + v2;
    v6 = v4 + ~v5;
    v7 = v6 | v2;
    v8 = v5 - v4;
    v9 = (v8 | v2) + v6;
    v10 = v7 + ~v9;
    v11 = (v6 ^ -v3) + ((v6 & -v3) + (v8 & v3)) * 2;
    v12 = v10 - v11 + (v7 - v9 + (v9 - v7) * 2 + (v11 | ~(v7 - v9 + (v9 - v7) * 2))) * 2;
    v13 = (v11 ^ -v10) + (v11 & -v10) * 2 + (v11 + ~v11 * 2 + 1 & v10) * 2;
    *a0 = v13 + v12 + 3 + (-v13 & ~(v12 + 2)) * 2 + ((-v13 | ~(v12 + 2)) + v12 + 3) * 2 - 1;
    v14 = (char)v1;
    v15 = (char)v0;
    v16 = v14 + ~v14 * 2 + 1;
    v17 = -v15;
    v18 = (v14 ^ v17) + (v14 & v17) * 2 + (v16 + (v15 | ~v16)) * 2 + 2;
    v19 = (v18 ^ v17) + (v15 & ~v18 | v18 & v17) * 2;
    a0[72] = (char)((v18 ^ v14 | v19) - (v19 ^ v18 ^ v14)) + (char)~((v19 | ~(v18 ^ v14)) + (v18 ^ v14));
    return a0;
}
