/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa307c8..0xa30b60 (920 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a307c8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a307c8_0;

typedef struct st_a307c8_1 {
    long long field_0;
    long long field_8;
    struct st_a307c8_0 *field_10;
} st_a307c8_1;

typedef struct st_a307c8_2 {
    char padding_0[40];
    char field_28;
} st_a307c8_2;


void* sub_a307c8(st_a307c8_1 *a0, long long a1, st_a307c8_2 *a2)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned long long *v12;  // x8
    unsigned long long *v13;  // x11
    unsigned long long *v14;  // x12
    unsigned long long *v15;  // x13
    unsigned long long *v16;  // x15
    unsigned long long *v17;  // x16
    unsigned long long *v18;  // x14
    unsigned long long *v19;  // x17
    unsigned long long *iter;  // x0
    unsigned int v21;  // w1
    st_a307c8_0 *v4;  // x26
    unsigned long long *v22;  // x1
    unsigned int v23;  // w8
    unsigned long long v24;  // 4102
    unsigned int v25;  // w8
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4102
    unsigned long long v28;  // 4102
    long long v5;  // x0
    unsigned int idx;  // x0
    void* v7;  // x20
    unsigned int v8;  // x0
    unsigned int v9;  // x0
    unsigned long long *v10;  // x9
    unsigned long long *v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a68f38(sub_a7a42c(a1));
    v3 = sub_a6924c(v2, 0, a0->field_0, 58);
    if (v3)
    {
        v4 = a0->field_10;
        v5 = sub_a7a42c(a1);
        idx = sub_a6bffc(128, "crypto/encode_decode/encoder_meth.c", 42);
        if (idx)
        {
            v7 = (void*)idx;
            /* unsupported instruction */;
            *(unsigned int *)(idx + 40) = 1;
            *(unsigned int *)(idx + 8) = v3;
            v8 = sub_a6895c(a0);
            *(unsigned long long *)&v7[16] = v8;
            if (!v8)
            {
                do
                {
                    /* unsupported instruction */;
                    v23 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v28 = arm64g_calculate_condition(19, v23, 1, 0);
                if (!(v28 & 1))
                {
LABEL_a30a48:
                    /* unsupported instruction */;
                    goto LABEL_a30a88;
                }
                goto LABEL_a30a80;
            }
            *(st_a307c8_1 **)&v7[24] = a0;
            v9 = sub_aa5f84(v5, a0->field_8);
            *(unsigned long long *)&v7[32] = v9;
            if (v9)
            {
                v10 = v7 + 120;
                v11 = v7 + 112;
                v12 = v7 + 104;
                v13 = v7 + 96;
                v14 = v7 + 88;
                v15 = v7 + 80;
                v16 = v7 + 72;
                v17 = v7 + 64;
                v18 = v7 + 56;
                v19 = v7 + 48;
                iter = &v4->field_8;
                while (1)
                {
                    v21 = *(int *)((char *)iter - 8);
                    if (5 >= (int)v21)
                    {
                        if ((int)v21 > 2)
                        {
                            if (v21 == 3)
                            {
                                v22 = v17;
                                if (!*v17)
                                    goto LABEL_a308a4;
                            }
                            else if (v21 == 4)
                            {
                                v22 = v16;
                                if (!*v16)
                                    goto LABEL_a308a4;
                            }
                            else if (!(v21 != 5 || (v22 = v15, *v15)))
                            {
                                goto LABEL_a308a4;
                            }
                        }
                        else
                        {
                            if (v21 == 1)
                            {
                                v22 = v19;
                                if (!*v19)
                                    goto LABEL_a308a4;
                            }
                            else if (v21 == 2)
                            {
                                v22 = v18;
                                if (!*v18)
                                    goto LABEL_a308a4;
                            }
                            else if (!v21)
                            {
                                break;
                            }
                        }
                    }
                    else
                    {
                        if ((int)v21 > 10)
                        {
                            if (v21 == 11)
                            {
                                v22 = v12;
                                if (!*v12)
                                {
LABEL_a308a4:
                                    *v22 = *iter;
                                }
                            }
                            else if (v21 == 20)
                            {
                                v22 = v11;
                                if (!*v11)
                                    goto LABEL_a308a4;
                            }
                            else if (!(v21 != 21 || (v22 = v10, *v10)))
                            {
                                goto LABEL_a308a4;
                            }
                        }
                        else
                        {
                            if (v21 == 6)
                            {
                                v22 = v14;
                                if (!*v14)
                                    goto LABEL_a308a4;
                            }
                            else if (!(v21 != 10 || (v22 = v13, *v13)))
                            {
                                goto LABEL_a308a4;
                            }
                        }
                    }
                    iter += 2;
                }
                if ((!*v19 == (!*v18) || !(!*v11 ^ !*v10)) && *v12)
                {
                    if (!a1 || sub_a78c78(a1))
                    {
                        *(long long *)v7 = a1;
                        return v7;
                    }
                    do
                    {
                        /* unsupported instruction */;
                        v23 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v24 = arm64g_calculate_condition(19, v23, 1, 0);
                    if (!(v24 & 1))
                        goto LABEL_a30a48;
LABEL_a30a80:
                    if (1 >= (int)v23)
                    {
LABEL_a30a88:
                        sub_a6c2e4((long long)v7[16], "crypto/encode_decode/encoder_meth.c", 70);
                        sub_aa6fd0((long long)v7[32]);
                        sub_a78ccc(*(long long *)v7);
                        sub_a6c2e4(v7, "crypto/encode_decode/encoder_meth.c", 74);
                    }
                }
                else
                {
                    do
                    {
                        /* unsupported instruction */;
                        v25 = /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v26 = arm64g_calculate_condition(19, v25, 1, 0);
                    if (!(v26 & 1))
                    {
                        /* unsupported instruction */;
                    }
                    else if (1 < (int)v25)
                    {
                        goto LABEL_a30b04;
                    }
                    sub_a6c2e4((long long)v7[16], "crypto/encode_decode/encoder_meth.c", 70);
                    sub_aa6fd0((long long)v7[32]);
                    sub_a78ccc(*(long long *)v7);
                    sub_a6c2e4(v7, "crypto/encode_decode/encoder_meth.c", 74);
LABEL_a30b04:
                    sub_a368c8();
                    sub_a369bc("crypto/encode_decode/encoder_meth.c", 286, "encoder_from_algorithm");
                    sub_a36abc(59, 0xc0108, 0);
                }
            }
            else
            {
                do
                {
                    /* unsupported instruction */;
                    v23 = /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v27 = arm64g_calculate_condition(19, v23, 1, 0);
                if (!(v27 & 1))
                    goto LABEL_a30a48;
                goto LABEL_a30a80;
            }
        }
    }
    a2->field_28 = a2->field_28 | 1;
    return 0;
}
