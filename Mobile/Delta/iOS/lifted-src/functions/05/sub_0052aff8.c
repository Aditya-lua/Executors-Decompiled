/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52aff8..0x52b168 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52aff8_0 {
    char field_0;
} st_52aff8_0;


int sub_52aff8(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned short v14;  // x8
    unsigned int v15;  // w9
    unsigned int v4;  // w10
    unsigned int v5;  // w12
    unsigned int v6;  // w11
    unsigned int v7;  // w10
    unsigned int v8;  // w10
    unsigned int v9;  // w11
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    st_52aff8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52aff8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned short

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned short)v1;
    v3 = (unsigned short)v0;
    v4 = v2 + ~v2 * 2 + 1;
    v5 = v3 + v2;
    v6 = v5 + ~v3 * 2 + 2;
    v7 = (v4 + v3 + ~(v4 | v3)) * 2 + 3;
    v8 = (v7 ^ v6) + (v7 & v6) * 2;
    v9 = ~v8 + v8 * 2;
    v10 = v2 | v3;
    v11 = (v5 ^ -v10) + (v5 & -v10) * 2;
    v12 = v10 + v11 + ~v11 * 2 + 1;
    v13 = (v9 | v12) - (v12 + v8);
    v14 = (((unsigned short)-v8 & (unsigned short)~v12) + (unsigned short)v9 ^ (unsigned short)(-v8 - (-v8 | ~v12))) + (((unsigned short)-v8 & (unsigned short)~v12) + (unsigned short)v9 & (unsigned short)(-v8 - (-v8 | ~v12))) * 2 + ((unsigned short)v13 & (unsigned short)v8) * 4 + ((unsigned short)v13 ^ (unsigned short)v8) * 2 + (((unsigned short)v13 & (unsigned short)v8) * 4 + ((unsigned short)v13 ^ (unsigned short)v8) * 2 | (unsigned short)~(((-v8 & ~v12) + v9 ^ -v8 - (-v8 | ~v12)) + ((-v8 & ~v12) + v9 & -v8 - (-v8 | ~v12)) * 2)) + ((((unsigned short)-v8 & (unsigned short)~v12) + (unsigned short)v9 ^ (unsigned short)(-v8 - (-v8 | ~v12))) + (((unsigned short)-v8 & (unsigned short)~v12) + (unsigned short)v9 & (unsigned short)(-v8 - (-v8 | ~v12))) * 2 & (unsigned short)~((v13 & v8) * 4 + (v13 ^ v8) * 2)) + 1;
    v0 = ((v14 | 1) + (v14 & 1) + 2740 | 1) + ((v14 | 1) + (v14 & 1) + 2740 & 1) - 2;
    v1 = (1218 & v14 * 2) + v14 + (1218 & v14 * 2 ^ 1218) - 610;
    v15 = (v1 ^ 1) + ~v1 * 2 + (__ROL__(v1, 1) & 2 & 3);
    return (v15 + v0 | 0xfffffffe) + (v15 + v0 + (v0 + (-v15 | ~v0) + (-v15 & ~v0)) * 2 + 2 | 1);
}
