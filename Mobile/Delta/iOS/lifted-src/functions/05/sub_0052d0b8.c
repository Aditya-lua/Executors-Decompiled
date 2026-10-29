/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d0b8..0x52d238 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d0b8_0 {
    char field_0;
} st_52d0b8_0;


unsigned int sub_52d0b8(char a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w11
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v4;  // w12
    unsigned int v5;  // w11
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    st_52d0b8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    char *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v2 + 1;
    v5 = v4 + ~v2 * 2;
    v6 = (v5 | v3) + v2 + (v3 | v2) + ((v3 | v2) & ~((v5 | v3) + v2)) * 2 + (~((v5 | v3) + v2) & ~(v3 | v2)) * 2 + 1;
    v7 = v4 + v3 + (v3 + ~v3 * 2 + 1 | v5);
    v8 = ((v7 & ~((v2 | ~v3) + v3)) * 2 + (v7 ^ ~((v2 | ~v3) + v3)) ^ 1) + (__ROL__(v7 ^ ~((v2 | ~v3) + v3), 1) & 2 & 3) + ((v7 ^ (v2 | ~v3) + v3) - (v7 & ~((v2 | ~v3) + v3)) * 2) * 2;
    v9 = (((v6 | v8) + (v8 & v6)) * 2 & 4) + ((v6 | v8) + (v8 & v6) ^ 2);
    v10 = ~v9;
    v11 = v10 + v9 * 2;
    v12 = -v9;
    v13 = ((v12 | 26) ^ v9) + ((v12 | 26) & v9) * 2;
    v0 = (v10 | 0xfffffffe) + (v11 + (312 & v11 * 2) + (312 & v11 * 2 ^ 312) - 156 & 0xfffffffe) + 1;
    v1 = ~(((v12 & 26) + v11 + 1 ^ v13) + ((v12 & 26) + v11 + 1 & v13) * 2) + (((v12 & 26) + v11 + 1 ^ v13) + ((v12 & 26) + v11 + 1 & v13) * 2) * 2;
    v14 = a1 * ((v1 + ~v1 * 2 + 1 & v0) + v1 + (v1 + v0 ^ -(v0 | v1)) + (v1 + v0 & -(v0 | v1)) * 2);
    return (a0 | ~v14) + v14 + (v14 | a0) + 1 & 0xff;
}
