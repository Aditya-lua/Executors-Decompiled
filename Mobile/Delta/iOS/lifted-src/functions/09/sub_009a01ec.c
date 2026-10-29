/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a01ec..0x9a0360 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a01ec_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char padding_40[836];
    char *field_384;
    struct st_9a01ec_4 *field_38c;
    char padding_394[524];
    struct st_9a01ec_4 *field_5a0;
    char padding_5a8[20];
    struct st_9a01ec_4 *field_5bc;
} st_9a01ec_3;

typedef struct st_9a01ec_0 {
    struct st_9a01ec_1 *field_0;
    char *field_8;
} st_9a01ec_0;

typedef struct st_9a01ec_1 {
    unsigned short field_0;
} st_9a01ec_1;

typedef struct st_9a01ec_2 {
    char padding_0[240];
    unsigned int field_f0;
    char padding_f4[1044];
    unsigned int field_508;
    char padding_50c[112];
    uint128_t field_57c;
    uint128_t field_58c;
    uint128_t field_59c;
    uint128_t field_5ac;
    char padding_5bc[836];
    char *field_900;
    char *field_908;
    char padding_910[524];
    char *field_b1c;
    char padding_b24[20];
    char *field_b38;
} st_9a01ec_2;

typedef struct st_9a01ec_4 {
    char padding_0[16];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    char padding_50[756];
    struct st_9a01ec_4 *field_344;
} st_9a01ec_4;


char * sub_9a01ec(st_9a01ec_2 *a0, st_9a01ec_0 *a1)
{
    char *v2;  // x8
    unsigned long v3;  // x9
    uint128_t v12;  // q1
    uint128_t v13;  // q3
    char *v4;  // w20
    char *v5;  // x0
    st_9a01ec_2 *v6;  // x0
    long long v7;  // x1
    long long v8;  // x2
    char *v9;  // x8
    st_9a01ec_3 *v10;  // x8
    uint128_t v11;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    if (v2 < 2 || (v3 = *(short *)a1->field_0, a1->field_0 = a1->field_0 + 1, a1->field_8 = v2 - 2, v2 != 2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 2120, "tls_parse_stoc_psk");
        v6 = a0;
        v7 = 50;
        v8 = 159;
    }
    else
    {
        v4 = (char *)((unsigned int)((v3 & 0xff00) >> 8) | (unsigned int)v3 * 0x100 & 0xff00ff00);
        if ((unsigned int)*(int *)&a0->padding_b24[8] > v4)
        {
            v5 = a0->field_900;
            if (v4)
            {
                if (v5)
                    goto LABEL_9a02e0;
                sub_a368c8();
                sub_a369bc("ssl/statem/extensions_clnt.c", 2143, "tls_parse_stoc_psk");
                v6 = a0;
                v7 = 80;
                v8 = 786691;
            }
            else
            {
                if (*(int *)&a0->padding_b24[8] == 2 || !v5)
                {
                    a0->field_508 = 1;
                    sub_9662a0();
                    a0->field_900 = 0;
                    return 1;
                }
LABEL_9a02e0:
                if ((a0->field_f0 | 4) != 7 || (v9 = *(long long *)&a0->padding_5bc[832], *(int *)&v9[836] || !*(int *)&v5[836]))
                {
                    v10 = (a0->padding_50c)[1];
                    v11 = *(int128_t *)&v5[16];
                    v12 = *(int128_t *)&v5[32];
                    v13 = *(int128_t *)&v5[64];
                    v10->field_20 = *(int128_t *)&v5[48];
                    v10->field_30 = v13;
                    v10->field_0 = v11;
                    v10->field_10 = v12;
                    v9 = *(long long *)&a0->padding_5bc[832];
                }
                sub_9662a0(v9);
                *(char **)&a0->padding_5bc[832] = a0->field_900;
                a0->field_900 = 0;
                a0->field_508 = 1;
                if (v4)
                {
                    *(unsigned int *)&a0->padding_910[516] = 0;
                    return 1;
                }
                return 1;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_clnt.c", 2125, "tls_parse_stoc_psk");
            v6 = a0;
            v7 = 47;
            v8 = 114;
        }
    }
    sub_9a58a4(v6, v7, v8, 0);
    return 0;
}
