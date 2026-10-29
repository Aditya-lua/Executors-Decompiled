/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad8048..0xad8300 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad8048_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ad8048_0 *field_8;
} st_ad8048_1;

typedef struct st_ad8048_0 {
    char padding_0[96];
    struct st_ad8048_0 *field_60;
    struct st_ad8048_0 *field_68;
    unsigned long long field_70;
    unsigned long long field_78;
    struct st_ad8048_0 *field_80;
    struct st_ad8048_0 *field_88;
    struct st_ad8048_0 *field_90;
    struct st_ad8048_0 *field_98;
    struct st_ad8048_0 *field_a0;
    struct st_ad8048_0 *field_a8;
    struct st_ad8048_0 *field_b0;
    struct st_ad8048_0 *field_b8;
    struct st_ad8048_0 *field_c0;
    struct st_ad8048_0 *field_c8;
    struct st_ad8048_0 *field_d0;
} st_ad8048_0;

typedef struct st_ad8048_2 {
    long long field_0;
    unsigned long long field_8;
    struct st_ad8048_1 *field_10;
    unsigned long long field_18;
} st_ad8048_2;

typedef struct st_ad8048_3 {
    char padding_0[40];
    char field_28;
} st_ad8048_3;


int sub_ad8048(st_ad8048_2 *a0, st_ad8048_0 *a1, st_ad8048_3 *a2)
{
    long long v2;  // x0
    st_ad8048_0 *v3;  // w0
    st_ad8048_0 **v12;  // x9
    st_ad8048_0 **v13;  // x11
    st_ad8048_0 **v14;  // x14
    st_ad8048_0 **v15;  // x16
    st_ad8048_0 **v16;  // x15
    st_ad8048_0 **v17;  // x17
    st_ad8048_0 **v18;  // x1
    unsigned long v19;  // x2
    st_ad8048_0 **v20;  // x2
    st_ad8048_0 *v21;  // w8
    st_ad8048_1 *v4;  // x25
    unsigned long long v22;  // 4102
    st_ad8048_0 *v5;  // x0
    st_ad8048_0 *v6;  // x0
    st_ad8048_0 **v7;  // x10
    st_ad8048_0 **v8;  // x12
    st_ad8048_0 **v9;  // x13
    unsigned long long v10;  // x16
    st_ad8048_0 **v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68f38(sub_a7a42c(a1));
    v3 = (st_ad8048_0 *)(unsigned int)sub_a691c4(v2, 0, a0->field_0);
    if (v3)
    {
        v4 = a0->field_10;
        v5 = sub_a6bffc(216, "crypto/store/store_meth.c", 50);
        if (v5 && !(/* unsupported instruction */, *(unsigned int *)&v5->field_80 = 1, v6 = v5, !sub_a78c78(a1)))
        {
            v6->field_60 = a1;
            *(unsigned int *)&v6->field_68 = (unsigned int)v3;
            v7 = &v6->field_d0;
            v8 = &v6->field_c8;
            v9 = &v6->field_c0;
            v10 = a0->field_18;
            v11 = &v6->field_b8;
            v12 = &v6->field_b0;
            v13 = &v6->field_a8;
            v14 = &v6->field_a0;
            v6->field_70 = a0->field_8;
            v6->field_78 = v10;
            v15 = &v6->field_98;
            v16 = &v6->field_90;
            v17 = &v6->field_88;
            v18 = &v4->field_8;
            while (1)
            {
                v19 = *(int *)((char *)v18 - 8);
                if (5 >= (int)v19)
                {
                    if ((int)v19 > 2)
                    {
                        if ((unsigned int)v19 == 3)
                        {
                            v20 = v15;
                            if (!*v15)
                                goto LABEL_ad8110;
                        }
                        else if ((unsigned int)v19 == 4)
                        {
                            v20 = v14;
                            if (!*v14)
                                goto LABEL_ad8110;
                        }
                        else if (!((unsigned int)v19 != 5 || (v20 = v13, *v13)))
                        {
                            goto LABEL_ad8110;
                        }
                    }
                    else
                    {
                        if ((unsigned int)v19 == 1)
                        {
                            v20 = v17;
                            if (!*v17)
                                goto LABEL_ad8110;
                        }
                        else if ((unsigned int)v19 == 2)
                        {
                            v20 = v16;
                            if (!*v16)
                                goto LABEL_ad8110;
                        }
                        else if (!(unsigned int)v19)
                        {
                            break;
                        }
                    }
                }
                else
                {
                    if ((int)v19 > 7)
                    {
                        if ((unsigned int)v19 == 8)
                        {
                            v20 = v9;
                            if (!*v9)
                            {
LABEL_ad8110:
                                *v20 = *v18;
                            }
                        }
                        else if ((unsigned int)v19 == 9)
                        {
                            v20 = v8;
                            if (!*v8)
                                goto LABEL_ad8110;
                        }
                        else if (!((unsigned int)v19 != 10 || (v20 = v7, *v7)))
                        {
                            goto LABEL_ad8110;
                        }
                    }
                    else
                    {
                        if ((unsigned int)v19 == 6)
                        {
                            v20 = v12;
                            if (!*v12)
                                goto LABEL_ad8110;
                        }
                        else if (!((unsigned int)v19 != 7 || (v20 = v11, *v11)))
                        {
                            goto LABEL_ad8110;
                        }
                    }
                }
                v18 += 2;
            }
            if ((*v17 || *v16) && *v13 && *v12 && *v11)
                goto LABEL_ad82e8;
            if (a1)
            {
                do
                {
                    /* unsupported instruction */;
                    v21 = (st_ad8048_0 *)/* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v22 = arm64g_calculate_condition(19, (unsigned long long)v21, 1, 0);
                if (!(v22 & 1))
                {
                    /* unsupported instruction */;
                }
                else if (1 < v21)
                {
                    goto LABEL_ad82ac;
                }
                sub_a78ccc(v6->field_60);
            }
            v18 = "crypto/store/store_meth.c";
            v19 = 39;
            v6 = sub_a6c2e4();
LABEL_ad82ac:
            sub_a368c8(v6, v18, v19);
            sub_a369bc("crypto/store/store_meth.c", 241, "loader_from_algorithm");
            sub_a36abc(44, 116, 0);
        }
        else
        {
            sub_a6c2e4();
        }
    }
    v6 = 0;
    a2->field_28 = a2->field_28 | 1;
LABEL_ad82e8:
    return (unsigned int)v6;
}
