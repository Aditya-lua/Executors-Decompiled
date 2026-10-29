/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa78980..0xa78b18 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a78980_1 {
    struct st_a78980_0 *field_0;
    char padding_8[8];
    uint128_t field_10;
    unsigned long long field_20;
} st_a78980_1;

typedef struct st_a78980_0 {
    uint128_t field_0;
    char field_1;
    char padding_2[8];
    char field_a;
    char padding_b[5];
    uint128_t field_10;
    unsigned long long field_20;
    char padding_28[8];
    struct st_a78980_0 *field_30;
    struct st_a78980_0 *field_38;
    struct st_a78980_0 *field_40;
} st_a78980_0;


st_a78980_0 * sub_a78980(unsigned long a0, st_a78980_1 *a1)
{
    st_a78980_0 *v2;  // x0
    st_a78980_0 *v3;  // x20
    long long v12;  // x1
    st_a78980_0 *v4;  // x0
    st_a78980_0 *v5;  // x8
    st_a78980_0 *v6;  // x21
    st_a78980_0 *v7;  // x0
    st_a78980_0 *v8;  // x8
    st_a78980_0 *v9;  // q0
    uint128_t v10;  // q1
    st_a78980_0 *v11;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (v2)
    {
        if (a1->field_0)
        {
            v3 = v2;
            v4 = sub_a7c198(v2->field_10);
            if (!(unsigned int)v4)
                return v4;
            v5 = v3->field_30;
            if (!v5)
            {
                v7 = sub_a6bffc(400, "crypto/provider_core.c", 375);
                v3->field_20 = v7;
                if (v7)
                {
                    v3->field_30 = 10;
LABEL_a78ac8:
                    v8 = (char *)v7 + 40 * v3->padding_28;
                    v9 = (st_a78980_0 *)*(int128_t *)&a1->field_0;
                    v10 = a1->field_10;
                    *(unsigned long long *)&v8->field_10 = a1->field_20;
                    v8->field_0 = (uint128_t)v9;
                    *(uint128_t *)&v8->field_1 = v10;
                    v3->padding_28 = v3->padding_28 + 1;
                    v11 = 1;
                }
                else
                {
LABEL_a78af8:
                    v11 = 0;
                }
            }
            else if (v3->padding_28 == v5)
            {
                v6 = (char *)&v5->field_0 + 10;
                v7 = sub_a6c1b4(v3->field_20, v6 * 40, "crypto/provider_core.c", 384);
                if (!v7)
                    goto LABEL_a78af8;
                v3->field_20 = v7;
                v3->field_30 = v6;
                goto LABEL_a78ac8;
            }
            else
            {
                v7 = v3->field_20;
                goto LABEL_a78ac8;
            }
            sub_a7c1b4(v3->field_10);
            return v11;
        }
LABEL_a78a60:
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 362, "ossl_provider_info_add_to_store");
        v12 = 786690;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        if (!a1->field_0)
            goto LABEL_a78a60;
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 367, "ossl_provider_info_add_to_store");
        v12 = 786691;
    }
    sub_a36abc(15, v12, 0);
    return 0;
}
