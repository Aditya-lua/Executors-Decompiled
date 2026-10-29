/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4b20..0xc4b98 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4b20_0 {
    char field_0;
} st_c4b20_0;


long long * sub_c4b20(long long *a0)
{
    st_c4b20_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_c4b20_0 *v1;  // [bp-0x68]
    uint128_t v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x30]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return 0;
    v2 = *(int128_t *)&a0[3416];
    v3 = a0[3418];
    v4 = *(int128_t *)&a0[3416];
    v5 = a0[3418];
    sub_80164(*a0, &v4);
    sub_80164(a0, &v2);
    return 0;
}
