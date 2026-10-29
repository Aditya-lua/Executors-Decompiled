/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54764c..0x5477d0 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54764c_0 {
    char field_0;
} st_54764c_0;


int sub_54764c(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w12
    unsigned int v14;  // w9
    unsigned int v4;  // w11
    unsigned int v5;  // w12
    unsigned int v6;  // w13
    unsigned int v7;  // w10
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w10
    unsigned int v11;  // w8
    st_54764c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_54764c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (v2 | ~v3) + v3;
    v5 = v3 | v2;
    v6 = v5 + ~v4;
    v7 = v3 * 2 + ~v3 * 4 + (v3 ^ 1) + (v3 * 2 & 2);
    v8 = v3 - v2 + (v7 + v2 + ~(v7 + 2 | v2)) * 2;
    v9 = v8 + 6;
    v10 = (v9 ^ v6) + (v5 - v4 + (v4 - v5) * 2 + ((unsigned int)(0xfffffffa - v8) | ~(v5 - v4 + (v4 - v5) * 2)) + (v9 & v6)) * 2 + 2;
    v11 = (v9 - (v8 + 5 & v6) & v6 - v9) * 4 + (v9 - (v8 + 5 & v6) ^ v6 - v9) * 2;
    v12 = v10 + (v11 | ~v10) + (v11 | v10) + 1;
    v13 = 4228922446 - (v12 & 4228922445);
    v0 = v12 + (v12 & 66044850) + (132089700 & ~(v12 * 2)) + (v13 ^ v12 + 66044850) + (v13 & v12 + 66044850) * 2 + 4228922446;
    v1 = v12 + (v12 ^ 4124703502) + (v12 | 170263793) + (170263793 & ~v12) + 1;
    v14 = (0xffffffff ^ ~v1 * 2) - v1;
    return (v14 ^ v0) + (v0 + (v14 | ~v0)) * 2 + 1;
}
