/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82370..0x82490 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82370_0 {
    char field_0;
} st_82370_0;


double sub_82370(long long a0, long long a1, uint128_t *a2, long long a3, long long a4)
{
    st_82370_0 **v0;  // [bp-0x130], Other Possible Types: char
    st_82370_0 *v1;  // [bp-0x128]
    uint128_t v2;  // [bp-0x120]
    uint128_t v3;  // [bp-0x110]
    uint128_t v4;  // [bp-0x100]
    uint128_t v5;  // [bp-0xf0]
    uint128_t v6;  // [bp-0xe0]
    uint128_t v7;  // [bp-0xd0]
    uint128_t v8;  // [bp-0xc0]
    uint128_t v9;  // [bp-0xb0]
    uint128_t v10;  // [bp-0xa0]
    uint128_t v11;  // [bp-0x90]
    uint128_t v12;  // [bp-0x80]
    uint128_t v13;  // [bp-0x70]
    uint128_t v14;  // [bp-0x60]
    uint128_t v15;  // [bp-0x50]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v1 = &v0;
    v0 = &v1;
    if (!sub_8290c(a1, a2, a3))
    {
        v12 = a2[10];
        v13 = a2[11];
        v14 = a2[12];
        v15 = a2[13];
        v8 = a2[6];
        v9 = a2[7];
        v10 = a2[8];
        v11 = a2[9];
        v4 = a2[2];
        v5 = a2[3];
        v6 = a2[4];
        v7 = a2[5];
        v2 = *a2;
        v3 = a2[1];
        sub_7d05c(a0, a1, &v2, a3, a4);
        return (unsigned long long)*a2;
    }
    v12 = a2[10];
    v13 = a2[11];
    v14 = a2[12];
    v15 = a2[13];
    v8 = a2[6];
    v9 = a2[7];
    v10 = a2[8];
    v11 = a2[9];
    v4 = a2[2];
    v5 = a2[3];
    v6 = a2[4];
    v7 = a2[5];
    v2 = *a2;
    v3 = a2[1];
    sub_7d44c(a0, a1, &v2, a3, a4);
    return (unsigned long long)*a2;
}
