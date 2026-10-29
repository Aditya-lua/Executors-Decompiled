/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb50a70..0xb50be4 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b50a70_2 {
    struct st_b50a70_0 *field_0;
    struct st_b50a70_0 *field_8;
    char padding_10[8];
    struct st_b50a70_0 *field_18;
    struct st_b50a70_0 *field_20;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    struct st_b50a70_0 *field_68;
    char padding_70[8];
    uint128_t field_78;
    uint128_t field_88;
    uint128_t field_98;
    unsigned long long field_a8[2];
    struct st_b50a70_0 *field_b0;
    unsigned long long field_b8;
    struct st_b50a70_0 *field_c0;
} st_b50a70_2;

typedef struct st_b50a70_1 {
    unsigned long long field_0[2];
    struct st_b50a70_0 *field_8;
    struct st_b50a70_0 *field_10;
    char padding_18[8];
    struct st_b50a70_0 *field_20;
    struct st_b50a70_0 *field_28;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    struct st_b50a70_0 *field_70;
    char padding_78[8];
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    struct st_b50a70_0 *field_b8;
    long long field_c0;
} st_b50a70_1;

typedef struct st_b50a70_0 {
    unsigned long long field_0[2];
    struct st_b50a70_0 *field_8;
    struct st_b50a70_0 *field_10;
    char padding_18[8];
    struct st_b50a70_0 *field_20;
    struct st_b50a70_0 *field_28;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    struct st_b50a70_0 *field_70;
    char padding_78[8];
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    unsigned long long field_b0[2];
    struct st_b50a70_0 *field_b8;
    unsigned long long field_c0;
    struct st_b50a70_0 *field_c8;
} st_b50a70_0;


st_b50a70_0 * sub_b50a70(st_b50a70_1 *a0)
{
    st_b50a70_0 *v2;  // x19
    uint128_t v3;  // q1
    st_b50a70_0 *v12;  // x8
    st_b50a70_0 *v13;  // x8
    st_b50a70_0 *v14;  // x0
    st_b50a70_0 *v15;  // x0
    st_b50a70_0 *v16;  // x0
    uint128_t v4;  // q1
    uint128_t v5;  // q0
    uint128_t v6;  // q1
    uint128_t v7;  // q0
    uint128_t v8;  // q0
    st_b50a70_0 *v9;  // x21
    st_b50a70_2 *v10;  // x21
    st_b50a70_0 *v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(208, "providers/implementations/signature/rsa_sig.c", 1360);
    if (!v2)
        return v2;
    v3 = a0->field_a0;
    v2->field_90 = a0->field_90;
    v2->field_a0 = v3;
    v2->field_b0[0] = a0->field_b0;
    v4 = a0->field_60;
    v2->field_50 = a0->field_50;
    v2->field_60 = v4;
    v5 = a0->field_80;
    *(int128_t *)&v2->field_70 = *(int128_t *)&a0->field_70;
    v2->field_80 = v5;
    v6 = *(int128_t *)&a0->field_28;
    *(int128_t *)v2->padding_18 = *(int128_t *)a0->padding_18;
    *(uint128_t *)&v2->field_28 = v6;
    v7 = a0->field_40;
    v2->field_30 = a0->field_30;
    v2->field_40 = v7;
    v8 = *(int128_t *)&a0->field_8;
    v2->field_0 = a0->field_0;
    *(uint128_t *)&v2->field_8 = v8;
    *(unsigned long long *)&v2->field_60 = 0;
    v9 = v2;
    v9->field_0[1] = 0;
    v10 = &v9->field_0[1];
    v10->field_b0 = 0;
    v10->field_a8[0] = 0;
    v9->field_8 = 0;
    *(unsigned long long *)v9->padding_18 = 0;
    v10->field_20 = 0;
    if (!a0->field_8)
    {
        v11 = 0;
        goto LABEL_b50b1c;
    }
    if (sub_ab146c(a0->field_8))
    {
        v11 = a0->field_8;
LABEL_b50b1c:
        v9->field_8 = v11;
        if (!a0->padding_18)
        {
            v12 = 0;
            goto LABEL_b50b3c;
        }
        if (sub_a40a98(a0->padding_18))
        {
            v12 = (st_b50a70_0 *)a0->padding_18;
LABEL_b50b3c:
            *(st_b50a70_0 **)v9->padding_18 = v12;
            if (!(long long)a0->field_60)
            {
                v13 = 0;
                goto LABEL_b50b5c;
            }
            else if (sub_a40a98(a0->field_60))
            {
                v13 = (long long)a0->field_60;
LABEL_b50b5c:
                *(st_b50a70_0 **)&v9->field_60 = v13;
                if ((!a0->field_20 || (v14 = sub_a3f728(), v9->field_20 = v14, v14 && sub_a40520())) && (!a0->field_0[1] || (v15 = sub_a6d9b4(a0->field_0[1], "providers/implementations/signature/rsa_sig.c", 1393), v10->field_0 = v15, v15)))
                {
                    if (*(long long *)((char *)&a0->field_a0 + 8))
                    {
                        v16 = sub_a6dac4(*(long long *)((char *)&a0->field_a0 + 8), a0->field_b0, "providers/implementations/signature/rsa_sig.c", 1399);
                        *(st_b50a70_0 **)((char *)&v9->field_a0 + 8) = v16;
                        if (v16)
                            return v9;
                    }
                    else
                    {
                        return v9;
                    }
                }
            }
        }
    }
    sub_b509b4(v9);
    return 0;
}
