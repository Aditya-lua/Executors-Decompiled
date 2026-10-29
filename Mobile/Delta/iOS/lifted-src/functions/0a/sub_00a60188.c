/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60188..0xa6047c (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60188_0 {
    char padding_0[8];
    long long field_8;
    struct st_a60188_0 *field_10;
    long long field_18;
} st_a60188_0;


st_a60188_0 * sub_a60188(unsigned int *a0, long long a1)
{
    st_a60188_0 *v7;  // x0
    st_a60188_0 *v8;  // x0
    st_a60188_0 *v9;  // x23
    st_a60188_0 *v10;  // x21
    st_a60188_0 *v11;  // x22
    st_a60188_0 *v12;  // x0
    st_a60188_0 *v13;  // x0
    st_a60188_0 *v14;  // x0
    unsigned int v0;  // [bp-0x64]
    st_a60188_0 *v1;  // [bp-0x60]
    st_a60188_0 *v2;  // [bp-0x58]
    st_a60188_0 *v3;  // [bp-0x50]
    st_a60188_0 *v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    v7 = sub_a6fbc4(a1, "group");
    if (!v7 || (int)v7->field_8 == 4 && v7->field_10 && (v8 = sub_a6047c(v7->field_10), v8 && sub_a60868(a0, v8)))
    {
        v9 = sub_a6fbc4(a1, "p");
        v10 = sub_a6fbc4(a1, "g");
        v11 = sub_a6fbc4(a1, "q");
        if ((!v9 || sub_a70f20(v9, &v4)) && (!v11 || sub_a70f20(v11, &v3)) && (!v10 || sub_a70f20(v10, &v2)))
        {
            if (!sub_a6fbc4(a1, "gindex"))
            {
LABEL_a60290:
                if (sub_a6fbc4(a1, "pcounter"))
                {
                    if (sub_a6fc2c())
                    {
                        a0[12] = v0;
                        goto LABEL_a602b8;
                    }
                }
                else
                {
LABEL_a602b8:
                    if (!sub_a6fbc4(a1, "j") || sub_a70f20())
                    {
                        if (sub_a6fbc4(a1, "hindex"))
                        {
                            if (sub_a6fc2c())
                            {
                                a0[15] = v0;
                                goto LABEL_a60300;
                            }
                        }
                        else
                        {
LABEL_a60300:
                            v12 = sub_a6fbc4(a1, "seed");
                            if (!v12 || (int)v12->field_8 == 5 && sub_a60d78(a0, v12->field_10, v12->field_18))
                            {
                                if (sub_a6fbc4(a1, "validate-pq"))
                                {
                                    if (sub_a6fc2c())
                                    {
                                        sub_a60e10(a0, 1, v0);
                                        goto LABEL_a60360;
                                    }
                                }
                                else
                                {
LABEL_a60360:
                                    if (sub_a6fbc4(a1, "validate-g"))
                                    {
                                        if (sub_a6fc2c())
                                        {
                                            sub_a60e10(a0, 2, v0);
                                            goto LABEL_a60390;
                                        }
                                    }
                                    else
                                    {
LABEL_a60390:
                                        if (sub_a6fbc4(a1, "validate-legacy"))
                                        {
                                            if (sub_a6fc2c())
                                            {
                                                sub_a60e10(a0, 4, v0);
                                                goto LABEL_a603c0;
                                            }
                                        }
                                        else
                                        {
LABEL_a603c0:
                                            v13 = sub_a6fbc4(a1, "digest");
                                            if (!v13)
                                            {
                                                sub_a60cac(a0, v4, v3, v2);
                                                sub_a60d4c(a0, v1);
                                                return 1;
                                            }
                                            if ((int)v13->field_8 == 4)
                                            {
                                                v14 = sub_a6fbc4(a1, "properties");
                                                if (!v14)
                                                {
LABEL_a60448:
                                                    sub_a60e34(a0, v13->field_10);
                                                    sub_a60cac(a0, v4, v3, v2);
                                                    sub_a60d4c(a0, v1);
                                                    return 1;
                                                }
                                                if ((int)v14->field_8 == 4)
                                                    goto LABEL_a60448;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (sub_a6fc2c())
            {
                a0[14] = v0;
                goto LABEL_a60290;
            }
        }
    }
    sub_9e48d4(v1);
    sub_9e48d4(v4);
    sub_9e48d4(v3);
    sub_9e48d4(v2);
    return 0;
}
