/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd705c..0xd710c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d705c_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_d705c_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
    unsigned int field_30;
} st_d705c_1;

typedef struct st_d705c_0 {
    char field_0;
} st_d705c_0;


st_d705c_1 * sub_d705c(st_d705c_1 *a0, unsigned long long a1, unsigned long long a2)
{
    uint128_t *v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    uint128_t *v5;  // x10
    unsigned long long v7;  // 4125
    char *v8;  // x8
    char v9;  // x9
    st_d705c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_d705c_0 *v1;  // [bp-0x8]

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
        v8[a1] = *(&v8[a1] - 1) + v9;
        v8 = a0->field_10;
        v9 = a0->field_30;
        if (a0->field_30 + *(char *)&a0->field_10[a1] >= 0x100)
            a0->field_28 = 0;
    } while ((a1 -= 1, a2 != a1));
    return a0;
}
