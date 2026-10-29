/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a058..0x98a138 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98a058_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char padding_80[16];
    struct st_98a058_0 *field_90;
} st_98a058_0;

typedef struct st_98a058_1 {
    unsigned long long field_0[2];
    struct st_98a058_0 *field_8;
    uint128_t field_10;
    struct st_98a058_0 *field_18;
    uint128_t field_20;
    struct st_98a058_0 *field_28;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    struct st_98a058_0 *field_7c;
} st_98a058_1;


double sub_98a058(st_98a058_1 *a0)
{
    st_98a058_0 *v2;  // x0
    st_98a058_1 *v3;  // x9
    st_98a058_0 *v4;  // x8
    uint128_t v5;  // q1
    uint128_t v6;  // q1
    uint128_t v7;  // q1
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0[1] && (&a0->field_8)[1] && *(long long *)((char *)&a0->field_10 + 8))
    {
        v2 = sub_a6bffc(176, "ssl/quic/quic_tls.c", 644);
        if (v2)
        {
            v3 = a0;
            if (!*(int *)((char *)&a0->field_40 + 12) || !(v4 = sub_a3708c(), v2 = v2, v3 = a0, v2->field_90 = v4, !v4))
            {
                v5 = *(int128_t *)&v3->field_28;
                v2->field_40 = v3->field_20;
                v2->field_50 = v5;
                v6 = v3->field_40;
                v2->field_60 = v3->field_30;
                v2->field_70 = v6;
                v7 = *(int128_t *)&v3->field_8;
                *(unsigned long long [2])&v2->field_0 = v3->field_0;
                v2->field_10 = v7;
                v8 = v3->field_10;
                v9 = *(int128_t *)&v3->field_18;
                v2->field_20 = v8;
                v2->field_30 = v9;
                return (unsigned long long)v8;
            }
            sub_a6c2e4(v2, "ssl/quic/quic_tls.c", 649);
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_tls.c", 640, "ossl_quic_tls_new");
        sub_a36abc(20, 0xc0102, 0);
    }
    return (unsigned long long)v8;
}
