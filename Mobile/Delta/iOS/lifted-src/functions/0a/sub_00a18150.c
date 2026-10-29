/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18150..0xa186a4 (1364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18150_2 {
    struct st_a18150_0 *field_0;
    int field_4;
    int field_8;
    unsigned int field_c;
} st_a18150_2;

typedef struct st_a18150_3 {
    struct st_a18150_0 *field_0;
    char field_4;
    char padding_5[3];
    unsigned int field_8;
    unsigned int field_c;
} st_a18150_3;

typedef struct st_a18150_0 {
    char padding_0[40];
    struct st_a18150_1 *field_28;
} st_a18150_0;

typedef struct st_a18150_1 {
    unsigned long long field_0;
} st_a18150_1;

extern void g_e8efa8;

st_a18150_3 * sub_a18150(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    void* iter;  // x8
    unsigned long long v12;  // x9
    st_a18150_2 *v21;  // x24
    long long v22;  // x27
    st_a18150_2 *v23;  // x22
    st_a18150_3 *v24;  // x0
    long long v25;  // x21
    st_a18150_2 *v26;  // x0
    st_a18150_2 *v27;  // x23
    st_a18150_2 *v28;  // x0
    unsigned long long v13;  // x9
    st_a18150_2 *v14;  // x20
    st_a18150_2 *v15;  // x27
    long long v16;  // x25
    st_a18150_2 *v17;  // x28
    unsigned long v18;  // x21
    unsigned long v19;  // x23
    unsigned long v20;  // x26
    unsigned long long v0;  // [bp-0xb0]
    st_a18150_2 *v1;  // [bp-0xa0]
    st_a18150_2 *v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    unsigned long v4;  // [bp-0x88]
    st_a18150_2 *v5;  // [bp-0x80]
    long long v6;  // [bp-0x74]
    st_a18150_2 *v7;  // [bp-0x70]
    st_a18150_3 *v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    if ((int)a2 >= 1)
    {
        iter = &g_e8efa8;
        v12 = 82;
        while (1)
        {
            v13 = v12;
            if (*(int *)((char *)iter - 8) == (unsigned int)a2)
                break;
            iter += 32;
            v12 = v13 - 1;
            if (v13 == 1)
                goto LABEL_a18600;
        }
        v14 = *(long long *)iter;
        v15 = (long long)iter[8];
        if (!v14)
        {
            if (v15)
                v15();
            v21 = sub_a19fb4();
            goto LABEL_a185fc;
            goto LABEL_a185fc;
        }
        v16 = 524304;
        v17 = sub_9dddcc();
        v8 = v17;
        if (!v17)
        {
            v5 = 0;
            v2 = 0;
            v1 = 0;
            v7 = 0;
            v27 = 0;
            v23 = 0;
            v21 = 0;
            v25 = 2876;
            v16 = 524291;
            goto LABEL_a18580;
        }
        v6 = 524291;
        v18 = *(int *)((char *)&v14->field_0 + 4);
        v19 = v14->field_4;
        v20 = &v14->field_c;
        if (v15)
            v15();
        v21 = 0;
        v3 = v20;
        v4 = v18;
        v22 = v20 + v18;
        v23 = sub_9e4db0(v22, v19, 0);
        if (!v23 || (v5 = sub_9e4db0(v22 + v19, v19, 0), !v5))
        {
            v5 = 0;
            v2 = 0;
            v1 = 0;
            v7 = 0;
            v27 = 0;
            v17 = 0;
            v25 = 2907;
            v16 = v6;
            goto LABEL_a18580;
        }
        v2 = sub_9e4db0(v22 + v19 * 2, v19, 0);
        if (!v2)
        {
            v2 = 0;
            v1 = 0;
            v7 = 0;
            v27 = 0;
            v17 = 0;
            v25 = 2907;
            goto LABEL_a183ac;
        }
        v24 = v23;
        if ((int)v14->field_0 == 406)
        {
            v21 = sub_a18a2c(v24, v5, v2, v17);
            if (v21)
                goto LABEL_a18410;
            v7 = 0;
            v17 = 0;
            v25 = 2918;
        }
        else
        {
            v21 = sub_a18ab4(v24, v5, v2, v17);
            if (v21)
            {
LABEL_a18410:
                sub_a1abbc(v21, a2);
                v17 = sub_a1a56c(v21);
                if (v17)
                {
                    v1 = sub_9e4db0(v22 + v19 * 3, v19, 0);
                    if (v1)
                    {
                        v26 = sub_9e4db0(v22 + v19 * 4, v19, 0);
                        if (!v26)
                        {
                            v7 = 0;
                            v27 = 0;
                            v25 = 2942;
                            goto LABEL_a18670;
                        }
                        v7 = v26;
                        if (!sub_a1b250(v21, v17, v1, v7, v8))
                        {
                            v27 = 0;
                            v25 = 2946;
                            goto LABEL_a18674;
                        }
                        v27 = sub_9e4db0(v22 + (unsigned int)v19 * 5, v19, 0);
                        if (v27)
                        {
                            v1 = v1;
                            v2 = v2;
                            if (sub_9e4d58(v1, v14->field_8))
                            {
                                v5 = v5;
                                if (!sub_a1a764(v21, v17, v27, v1))
                                {
                                    v25 = 2955;
                                    goto LABEL_a18580;
                                }
                                else if (!(unsigned int)v4 || sub_a1abf0(v21, v3))
                                {
                                    if (sub_a1abe0(v21) != 1)
                                        goto LABEL_a185b8;
                                    v28 = sub_a99624(a2);
                                    if (v28)
                                    {
                                        if (!sub_a9a7f0())
                                            sub_319f0(v21, 0);
                                        sub_9c3580(v28);
                                        goto LABEL_a185b8;
                                    }
                                    else
                                    {
                                        v16 = 524296;
                                        v25 = 2982;
                                        goto LABEL_a18580;
                                    }
                                }
                                else
                                {
                                    v25 = 2960;
                                    goto LABEL_a18580;
                                }
                            }
                            else
                            {
                                v25 = 2951;
LABEL_a183ac:
                                v16 = v6;
                                goto LABEL_a18580;
                            }
                        }
                        else
                        {
                            v25 = 2951;
LABEL_a18670:
                            v16 = v6;
LABEL_a18674:
                            goto LABEL_a18580;
                        }
                        goto LABEL_a18580;
                    }
                    else
                    {
                        v7 = 0;
                        v25 = 2942;
                        v16 = v6;
                    }
                }
                else
                {
                    v7 = 0;
                    v25 = 2936;
                }
            }
            else
            {
                v7 = 0;
                v17 = 0;
                v25 = 2927;
            }
        }
        v1 = 0;
        v27 = 0;
LABEL_a18580:
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_curve.c", v25, "ec_group_new_from_data");
        sub_a36abc(16, v16, 0);
        sub_a1a174(v21);
        v21 = 0;
LABEL_a185b8:
        sub_a1a254(v17);
        sub_9dded4(v8);
        sub_9e48d4(v23);
        sub_9e48d4(v5);
        sub_9e48d4(v2);
        sub_9e48d4(v27);
        sub_9e48d4(v1);
        sub_9e48d4(v7);
LABEL_a185fc:
        if (v21)
            return v21;
    }
LABEL_a18600:
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_curve.c", 3027, "EC_GROUP_new_by_curve_name_ex");
    v0 = sub_a9976c(a2);
    sub_a36abc(16, 129, "name=%s");
    return 0;
}
