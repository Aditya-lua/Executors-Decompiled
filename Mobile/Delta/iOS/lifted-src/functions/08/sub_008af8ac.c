/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8af8ac..0x8af978 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8af8ac_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_8af8ac_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
    unsigned int field_30;
} st_8af8ac_1;

typedef struct st_8af8ac_0 {
    char field_0;
} st_8af8ac_0;


st_8af8ac_1 * sub_8af8ac(st_8af8ac_1 *a0, unsigned long long a1, unsigned long long a2)
{
    uint128_t *v2;  // x8
    unsigned long long v3;  // x8
    unsigned int v12;  // w10
    unsigned long long v4;  // x9
    uint128_t *v5;  // x10
    unsigned long long v7;  // 4125
    char *v8;  // x9
    unsigned int v9;  // w8
    char *v10;  // x9
    unsigned int v11;  // w10
    st_8af8ac_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_8af8ac_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_8 + a1 * 16;
    *v2 = *(int128_t *)((char *)v2 - 16);
    if (a1 - 1 != a2)
    {
        v3 = a2 - a1 + 1;
        v4 = a1 * 16;
        do
        {
            v5 = a0->field_8 + v4;
            *(int128_t *)((char *)v5 - 16) = *(int128_t *)((char *)v5 - 32);
            v4 -= 16;
            v7 = arm64g_calculate_condition(50, v3, 1, 0);
            v3 += 1;
        } while (v7 & 1);
    }
    if (a1 == a2)
        return a0;
    v8 = a0->field_10;
    v9 = a0->field_30;
    do
    {
        v10 = &v8[a1];
        v11 = *(v10 - 1);
        *v10 = (char)v9 + (char)v11 + ((char)v11 & (char)~v9) + ((char)v9 | (char)~v11) + 1;
        v8 = a0->field_10;
        v12 = *(char *)&a0->field_10[a1];
        v9 = a0->field_30;
        if ((v12 | v9) + (v9 & v12) >= 0x100)
            a0->field_28 = 0;
    } while ((a1 -= 1, a2 != a1));
    return a0;
}
