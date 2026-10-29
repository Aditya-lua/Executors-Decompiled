/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa79808..0xa79e58 (1616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a79808_3 {
    char padding_0[8];
    struct st_a79808_4 *field_8;
} st_a79808_3;

typedef struct st_a79808_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
    char padding_10[8];
    long long field_18;
    char field_20;
    char padding_21[7];
    unsigned long long field_28;
    char padding_30[16];
    struct st_a79808_1 *field_40;
    char padding_48[8];
    long long field_50;
    struct st_a79808_2 *field_58;
    char padding_60[56];
    unsigned long long field_98;
    char padding_a0[48];
    char field_d0;
} st_a79808_0;

typedef struct st_a79808_5 {
    char padding_0[24];
    long long field_18;
} st_a79808_5;

typedef struct st_a79808_2 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    long long field_20;
} st_a79808_2;

typedef struct st_a79808_4 {
    unsigned long long field_0;
} st_a79808_4;

typedef struct st_a79808_1 {
    char field_0;
} st_a79808_1;


unsigned long long sub_a79808(st_a79808_0 *a0, char a1, char a2)
{
    long long *v6;  // x25
    st_a79808_3 *v7;  // x0
    char v16;  // x23
    unsigned long long v8;  // x0
    char *v9;  // x8
    char v10;  // x0
    char v11;  // x0
    char v12;  // x0
    st_a79808_5 *v13;  // x22
    char v14;  // x21
    char v15;  // x22
    unsigned long v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x64]
    char v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = 0xffffffff;
    v6 = a0->field_58;
    if (!v6)
    {
        v2 = 0;
        v3 = 0;
        if (!(a0->field_0 & 1))
        {
            if (a0->field_40)
                a0->field_40();
            v10 = *(long long *)&a0->padding_30[8];
            if (v10)
            {
LABEL_a79970:
                v9 = sub_a04518(v10, "OSSL_provider_init");
                a0->field_40 = v9;
                if (v9)
                    v9();
                sub_a368c8();
                sub_a369bc("crypto/provider_core.c", 1038, "provider_init");
                v0 = a0->field_28;
                goto LABEL_a79bdc;
                goto LABEL_a79bdc;
            }
            v11 = sub_a040c0(0);
            *(unsigned long long *)&a0->padding_30[8] = v11;
            if (v11)
            {
                v12 = sub_a6820c(a0->field_50, 1);
                if (v12)
                {
                    v13 = (st_a79808_5 *)v12;
                    if (sub_a7c17c(*(long long *)(v12 + 24)))
                    {
                        if (*(long long *)&v13[1].padding_0[8])
                        {
                            v14 = sub_a6d9b4(*(long long *)&v13[1].padding_0[8], "crypto/provider_core.c", 989);
                            sub_a7c1b4(v13->field_18);
                            if (v14)
                                goto LABEL_a79d58;
                        }
                        else
                        {
                            sub_a7c1b4(v13->field_18);
                            if (!sub_a6ac44("OPENSSL_MODULES"))
                                sub_a69ad4();
                            v14 = 0;
LABEL_a79d58:
                            sub_a0444c(*(long long *)&a0->padding_30[8], 2, 2, 0);
                            if (*(long long *)&a0->padding_30[0])
                            {
                                v15 = 0;
LABEL_a79d94:
                                v16 = sub_a045ec(*(long long *)&a0->padding_30[8]);
                                if (v16 && sub_a042b8(*(long long *)&a0->padding_30[8], v16, 0, 0))
                                    goto LABEL_a79dd4;
                            }
                            else
                            {
                                v15 = sub_a04658(*(long long *)&a0->padding_30[8], a0->field_28);
                                if (v15)
                                    goto LABEL_a79d94;
                                v16 = 0;
                            }
                            sub_a04184(*(long long *)&a0->padding_30[8]);
                            *(unsigned long long *)&a0->padding_30[8] = 0;
LABEL_a79dd4:
                            sub_a6c2e4(v16, "crypto/provider_core.c", 1019);
                            sub_a6c2e4(v15, "crypto/provider_core.c", 0x3fc);
                            sub_a6c2e4(v14, "crypto/provider_core.c", 0x3fd);
                            v10 = *(long long *)&a0->padding_30[8];
                            if (*(long long *)&a0->padding_30[8])
                                goto LABEL_a79970;
                            sub_a368c8(0);
                            sub_a369bc("crypto/provider_core.c", 1026, "provider_init");
                            v0 = a0->field_28;
LABEL_a79bdc:
                            sub_a36abc(15);
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
                    goto LABEL_a79bdc;
                }
            }
        }
        else
        {
            sub_c6943c();
        }
    }
    else if ((!a0->field_98 || sub_aa9158(a0->field_50, a0)) && (!a2 || !(a0->field_d0 & 1) || sub_a779ec(a0, 1)))
    {
        if (a1)
        {
            if (sub_a7c17c(v6[4]))
            {
                if (sub_a7c198(a0->field_8))
                    goto LABEL_a79890;
                sub_a7c1b4(v6[4]);
            }
            if (!a2)
            {
                return 0xffffffff;
            }
            else if (a0->field_d0 & 1)
            {
                sub_a77a58(a0, 1);
            }
            else
            {
                return 0xffffffff;
            }
        }
        else
        {
LABEL_a79890:
            if (sub_a7c268(&a0->field_20, 1, &v1, a0->field_18) && (a0->field_0 = a0->field_0 | 2, v6 && v1 == 1))
            {
                if ((int)sub_ad69e4(a0->field_58->field_10) >= 1)
                {
                    v7 = sub_ad69f8(a0->field_58->field_10, 0);
                    v7->field_8();
                }
                if (a1)
                    goto LABEL_a79920;
            }
            else if (a1)
            {
LABEL_a79920:
                sub_a7c1b4(a0->field_8);
                sub_a7c1b4(v6[4]);
                if (v1 == 1)
                    sub_a2e1e4(a0->field_50);
            }
            v8 = v1;
            return v8;
        }
    }
    return 0xffffffff;
}
