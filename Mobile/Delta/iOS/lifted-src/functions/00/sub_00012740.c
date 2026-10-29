/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12740..0x127c0 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12740_1 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[128];
    unsigned int field_114;
} st_12740_1;

typedef struct st_12740_0 {
    char field_0;
} st_12740_0;


unsigned long long sub_12740(st_12740_1 *a0, unsigned long a1)
{
    unsigned int v5;  // w20
    unsigned long long v6;  // x0
    st_12740_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_12740_0 *v1;  // [bp-0x38]
    uint128_t v2;  // [bp-0x30]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = *(int *)&a0->padding_94[116];
    v2 = *(int128_t *)&(&a0->field_80)[1];
    if (a0->field_80 != 38 && a0->field_80 != 124)
    {
        sub_15068(a0, 0);
        *(unsigned int *)&a0->padding_94[116] = v5;
    }
    v6 = sub_1615c(a0);
    *(unsigned int *)&a0->padding_94[116] = v5;
    return v6;
}
