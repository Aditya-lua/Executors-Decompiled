/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54e84c..0x54e970 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54e84c_0 {
    char field_0;
} st_54e84c_0;


unsigned int sub_54e84c(char a0, char a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    char v12;  // x8
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    char v11;  // x10
    st_54e84c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_54e84c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = ((v2 | v3) & -v2) * 4 + ((v2 | v3) ^ -v2) * 2 | 1;
    v5 = (v4 ^ v2 - v3) + (v4 & v2 - v3) * 2 - 1;
    v6 = v3 + v2 + (0xffffffff ^ v3 * 2) + ~(v3 + v2 + (0xffffffff ^ v3 * 2) + (v3 | ~v2));
    v7 = (v3 - v2 + v6 * 4 + 1 + ~(v6 * 2)) * 3 + (v6 * 2 - (v3 - v2 + v6 * 4 + 1)) * 4 + 4;
    v8 = (v7 ^ v5) + (v7 & v5) * 2;
    v0 = v8 + 131;
    v1 = (v8 & 50) + (v8 + ~(v8 & 50) + 0x33 | ~(v8 & 50)) + (v8 & 50 | v8 + ~(v8 & 50) + 0x33) + 1;
    v9 = v0;
    v10 = v1;
    v11 = ((char)v10 + (char)v9 ^ (char)-(v9 | v10)) + ((char)v10 + (char)v9 & (char)-(v9 | v10)) * 2;
    v12 = (char)v9 + ((char)v10 | (char)~v9) + ((char)v10 ^ (char)v9) + 1;
    return a0 + a1 * ((v11 | v12) + (v11 & v12)) & 0xff;
}
