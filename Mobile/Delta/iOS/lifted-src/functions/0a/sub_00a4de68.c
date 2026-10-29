/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4de68..0xa4e0ac (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4de68_3 {
    struct st_a4de68_0 *field_0;
    char padding_8[8];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
} st_a4de68_3;

typedef struct st_a4de68_4 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    char field_78;
    char padding_79[7];
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
} st_a4de68_4;

typedef struct st_a4de68_0 {
    char padding_0[17];
    char field_11;
    char padding_12[38];
    int field_38;
    char padding_3c[20];
    struct st_a4de68_1 *field_50;
    char padding_58[136];
    struct st_a4de68_2 *field_e0;
} st_a4de68_0;

typedef struct st_a4de68_1 {
    unsigned long long field_0;
} st_a4de68_1;

typedef struct st_a4de68_2 {
    char field_0;
} st_a4de68_2;


int sub_a4de68(st_a4de68_4 *a0, st_a4de68_3 *a1)
{
    st_a4de68_0 *v2;  // x8
    uint128_t v3;  // q1
    long long v12;  // x1
    uint128_t v13;  // q1
    st_a4de68_0 *v14;  // q3
    uint128_t v15;  // q2
    uint128_t v16;  // q1
    uint128_t v17;  // q3
    uint128_t v18;  // q2
    uint128_t v19;  // q1
    uint128_t v20;  // q3
    uint128_t v21;  // q2
    uint128_t v4;  // q0
    st_a4de68_0 *v22;  // x21
    unsigned long v23;  // x0
    char v24;  // x0
    uint128_t v5;  // q2
    st_a4de68_0 *v6;  // q3
    uint128_t v7;  // q4
    uint128_t v8;  // q6
    uint128_t v9;  // q3
    uint128_t v10;  // q4
    uint128_t v11;  // q6
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 || (v2 = a1->field_0, !v2))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1783, "EVP_CIPHER_CTX_copy");
        v12 = 111;
    }
    else if (*(long long *)&v2->padding_58[32])
    {
        if (v2->field_e0)
        {
            sub_a4bab0(a0);
            v3 = a1->field_80;
            v4 = a1->field_90;
            v5 = a1->field_a0;
            a0->field_a0 = a1->field_b0;
            v6 = (st_a4de68_0 *)*(int128_t *)&a1->field_0;
            v7 = a1->field_10;
            v8 = a1->field_30;
            a0->field_20 = a1->field_20;
            a0->field_30 = v8;
            a0->field_0 = (uint128_t)v6;
            a0->field_10 = v7;
            v9 = a1->field_40;
            v10 = a1->field_50;
            v11 = a1->field_70;
            a0->field_60 = a1->field_60;
            a0->field_70 = v11;
            a0->field_40 = v9;
            a0->field_50 = v10;
            a0->field_80 = v4;
            a0->field_90 = v5;
            *(uint128_t *)&a0->field_78 = v3;
            *(unsigned long long *)&a0->field_a0 = 0;
            if (*(long long *)((char *)&a1->field_b0 + 8) && !*(int *)(*(long long *)((char *)&a1->field_b0 + 8) + 24))
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
            }
            a1->field_0->field_e0();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 0x6ff, "EVP_CIPHER_CTX_copy");
            v12 = 190;
        }
    }
    else
    {
        if (!a1->padding_8 || sub_a32d54(a1->padding_8))
        {
            sub_a4bab0(a0);
            v13 = a1->field_30;
            v14 = (st_a4de68_0 *)*(int128_t *)&a1->field_0;
            v15 = a1->field_10;
            a0->field_20 = a1->field_20;
            a0->field_30 = v13;
            a0->field_0 = (uint128_t)v14;
            a0->field_10 = v15;
            v16 = a1->field_70;
            v17 = a1->field_40;
            v18 = a1->field_50;
            a0->field_60 = a1->field_60;
            a0->field_70 = v16;
            a0->field_40 = v17;
            a0->field_50 = v18;
            v19 = a1->field_b0;
            v20 = a1->field_80;
            v21 = a1->field_90;
            a0->field_90 = a1->field_a0;
            a0->field_a0 = v19;
            *(uint128_t *)&a0->field_78 = v20;
            a0->field_80 = v21;
            v22 = a1->field_0;
            if (*(long long *)((char *)&a1->field_70 + 8))
            {
                v23 = v22->field_38;
                if ((unsigned int)v23)
                {
                    v24 = sub_a6bf4c(v23, "crypto/evp/evp_enc.c", 1828);
                    *(unsigned long long *)((char *)&a0->field_70 + 8) = v24;
                    if (!v24)
                    {
                        *(unsigned long long *)&a0->field_0 = 0;
                        return *(unsigned int *)&v24;
                    }
                    v22 = a1->field_0;
                    _memcpy();
                }
            }
            if (!(v22->field_11 >> 2 & 1))
                return 1;
            v22->field_50();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 1819, "EVP_CIPHER_CTX_copy");
            v12 = 524326;
        }
    }
    sub_a36abc(6, v12, 0);
    return 0;
}
