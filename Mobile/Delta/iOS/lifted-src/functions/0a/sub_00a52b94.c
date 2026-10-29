/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52b94..0xa52fa0 (1036 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a52b94_0 {
    struct st_a52b94_0 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    struct st_a52b94_0 *field_20;
    struct st_a52b94_0 *field_28;
    char padding_30[48];
    struct st_a52b94_0 *field_60;
    struct st_a52b94_0 *field_68;
    char padding_70[8];
    struct st_a52b94_0 *field_78;
    char padding_80[8];
    struct st_a52b94_0 *field_88;
    char padding_90[32];
    struct st_a52b94_0 *field_b0;
    struct st_a52b94_0 *field_b8;
} st_a52b94_0;

extern long long g_a5280c;
extern long long g_a52aec;
extern long long g_a52b08;

st_a52b94_0 * sub_a52b94(st_a52b94_0 *a0, unsigned long long a1)
{
    long long v4;  // x0
    st_a52b94_0 *v5;  // x0
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    st_a52b94_0 *v16;  // x0
    st_a52b94_0 *v17;  // x22
    st_a52b94_0 *v18;  // x21
    st_a52b94_0 *v19;  // w20
    st_a52b94_0 *v20;  // w8
    unsigned long long v21;  // 4102
    unsigned long v22;  // x27
    st_a52b94_0 *v23;  // x27
    st_a52b94_0 *v6;  // x21
    long long v24;  // x0
    st_a52b94_0 *v25;  // w8
    unsigned long long v26;  // 4102
    long long v28;  // x1
    st_a52b94_0 *v30;  // x8
    st_a52b94_0 *v7;  // x0
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v0;  // [bp-0x70]
    st_a52b94_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/exchange.c", 217, "EVP_PKEY_derive_init_ex");
        sub_a36abc(6, 0xc0102, 0);
        return 0xfffffffe;
    }
    v0 = a1;
    v4 = sub_a5d5bc();
    *(unsigned int *)&a0->field_0 = 0x800;
    sub_a36c8c(v4);
    v5 = a0->field_18;
    if (!v5)
    {
LABEL_a52efc:
        sub_a36cd4(v5);
        v30 = (st_a52b94_0 *)a0->padding_70;
        if (v30 && v30->field_b0)
        {
            if (*(long long *)&v30->padding_90[24])
                (*(long long *)&v30->padding_90[24])();
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/exchange.c", 371, "EVP_PKEY_derive_init_ex");
        sub_a36abc(6, 150, 0);
        return 0xfffffffe;
    }
    v6 = (st_a52b94_0 *)a0->padding_80;
    if (!v6)
    {
        v6 = sub_a5ba1c();
        if (v6 && sub_a5a074(v6, a0->field_18) && !(v7 = sub_a55934(a0->field_18), v6->field_60 = v7, !v7))
        {
            *(st_a52b94_0 **)a0->padding_80 = v6;
            v5 = a0->field_18;
        }
        else
        {
            sub_a36e70();
            sub_a368c8(sub_a5a4c8(v6));
            v28 = 241;
            goto LABEL_a52e94;
        }
    }
    if (*(long long *)&v6->padding_30[40])
    {
        v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v13 = arm64g_calculate_condition(20, (v12 & 1 ? *(long long *)&v6->padding_30[40] : 0x40000000), (v12 & 1 ? v5 : 0), 0);
        if (v13 & 1)
            goto LABEL_a52f98;
LABEL_a52bf4:
        v16 = sub_a551d4();
        if (v16)
        {
            v17 = v16;
            v18 = 0;
            v19 = (st_a52b94_0 *)1;
            do
            {
                if (v18)
                {
                    do
                    {
                        /* unsupported instruction */;
                        v20 = (st_a52b94_0 *)/* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v21 = arm64g_calculate_condition(19, (unsigned long long)v20, 1, 0);
                    if (!(v21 & 1))
                    {
                        /* unsupported instruction */;
                    }
                    else if (1 < v20)
                    {
                        goto LABEL_a52c80;
                    }
                    sub_a6c2e4(*(long long *)&v18->field_1, "crypto/evp/exchange.c", 162);
                    sub_a78ccc(v18->field_10);
                    sub_a6c2e4(v18, "crypto/evp/exchange.c", 165);
                }
LABEL_a52c80:
                sub_a55830(v1);
                v1 = 0;
                if (v19 == 1)
                {
                    v5 = sub_a4e6ec(*(long long *)&a0->field_1, 11, v17, a0->field_8, &g_a5280c, &g_a52aec, &g_a52b08);
                    v18 = v5;
                    if (v5)
                    {
                        v22 = v18->field_10;
                    }
                    else
                    {
                        v23 = 0;
                        if (v19 > 1)
                            break;
                        else
                            goto LABEL_a52d48;
                    }
                }
                else
                {
                    v22 = sub_975ff4(a0->field_18);
                    v5 = sub_a4ea80(v22, 11, v17, a0->field_8, &g_a5280c, &g_a52aec, &g_a52b08);
                    if (!v5)
                        goto LABEL_a52efc;
                    v18 = v5;
                }
                v24 = sub_c4ba8(a0->field_18);
                v1 = sub_a55240(v22, v24, a0->field_8);
                if (v1)
                {
                    v5 = sub_a5a1f8(a0->padding_80, *(long long *)&a0->field_1, &v1, a0->field_8);
                    v23 = v5;
                    if (v1)
                        goto LABEL_a52d40;
                }
                else
                {
                    v23 = 0;
                }
                v5 = sub_a55830(v1);
LABEL_a52d40:
                if (1 < v19)
                    break;
LABEL_a52d48:
            } while ((v19 = (char *)&v19->field_0 + 1, !v23));
            if (v23)
            {
                sub_a36cd4();
                a0->field_20 = v18;
                sub_a79f54(v18->field_10);
                v18->field_20();
            }
            if (v18)
            {
                do
                {
                    /* unsupported instruction */;
                    v25 = (st_a52b94_0 *)/* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v26 = arm64g_calculate_condition(19, (unsigned long long)v25, 1, 0);
                if (!(v26 & 1))
                {
                    /* unsupported instruction */;
                }
                else if (1 < v25)
                {
                    goto LABEL_a52efc;
                }
                sub_a6c2e4(*(long long *)&v18->field_1, "crypto/evp/exchange.c", 162);
                sub_a78ccc(v18->field_10);
                v5 = sub_a6c2e4(v18, "crypto/evp/exchange.c", 165);
                goto LABEL_a52efc;
            }
        }
        else
        {
            sub_a368c8(sub_a36e70());
            v28 = 260;
        }
LABEL_a52e94:
        sub_a369bc("crypto/evp/exchange.c", v28, "EVP_PKEY_derive_init_ex");
        sub_a36abc(6, 134, 0);
    }
    else
    {
        v14 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v15 = arm64g_calculate_condition(16, (v14 & 1 ? 0 : 0x40000000), (v14 & 1 ? v5 : 0), 0);
        if (!(v15 & 1))
            goto LABEL_a52bf4;
LABEL_a52f98:
        sub_c675d8();
    }
    sub_a5d5bc(a0);
    *(unsigned int *)&a0->field_0 = 0;
    sub_a55830(v1);
    return 0;
}
