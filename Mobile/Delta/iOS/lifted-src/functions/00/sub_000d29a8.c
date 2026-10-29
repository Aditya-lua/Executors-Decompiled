/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd29a8..0xd2ab8 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d29a8_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_d29a8_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
    unsigned int field_30;
} st_d29a8_1;

typedef struct st_d29a8_0 {
    char field_0;
} st_d29a8_0;


st_d29a8_1 * sub_d29a8(st_d29a8_1 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v5;  // x20
    void* v6;  // x8
    char v15;  // x9
    st_d29a8_1 *v7;  // x0
    unsigned long long v8;  // x22
    unsigned long long v9;  // x23
    void* v10;  // x8
    uint128_t v11;  // q0
    unsigned long long v13;  // 4109
    char *v14;  // x8
    st_d29a8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_d29a8_0 *v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_8 + 24 * a1;
    *(int *)v6 = *(int *)((char *)v6 - 24);
    *(int128_t *)&v6[8] = *(int128_t *)((char *)v6 - 16);
    *(unsigned long long *)((char *)v6 - 16) = 0;
    *(unsigned long long *)((char *)v6 - 8) = 0;
    v7 = a0;
    if (a1 - 1 != a2)
    {
        v8 = v5 * 24;
        v9 = a2 - v5 + 1;
        do
        {
            v10 = a0->field_8 + v8;
            *(int *)((char *)v10 - 24) = *(int *)((char *)v10 - 48);
            v11 = *(int128_t *)((char *)v10 - 40);
            *(unsigned long long *)((char *)v10 - 40) = 0;
            *(unsigned long long *)((char *)v10 - 32) = 0;
            v2 = *(int128_t *)((char *)v10 - 16);
            *(uint128_t *)((char *)v10 - 16) = v11;
            v7 = sub_60b78(&v2);
            v8 -= 24;
            v13 = arm64g_calculate_condition(50, v9, 1, 0);
            v9 += 1;
        } while (v13 & 1);
    }
    if (v5 == a2)
        return v7;
    v14 = a0->field_10;
    v15 = a0->field_30;
    do
    {
        v14[v5] = *(&v14[v5] - 1) + v15;
        v14 = a0->field_10;
        v15 = a0->field_30;
        if (a0->field_30 + *(char *)&a0->field_10[v5] >= 0x100)
            a0->field_28 = 0;
    } while ((v5 -= 1, a2 != v5));
    return v7;
}
