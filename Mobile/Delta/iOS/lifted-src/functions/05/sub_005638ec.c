/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5638ec..0x563a04 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5638ec_0 {
    char field_0;
} st_5638ec_0;


int sub_5638ec(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w13
    unsigned int v5;  // w10
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w9
    st_5638ec_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    char *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v2 + 1;
    v5 = v2 + (v3 | ~v2) + (v3 ^ v2) + (v3 & v2) + ~(v3 & v2) * 2;
    v7 = (v3 | v2) - (v3 + v2);
    v8 = (unsigned int)(v5 - ((v7 ^ v4 + v4 + ~v2 * 2 + (v3 | ~(v4 + ~v2 * 2))) + (v4 + v4 + ~v2 * 2 + (v3 | ~(v4 + ~v2 * 2)) & v7) * 2)) + ((v7 ^ ~(v4 + v4 + ~v2 * 2 + (v3 | ~(v4 + ~v2 * 2)))) - (v4 + v4 + ~v2 * 2 + (v3 | ~(v4 + ~v2 * 2)) & v7) * 2 & v5 + 3) + ((v7 ^ v4 + v4 + ~v2 * 2 + (v3 | ~(v4 + ~v2 * 2))) + (v4 + v4 + ~v2 * 2 + (v3 | ~(v4 + ~v2 * 2)) & v7) * 2 | (unsigned int)(0xfffffffc - v5));
    v0 = v8 + 783731419;
    v1 = v8 + 4 + (v8 + 4 ^ 2367056875) + (v8 + 4 | 1927910420) + (1927910420 & ~(v8 + 4)) + 1;
    v9 = (unsigned int)(v1 * 2 + (v1 ^ 0xfffffffe) - (v1 * 2 & 2)) + 3;
    return (v9 ^ v0) + (v0 + (v9 | ~v0)) * 2 + 1;
}
