/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5380c..0xa53af0 (740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5380c_0 {
    struct st_a5380c_0 *field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    char padding_c[4];
    struct st_a5380c_0 *field_10;
    unsigned long long field_18;
    struct st_a5380c_0 *field_20;
    struct st_a5380c_0 *field_28;
    struct st_a5380c_0 *field_30;
    struct st_a5380c_0 *field_38;
    struct st_a5380c_0 *field_40;
    struct st_a5380c_0 *field_48;
    struct st_a5380c_0 *field_50;
    struct st_a5380c_0 *field_58;
    struct st_a5380c_0 *field_60;
    struct st_a5380c_0 *field_68;
    struct st_a5380c_0 *field_70;
    struct st_a5380c_0 *field_78;
} st_a5380c_0;

typedef struct st_a5380c_2 {
    struct st_a5380c_0 *field_0;
    struct st_a5380c_0 *field_8;
} st_a5380c_2;

typedef struct st_a5380c_1 {
    char padding_0[16];
    struct st_a5380c_2 *field_10;
    unsigned long long field_18;
} st_a5380c_1;


st_a5380c_0 * sub_a5380c(unsigned int a0, st_a5380c_1 *a1, st_a5380c_0 *a2)
{
    st_a5380c_0 **v2;  // x24
    st_a5380c_0 *v3;  // x0
    unsigned long long v12;  // 4102
    st_a5380c_0 *v4;  // x19
    st_a5380c_0 *v5;  // x0
    st_a5380c_0 *v6;  // w9
    st_a5380c_0 *iter;  // w8
    st_a5380c_0 **v8;  // x10
    st_a5380c_0 **v9;  // x10
    st_a5380c_0 *v10;  // w11
    st_a5380c_0 *v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a6bffc(128, "crypto/evp/kdf_meth.c", 50);
    if (!v3)
    {
        sub_a368c8(sub_a6c2e4(), "crypto/evp/kdf_meth.c", 52);
        sub_a369bc("crypto/evp/kdf_meth.c", 67, "evp_kdf_from_algorithm");
        sub_a36abc(6, 0x80006, 0);
        return 0;
    }
    v4 = v3;
    /* unsupported instruction */;
    *(unsigned int *)&v3->field_18 = 1;
    *(unsigned int *)&v3->field_1 = a0;
    v5 = sub_a6895c(a1);
    *(st_a5380c_0 **)&v4->field_8 = v5;
    if (v5)
    {
        v6 = (st_a5380c_0 *)0;
        iter = (st_a5380c_0 *)0;
        v4->field_10 = a1->field_18;
        v8 = v2 + 1;
        while (1)
        {
            v9 = v8;
            v10 = (st_a5380c_0 *)*(int *)((char *)v9 - 8);
            if (v10 > 5)
            {
                if (8 >= v10)
                {
                    if (v10 != 6)
                    {
                        if (v10 != 7)
                        {
                            if (v10 == 8 && !v4->field_58)
                            {
                                v8 = v9 + 2;
                                v4->field_58 = *v9;
                                continue;
                            }
                        }
                        else
                        {
                            if (!v4->field_50)
                            {
                                v8 = v9 + 2;
                                v4->field_50 = *v9;
                                continue;
                            }
                        }
                    }
                    else
                    {
                        if (!v4->field_48)
                        {
                            v8 = v9 + 2;
                            v4->field_48 = *v9;
                            continue;
                        }
                    }
                }
                else
                {
                    if (v10 != 9)
                    {
                        if (v10 != 10)
                        {
                            if (v10 == 11 && !v4->field_70)
                            {
                                v8 = v9 + 2;
                                v4->field_70 = *v9;
                                continue;
                            }
                        }
                        else
                        {
                            if (!v4->field_68)
                            {
                                v4->field_68 = *v9;
                                goto LABEL_a5388c;
                            }
                        }
                    }
                    else
                    {
                        if (!v4->field_60)
                        {
                            v8 = v9 + 2;
                            v4->field_60 = *v9;
                            continue;
                        }
                    }
                }
            }
            if (v10 > 2)
            {
                if (v10 == 3)
                {
                    if (!v4->field_30)
                    {
                        v8 = v9 + 2;
                        v4->field_30 = *v9;
                        iter = (char *)&iter->field_0 + 1;
                        continue;
                    }
                }
                else
                {
                    if (v10 != 4)
                    {
                        if (v10 == 5 && !v4->field_40)
                        {
                            v8 = v9 + 2;
                            v4->field_40 = *v9;
                            v6 = (char *)&v6->field_0 + 1;
                            continue;
                        }
                    }
                    else
                    {
                        if (!v4->field_38)
                        {
                            v8 = v9 + 2;
                            v4->field_38 = *v9;
                            continue;
                        }
                    }
                }
                goto LABEL_a5388c;
            }
            switch (v10)
            {
            case 1:
                if (v4->field_20)
                {
LABEL_a5388c:
                    v8 = v9 + 2;
                }
                else
                {
                    v8 = v9 + 2;
                    v4->field_20 = *v9;
                    iter = (char *)&iter->field_0 + 1;
                }
                break;
            default:
                if (v10 == 2)
                {
                    if (!v4->field_28)
                    {
                        v8 = v9 + 2;
                        v4->field_28 = *v9;
                        continue;
                    }
                }
                else
                {
                    if (!v10)
                        break;
                    else
                        goto LABEL_a5388c;
                }
                goto LABEL_a5388c;
            }
        }
        if (v6 != 1 || iter != 2)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/kdf_meth.c", 144, "evp_kdf_from_algorithm");
            sub_a36abc(6, 193, 0);
        }
        else if (!a2 || sub_a78c78(a2))
        {
            v4->field_0 = a2;
            return v4;
        }
    }
    do
    {
        /* unsupported instruction */;
        v11 = (st_a5380c_0 *)/* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v12 = arm64g_calculate_condition(19, (unsigned long long)v11, 1, 0);
    if (!(v12 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < v11)
    {
        return 0;
    }
    sub_a6c2e4(*(long long *)&v4->field_8, "crypto/evp/kdf_meth.c", 40);
    sub_a78ccc(v4->field_0);
    sub_a6c2e4(v4, "crypto/evp/kdf_meth.c", 43);
    return 0;
}
