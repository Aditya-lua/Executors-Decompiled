/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d508..0x52d66c (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d508_0 {
    char field_0;
} st_52d508_0;


unsigned int sub_52d508(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w10
    unsigned int v5;  // w8
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    st_52d508_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52d508_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v2 - v3 + (v3 & ~v2) * 2;
    v5 = v3 - v2 + ((v2 + ~v3 & -(v2 | ~v3)) * 4 + (v2 + ~v3 ^ -(v2 | ~v3)) * 2 | ~(v3 - v2)) + ((v2 + ~v3 & -(v2 | ~v3)) * 4 + (v2 + ~v3 ^ -(v2 | ~v3)) * 2 | v3 - v2);
    v6 = (v4 | ~v5) - v4 + (v5 & v4);
    v7 = (~(~v5 + v4) - (v5 | ~v4) & ~v5 + v4) * 4 + (~(~v5 + v4) - (v5 | ~v4) ^ ~v5 + v4) * 2 | 1;
    v8 = ~((v7 ^ v6) + (v7 & v6) * 2) + ((v7 ^ v6) + (v7 & v6) * 2) * 2;
    v0 = (v8 | 0xffffffb8) + (v8 ^ 71) + 72 + (v8 | 0xffffffb8) * 2 + ((unsigned int)(0xffffffb7 - (v8 | 0xffffffb8)) | (v8 | 0xffffffb8) + (v8 ^ 71) + 72) + ((unsigned int)(0xffffffb7 - (v8 | 0xffffffb8)) | ~((v8 | 0xffffffb8) + (v8 ^ 71) + 72)) + 146;
    v1 = v8 + 110;
    v9 = a1 * (v1 + v0 + 1 + ((v0 + 1 + ~v0 * 2 | v1) ^ -(v0 + 1 + ~v0 * 2)) + (v1 + ~v1 * 2 + 1 | ~v0) + ((v0 + 1 + ~v0 * 2 | v1) & -(v0 + 1 + ~v0 * 2)) * 2);
    v10 = ((a0 | v9) + 1 ^ (unsigned int)(v9 + a0 - (a0 | v9))) + ((a0 | v9) + 1 & (unsigned int)(v9 + a0 - (a0 | v9))) * 2;
    return ~v10 + v10 * 2 & 0xff;
}
