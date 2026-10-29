/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a360..0x2a440 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a360_0 {
    char field_0;
} st_2a360_0;


unsigned long long sub_2a360(void* a0, char a1, char a2)
{
    unsigned long long v16;  // x20
    unsigned long long v17;  // x22
    st_2a360_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_2a360_0 *v1;  // [bp-0xc8]
    uint128_t v2;  // [bp-0xc0]
    uint128_t v3;  // [bp-0xb0]
    char v4;  // [bp-0xa7]
    char v5;  // [bp-0xa5]
    unsigned int v6;  // [bp-0xa0]
    uint128_t v7;  // [bp-0x98]
    uint128_t v8;  // [bp-0x88]
    uint128_t v9;  // [bp-0x78]
    uint128_t v10;  // [bp-0x68]
    uint128_t v11;  // [bp-0x58]
    uint128_t v12;  // [bp-0x48]
    char *v13;  // [bp-0x38]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v1 = &v0;
    v0 = &v1;
    v16 = (long long)a0[8];
    v17 = (long long)a0[16];
    v6 = 0;
    v2 = 0;
    v3 = 0;
    v7 = 0;
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v4 = a1;
    v5 = a2;
    sub_30efc(a0 + 8, &v2);
    *(unsigned int *)&a0[32] = 4042322161 * (unsigned int)(v17 - v16 >> 3);
    *(char *)&a0[240] = 0;
    *(unsigned int *)&a0[648] = 0;
    v13 = &v10;
    sub_1aedc(&v13);
    return 4042322161 * (v17 - v16 >> 3);
}
