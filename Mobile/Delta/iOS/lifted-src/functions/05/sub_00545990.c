/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x545990..0x545aec (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_545990_0 {
    char field_0;
} st_545990_0;


int sub_545990(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w13
    unsigned int v5;  // w15
    unsigned int v6;  // w17
    unsigned int v7;  // w15
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    unsigned int v10;  // w9
    st_545990_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_545990_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 | v2;
    v5 = -(v3 & v2);
    v6 = (v4 + (v5 | ~v4)) * 2 + 2;
    v7 = (v4 ^ v5) + v6;
    v8 = v2 + v3 + (v2 - v3 - (v2 | ~v3) & v3 + ~v2) * 4 + (v2 - v3 - (v2 | -v3) + (-v3 & ~v2) + (v2 - v3 - (v2 | ~v3) ^ v3 + ~v2)) * 2 + ((v4 ^ ~v5) - v6) * 4 + v7 + 3;
    v9 = v8 + v7 * 2;
    v0 = ((unsigned int)(0xfffffffe - v9) | 4023436572) + v9 + 2 + 271530723 + ((v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2 | 271530723) ^ -(v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2)) + ((v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2 | 271530723) & -(v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2)) * 2 + (((v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2 | 271530723) ^ -(v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2)) + ((v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2 | 271530723) & -(v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2)) * 2 & (unsigned int)(4023436572 - (((unsigned int)(0xfffffffe - v9) | 4023436572) + v9 + 2))) + (((unsigned int)(0xfffffffe - v9) | 4023436572) + v9 + 2 + 271530723 | ~(((v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2 | 271530723) ^ -(v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2)) + ((v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2 | 271530723) & -(v9 + 2 + (unsigned int)(0xfffffffe - v9) * 2)) * 2)) + 1;
    v1 = (v9 + (v9 * 2 + 2 & 296684406) + (v9 * 2 + 2 & 296684406 ^ 296684406) + 4146625094 | 1) + (v8 & 1) - 2;
    v10 = v1 + 1;
    return (v10 ^ v0) + (v10 & v0) * 2 - 1;
}
