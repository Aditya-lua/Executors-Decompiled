/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52e868..0x52e9c0 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52e868_0 {
    char field_0;
} st_52e868_0;


int sub_52e868(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w10
    unsigned int v4;  // w11
    unsigned int v5;  // w11
    unsigned int v6;  // w8
    unsigned int v7;  // w9
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w10
    unsigned int v11;  // w10
    st_52e868_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_52e868_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (~v2 & ~v3) + (v3 | v2) * 2 + 1;
    v5 = v4 + (v3 & v2) + (-(v3 & v2) & ~v4) * 2 + (v4 + (-(v3 & v2) | ~v4)) * 2;
    v6 = v3 + v2 + (-v2 & ~v3) * 2 + (unsigned int)(v3 - v2 - (v3 | -v2)) * 2;
    v7 = 1 | (v3 + ~v3 * 2 + 1 & v2) * 2;
    v8 = ~((v7 ^ v6) + (v7 & v6) * 2) + ((v7 ^ v6) + (v7 & v6) * 2) * 2;
    v9 = ((v8 - 1 & v5 + 2) - v8 ^ v8 - (v5 + 2) + (v5 + 2 | -v8)) + ((v8 - 1 & ~(v5 + 2)) - v8 & v5 + 3) * 4 + (((v8 - 1 & ~(v5 + 2)) - v8 ^ v5 + 3) + ((v8 - 1 & v5 + 2) - v8 & v8 - (v5 + 2) + (v5 + 2 | -v8))) * 2;
    v10 = v9 + ~v9 * 2 + 1;
    v11 = v9 + v10 + (0xd96f7f00 | ~v10) + 647004417;
    v0 = v9 + 1613560844;
    v1 = (v11 ^ (v9 | 0x269080ff) + 1) + (v11 & (v9 | 0x269080ff) + 1) * 2 - 1;
    return v0 - v1 + v1 * 2;
}
