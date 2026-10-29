/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d05c..0x7d1fc (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d05c_4 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned int field_30;
    char padding_34[4];
    unsigned long long field_38;
    char padding_40[32];
    unsigned long long field_60;
    char padding_68[8];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
} st_7d05c_4;

typedef struct st_7d05c_1 {
    char padding_0[268];
    unsigned int field_10c;
    char padding_110[128];
    unsigned int field_190;
    char padding_194[284];
    unsigned int field_2b0;
    char padding_2b4[4];
    unsigned long long field_2b8;
    char field_2c0;
    char padding_2c1[15];
    unsigned long long field_2d0;
    char padding_2d8[8];
    unsigned long long field_2e0;
    char padding_2e8[2480];
    long long field_c98;
    char padding_ca0[8];
    uint128_t field_ca8;
    uint128_t field_cb8;
    unsigned long long field_cc8;
    unsigned long long field_cd0;
    long long field_cd8;
    long long field_ce0;
    char padding_ce8[32];
    unsigned long long field_d08;
    char padding_d10[8];
    long long field_d18;
    char padding_d20[8];
    long long field_d28;
} st_7d05c_1;

typedef struct st_7d05c_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[88];
    uint128_t field_68;
    uint128_t field_78;
    unsigned long long field_88;
    double field_90;
    char padding_98[8];
    long long field_a0;
    char padding_a8[32];
    unsigned long long field_c8;
    char padding_d0[8];
    long long field_d8;
    char padding_e0[8];
    long long field_e8;
    char padding_f0[120];
    unsigned int field_168[7];
    unsigned int field_16c;
    unsigned int field_170;
    uint128_t field_174;
    unsigned int field_180;
} st_7d05c_0;

typedef struct st_7d05c_3 {
    unsigned int field_0[7];
    char field_4;
    char padding_5[3];
    char field_8;
    char padding_9[3];
    unsigned int field_c[4];
    char field_18;
} st_7d05c_3;

typedef struct st_7d05c_2 {
    char field_0;
} st_7d05c_2;


int sub_7d05c(st_7d05c_1 *a0, st_7d05c_0 *a1, void* a2, unsigned long a3, unsigned long a4)
{
    st_7d05c_3 *v4;  // x21
    unsigned int v5;  // w8
    uint128_t v14;  // q1
    uint128_t v6;  // q0
    long long v7;  // x0
    unsigned long long v8;  // 4106
    long long v9;  // x23
    long long n;  // x22
    st_7d05c_4 *v11;  // x21
    unsigned long long v12;  // 4127
    uint128_t v13;  // q0
    st_7d05c_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_7d05c_2 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = &a1->padding_f0[112];
    v5 = (int)a2[4];
    v6 = *(int128_t *)&v4->field_0[3];
    *(int128_t *)&a2[4] = *(int128_t *)&v4->field_0[0];
    *(uint128_t *)&a2[16] = v6;
    *(unsigned int *)&a2[4] = v5;
    *(unsigned int *)&a2[160] = (&a1[13].field_170)[1];
    v7 = sub_80ae4();
    v8 = arm64g_calculate_condition(130, v7, 120, 0);
    if (!(v8 & 1))
    {
        a0->field_2e0 = a0->field_2d0;
        if (sub_7cd78(a1->field_168[4], (&a1[13].field_170)[1], 0))
            v9 = 1 << ((char)*(int *)&a1->padding_f0[116] & 63);
        else
            v9 = 0;
        n = 1 << ((char)a1->field_168[0] & 63);
        sub_81380(a0->padding_d10, a1->padding_d0, n, v4);
        if (sub_7cd78(a0->field_10c, a0->field_190, 0))
            sub_81380(a0->padding_d20, a1->padding_e0, v9, v4);
        v11 = (a0->padding_ca0)[1];
        v12 = arm64g_calculate_condition(49, a1->field_168[4] - 6, 3, 0);
        if (!(v12 & 1) && (&a1[13].field_170)[1] == 1)
        {
            _memcpy(a0->field_cd8, a1->padding_98, n);
            *(long long *)&a0->padding_ce8[24] = *(long long *)&a1->padding_a8[24];
        }
        _bzero();
        sub_7fc20(&a0->field_2c0);
        v13 = *(int128_t *)&(a1->padding_10)[1];
        v14 = *(int128_t *)((char *)&a1->field_68 + 8);
        v11->field_20 = *(long long *)((char *)&a1->field_78 + 8);
        v11->field_0 = v13;
        v11->field_10 = v14;
        *(double *)&a0->field_cc8 = *(double *)&a1->field_88;
        a0->field_2b0 = a1[13].field_16c;
        a0->field_2b8 = a1->field_8;
        _memcpy(a0->field_c98, &(&a1->field_170)[2], 0x1600);
        v7 = 0;
    }
    return v7;
}
