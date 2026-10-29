/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96d41c..0x96d864 (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96d41c_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
    char padding_478[504];
    struct st_96d41c_0 *field_670;
    struct st_96d41c_0 *field_678;
    struct st_96d41c_0 *field_680;
} st_96d41c_1;

typedef struct st_96d41c_0 {
    struct st_96d41c_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_96d41c_0 *field_8;
    char field_a;
    char padding_b[5];
    struct st_96d41c_0 *field_10;
    char padding_18[4];
    unsigned short field_1c;
    char padding_1e[18];
    char field_30;
} st_96d41c_0;


st_96d41c_0 * sub_96d41c(long long a0, st_96d41c_1 **a1)
{
    st_96d41c_1 *v4;  // x20
    st_96d41c_0 *v5;  // x8
    st_96d41c_0 *v14;  // x0
    st_96d41c_0 *v15;  // w8
    long long v16;  // x1
    st_96d41c_0 *v17;  // x19
    st_96d41c_0 *v6;  // x9
    st_96d41c_0 *v7;  // x0
    st_96d41c_0 *ptr;  // x21
    st_96d41c_0 *v9;  // x0
    st_96d41c_0 *v10;  // x0
    st_96d41c_0 *v11;  // x0
    st_96d41c_0 *v12;  // x0
    st_96d41c_0 *v13;  // x0
    st_96d41c_0 *v0;  // [bp-0x38]
    unsigned int v1;  // [bp-0x34]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a1;
    v0 = (st_96d41c_0 *)0;
    v5 = v4->field_680;
    v6 = v4->field_678;
    if (v5 == v6)
    {
        if (v5)
        {
            v7 = sub_a6c1b4(v4->field_670, 560 + 56 * v5, "ssl/t1_lib.c", 244);
            if (!v7)
                return 0;
        }
        else
        {
            v7 = sub_a6bf4c(560, "ssl/t1_lib.c", 239);
            if (!v7)
                return 0;
        }
        v4->field_670 = v7;
        _bzero((char *)v7 + 0x38 * v4->field_680, 560);
        v4->field_680 = &v4->field_680->padding_2[1];
        v6 = v4->field_678;
    }
    ptr = (char *)v4->field_670 + 0x38 * v6;
    v9 = sub_a6fbc4(a0, "tls-group-name");
    if (!v9 || *(int *)&v9->field_1 != 4)
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 258, "add_provider_groups");
        sub_a36abc(20, 0x80106, 0);
        v17 = 0;
        if (!ptr)
            return 0;
        goto LABEL_96d684;
    }
    v10 = sub_a6d9b4(v9->field_8, "ssl/t1_lib.c", 261);
    ptr->field_0 = v10;
    if (v10)
    {
        v11 = sub_a6fbc4(a0, "tls-group-name-internal");
        if (v11 && *(int *)&v11->field_1 == 4)
        {
            v12 = sub_a6d9b4(v11->field_8, "ssl/t1_lib.c", 270);
            *(st_96d41c_0 **)&ptr->field_1 = v12;
            if (!v12)
                goto LABEL_96d680;
            if (sub_a6fbc4(a0, "tls-group-id") && sub_a6ffcc() && 0x10000 > v1)
            {
                *(unsigned short *)&ptr->padding_b[3] = v1;
                v13 = sub_a6fbc4(a0, "tls-group-alg");
                if (v13 && *(int *)&v13->field_1 == 4)
                {
                    v14 = sub_a6d9b4(v13->field_8, "ssl/t1_lib.c", 286);
                    ptr->field_8 = v14;
                    if (!v14)
                        goto LABEL_96d680;
                    if (!sub_a6fbc4(a0, "tls-group-sec-bits") || !sub_a6ffcc())
                    {
                        sub_a368c8();
                        v16 = 292;
                    }
                    else if (sub_a6fbc4(a0, "tls-group-is-kem"))
                    {
                        if (sub_a6ffcc() && !(v15 = v0, v15 >= 2))
                            goto LABEL_96d734;
                        sub_a368c8();
                        v16 = 298;
                    }
                    else
                    {
                        v15 = (st_96d41c_0 *)0;
LABEL_96d734:
                        ptr->padding_1e[2] = (char)v15;
                        if (!sub_a6fbc4(a0, "tls-min-tls") || !sub_a6fc2c())
                        {
                            sub_a368c8();
                            v16 = 305;
                        }
                        else if (!sub_a6fbc4(a0, "tls-max-tls") || !sub_a6fc2c())
                        {
                            sub_a368c8();
                            v16 = 311;
                        }
                        else if (sub_a6fbc4(a0, "tls-min-dtls") && sub_a6fc2c())
                        {
                            if (sub_a6fbc4(a0, "tls-max-dtls") && sub_a6fc2c())
                            {
                                sub_a36c8c();
                                if (sub_a55808(v4->field_0, ptr->field_8, v4->field_470))
                                {
                                    v4->field_678 = (char *)&v4->field_678->field_0 + 1;
                                    sub_a55830();
                                    ptr = 0;
                                }
                                sub_a36cd4();
                                v17 = 1;
                                if (!ptr)
                                    return 1;
LABEL_96d684:
                                sub_a6c2e4(ptr->field_0, "ssl/t1_lib.c", 344);
                                sub_a6c2e4(*(long long *)&ptr->field_1, "ssl/t1_lib.c", 345);
                                sub_a6c2e4(ptr->field_8, "ssl/t1_lib.c", 346);
                                memset(ptr, 0, 24);
                                return v17;
                            }
                            sub_a368c8();
                            v16 = 323;
                        }
                        else
                        {
                            sub_a368c8();
                            v16 = 317;
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    v16 = 283;
                }
            }
            else
            {
                sub_a368c8();
                v16 = 276;
            }
        }
        else
        {
            sub_a368c8();
            v16 = 267;
        }
        sub_a369bc("ssl/t1_lib.c", v16, "add_provider_groups");
        sub_a36abc(20, 0x80106, 0);
    }
LABEL_96d680:
    v17 = 0;
    goto LABEL_96d684;
}
