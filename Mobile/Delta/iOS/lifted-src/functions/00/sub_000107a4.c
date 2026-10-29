/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107a4..0x10820 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_107a4_1 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[4];
    unsigned long long field_98;
} st_107a4_1;

typedef struct st_107a4_2 {
    unsigned long long field_0;
    uint128_t field_8;
    char field_18;
} st_107a4_2;

typedef struct st_107a4_0 {
    char field_0;
} st_107a4_0;


double sub_107a4(st_107a4_1 *a0)
{
    unsigned long long v4;  // x20
    uint128_t v5;  // q0
    st_107a4_2 *v6;  // x8
    unsigned long v8;  // d0
    st_107a4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_107a4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_80 != 281)
    {
        sub_10c2c();
        *(char *)&v6->field_0 = 0;
        *((char *)&v6->field_8 + 8) = 0;
        return v8;
    }
    v4 = *(long long *)((char *)&a0->field_84 + 8);
    v5 = *(int128_t *)&(&a0->field_80)[1];
    *(uint128_t *)&(&v6->field_0)[1] = v5;
    sub_f8d0();
    v6->field_0 = v4;
    *((char *)&v6->field_8 + 8) = 1;
    return (unsigned long long)v5;
}
