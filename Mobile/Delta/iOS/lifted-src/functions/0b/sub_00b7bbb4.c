/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7bbb4..0xb7c04c (1176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7bbb4_8 {
    long long field_0;
    struct st_b7bbb4_7 *field_8;
} st_b7bbb4_8;

typedef struct st_b7bbb4_1 {
    char padding_0[8];
    struct st_b7bbb4_1 *field_8;
    struct st_b7bbb4_0 *field_10;
} st_b7bbb4_1;

typedef struct st_b7bbb4_7 {
    char padding_0[24];
    struct st_b7bbb4_5 *field_18;
} st_b7bbb4_7;

typedef struct st_b7bbb4_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
} st_b7bbb4_0;

typedef struct st_b7bbb4_3 {
    unsigned long long field_0;
    char padding_8[24];
    long long field_20;
} st_b7bbb4_3;

typedef struct st_b7bbb4_4 {
    char padding_0[8];
    struct st_b7bbb4_1 *field_8;
    struct st_b7bbb4_2 *field_10;
    char padding_18[8];
    struct st_b7bbb4_3 *field_20;
    char padding_28[8];
    char field_30;
} st_b7bbb4_4;

typedef struct st_b7bbb4_2 {
    char padding_0[64];
    unsigned long long field_40;
} st_b7bbb4_2;

typedef struct st_b7bbb4_5 {
    unsigned long long field_0;
} st_b7bbb4_5;

extern unsigned long long g_b7df84;
extern unsigned long long g_b8bcfc;
extern long long g_cb89e0;
extern long long g_cb8a17;
extern long long g_cba67f;
extern long long g_ef8008;

unsigned long long sub_b7bbb4(st_b7bbb4_8 **a0, st_b7bbb4_4 *a1)
{
    unsigned long v6;  // x23
    st_b7bbb4_2 *v7;  // x21
    st_b7bbb4_1 *v8;  // x24
    unsigned long long v9;  // x9
    unsigned long long v10;  // 4116
    st_b7bbb4_1 *iter;  // x25
    st_b7bbb4_0 *v12;  // x8
    st_b7bbb4_8 *v13;  // x20
    st_b7bbb4_1 *v0;  // [bp-0x80]
    st_b7bbb4_1 *v1;  // [bp-0x78], Other Possible Types: unsigned long long *
    st_b7bbb4_5 **v2;  // [bp-0x70], Other Possible Types: st_b7bbb4_1 **
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1->field_30;
    if (v6 & 1)
        *a0->field_8->field_18();
    v7 = a1->field_10;
    if (v7 == 1)
    {
        if (a1->padding_28 != 1 || a1->field_20->field_0 != 10)
        {
LABEL_b7bdc8:
            v8 = a1->field_8;
            v1 = v8;
            if (v8->padding_0 != 9223372036854775810)
            {
LABEL_b7bd98:
                v2 = &v1;
                v3 = &g_b7df84;
                if (!(sub_be769c(*a0->field_0, *a0->field_8, &g_cba67f, &v2) & 1))
                    goto LABEL_b7bdf8;
            }
            else
            {
LABEL_b7bde8:
                if (!(sub_b79b20(a0, &v8->field_8) & 1))
                {
LABEL_b7bdf8:
                    if (v7 != 1)
                        *a0->field_8->field_18();
LABEL_b7be00:
                    if (a1->padding_28)
                    {
                        *a0->field_8->field_18();
                    }
                    else if (!(v6 & 1))
                    {
                        sub_c73c80("assertion failed: assign.prefix -- parallelrepeat\nuntil return", 31, &g_ef8008);
                        /* unsupported instruction */;
                        sub_c7573c(&v7->padding_0[8]);
                        if (v7->field_40 != 0x8000000000000000 && !(v1 = &v7->field_40, v2 = &v1, v3 = &g_b8bcfc, !sub_be769c(*a0->field_0, *a0->field_8, &g_cb89e0, &v2)))
                        {
                            while (1)
                            {
                                /* unsupported instruction */;
                                if (/* unsupported instruction */ != 1)
                                    break;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                if (!(/* unsupported instruction */ ^ 1))
                                    return 1;
                            }
                            /* unsupported instruction */;
                            sub_c75418(a1);
                        }
                        else
                        {
                            while (1)
                            {
                                /* unsupported instruction */;
                                if (/* unsupported instruction */ != 1)
                                    break;
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                                if (!(/* unsupported instruction */ ^ 1))
                                {
                                    if (sub_b7ade4(a0, 8) & 1)
                                        return 1;
                                    *a0->field_8->field_18();
                                }
                            }
                            /* unsupported instruction */;
                            sub_c75418(a1);
                            if (!(sub_b7ade4(a0, 8) & 1))
                                *a0->field_8->field_18();
                        }
                    }
                    else if (a1[1].padding_0[0] == 1)
                    {
                        *a0->field_8->field_18();
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
LABEL_b7bf14:
            return 1;
        }
        v8 = a1->field_8;
        if (!(v6 & 1))
        {
            v9 = (unsigned long long)(v8->padding_0 ^ 0x8000000000000000);
            v10 = arm64g_calculate_condition(0x44, v8->padding_0, 0, 0);
            if (!(v10 & 1))
                v9 = 1;
            if (v9 == 1)
                goto LABEL_b7bc94;
            if (v9 != 2)
                goto LABEL_b7bdc8;
            iter = v8;
        }
        else
        {
LABEL_b7bc94:
            v0 = v8;
            v13 = *a0;
            v2 = &v0;
            v3 = &g_b7df84;
            if (sub_be769c(v13->field_0, v13->field_8, &g_cb8a17, &v2) & 1)
            {
                return 1;
            }
            else if (!(sub_b7a80c(v13, a1->field_20->field_20) & 1))
            {
                v13->field_8->field_18();
            }
            goto LABEL_b7bf14;
        }
        while (1)
        {
            v12 = iter->field_10;
            if (v12->field_0 != 6 || v12->padding_8 < 0 || !sub_b7c6ec(v12->field_10, v12->field_18))
                break;
            iter = iter->field_8;
            if (iter->padding_0 != 7)
            {
                if (2 > iter->padding_0)
                    goto LABEL_b7bc94;
                break;
            }
        }
    }
    else
    {
        v8 = a1->field_8;
    }
    if (!v7)
        goto LABEL_b7be00;
    v1 = v8;
    if (v8->padding_0 == 9223372036854775810)
        goto LABEL_b7bde8;
    goto LABEL_b7bd98;
}
