/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31a20..0x31a80 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31a20_0 {
    char field_0;
} st_31a20_0;


double sub_31a20(float a0, float a1, float a2, float a3)
{
    st_31a20_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_31a20_0 *v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x68]
    unsigned int v3;  // [bp-0x60]
    unsigned int v4;  // [bp-0x5c]
    unsigned int v5;  // [bp-0x58]
    unsigned int v6;  // [bp-0x54]
    uint128_t v7;  // [bp-0x50]
    uint128_t v8;  // [bp-0x48]
    uint128_t v9;  // [bp-0x40], Other Possible Types: unsigned int
    unsigned int v10;  // [bp-0x38]
    unsigned int v11;  // [bp-0x34]
    uint128_t v12;  // [bp-0x30], Other Possible Types: unsigned int
    unsigned int v13;  // [bp-0x2c]
    uint128_t v14;  // [bp-0x20]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v1 = &v0;
    v0 = &v1;
    v9 = 0;
    v12 = 0;
    v14 = 0;
    v9 = 4;
    v10 = a0;
    v11 = a1;
    v12 = a2;
    v13 = a3;
    v2 = 4;
    v7 = 0;
    v8 = 0;
    v3 = a0;
    v4 = a1;
    v5 = a2;
    v6 = a3;
    sub_2a1ac();
    return a0;
}
