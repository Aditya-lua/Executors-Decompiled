/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52b168..0x52b2f4 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52b168_0 {
    char field_0;
} st_52b168_0;


unsigned int sub_52b168(unsigned int a0, char a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w11
    unsigned int v13;  // w10
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w8
    char v17;  // x8
    char v18;  // x10
    unsigned int v4;  // w14
    unsigned int v5;  // w12
    unsigned int v6;  // w10
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w12
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    st_52b168_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_52b168_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 + v2;
    v5 = v4 + (v2 + (-v3 | ~v2) + (-v3 & ~v2)) * 2 + 2;
    v6 = (v3 + ~v2 + (v2 & ~v3)) * 2;
    v7 = v5 * 2 - (v6 + 2 & v5) - (((unsigned int)(0xfffffffd - v6) & v5) - v6);
    v8 = v3 + ~v3 * 2;
    v9 = v4 + (v8 + 1 | ~v2) + 1;
    v10 = -((v8 ^ ~(v2 - v3 + (v3 | ~v2))) + (v2 - v3 + (v3 | ~v2) & ~v8) * 2);
    v11 = (v10 ^ v9) + (v10 & v9) * 2;
    v12 = v7 + 2;
    v13 = v11 + v12 + (unsigned int)(0xfffffffd - v7 - v11 - (-v11 | (unsigned int)(0xfffffffd - v7))) * 2;
    v14 = (unsigned int)((v11 - 1 | v12) - (v7 + v11)) - 2;
    v15 = (v14 & v7 + 3) * 4 + (v14 ^ v7 + 3) * 2 | 1;
    v16 = (v15 ^ v13) + (v15 & v13) * 2;
    v0 = v16 + 54;
    v1 = (v16 + (-v16 & 0xffffff81) + 126 ^ -(-v16 & 0xffffff81)) + (v16 + (-v16 & 0xffffff81) + 126 & -(-v16 & 0xffffff81)) * 2 - 1;
    v17 = a1 * (char)((~v1 + v1 * 2 + 2 ^ v0) + (~v1 + v1 * 2 + 2 & v0) * 2 - 1);
    v18 = (char)a0 + 1;
    return v18 + (v17 | v18 + ~a0 * 2) + (v17 | a0) & 0xff;
}
