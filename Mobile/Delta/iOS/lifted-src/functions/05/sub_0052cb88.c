/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52cb88..0x52ccdc (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52cb88_0 {
    char field_0;
} st_52cb88_0;


int sub_52cb88(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned int v14;  // w9
    unsigned int v15;  // w10
    unsigned int v16;  // w11
    unsigned int v17;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w12
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w10
    unsigned int v11;  // w8
    st_52cb88_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52cb88_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 & ~v2;
    v5 = v4 * 2;
    v6 = v2 + v3 + ~v3 * 2 + v4 * 4 + 3;
    v7 = v6 + ~v5;
    v8 = v3 - v2 + (((v3 | v2) & -v3) * 4 + ((v3 | v2) ^ -v3) * 2 | ~(v3 - v2)) + (((v3 | v2) & -v3) * 4 + ((v3 | v2) ^ -v3) * 2 | v3 - v2);
    v9 = v8 + 1;
    v10 = (v9 ^ v7) + (v9 & v7) * 2 + (v6 - v5 + (v5 - v6) * 2 + (~(v6 - v5 + (v5 - v6) * 2) | ~v8)) * 2;
    v11 = (v7 - v9 & -(v7 | ~v8)) * 4 + (v7 - v9 ^ -(v7 | ~v8)) * 2;
    v12 = (v11 | ~(v10 + 2)) + v11 + (~(v10 + 2) | ~v11) + v10 * 2;
    v0 = v12 + 6 + (v12 + 6 ^ 1906417319) + (v12 + 6 | 2388549976) + (2388549976 & ~(v12 + 6)) + 1;
    v1 = v12 + 1008250487;
    v13 = v0;
    v14 = v1;
    v15 = v14 & v13;
    v16 = v14 + ~v14 * 2 + 1;
    v17 = v14 + v16 + (v13 | ~v16) + 2;
    return (v17 ^ v15) + (v17 & v15) * 2 - 1;
}
