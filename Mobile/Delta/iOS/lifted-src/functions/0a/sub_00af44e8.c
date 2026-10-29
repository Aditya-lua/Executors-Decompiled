/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf44e8..0xaf4814 (812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af44e8_2 {
    char padding_0[32];
    struct st_af44e8_1 *field_20;
    char padding_28[16];
    struct st_af44e8_3 *field_38;
    char padding_40[88];
    char field_98;
    char padding_99[23];
    unsigned int field_b0;
    char padding_b4[4];
    unsigned long long field_b8;
    char padding_c0[48];
    struct st_af44e8_0 *field_f0;
} st_af44e8_2;

typedef struct st_af44e8_1 {
    char padding_0[24];
    long long field_18;
    char padding_20[12];
    unsigned int field_2c;
} st_af44e8_1;

typedef struct st_af44e8_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18[2];
    char field_20;
    char padding_21[7];
    char field_28;
    char padding_29[3];
    unsigned long long field_2c;
    char padding_34[4];
    char field_38;
} st_af44e8_4;

typedef struct st_af44e8_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    uint128_t field_18;
    long long field_20;
    char field_28;
    char padding_29[3];
    unsigned long long field_2c;
    char padding_34[4];
    char field_38;
} st_af44e8_0;

typedef struct st_af44e8_3 {
    unsigned long long field_0;
} st_af44e8_3;

typedef struct st_af44e8_5 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    char padding_28[48];
    struct st_af44e8_4 *field_58;
} st_af44e8_5;


unsigned long long sub_af44e8(st_af44e8_2 *a0)
{
    st_af44e8_5 *v2;  // x20
    long long v3;  // x1
    unsigned long long v12;  // w0
    unsigned long long v13;  // x0
    unsigned long long v15;  // w0
    unsigned long long v16;  // w8
    unsigned long long v4;  // x0
    unsigned int v5;  // w8
    unsigned int v6;  // w21
    unsigned int v7;  // w0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x21
    st_af44e8_0 *v10;  // x23
    unsigned long long v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0->padding_0[8])
    {
        v2 = &a0->field_98;
        if (*(long long *)&a0->field_98)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_vfy.c", 340, "x509_verify_x509");
            v3 = 786689;
LABEL_af4564:
            sub_a36abc(11, v3, 0);
            v16 = 69;
        }
        else if (sub_af1bbc(v2))
        {
            *(unsigned int *)&a0->padding_40[84] = 1;
            v4 = sub_af1e94(*(long long *)&a0->padding_0[8]);
            v5 = a0->field_20->field_2c;
            if ((int)v5 >= 1)
            {
                if (v4)
                {
                    if (v5 < 5)
                        v6 = v5;
                    else
                        v6 = 5;
                    v7 = sub_a59d18();
                    if (*(int *)(4 * v6 + 14671044) <= (int)v7)
                        goto LABEL_af4620;
                }
                v8 = *(long long *)&a0->padding_0[8];
                *(unsigned int *)&a0->padding_99[19] = 0;
                if (!v8)
                    v8 = sub_ad69f8(*(long long *)&v2->padding_0[0], 0);
                a0->field_b8 = v8;
                a0->field_b0 = 66;
                a0->field_38();
            }
            else
            {
LABEL_af4620:
                if (a0->field_f0 && (int)sub_ad69e4(a0->field_f0->field_8) >= 1)
                {
                    v9 = *(long long *)&a0->padding_0[8];
                    v10 = a0->field_f0;
                    sub_afc404(v10->field_18);
                    *(uint128_t *)(v10->padding_10)[1] = __double_as_longlong(0) * 0x10000000000000000;
                    *(unsigned long long *)((char *)&v10->field_18 + 12) = 0xffffffffffffffff;
                    v11 = sub_af71a4(a0, *(long long *)&a0->padding_0[8], 0);
                    if (!(unsigned int)v11 && (*((char *)&v10->field_18 + 8) & 5 || *(int *)((char *)&v10->field_18 + 12) >= 0))
                        goto LABEL_af4734;
                    if (!sub_af4e7c(0, *(long long *)&v2->padding_0[0]))
                    {
LABEL_af47fc:
                        v13 = 0xffffffff;
                    }
                    else if ((int)v11 >= 1)
                    {
                        v12 = (unsigned int)sub_af1ff4(0, v9, 0, a0->field_20->field_18);
                        if (v12)
                        {
                            *(unsigned int *)&a0->padding_99[19] = 0;
                            if (!v9)
                                v9 = sub_ad69f8(*(long long *)&v2->padding_0[0], 0);
                            a0->field_b8 = v9;
                            a0->field_b0 = v12;
                            a0->field_38();
                        }
                        else if (v10->field_28 & 1 || !(v13 = sub_af74ac(a0), !(unsigned int)v13))
                        {
                            *(unsigned int *)&a0->padding_99[19] = 0;
                            a0->field_b8 = v9;
                            a0->field_38();
                        }
                    }
                    else
                    {
                        if (!(v11 >> 31 & 1))
                        {
                            v15 = (unsigned int)sub_af1ff4(0, v9, 0, a0->field_20->field_18);
                            if (v15)
                            {
                                *(unsigned int *)&a0->padding_99[19] = 0;
                                if (!v9)
                                    v9 = sub_ad69f8(*(long long *)&v2->padding_0[0], 0);
                                a0->field_b8 = v9;
                                a0->field_b0 = v15;
                                a0->field_38();
                            }
                            else
                            {
                                *(unsigned int *)&a0->padding_99[19] = 0;
                                if (!v9)
                                    v9 = sub_ad69f8(*(long long *)&v2->padding_0[0], 0);
                                a0->field_b8 = v9;
                                a0->field_b0 = 65;
                                a0->field_38();
                            }
                        }
                        else
                        {
                            a0->field_b8 = v9;
                            *(double *)&a0->padding_99[19] = 3.60739284464e-313;
                            goto LABEL_af47fc;
                        }
                        goto LABEL_af47fc;
                    }
                }
                else
                {
LABEL_af4734:
                    v13 = sub_af65fc(a0);
                    if (0 < (int)v13)
                        return v13;
                }
                if (!a0->field_b0)
                {
                    a0->field_b0 = 1;
                    return v13;
                }
                return v13;
            }
        }
        else
        {
            v16 = 0x11;
        }
        a0->field_b0 = v16;
        return 0xffffffff;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_vfy.c", 330, "x509_verify_x509");
    v3 = 105;
    goto LABEL_af4564;
}
