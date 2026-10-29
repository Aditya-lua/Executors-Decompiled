/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d238..0x52d37c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d238_0 {
    char field_0;
} st_52d238_0;


unsigned int sub_52d238(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    char v14;  // x8
    char v15;  // x10
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    st_52d238_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_52d238_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = 1 | (v2 + (0xffffffff ^ v2 * 2) & v3) * 2;
    v5 = (v4 ^ v2 - v3) + (v4 & v2 - v3) * 2;
    v6 = ~v5 + v5 * 2;
    v7 = -(v3 ^ v2);
    v8 = ((v6 | v7) ^ -v5 - (-v5 | v7)) + ((v6 | v7) & -v5 - (-v5 | v7)) * 2;
    v9 = v8 + (v6 & v7) * 2 + (v8 & ~((v6 & v7) * 2)) + ((v6 & v7) * 2 | ~v8);
    v10 = v9 + 1;
    v11 = (v9 + 53 ^ -(v10 | 52)) + (v9 + 53 & -(v10 | 52)) * 2;
    v12 = (v10 & 52) - (v9 + 54) + (v9 + 54 - (v10 & 52)) * 2;
    v13 = (v10 ^ 130) + (v10 + (130 | ~v10)) * 2 + 2;
    v0 = ~((v11 ^ v12) + (v11 & v12) * 2) + ((v11 ^ v12) + (v11 & v12) * 2) * 2;
    v1 = v13 * 3 + ~v13 * 2 + 1;
    v14 = (char)a1 * ((char)v1 + (char)v0) + (char)~(a1 * (v1 + v0) | a0);
    v15 = (char)a0 + 1;
    return (v14 ^ v15) + (a1 * (v1 + v0) | a0) + (v14 & v15) * 2 & 0xff;
}
