/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95834c..0x958664 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95834c_1 {
    unsigned long long field_0;
    struct st_95834c_0 *field_8;
    struct st_95834c_0 *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned long long field_20;
    struct st_95834c_0 *field_28;
    struct st_95834c_0 *field_30;
    long long field_38;
    struct st_95834c_0 *field_40;
    unsigned long long field_48;
    struct st_95834c_0 *field_50;
    unsigned long long field_58;
    uint128_t field_60;
    struct st_95834c_0 *field_70;
    struct st_95834c_0 *field_78;
    char field_80;
    char padding_81[15];
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[4];
    unsigned long long field_a0;
    struct st_95834c_0 *field_a8;
} st_95834c_1;

typedef struct st_95834c_0 {
    struct st_95834c_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_95834c_0 *field_8;
    struct st_95834c_0 *field_10;
    struct st_95834c_0 *field_18;
    char field_1c;
    char padding_1d[3];
    struct st_95834c_0 *field_20;
    struct st_95834c_0 *field_28;
    struct st_95834c_0 *field_30;
    unsigned long long field_38;
    struct st_95834c_0 *field_40;
    unsigned long long field_48;
    struct st_95834c_0 *field_50;
    unsigned long long field_58;
    uint128_t field_60;
    struct st_95834c_0 *field_70;
    struct st_95834c_0 *field_78;
    char field_80;
    char padding_81[15];
    unsigned long long field_90;
    unsigned int field_98;
    char padding_9c[4];
    unsigned long long field_a0;
    struct st_95834c_0 *field_a8;
    unsigned int field_b0;
} st_95834c_0;


