/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x955e34..0x9562c4 (1168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_955e34_0 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_955e34_0;

typedef struct st_955e34_2 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    struct st_955e34_0 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[44];
    unsigned int field_78;
    char padding_7c[916];
    unsigned int field_410;
    unsigned int field_414;
    char padding_418[1128];
    struct st_955e34_1 *field_880;
    char padding_888[296];
    unsigned long long field_9b0;
    char padding_9b8[656];
    unsigned long long field_c48;
} st_955e34_2;

typedef struct st_955e34_3 {
    char padding_0[36];
    unsigned int field_24;
} st_955e34_3;

typedef struct st_955e34_1 {
    char padding_0[30];
    char field_1e;
    char padding_1f[1];
    unsigned long long field_20;
} st_955e34_1;


unsigned long long sub_955e34(st_955e34_2 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x28
    unsigned long long v16;  // x28
    unsigned long long v17;  // x21
    unsigned long long v18;  // x22
    unsigned long long v19;  // x9
    unsigned long long ptr;  // x0
    st_955e34_1 *v21;  // x8
    unsigned long v22;  // x8
    unsigned int v23;  // w8
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v8;  // x0
    unsigned long long v26;  // x25
    unsigned int *v27;  // x26
    unsigned long v28;  // cc_dep1
    unsigned long long v29;  // 4111
    unsigned long long v30;  // 4111
    unsigned long long v31;  // x8
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // x10
    unsigned long long v34;  // x8
    unsigned long long v35;  // 4110
    unsigned long long v9;  // x23
    unsigned long long v36;  // 4105
    unsigned long long v37;  // w8
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4105
    unsigned long long v40;  // x0
    unsigned long long v41;  // x27
    unsigned long long v42;  // x26
    unsigned long long v10;  // x24
    st_955e34_3 *v11;  // x0
    unsigned long v12;  // x24
    st_955e34_3 *v13;  // x0
    unsigned long long v14;  // x24
    st_955e34_3 *v15;  // x0
    unsigned int v0;  // [bp-0x7c]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a2;
    if (a0->field_880->field_1e & 3)
    {
LABEL_955e6c:
        v7 = 0;
        v2 = a1;
        a1 = v6;
    }
    else if (!(a0->field_9b0 >> 22 & 1))
    {
        v7 = 0;
        v2 = v6;
    }
    else
    {
        if (!(a0->field_9b0 >> 21 & 1))
            goto LABEL_955e6c;
        if ((int)sub_ad69e4(a1) >= 1 && *(int *)(sub_ad69f8(a1, 0) + 36) == 0x80000)
        {
            v8 = sub_ad69e4(v6);
            if ((int)v8 >= 1)
            {
                v9 = v8;
                v10 = 0;
                do
                {
                    v11 = sub_ad69f8(v6, v10);
                    if (v11->field_24 == 0x80000)
                    {
                        v7 = sub_ad61e0(0, v9);
                        if (!v7)
                            goto LABEL_955f00;
                        sub_ad68a0(v7, v11);
                        v12 = (unsigned int)v10 + 1;
                        if ((int)v12 < (int)v9)
                        {
                            do
                            {
                                v13 = sub_ad69f8(v6, v12);
                                if (v13->field_24 == 0x80000)
                                    sub_ad68a0(v7, v13);
                            } while ((v12 = (unsigned int)v12 + 1, (unsigned int)v9 != (unsigned int)v12));
                        }
                        v14 = 0;
                        do
                        {
                            v15 = sub_ad69f8(v6, v14);
                            if (v15->field_24 != 0x80000)
                                sub_ad68a0(v7, v15);
                        } while ((v14 = (unsigned int)v14 + 1, (unsigned int)v9 != (unsigned int)v14));
                        v2 = a1;
                        a1 = v7;
                        goto LABEL_955f04;
                    }
                } while ((v10 = (unsigned int)v10 + 1, (unsigned int)v9 != (unsigned int)v10));
            }
        }
        v7 = 0;
LABEL_955f00:
        v2 = a1;
        a1 = v6;
    }
LABEL_955f04:
    v16 = v7;
    if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        if (!*(long long *)&a0->padding_888[240])
            goto LABEL_955f64;
        v17 = *(long long *)&a0->padding_7c[156];
        if (v17)
        {
            v18 = 0;
            do
            {
                if (v18 >> 31 & 1 || (int)v17 <= (int)v18)
                    continue;
                if (!a0->field_78)
                    v19 = 5528;
                else
                    v19 = 5544;
                if (*(long long *)((char *)a0 + v19))
                {
                    ptr = _memchr();
                    v21 = a0->field_880;
                    if (ptr)
                    {
                        v22 = a0->field_880->field_20 + ((unsigned int)v18 & 0x7fffffff) * 40;
                        goto LABEL_95615c;
                    }
                }
                else
                {
                    v21 = a0->field_880;
                }
                v22 = v21->field_20 + ((unsigned int)v18 & 0x7fffffff) * 40;
                if (!*(long long *)v22)
                    continue;
LABEL_95615c:
                if (*(long long *)(v22 + 8))
                    goto LABEL_95620c;
            } while ((v18 += 1, v17 != v18));
            v18 = v17;
        }
        else
        {
            v18 = 0;
        }
LABEL_95620c:
        v23 = v18 != v17;
    }
    else
    {
        sub_96c74c(a0);
        sub_961c98(a0);
LABEL_955f64:
        v23 = 1;
    }
    v0 = v23;
    v1 = v16;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v24 = 0;
        v25 = 0;
        v3 = 0;
        v26 = 0;
        do
        {
            v27 = sub_ad69f8(a1, v25);
            v28 = (int)a0->field_18->field_d8[80] & 8;
            if (!((int)a0->field_18->field_d8[80] & 8))
            {
                v29 = arm64g_calculate_condition(9, v28, 0, 0);
                if (!(v29 & 1))
                    goto LABEL_955fee;
                goto LABEL_955fed;
            }
            else
            {
                v30 = arm64g_calculate_condition(9, v28, 0, 0);
                if (v30 & 1)
                {
LABEL_955fed:
                    v31 = 48;
                    goto LABEL_955ff0;
                }
                else
                {
LABEL_955fee:
                    v31 = 56;
LABEL_955ff0:
                    if (sub_9ae69c() >> 31 & 1 || 0 < (int)sub_9ae69c(a0, a0->field_48, *(int *)((char *)v27 + v31)))
                        continue;
                    if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
                    {
                        v26 = v27[7];
                        v32 = v26 & 456;
                        v3 = v27[8];
                        if (v26 & 456 && !*(long long *)&a0->padding_888[240])
                            continue;
                        v33 = a0->field_c48 & 32;
                        v34 = (a0->field_414 | v33 * 2) & v3;
                        if ((v33 | a0->field_410) & v26)
                        {
                            v35 = arm64g_calculate_condition(26, v32, 0, 0);
                            v36 = arm64g_calculate_condition(4, (v35 & 1 ? v34 : 0x40000000), 0, 0);
                            v37 = (unsigned int)!(v36 & 1);
                            if (!(v26 >> 2 & 1))
                                goto LABEL_9560a0;
                        }
                        else
                        {
                            v38 = arm64g_calculate_condition(26, v32, 0, 0);
                            v39 = arm64g_calculate_condition(0, (v38 & 1 ? v34 : 0x40000000), 0, 0);
                            v37 = (unsigned int)!(v39 & 1);
                            if (!(v26 >> 2 & 1))
                                goto LABEL_9560a0;
                        }
                        if (v37)
                        {
                            if (!sub_9690cc(a0, v27[6]))
                                continue;
                            goto LABEL_9560b4;
                        }
LABEL_9560a0:
                        if ((!(v26 & 4) & v37) != 1)
                            continue;
                        goto LABEL_9560b4;
                    }
                    else
                    {
LABEL_9560b4:
                        v40 = sub_ad66d4(v2, v27);
                        if (v40 >> 31 & 1 || (v41 = v40, !sub_959e54(a0, 0x10002, v27[0x11], 0, v27)))
                            continue;
                        if (!(v26 >> 2 & 1) || !(v3 >> 3 & 1) || !a0->padding_418[196])
                        {
                            v42 = sub_ad69f8(v2, v41);
                            if (v0 & 1 || sub_95a688(a0->field_8, *(int *)(v42 + 64)) && sub_a509f4())
                                break;
                            if (!v24)
                                v24 = v42;
                        }
                        else if (!v24)
                        {
                            v24 = sub_ad69f8(v2, v41);
                        }
                    }
                }
            }
        } while ((v25 = (unsigned int)v25 + 1, v42 = v24, (int)sub_ad69e4(a1) > (int)v25));
    }
    else
    {
        v42 = 0;
    }
    sub_ad6020(v1);
    return v42;
}
