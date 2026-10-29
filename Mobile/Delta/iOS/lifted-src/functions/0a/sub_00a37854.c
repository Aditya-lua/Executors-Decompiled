/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa37854..0xa37d3c (1256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a37854_0 {
    struct st_a37854_0 *field_0;
    char field_1;
    char padding_2[6];
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    struct st_a37854_0 *field_20;
    struct st_a37854_0 *field_28;
    char padding_30[48];
    struct st_a37854_0 *field_60;
    char padding_68[16];
    struct st_a37854_0 *field_78;
    char padding_80[8];
    struct st_a37854_0 *field_88;
    struct st_a37854_0 *field_90;
    struct st_a37854_0 *field_98;
    struct st_a37854_0 *field_a0;
} st_a37854_0;

extern long long g_a382c0;
extern long long g_a385f0;
extern long long g_a3860c;

st_a37854_0 * sub_a37854(st_a37854_0 *a0, st_a37854_0 *a1, unsigned long long a2)
{
    long long v4;  // x0
    st_a37854_0 *v5;  // x0
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    st_a37854_0 *v14;  // x0
    st_a37854_0 *v15;  // x22
    st_a37854_0 *v16;  // x21
    st_a37854_0 *v17;  // w20
    st_a37854_0 *v18;  // w8
    unsigned long long v19;  // 4102
    unsigned long v20;  // x27
    st_a37854_0 *v21;  // x27
    long long v22;  // x0
    st_a37854_0 *v23;  // w8
    unsigned long long v24;  // 4102
    long long v26;  // x1
    st_a37854_0 *v29;  // x8
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v0;  // [bp-0x70]
    st_a37854_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/asymcipher.c", 43, "evp_pkey_asym_cipher_init");
        sub_a36abc(6, 150, 0);
        return 0xfffffffe;
    }
    v0 = a2;
    v4 = sub_a5d5bc();
    *(unsigned int *)&a0->field_0 = (unsigned int)a1;
    sub_a36c8c(v4);
    v5 = a0->field_18;
    if (!v5)
    {
LABEL_a37c04:
        sub_a36cd4(v5);
        sub_a55830(v1);
        v1 = 0;
        v29 = *(long long *)&a0->padding_68[8];
        if (v29 && v29->field_90)
        {
            if ((int)a0->field_0 != 0x400)
            {
                if ((int)a0->field_0 != 0x200)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/asymcipher.c", 219, "evp_pkey_asym_cipher_init");
                    sub_a36abc(6, 134, 0);
                    sub_a5d5bc(a0);
                    *(unsigned int *)&a0->field_0 = 0;
                    sub_a55830(v1);
                    return 0xffffffff;
                }
                else if (v29->field_88)
                {
                    v29->field_88();
                }
                else
                {
                    return 1;
                }
            }
            else
            {
                if (v29->field_98)
                    v29->field_98();
                return 1;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/evp/asymcipher.c", 0xcc, "evp_pkey_asym_cipher_init");
        sub_a36abc(6, 150, 0);
        return 0xfffffffe;
    }
    if (a0->padding_80)
    {
        if (*(long long *)&a0->padding_80[96])
        {
            v6 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
            v7 = arm64g_calculate_condition(20, (v6 & 1 ? *(long long *)&a0->padding_80[96] : 0x40000000), (v6 & 1 ? v5 : 0), 0);
            if (v7 & 1)
                goto LABEL_a37d34;
LABEL_a378b8:
            v14 = sub_a551d4();
            if (v14)
            {
                v15 = v14;
                v16 = 0;
                v17 = (st_a37854_0 *)1;
                do
                {
                    if (v16)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            v18 = (st_a37854_0 *)/* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v19 = arm64g_calculate_condition(19, (unsigned long long)v18, 1, 0);
                        if (!(v19 & 1))
                        {
                            /* unsupported instruction */;
                        }
                        else if (1 < v18)
                        {
                            goto LABEL_a37944;
                        }
                        sub_a6c2e4(*(long long *)&v16->field_1, "crypto/evp/asymcipher.c", 494);
                        sub_a78ccc(v16->field_10);
                        sub_a6c2e4(v16, "crypto/evp/asymcipher.c", 497);
                    }
LABEL_a37944:
                    sub_a55830(v1);
                    v1 = 0;
                    if (v17 == 1)
                    {
                        v5 = sub_a4e6ec(*(long long *)&a0->field_1, 13, v15, a0->field_8, &g_a382c0, &g_a385f0, &g_a3860c);
                        v16 = v5;
                        if (v5)
                        {
                            v20 = v16->field_10;
                        }
                        else
                        {
                            v21 = 0;
                            if (v17 > 1)
                                break;
                            else
                                goto LABEL_a37a0c;
                        }
                    }
                    else
                    {
                        v20 = sub_975ff4(a0->field_18);
                        v5 = sub_a4ea80(v20, 13, v15, a0->field_8, &g_a382c0, &g_a385f0, &g_a3860c);
                        if (!v5)
                            goto LABEL_a37c04;
                        v16 = v5;
                    }
                    v22 = sub_c4ba8(a0->field_18);
                    v1 = sub_a55240(v20, v22, a0->field_8);
                    if (v1)
                    {
                        v5 = sub_a5a1f8(a0->padding_80, *(long long *)&a0->field_1, &v1, a0->field_8);
                        v21 = v5;
                        if (v1)
                            goto LABEL_a37a04;
                    }
                    else
                    {
                        v21 = 0;
                    }
                    v5 = sub_a55830(v1);
LABEL_a37a04:
                    if (1 < v17)
                        break;
LABEL_a37a0c:
                } while ((v17 = (char *)&v17->field_0 + 1, !v21));
                if (v21)
                {
                    sub_a36cd4();
                    a0->field_20 = v16;
                    sub_a79f54(v16->field_10);
                    v16->field_20();
                }
                if (v16)
                {
                    do
                    {
                        /* unsupported instruction */;
                        v23 = (st_a37854_0 *)/* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v24 = arm64g_calculate_condition(19, (unsigned long long)v23, 1, 0);
                    if (!(v24 & 1))
                    {
                        /* unsupported instruction */;
                    }
                    else if (1 < v23)
                    {
                        goto LABEL_a37c04;
                    }
                    sub_a6c2e4(*(long long *)&v16->field_1, "crypto/evp/asymcipher.c", 494);
                    sub_a78ccc(v16->field_10);
                    v5 = sub_a6c2e4(v16, "crypto/evp/asymcipher.c", 497);
                    goto LABEL_a37c04;
                }
            }
            else
            {
                sub_a368c8(sub_a36e70());
                sub_a369bc("crypto/evp/asymcipher.c", 75, "evp_pkey_asym_cipher_init");
                v26 = 134;
            }
LABEL_a37ba4:
            sub_a36abc(6, v26, 0);
        }
        else
        {
            v10 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
            v11 = arm64g_calculate_condition(16, (v10 & 1 ? 0 : 0x40000000), (v10 & 1 ? v5 : 0), 0);
            if (!(v11 & 1))
                goto LABEL_a378b8;
LABEL_a37d34:
            sub_c66ee8();
        }
        sub_a5d5bc(a0);
        *(unsigned int *)&a0->field_0 = 0;
        sub_a55830(v1);
        return 0;
    }
    sub_a368c8(sub_a36e70());
    sub_a369bc("crypto/evp/asymcipher.c", 57, "evp_pkey_asym_cipher_init");
    v26 = 154;
    goto LABEL_a37ba4;
}
