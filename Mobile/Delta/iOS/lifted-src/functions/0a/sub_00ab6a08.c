/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab6a08..0xab6b1c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab6a08_4 {
    char padding_0[152];
    struct st_ab6a08_3 *field_98;
} st_ab6a08_4;

typedef struct st_ab6a08_1 {
    char padding_0[104];
    unsigned long long field_68;
    unsigned int field_70;
    char padding_74[4];
    struct st_ab6a08_2 *field_78;
    char padding_80[24];
    struct st_ab6a08_0 *field_98;
} st_ab6a08_1;

typedef struct st_ab6a08_2 {
    unsigned int field_0;
} st_ab6a08_2;

typedef struct st_ab6a08_3 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ab6a08_0 *field_8;
    char padding_10[12];
    unsigned int field_1c;
    uint128_t field_20;
    unsigned int field_30;
    char padding_34[12];
    struct st_ab6a08_0 *field_40;
    long long field_48;
    unsigned int field_50;
} st_ab6a08_3;

typedef struct st_ab6a08_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ab6a08_0 *field_8;
    unsigned int field_10;
    char field_14;
    char padding_15[7];
    unsigned int field_1c;
    uint128_t field_20;
    unsigned int field_30;
    char padding_34[12];
    struct st_ab6a08_0 *field_40;
    long long field_48;
    unsigned int field_50;
} st_ab6a08_0;


st_ab6a08_0 * sub_ab6a08(st_ab6a08_1 *a0, st_ab6a08_4 *a1)
{
    st_ab6a08_0 *v2;  // x0
    st_ab6a08_0 *v3;  // x19
    unsigned int v4;  // w9
    st_ab6a08_3 *v5;  // x21
    st_ab6a08_0 *v6;  // x0
    st_ab6a08_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "crypto/rsa/rsa_pmeth.c", 64);
    if (!v2)
        return v2;
    v3 = v2;
    v2->field_0 = 0x800;
    v2->field_10 = 2;
    if (*(int *)a0->field_78 == 912)
        v4 = 6;
    else
        v4 = 1;
    v2->field_1c = v4;
    *(double *)&v2->field_30 = nan;
    v2->field_50 = 1;
    a0->field_98 = v2;
    a0->field_68 = &v2->field_14;
    a0->field_70 = 2;
    v5 = a1->field_98;
    v2->field_0 = v5->field_0;
    if (v5->field_8)
    {
        v6 = sub_9e4b00(v5->field_8);
        v3->field_8 = v6;
        if (!v6)
            return v6;
    }
    v3->field_1c = v5->field_1c;
    v3->field_20 = v5->field_20;
    v3->field_30 = v5->field_30;
    v3->field_50 = v5->field_50;
    if (!v5->field_40)
        return 1;
    sub_a6c2e4(v3->field_40, "crypto/rsa/rsa_pmeth.c", 105);
    v7 = sub_a6dac4(v5->field_40, v5->field_48, "crypto/rsa/rsa_pmeth.c", 106);
    v3->field_40 = v7;
    if (!v7)
        return v7;
    v3->field_48 = v5->field_48;
    return 1;
}
