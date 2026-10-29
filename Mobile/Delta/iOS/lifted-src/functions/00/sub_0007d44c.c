/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d44c..0x7d598 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d44c_3 {
    char field_0[28];
    char field_c;
} st_7d44c_3;

typedef struct st_7d44c_2 {
    char padding_0[688];
    unsigned int field_2b0;
    char padding_2b4[4];
    long long field_2b8;
    char padding_2c0[2520];
    long long field_c98;
    char padding_ca0[8];
    unsigned long long field_ca8;
    unsigned long long field_cb0;
    char padding_cb8[8];
    unsigned int field_cc0;
    unsigned int field_cc4;
    char padding_cc8[8];
    unsigned int field_cd0;
    char padding_cd4[204];
    unsigned long long field_da0;
} st_7d44c_2;

typedef struct st_7d44c_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[88];
    unsigned long long field_68;
    unsigned long long field_70;
    char padding_78[8];
    unsigned int field_80;
    char padding_84[112];
    long long field_f4;
    char padding_fc[108];
    char field_168[28];
    char field_174;
} st_7d44c_1;

typedef struct st_7d44c_0 {
    char field_0;
} st_7d44c_0;


unsigned long long sub_7d44c(st_7d44c_2 *a0, st_7d44c_1 *a1, void* a2, long long a3, long long a4)
{
    st_7d44c_3 *v7;  // x8
    unsigned int v8;  // w25
    void* v9;  // x24
    unsigned long long v10;  // x0
    unsigned long long v11;  // 4106
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    st_7d44c_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_7d44c_0 *v1;  // [bp-0x98]
    uint224_t v2;  // [bp-0x8c]
    uint128_t v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x64]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = &a1->padding_fc[104];
    v3 = *(int128_t *)&v7->field_0[0];
    v4 = *(int128_t *)&v7->field_0[12];
    v8 = (int)a2[4];
    v9 = a2 + 4;
    if (*(int *)&(a1->padding_84)[1])
        sub_7fa68(&v3);
    sub_7f578(&v3, a3, a1->field_8, 1, (int)a2[160]);
    *(uint128_t *)v9 = *(uint128_t *)&v2;
    *(uint128_t *)&v9[12] = *(uint128_t *)((void*)&v2 + 12);
    *(unsigned int *)&a2[4] = v8;
    *(int *)&a2[160] = *(int *)&a1[15].padding_84[45];
    v10 = sub_80ae4(a0, a2, a3, 0, 0, a4);
    v11 = arm64g_calculate_condition(130, v10, 120, 0);
    if (v11 & 1)
        return v10;
    v12 = a1->field_68 - a1->field_70;
    if (a1->field_80 != v12)
    {
        a0->field_da0 = &a1->field_68;
        v13 = a0->field_cc0;
        if (v12 > v13)
        {
            a0->field_ca8 = a0->field_cb0 + v12;
            a0->field_cc4 = v12;
            a0->field_cc0 = v12;
            v13 = v12;
        }
        a0->field_cd0 = v13;
    }
    a0->field_2b0 = *(int *)&a1[15].padding_84[37];
    a0->field_2b8 = a1->field_8;
    _memcpy(a0->field_c98, (char *)&a1[1].field_8 + 7, 0x1600);
    return 0;
}