st_95834c_0 * sub_95834c(st_95834c_1 *a0)
{
    st_95834c_0 *v2;  // x19
    st_95834c_0 *v3;  // x8
    st_95834c_0 *v12;  // x25
    st_95834c_0 *v13;  // x0
    st_95834c_0 *v14;  // x8
    st_95834c_0 *v15;  // x0
    st_95834c_0 *v16;  // x0
    st_95834c_0 *v17;  // x0
    st_95834c_0 *v18;  // x0
    st_95834c_0 *v19;  // x0
    st_95834c_0 *v4;  // x0
    st_95834c_0 *v5;  // x9
    st_95834c_0 *v6;  // x22
    st_95834c_0 *i;  // x23
    unsigned long v8;  // x25
    st_95834c_0 *v9;  // x24
    st_95834c_0 *v10;  // x26
    st_95834c_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(184, "ssl/ssl_cert.c", 97);
    if (!v2)
        return v2;
    v3 = a0->field_28;
    *(st_95834c_0 **)&v2->field_1c = v3;
    v4 = sub_a6bffc(v3 * 40, "ssl/ssl_cert.c", 107);
    v2->field_18 = v4;
    if (!v4)
    {
        sub_a6c2e4(v2, "ssl/ssl_cert.c", 109);
        return 0;
    }
    v5 = v2;
    v5->field_0 = (char *)v4 + a0->field_0 - a0->field_20;
    /* unsupported instruction */;
    *(unsigned int *)&v5->field_a0 = 1;
    if (!a0->field_8)
    {
LABEL_9583e4:
        v2->field_8 = a0->field_10;
        *(unsigned int *)&v2->field_10 = a0->field_18;
        if (*(long long *)&v2->field_1c)
        {
            v6 = 0;
            i = 0;
            do
            {
                v8 = a0->field_20;
                v9 = v2->field_18;
                if (*(long long *)(v8 + (char *)v6))
                {
                    if (sub_af3b1c(*(long long *)(v8 + (char *)v6)))
                    {
                        *(long long *)(v9 + v6) = *(long long *)(v8 + (char *)v6);
                    }
                    else
                    {
                        sub_958664(v2);
                        return 0;
                    }
                }
                v10 = v8 + (char *)v6;
                if (*(long long *)&v10->field_1)
                {
                    if (sub_a5bba8(*(long long *)&v10->field_1))
                    {
                        *(long long *)(v9 + v6 + 8) = *(long long *)&v10->field_1;
                    }
                    else
                    {
                        sub_958664(v2);
                        return 0;
                    }
                }
                if (v10->field_8)
                {
                    v11 = sub_af23d8(v10->field_8);
                    *(st_95834c_0 **)(v9 + v6 + 16) = v11;
                    if (!v11)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/ssl_cert.c", 148, "ssl_cert_dup");
                        sub_a36abc(20, 0x8000b, 0);
                        sub_958664(v2);
                        return 0;
                    }
                }
                v12 = v8 + (char *)v6;
                if (v12->field_10)
                {
                    v13 = sub_a6dac4(v12->field_10, v12->field_18, "ssl/ssl_cert.c", 154);
                    v14 = v9 + v6;
                    v14->field_10 = v13;
                    if (!v13)
                    {
                        sub_958664(v2);
                        return 0;
                    }
                    v14->field_18 = v12->field_18;
                }
                i = (char *)&i->field_0 + 1;
                v6 = &v6->field_1c;
            } while ((unsigned long long)*(long long *)&v2->field_1c > i);
        }
        if (a0->field_40)
        {
            v15 = sub_a6bf4c(a0->field_48 * 2, "ssl/ssl_cert.c", 173);
            v2->field_30 = v15;
            if (v15)
            {
                _memcpy();
                v2->field_38 = a0->field_48;
                if (!a0->field_50)
                    goto LABEL_958550;
                goto LABEL_958508;
            }
        }
        else
        {
            v2->field_30 = 0;
            if (a0->field_50)
            {
LABEL_958508:
                v16 = sub_a6bf4c(a0->field_58 * 2, "ssl/ssl_cert.c", 184);
                v2->field_40 = v16;
                if (v16)
                {
                    _memcpy();
                    v2->field_48 = a0->field_58;
                    v17 = a0->field_30;
                    if (v17)
                        goto LABEL_95855c;
                    goto LABEL_958580;
                }
            }
            else
            {
LABEL_958550:
                v2->field_40 = 0;
                v17 = a0->field_30;
                if (!v17)
                    goto LABEL_958580;
LABEL_95855c:
                v18 = sub_a6dac4(v17, a0->field_38, "ssl/ssl_cert.c", 194);
                v2->field_20 = v18;
                if (v18)
                {
                    v2->field_28 = a0->field_38;
LABEL_958580:
                    *(unsigned int *)((char *)&v2->field_10 + 4) = a0->field_1c;
                    *(uint128_t *)&v2->field_50 = a0->field_60;
                    if (a0->field_78)
                    {
                        if (sub_9ffbf8(a0->field_78))
                        {
                            *(struct st_95834c_0 **)((char *)&v2->field_60 + 8) = a0->field_78;
                            goto LABEL_9585a8;
                        }
                    }
                    else
                    {
LABEL_9585a8:
                        if (a0->field_70)
                        {
                            if (sub_9ffbf8(a0->field_70))
                            {
                                *(struct st_95834c_0 **)&v2->field_60 = a0->field_70;
                                goto LABEL_9585c0;
                            }
                        }
                        else
                        {
LABEL_9585c0:
                            *(unsigned long long *)&v2->field_80 = a0->field_90;
                            *(unsigned int *)&v2->padding_81[7] = a0->field_98;
                            v2->field_90 = a0->field_a0;
                            if (sub_9a0ba8(&v2->field_70, &a0->field_80))
                            {
                                if (a0->field_a8)
                                {
                                    v19 = sub_a6d9b4(a0->field_a8, "ssl/ssl_cert.c", 225);
                                    *(st_95834c_0 **)&v2->field_98 = v19;
                                    if (v19)
                                        return v2;
                                }
                                else
                                {
                                    return v2;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    else if (sub_a5bba8(a0->field_8))
    {
        *(struct st_95834c_0 **)&v2->field_1 = a0->field_8;
        goto LABEL_9583e4;
    }
    sub_958664(v2);
    return 0;
}
