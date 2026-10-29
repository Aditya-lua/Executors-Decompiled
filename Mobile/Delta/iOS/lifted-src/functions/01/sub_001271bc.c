/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1271bc..0x1272cc (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1271bc_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_1271bc_0 *field_10;
    char padding_18[16];
    unsigned long long field_28;
    unsigned int field_30;
} st_1271bc_1;

typedef struct st_1271bc_0 {
    char field_0;
} st_1271bc_0;


st_1271bc_1 * sub_1271bc(st_1271bc_1 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v5;  // x20
    void* v6;  // x8
    char *v15;  // x8
    char v16;  // x9
    st_1271bc_1 *v7;  // x0
    unsigned long long v8;  // x22
    unsigned long long v9;  // x23
    void* v10;  // x8
    unsigned long v11;  // x9
    uint128_t v12;  // q0
    unsigned long long v14;  // 4109
    st_1271bc_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1271bc_0 *v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_8 + 24 * a1;
    *(int128_t *)v6 = *(int128_t *)((char *)v6 - 24);
    *(long long *)&v6[16] = *(long long *)((char *)v6 - 8);
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
            v11 = *(long long *)((char *)v10 - 48);
            v12 = *(int128_t *)((char *)v10 - 40);
            *(unsigned long long *)((char *)v10 - 32) = 0;
            *(unsigned long *)((char *)v10 - 24) = v11;
            *(unsigned long long *)((char *)v10 - 40) = 0;
            v2 = *(int128_t *)((char *)v10 - 16);
            *(uint128_t *)((char *)v10 - 16) = v12;
            v7 = sub_60b78(&v2);
            v8 -= 24;
            v14 = arm64g_calculate_condition(50, v9, 1, 0);
            v9 += 1;
        } while (v14 & 1);
    }
    if (v5 == a2)
        return v7;
    v15 = a0->field_10;
    v16 = a0->field_30;
    do
    {
        v15[v5] = *(&v15[v5] - 1) + v16;
        v15 = a0->field_10;
        v16 = a0->field_30;
        if (a0->field_30 + *(char *)&a0->field_10[v5] >= 0x100)
            a0->field_28 = 0;
    } while ((v5 -= 1, a2 != v5));
    return v7;
}
