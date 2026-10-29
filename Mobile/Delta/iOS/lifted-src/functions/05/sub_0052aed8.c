/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52aed8..0x52aff8 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52aed8_0 {
    char field_0;
} st_52aed8_0;


unsigned int sub_52aed8(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    char v12;  // x13
    unsigned int v13;  // w10
    unsigned int v4;  // w10
    unsigned int v5;  // w8
    unsigned int v6;  // w8
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    char v11;  // x9
    st_52aed8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52aed8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (unsigned int)(v3 + v2 - (v3 & v2)) + ((v3 | v2) - 1 ^ v3 + v2) - (v3 + v2 & -(v3 | v2)) * 2 + 1;
    v5 = v3 - v2 + (v2 & ~v3) * 2;
    v6 = v5 + ~v5 * 2 + 1;
    v7 = v4 + (v6 | ~v4) + (v6 | v4) + 1;
    v8 = v7 + (v7 | 1) + (~v7 | 1);
    v0 = (v8 + 1 | 1) + (v8 + 1 & 1) + 60;
    v1 = v8 + 121;
    v9 = (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2;
    v10 = a1 * (~v9 + v9 * 2);
    v11 = (char)(v10 - a0) + ((char)a0 | (char)~v10);
    v12 = -(a0 + 1 + ~a0 * 2);
    v13 = v10 + ~v10 * 2 + 1;
    return a0 + 1 + v10 + (v11 ^ v12) + v13 + (a0 + 1 + ~a0 * 2 & ~v13) + (v11 & v12) * 2 & 0xff;
}
