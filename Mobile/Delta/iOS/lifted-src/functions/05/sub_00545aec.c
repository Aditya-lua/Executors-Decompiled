/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x545aec..0x545c40 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_545aec_0 {
    char field_0;
} st_545aec_0;

extern char g_75dc00;

int sub_545aec(void)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v14;  // w9
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v6;  // w11
    unsigned int v7;  // w10
    unsigned int v8;  // w13
    unsigned int v9;  // w12
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    unsigned int v12;  // w9
    unsigned int v13;  // w8
    st_545aec_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned short
    char v1;  // [bp-0xe]
    st_545aec_0 *v2;  // [bp-0x8], Other Possible Types: unsigned short
    char v3;  // [bp-0x6]

    v2 = &v0;
    v0 = &v2;
    v4 = (unsigned short)v2 | *(char *)((void*)&v2 + 2) * 0x10000;
    v5 = (unsigned short)v0 | *(char *)((void*)&v0 + 2) * 0x10000;
    v6 = v4 + 1;
    v7 = v6 + ~v4 * 2;
    v8 = v7 + 1;
    v9 = v8 + ~v7 * 2 | v5;
    v10 = v4 - v5 + (v9 ^ v8) * 2 + (v9 & v8) * 4 + ~((v6 + v5 + (v7 | ~v5) + (-(v5 & v4) | ~(v6 + v5 + (v7 | ~v5)))) * 2 + 2) - (v6 + v5 + (v7 | ~v5) ^ -(v5 & v4));
    v11 = (v10 * 2 & 4) + (v10 ^ 2);
    v12 = ~v11 + v11 * 2;
    v13 = (unsigned int)((v12 | 1) + (1 & ~v11) - &g_75dc00);
    v14 = ~(v12 + (463508 & v12 * 2) + (463508 & v12 * 2 ^ 463508) - 231754) + (v12 + (463508 & v12 * 2) + (463508 & v12 * 2 ^ 463508) - 231754) * 2;
    v0 = (unsigned short)~v13 + (unsigned short)v13 * 2;
    v1 = 0;
    v3 = v14 >> 16;
    v2 = v14;
    v15 = v0 | v1 * 0x10000;
    v16 = (v2 | v3 * 0x10000) + 1;
    return ((v0 | v1 * 0x10000) - v16 | 0xfffffffe) + (v15 - v16 + (v15 + (v16 | ~v15) + (v16 & ~v15)) * 2 + 2 | 1);
}
