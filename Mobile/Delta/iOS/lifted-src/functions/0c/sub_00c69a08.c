/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc69a08..0xc69da0 (920 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c69a08_2 {
    char padding_0[8];
    long long field_8;
} st_c69a08_2;

typedef struct st_c69a08_3 {
    struct st_c69a08_0 *field_0;
    struct st_c69a08_2 *field_8;
} st_c69a08_3;

typedef struct st_c69a08_4 {
    char padding_0[8];
    struct st_c69a08_2 *field_8;
} st_c69a08_4;

typedef struct st_c69a08_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_c69a08_1 *field_8;
} st_c69a08_0;

typedef struct st_c69a08_1 {
    unsigned short field_0;
} st_c69a08_1;

extern long long g_ae04f0;

unsigned long long sub_c69a08(unsigned long long idx, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x21
    st_c69a08_4 *v12;  // x26
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4102
    unsigned long v18;  // x10
    unsigned long long v19;  // w25
    st_c69a08_2 *v20;  // x0
    unsigned long long v4;  // x23
    unsigned long long v21;  // 4102
    unsigned long long v5;  // x0
    unsigned long long v22;  // x22
    st_c69a08_2 *v23;  // x0
    unsigned long long v24;  // 4102
    unsigned long long v25;  // x21
    unsigned long long v6;  // x20
    unsigned long long v7;  // x25
    st_c69a08_3 *v8;  // x27
    long long v9;  // x0
    unsigned long long v10;  // x0
    st_c69a08_0 *v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 && (v2 = a2, (int)sub_ad69e4(a1) >= 1))
    {
        if (!idx && !v2)
        {
LABEL_c69d74:
            return 0;
        }
        else if (!idx || *(long long *)(idx + 56))
        {
            if (v2)
            {
                v3 = 0;
                v4 = 0xffffffff;
            }
            else
            {
                v3 = sub_ad69f8(a1, 0);
                v2 = *(long long *)(v3 + 296);
                if (!*(long long *)(v3 + 296))
                    return 1;
                v4 = 0;
            }
            if (sub_ae019c(v2) || idx && !(*(unsigned int *)(idx + 172) = v4, *(unsigned int *)(idx + 176) = 41, !sub_ae1f50()))
            {
                sub_ad5f30(v2, &g_ae04f0);
                v5 = sub_ad5f4c(v2);
                if (v5)
                {
                    v6 = v5;
                    if ((int)sub_ae1f8c(sub_ad6ae4()) <= (int)v4)
                    {
LABEL_c69c80:
                        if (*(long long *)(v3 + 296) && (int)sub_ad69e4(*(long long *)(v3 + 296)) >= 1)
                        {
                            v22 = 0;
                            do
                            {
                                v23 = sub_ae1f64(sub_ad69f8(*(long long *)(v3 + 296), v22), v22);
                                v24 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
                                if (v24 & 1 || !*(int *)v23->field_8 && !(sub_ad66d4(v6) >> 31 & 1) && (!idx || !(*(unsigned int *)(idx + 172) = v4, *(unsigned int *)(idx + 176) = 46, sub_ae1f50())))
                                    goto LABEL_c69d64;
                            } while ((v22 = (unsigned int)v22 + 1, (int)v22 < (int)sub_ad69e4(*(long long *)(v3 + 296))));
                        }
                        v25 = 1;
                        goto LABEL_c69d68;
                    }
                    while (1)
                    {
                        v3 = sub_ad69f8(a1, v4);
                        if (!sub_ae019c(*(long long *)(v3 + 296)) && (!idx || (*(unsigned int *)(idx + 172) = v4, *(unsigned int *)(idx + 176) = 41, !sub_ae1f50())))
                            break;
                        if (*(long long *)(v3 + 296))
                        {
                            sub_ad5f30(*(long long *)(v3 + 296), &g_ae04f0);
                            if ((int)sub_ae1f78(sub_ad6ae4(*(long long *)(v3 + 296))) < 1)
                                goto LABEL_c69c74;
                            v7 = 0;
                            while (1)
                            {
                                v8 = sub_ae1f80();
                                v9 = sub_ad66d4(*(long long *)(v3 + 296), v8);
                                v10 = sub_ad69f8(*(long long *)(v3 + 296), v9);
                                if (v10)
                                {
                                    v11 = v8->field_0;
                                    if ((v11->field_0 & 0xfffffffe) != 2 || !(v12 = v10, sub_ae1f64(), v17 = arm64g_calculate_condition(v13 | 16, v14, v15, v16), !(v17 & 1)))
                                        goto LABEL_c69d64;
                                    if (*(int *)&v12->field_8->padding_0[0] == 1)
                                    {
                                        if (*(int *)&v8->field_8->padding_0[0])
                                        {
                                            if (v11->field_8)
                                                v18 = *(short *)v11->field_8;
                                            if (sub_ae155c(v12->field_8->field_8, v8->field_8->field_8))
                                                goto LABEL_c69be8;
                                            if (!idx || !(*(unsigned int *)(idx + 172) = v4, *(unsigned int *)(idx + 176) = 46, sub_ae1f50()))
                                                goto LABEL_c69d64;
                                        }
                                        else
                                        {
LABEL_c69be8:
                                            sub_ad6a28(v6, v7, v12);
                                        }
                                    }
                                }
                                else if (!(*(int *)&v8->field_8->padding_0[0] != 1))
                                {
                                    goto LABEL_c69c60;
                                }
                                v7 = (unsigned int)v7 + 1;
                                if ((int)v7 >= (int)sub_ae1f78())
                                    goto LABEL_c69c74;
                            }
                        }
                        else
                        {
                            if ((int)sub_ae1f78(0) < 1)
                                goto LABEL_c69c74;
                            v19 = 0;
                            while (1)
                            {
                                v20 = sub_ae1f64(sub_ae1f80());
                                v21 = arm64g_calculate_condition(v13 | 16, v14, v15, v16);
                                if (v21 & 1)
                                    goto LABEL_c69d64;
                                if (*(int *)v20->field_8)
                                    break;
                                v19 += 1;
                                if (v19 >= (int)sub_ae1f78())
                                    goto LABEL_c69c74;
                            }
LABEL_c69c60:
                            if (!idx || !(*(unsigned int *)(idx + 172) = v4, *(unsigned int *)(idx + 176) = 46, sub_ae1f50()))
                                break;
LABEL_c69c74:
                            if ((int)v4 >= (int)sub_ae1f8c())
                                goto LABEL_c69c80;
                        }
                    }
LABEL_c69d64:
                    v25 = 0;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_addr.c", 1246, "addr_validate_path_internal");
                    sub_a36abc(0x22, 0x8000f, 0);
                    if (!idx)
                        goto LABEL_c69d58;
                    v25 = 0;
                    v6 = 0;
                    *(unsigned int *)(idx + 176) = 0x11;
                }
            }
            else
            {
LABEL_c69d58:
                v25 = 0;
                v6 = 0;
            }
LABEL_c69d68:
            sub_ad6020(v6);
            return v25;
        }
    }
    else
    {
        if (!idx)
            goto LABEL_c69d74;
    }
    *(unsigned int *)(idx + 176) = 1;
    return 0;
}
