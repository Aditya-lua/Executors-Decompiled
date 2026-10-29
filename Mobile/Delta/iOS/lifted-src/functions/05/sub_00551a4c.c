/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x551a4c..0x551b60 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_551a4c_0 {
    char field_0;
} st_551a4c_0;


int sub_551a4c(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned int v4;  // w11
    unsigned int v5;  // w10
    unsigned int v6;  // w13
    unsigned int v7;  // w14
    unsigned int v8;  // w12
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    st_551a4c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_551a4c_0 *v1;  // [bp-0x8], Other Possible Types: char

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v1;
    v3 = (char)v0;
    v4 = v3 + 1;
    v5 = v4 + ~v3 * 2 | ~v2;
    v6 = v3 + v2;
    v7 = -((v6 ^ -(v2 | v3)) + (v6 & -(v2 | v3)) * 2);
    v8 = (v4 + v2 + v5 ^ v7) + (v4 + v2 + v5 & v7) * 2;
    v9 = -(((v2 | ~v3) ^ v4) + ((v2 | ~v3) & v4) * 2);
    v10 = (v9 ^ v5 + v6 + 1) + (v9 & v5 + v6 + 1) * 2;
    v11 = v10 + v8 + (~v8 + (v8 | -v10)) * 2 + 2;
    v12 = (v8 & (v10 + 1 + ~v10 * 2 | 1) + (v10 + 1 & 1)) * 2;
    v13 = (v11 | v12) + (v11 & v12);
    v0 = v13 - 92;
    v1 = ((char)v13 ^ 77 | 254) + (((char)v13 ^ 77) + ((char)v13 + (77 | (char)~v13)) * 2 + 2 & 254) + 1;
    return v1 + v0;
}
