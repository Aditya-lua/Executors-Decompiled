/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2df40..0x2dfb0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2df40_0 {
    char field_0;
} st_2df40_0;


long long sub_2df40(long long a0)
{
    st_2df40_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_2df40_0 *v1;  // [bp-0x80]
    unsigned int v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x68]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x58]
    uint128_t v7;  // [bp-0x50], Other Possible Types: unsigned int
    unsigned int v8;  // [bp-0x48]
    uint128_t v9;  // [bp-0x40]
    uint128_t v10;  // [bp-0x30]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v1 = &v0;
    v0 = &v1;
    v10 = 0;
    v7 = 0;
    v9 = 0;
    v7 = 6;
    v8 = sub_2dc60();
    v2 = 6;
    v3 = v8;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    return sub_2a1ac(a0, &v2, &v7);
}
