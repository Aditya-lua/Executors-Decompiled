/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d3b4..0x52d508 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d3b4_0 {
    char field_0;
} st_52d3b4_0;


int sub_52d3b4(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w9
    unsigned int v13;  // w8
    unsigned int v14;  // w10
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w11
    unsigned int v18;  // w8
    unsigned int v19;  // w9
    unsigned int v20;  // w10
    unsigned int v21;  // w8
    unsigned int v4;  // w12
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w10
    unsigned int v11;  // w11
    st_52d3b4_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    char *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 & v2;
    v5 = v2 - v3 + v4 + (v3 & ~v2) * 2;
    v6 = v3 | v2;
    v7 = -((v3 + ~v6 ^ v2 + 1) + (v3 + ~v6 & v2 + 1) * 2);
    v8 = (v7 ^ v5) + (v7 & v5) * 2;
    v9 = v6 - v4;
    v10 = -v9;
    v11 = v8 + ~v8 * 2 + 1;
    v12 = v8 + v9 + (unsigned int)(v11 - v9 - (v11 | v10)) * 2;
    v13 = (0xffffffff ^ (v8 & v10) * 2) + (v8 & v10) * 4 + 2;
    v14 = v12 ^ v13;
    v15 = v12 & v13;
    v16 = v14 + v15 * 2;
    v17 = ~v16 + v16 * 2;
    v0 = (-v16 & 2439205698) + v17 + ((v14 + (v15 - v16) * 2 | 2439205698) ^ -(v14 + (v15 - v16) * 2)) + ((v14 + (v15 - v16) * 2 | 2439205698) & -(v14 + (v15 - v16) * 2)) * 2;
    v1 = (v16 + (v17 ^ 0xffaf013f) + (5308096 & ~v17) ^ (v17 | 5308096) + 1) + (v16 + (v17 ^ 0xffaf013f) + (5308096 & ~v17) & (v17 | 5308096) + 1) * 2 - 1;
    v18 = v0;
    v19 = v1;
    v20 = v19 + (v18 | ~v19) + 1;
    v21 = (v19 | v18) + 1;
    return (v20 ^ v21) + (v20 & v21) * 2 - 1;
}
