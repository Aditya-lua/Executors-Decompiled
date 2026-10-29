/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42688..0x42aa0 (1048 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_42688_1 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_42688_1;

typedef struct st_42688_7 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_42688_7;

typedef struct st_42688_6 {
    unsigned int field_0;
    char field_4;
    char padding_5[35];
    char field_28;
    char field_29;
} st_42688_6;

typedef struct st_42688_4 {
    char padding_0[4];
    char field_4;
    char padding_5[19];
    char field_18;
    char padding_19[16];
    char field_29;
} st_42688_4;

typedef struct st_42688_2 {
    char padding_0[32];
    struct st_42688_3 *field_20;
    unsigned long long field_28;
    struct st_42688_3 *field_30;
} st_42688_2;

typedef struct st_42688_3 {
    long long field_0;
} st_42688_3;

typedef struct st_42688_0 {
    char field_0;
} st_42688_0;


unsigned long long sub_42688(st_42688_1 *a0, st_42688_2 *a1)
{
    long long v11;  // x0
    unsigned long long v12;  // x0
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // x22
    unsigned long long v24;  // x27
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    st_42688_6 *v29;  // x21
    unsigned int v30;  // w2
    unsigned long long v13;  // x21
    unsigned long v31;  // x23
    unsigned long long v32;  // x21
    unsigned long v33;  // x8
    unsigned long long v34;  // x10
    st_42688_4 *v35;  // x9
    unsigned long long l;  // x12
    unsigned long long v37;  // x11
    char *iter;  // x14
    char v39;  // x15
    unsigned long long v40;  // x10
    unsigned long long i;  // x22
    unsigned long long m;  // x8
    char *node;  // x9
    unsigned long long v43;  // x8
    st_42688_4 *iter1;  // x21
    st_42688_4 *v46;  // x22
    unsigned long long v47;  // x23
    st_42688_7 *v15;  // x8
    unsigned long j;  // x21
    unsigned long long v17;  // x24
    unsigned long long idx;  // x28
    unsigned long long v19;  // x25
    unsigned long long v20;  // x8
    st_42688_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_42688_0 *v1;  // [bp-0xb8]
    st_42688_4 *v2;  // [bp-0xb0]
    st_42688_4 *v3;  // [bp-0xa8]
    st_42688_4 **v4;  // [bp-0x98], Other Possible Types: uint128_t
    uint128_t v5;  // [bp-0x88]
    unsigned long v6;  // [bp-0x78]
    st_42688_1 *v7;  // [bp-0x70]
    unsigned int v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v7 = a0;
    v8 = a0->field_5fc;
    if (a1->field_28 == 1 && *(long long *)&a1[1].padding_0[0] == 1)
    {
        sub_3e1e0(a0, *(long long *)a1->field_20, &v7);
        if (*(unsigned int *)&v4)
        {
            v11 = sub_385b8(a0);
            sub_395b0(a0, *(long long *)a1->field_20);
            v12 = sub_45198(a0, &v4, v11, 1, *(long long *)a1->field_20);
        }
        else
        {
            v12 = sub_47e48(a0);
        }
    }
    else
    {
        sub_48600(&v2);
        if (a1->field_28)
        {
            v13 = 0;
            i = 0;
            do
            {
                sub_3e1e0(a0, *(long long *)&a1->field_20[i], &v7);
                v15 = &v2->padding_0[v13];
                v15->field_20 = v6;
                v15->field_0 = v4;
                v15->field_10 = v5;
                i += 1;
                v13 += 48;
            } while (i < a1->field_28);
        }
        sub_44b88(a0, a1, &v2, &a1->field_30);
        j = a1->field_28;
        if (j)
        {
            v17 = 0;
            idx = 0;
            v19 = 89;
            do
            {
                v20 = *(long long *)&a1[1].padding_0[0];
                v21 = idx;
                v22 = v20;
                if (v20 <= idx)
                    break;
                v23 = *(long long *)&a1->field_30[idx];
                v24 = idx + 1;
                if (v24 == v20)
                {
                    v25 = arm64g_calculate_condition(4, v21, v22, 0);
                    v26 = arm64g_calculate_condition(132, (v25 & 1 ? j : 0), (v25 & 1 ? v20 : 0), 0);
                    if (v26 & 1)
                        goto LABEL_42860;
                    goto LABEL_42838;
                }
                else
                {
                    v27 = arm64g_calculate_condition(4, v21, v22, 0);
                    v28 = arm64g_calculate_condition(128, (v27 & 1 ? j : 0), (v27 & 1 ? v20 : 0), 0);
                    if (!(v28 & 1))
                    {
LABEL_42838:
                        v29 = (char *)v2 + 48 * idx;
                        if (!v29->field_0)
                        {
                            v30 = v29->field_28;
                            if (v30 == 0xff)
                                v30 = v29->field_4;
                            v29->field_29 = v30;
                            sub_47e48(a0, v23);
                        }
                        else
                        {
                            v29->field_29 = sub_385b8(a0, v23, &v7);
                        }
                    }
                    else
                    {
LABEL_42860:
                        v31 = (unsigned int)(j - v20) + 1;
                        v32 = sub_3b87c(a0, a1, v31);
                        sub_3b0cc(a0, v23, v32, (unsigned int)v31 & 0xff, 1);
                        v33 = a1->field_28;
                        v34 = v33 - idx;
                        if (v33 <= idx)
                            continue;
                        v35 = v2;
                        if (v34 > 1)
                        {
                            l = 0;
                            v37 = v34 & 0xfffffffffffffffe;
                            idx += v37;
                            iter = &v35->padding_0[v19];
                            do
                            {
                                v39 = (char)v32 + (char)l;
                                *(iter - 48) = v39;
                                *iter = v39 + 1;
                                iter += 96;
                                l += 2;
                            } while ((v33 + v17 & 0xfffffffffffffffe) != l);
                            if (v34 == v37)
                                continue;
                        }
                        v40 = idx + v17;
                        m = v33 - idx;
                        node = (char *)v35 + 48 * idx + 41;
                        do
                        {
                            v43 = m;
                            *node = (char)v32 + (char)v40;
                            node += 48;
                            v40 += 1;
                            m = v43 - 1;
                        } while (m);
                    }
                }
            } while ((j = a1->field_28, v17 -= 1, v19 += 48, idx = v24, j > v24));
        }
        for (; j < (unsigned long long)*(long long *)&a1[1].padding_0[0]; j += 1)
        {
            sub_4716c(a0, *(long long *)&a1->field_30[j]);
        }
        iter1 = v2;
        v46 = v3;
        if (iter1 != v46)
        {
            v47 = 0;
            do
            {
                if (iter1->padding_0)
                {
                    sub_38fe4(a0, &iter1->field_18);
                    sub_45198(a0, iter1, iter1->field_29, 1);
                }
            } while ((v47 += 1, iter1 = &iter1[1].padding_5[1], iter1 != v46));
            iter1 = v2;
            v46 = v3;
        }
        for (; iter1 != v46; iter1 = &iter1[1].padding_5[1])
        {
            if (!iter1->padding_0 && iter1->field_29 != iter1->field_4)
                sub_2ad10(a0->field_0, 6);
        }
        v4 = &v2;
        v12 = sub_248e4(&v4);
    }
    v7->field_5fc = v8;
    return v12;
}
