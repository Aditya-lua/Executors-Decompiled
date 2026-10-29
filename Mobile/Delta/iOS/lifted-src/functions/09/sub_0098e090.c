/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e090..0x98e170 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e090_0 {
    struct st_98e090_0 *field_0;
    char padding_8[8];
    struct st_98e090_0 *field_10;
    char padding_18[8];
    struct st_98e090_0 *field_20;
    char padding_28[8];
    struct st_98e090_0 *field_30;
    char padding_38[8];
    struct st_98e090_0 *field_40;
    char padding_48[8];
    struct st_98e090_0 *field_50;
    char padding_58[8];
    struct st_98e090_0 *field_60;
    struct st_98e090_0 *field_68;
    struct st_98e090_0 *field_70;
    char padding_78[1];
    char field_79;
    char padding_7a[6];
    struct st_98e090_0 *field_80;
    struct st_98e090_0 *field_88;
    char padding_90[8];
    struct st_98e090_0 *field_98;
} st_98e090_0;

typedef struct st_98e090_1 {
    struct st_98e090_0 *field_0;
    struct st_98e090_0 *field_8;
    unsigned long long field_10;
} st_98e090_1;


int sub_98e090(st_98e090_1 *a0)
{
    st_98e090_1 *v2;  // x8
    st_98e090_0 *v3;  // x0
    st_98e090_1 *v4;  // x19
    st_98e090_0 *v5;  // x9
    st_98e090_0 *v6;  // x9
    st_98e090_0 *v7;  // x10
    st_98e090_0 **v8;  // x9
    st_98e090_0 *v9;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = a0->field_0;
    if (!v3)
    {
        v4 = v2;
        v3 = sub_a6bffc(176, "ssl/quic/quic_txpim.c", 99);
        if (!v3)
            return (unsigned int)v3;
        v2 = v4;
        v5 = v4->field_8;
        v3->field_80 = v5;
        v3->field_88 = 0;
        v4->field_8 = v3;
        if (v5)
            v5->field_88 = v3;
        if (!v2->field_0)
            v2->field_0 = v3;
    }
    v3->field_60 = 0;
    v3->field_68 = 0;
    *(uint128_t *)&v3->field_40 = 0;
    *(uint128_t *)&v3->field_50 = 0;
    *(uint128_t *)&v3->field_20 = 0;
    *(uint128_t *)&v3->field_30 = 0;
    *(uint128_t *)&v3->field_0 = 0;
    *(uint128_t *)&v3->field_10 = 0;
    v3->field_98 = 0;
    v3->field_70 = 0;
    v3->field_79 = v3->field_79 & 192;
    if (v2->field_0 == v3)
        v2->field_0 = v3->field_88;
    v6 = v3;
    v7 = v6->field_80;
    v8 = &v6->field_80;
    if (v2->field_8 == v3)
        v2->field_8 = v7;
    v9 = v3->field_88;
    if (v7)
        v7->field_88 = v9;
    if (v9)
        v9->field_80 = v7;
    *v8 = 0;
    v8[1] = 0;
    v2->field_10 = v2->field_10 + 1;
    return (unsigned int)v3;
}
