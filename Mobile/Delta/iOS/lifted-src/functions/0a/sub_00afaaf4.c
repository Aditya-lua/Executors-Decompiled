/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafaaf4..0xafaf90 (1180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afaaf4_3 {
    char padding_0[4];
    unsigned int field_4;
    struct st_afaaf4_4 *field_8;
} st_afaaf4_3;

typedef struct st_afaaf4_2 {
    long long field_0;
    struct st_afaaf4_1 *field_8;
    unsigned int field_10;
} st_afaaf4_2;

typedef struct st_afaaf4_0 {
    long long field_0;
    char padding_8[16];
    long long field_18;
    unsigned int field_20;
} st_afaaf4_0;

typedef struct st_afaaf4_1 {
    char padding_0[4];
    unsigned int field_4;
} st_afaaf4_1;

typedef struct st_afaaf4_4 {
    char field_0;
} st_afaaf4_4;

extern long long g_afaf94;
extern long long g_eba938;
extern long long g_ebaaa0;

unsigned long long sub_afaaf4(st_afaaf4_0 *a0)
{
    unsigned long long v6;  // x19
    unsigned long long v7;  // x22
    unsigned long long v16;  // w0
    unsigned long long v17;  // 4117
    char *v18;  // x27
    unsigned long v19;  // x28
    unsigned long long v20;  // w19
    unsigned long v21;  // x26
    char *v22;  // x19
    unsigned long v23;  // x26
    unsigned long long node;  // w27
    unsigned long long v8;  // x23
    char *iter;  // x28
    unsigned long v27;  // x0
    unsigned long v28;  // x24
    char *v29;  // x24
    char *v30;  // x8
    long long v32;  // x1
    unsigned long long v33;  // x21
    unsigned long long v34;  // x23
    unsigned long long v35;  // x0
    unsigned int v9;  // w27
    unsigned long long v36;  // x20
    unsigned long long v37;  // x22
    unsigned long long v38;  // x0
    st_afaaf4_2 *v10;  // x26
    unsigned long long v11;  // x0
    unsigned long long v12;  // x21
    unsigned long long v13;  // x0
    st_afaaf4_3 *v14;  // x25
    st_afaaf4_1 *v15;  // x26
    unsigned long long v0;  // [bp-0x80]
    unsigned int v1;  // [bp-0x74]
    unsigned long long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    sub_a6c2e4(a0->field_18, "crypto/x509/x_name.c", 319);
    a0->field_18 = 0;
    if (!sub_ad69e4(a0->field_0))
    {
        a0->field_20 = 0;
        return 1;
    }
    v6 = sub_ad61b4();
    if (!v6)
    {
        sub_a368c8();
        v32 = 328;
        goto LABEL_afad60;
    }
    if ((int)sub_ad69e4(a0->field_0) >= 1)
    {
        v7 = 0;
        v8 = 0;
        v9 = 0xffffffff;
        v0 = v6;
        while (1)
        {
            v10 = sub_ad69f8(a0->field_0, v7);
            if (v10->field_10 != v9)
            {
                v11 = sub_ad61b4();
                if (!v11)
                    break;
                v8 = v11;
                if (sub_ad68a0(v6, v8))
                {
                    v9 = v10->field_10;
                }
                else
                {
                    sub_a368c8(sub_ad6020(v8));
                    v32 = 339;
LABEL_afad60:
                    sub_a369bc("crypto/x509/x_name.c", v32, "x509_name_canon");
                    sub_a36abc(11, 0x8000f, 0);
                }
            }
            v12 = sub_9cde20(&g_eba938);
            if (v12)
            {
                v13 = sub_a9ad24(v10->field_0);
                *(unsigned long long *)v12 = v13;
                if (v13)
                {
                    v14 = *(long long *)(v12 + 8);
                    v15 = v10->field_8;
                    if (sub_9cacc4(v15->field_4) & 10582)
                    {
                        v14->field_4 = 12;
                        v16 = (unsigned int)sub_9c3fc4(&v14->field_8, v15);
                        *(unsigned int *)v14->padding_0 = v16;
                        v17 = arm64g_calculate_condition(1, v16, 1, 0);
                        if (v17 & 1)
                        {
                            sub_9cd960(v12, &g_eba938);
                            sub_ad6958(v6, &g_afaf94);
                            return 0;
                        }
                        v1 = v9;
                        if (v16 >= 1)
                        {
                            v18 = v14->field_8;
                            v19 = v16;
                            v20 = v16 + 1;
                            v21 = v19;
                            do
                            {
                                if (!sub_a6994c(*v18, 8))
                                {
                                    v22 = (char *)&v14->field_8[v19] - 1;
                                    do
                                    {
                                        v23 = v21;
                                        if (!sub_a6994c(*v22, 8))
                                        {
                                            node = 0;
                                            iter = v14->field_8;
                                            v6 = v0;
                                            do
                                            {
                                                v27 = *v18;
                                                if (v27 >> 31 & 1)
                                                {
                                                    v28 = v18 + 1;
                                                }
                                                else
                                                {
                                                    if (sub_a6994c(v27, 8))
                                                    {
                                                        *iter = 32;
                                                        do
                                                        {
                                                            v29 = v18;
                                                            v28 = v29 + 1;
                                                            node += 1;
                                                            v18 = v28;
                                                        } while (sub_a6994c(v29[1], 8));
                                                    }
                                                    else
                                                    {
                                                        v28 = v18 + 1;
                                                        v27 = sub_a69994(*v18);
                                                    }
                                                }
                                                *iter = v27;
                                                node += 1;
                                            } while ((iter += 1, v18 = v28, (int)v23 > node));
                                            v30 = v14->field_8;
                                            goto LABEL_afac90;
                                        }
                                    } while ((v21 = (unsigned int)v23 - 1, v22 -= 1, 1 < (int)v23));
                                }
                            } while ((v18 += 1, v21 -= 1, v20 -= 1, 1 < v20));
                        }
                        v30 = v14->field_8;
                        iter = v30;
                        v6 = v0;
LABEL_afac90:
                        *(unsigned int *)v14->padding_0 = iter - v30;
                        v9 = v1;
                    }
                    else if (!sub_9c7710(v14, v15))
                    {
                        sub_9cd960(v12, &g_eba938);
                        sub_ad6958(v6, &g_afaf94);
                        return 0;
                    }
                    if (!sub_ad68a0(v8, v12))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/x_name.c", 357, "x509_name_canon");
LABEL_afaf1c:
                        sub_a36abc(11);
                        sub_9cd960(v12, &g_eba938);
                        sub_ad6958(v6, &g_afaf94);
                        return 0;
                    }
                    v7 = (unsigned int)v7 + 1;
                    if ((int)v7 >= (int)sub_ad69e4(a0->field_0))
                        goto LABEL_afad80;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/x_name.c", 351, "x509_name_canon");
LABEL_afaeec:
                    goto LABEL_afaf1c;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x_name.c", 346, "x509_name_canon");
                goto LABEL_afaeec;
            }
        }
    }
    else
    {
LABEL_afad80:
        if ((int)sub_ad69e4(v6) >= 1)
        {
            v33 = 0;
            v34 = 0;
            do
            {
                v3 = sub_ad69f8(v6, v33);
                v35 = sub_9ccc84(&v3, 0, &g_ebaaa0, 0xffffffff, 0xffffffff);
                if (v35 >> 31 & 1 || (int)((unsigned int)v35 ^ 0x7fffffff) < (int)v34)
                    goto LABEL_afad78;
            } while ((v34 += v35, v33 = (unsigned int)v33 + 1, (int)v33 < (int)sub_ad69e4(v6)));
            goto LABEL_afadf8;
        }
        else
        {
            v34 = 0;
LABEL_afadf8:
            a0->field_20 = v34;
            v2 = sub_a6bf4c(v34 & 0xffffffff, "crypto/x509/x_name.c", 369);
            if (v2)
            {
                a0->field_18 = v2;
                if ((int)sub_ad69e4(v6) >= 1)
                {
                    v36 = 0;
                    v37 = 0;
                    do
                    {
                        v3 = sub_ad69f8(v6, v36);
                        v38 = sub_9ccc84(&v3, &v2, &g_ebaaa0, 0xffffffff, 0xffffffff);
                    } while (!(v38 >> 31 & 1) && (int)((unsigned int)v38 ^ 0x7fffffff) >= (int)v37 && (v37 += v38, v36 = (unsigned int)v36 + 1, (int)v36 < (int)sub_ad69e4(v6)));
                }
                sub_9cd960(0, &g_eba938);
                sub_ad6958(v6, &g_afaf94);
                return 1;
            }
        }
    }
LABEL_afad78:
    sub_9cd960(0, &g_eba938);
    sub_ad6958(v6, &g_afaf94);
    return 0;
}
