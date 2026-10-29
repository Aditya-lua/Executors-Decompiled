/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa53c94..0xa54180 (1260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a53c94_0 {
    struct st_a53c94_0 *field_0;
    long long field_8;
    long long field_10;
    struct st_a53c94_0 *field_18;
    long long field_20;
    struct st_a53c94_0 *field_28;
    char padding_30[48];
    struct st_a53c94_0 *field_60;
    char padding_68[32];
    struct st_a53c94_0 *field_88;
} st_a53c94_0;

extern long long g_a543a0;
extern long long g_a546b0;
extern long long g_a546cc;

st_a53c94_0 * sub_a53c94(st_a53c94_0 *a0, st_a53c94_0 *a1, unsigned long long a2, st_a53c94_0 *a3)
{
    st_a53c94_0 *v4;  // x8
    unsigned long v5;  // cc_op
    unsigned long long v14;  // 4102
    st_a53c94_0 *v15;  // x0
    st_a53c94_0 *v16;  // x25
    st_a53c94_0 *v17;  // x24
    unsigned int v18;  // w27
    unsigned int v19;  // w27
    unsigned int v20;  // w8
    unsigned long long v21;  // 4102
    st_a53c94_0 *v22;  // x20
    st_a53c94_0 *v23;  // x20
    unsigned long v6;  // cc_dep1
    st_a53c94_0 *v24;  // x0
    long long v25;  // x0
    unsigned int v27;  // w8
    unsigned long long v28;  // 4102
    long long v29;  // x1
    long long v30;  // x1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    long long v9;  // x1
    unsigned long v10;  // x0
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4110
    unsigned long long v0;  // [bp-0x70]
    st_a53c94_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a0 || !a0->field_18)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/kem.c", 42, "evp_kem_init");
        v9 = 134;
        goto LABEL_a53f04;
    }
    v0 = a2;
    sub_a5d5bc(a0);
    *(unsigned int *)&a0->field_0 = (unsigned int)a1;
    v4 = a0->field_88;
    if (!v4)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/kem.c", 50, "evp_kem_init");
        v30 = 154;
    }
    if (a3 && (v5 = 3, v6 = (int)a3->field_0, v7 = (int)v4->field_0, v8 = 0, (int)a3->field_0 != (int)v4->field_0))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/kem.c", 54, "evp_kem_init");
        v9 = 101;
LABEL_a53f04:
        sub_a36abc(6, v9, 0);
        return 0;
    }
    v10 = a0->field_20;
    if (v4->field_60)
    {
        v11 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v12 = arm64g_calculate_condition(20, (v11 & 1 ? v4->field_60 : 0x40000000), (v11 & 1 ? v10 : 0), 0);
        if (v12 & 1)
            goto LABEL_a54178;
    }
    else
    {
        v13 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
        v14 = arm64g_calculate_condition(16, (v13 & 1 ? 0 : 0x40000000), (v13 & 1 ? v10 : 0), 0);
        if (v14 & 1)
        {
LABEL_a54178:
            sub_c67618(v10);
            v23 = 0;
LABEL_a53f94:
            sub_a5d5bc(a0);
            *(unsigned int *)&a0->field_0 = 0;
            sub_a55830(v1);
            return v23;
        }
    }
    v15 = sub_a551d4(v10, 14);
    if (v15)
    {
        v16 = v15;
        v17 = 0;
        v18 = 1;
        while (1)
        {
            v19 = v18;
            if (v17)
            {
                do
                {
                    /* unsupported instruction */;
                    v20 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v21 = arm64g_calculate_condition(19, v20, 1, 0);
                if (!(v21 & 1))
                {
                    /* unsupported instruction */;
                    goto LABEL_a53d60;
                }
                else if (1 >= (int)v20)
                {
LABEL_a53d60:
                    sub_a6c2e4(v17->field_8, "crypto/evp/kem.c", 443);
                    sub_a78ccc(v17->field_18);
                    sub_a6c2e4(v17, "crypto/evp/kem.c", 446);
                }
            }
            sub_a55830(v1);
            v1 = 0;
            if (v19 == 1)
            {
                v17 = sub_a4e6ec(a0->field_8, 14, v16, a0->field_10, &g_a543a0, &g_a546b0, &g_a546cc);
                if (v17)
                {
                    v22 = v17->field_18;
                    goto LABEL_a53e10;
                }
                v23 = 0;
                if (!1)
                    goto LABEL_a53ea0;
LABEL_a53e84:
                v18 = v19 + 1;
                if (v19 >= 2)
                    goto LABEL_a53ea0;
            }
            else
            {
                v22 = sub_975ff4(a0->field_20);
                v24 = sub_a4ea80(v22, 14, v16, a0->field_10, &g_a543a0, &g_a546b0, &g_a546cc);
                if (v24)
                {
                    v17 = v24;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/kem.c", 117, "evp_kem_init");
                    sub_a36abc(6, 150, 0);
                    v23 = 0xfffffffe;
                    goto LABEL_a53f94;
                }
LABEL_a53e10:
                v25 = sub_c4ba8(a0->field_20);
                v1 = sub_a55240(v22, v25, a0->field_10);
                if (v1)
                {
                    v23 = sub_a5a1f8(a0->field_88, a0->field_8, &v1, a0->field_10);
                    if (a3 && v23 && !sub_a5a1f8(a3, a0->field_8, &v1, a0->field_10))
                        break;
                    if (v1)
                        goto LABEL_a53e80;
                }
                else
                {
                    v23 = 0;
                }
                sub_a55830(v1);
LABEL_a53e80:
                if (!v23)
                    goto LABEL_a53e84;
LABEL_a53ea0:
                if (v23)
                {
                    a0->field_28 = v17;
                    sub_a79f54(v17->field_18);
                    v17->field_28();
                }
                sub_a368c8(sub_a5431c(v17));
                sub_a369bc("crypto/evp/kem.c", 157, "evp_kem_init");
                sub_a36abc(6, 134, 0);
                goto LABEL_a53f94;
            }
        }
        do
        {
            /* unsupported instruction */;
            v27 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v28 = arm64g_calculate_condition(19, v27, 1, 0);
        if (!(v28 & 1))
        {
            /* unsupported instruction */;
            goto LABEL_a540b8;
        }
        else
        {
            if (1 < (int)v27)
                goto LABEL_a540e8;
LABEL_a540b8:
            sub_a6c2e4(v17->field_8, "crypto/evp/kem.c", 443);
            sub_a78ccc(v17->field_18);
            sub_a6c2e4(v17, "crypto/evp/kem.c", 446);
LABEL_a540e8:
            sub_a368c8();
            v29 = 146;
        }
    }
    else
    {
        sub_a368c8();
        v29 = 0x44;
    }
}
