/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa71e0..0xaa7538 (856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa71e0_0 {
    char padding_0[12];
    char field_c;
} st_aa71e0_0;


char sub_aa71e0(long long a0, char a1, long long a2, char a3)
{
    char v6;  // w24
    st_aa71e0_0 *iter;  // x25
    char v16;  // x0
    char v17;  // x8
    char v18;  // x9
    void* v19;  // x8
    char v20;  // x8
    char v21;  // x9
    void* v22;  // x8
    char v23;  // x0
    unsigned long v24;  // x8
    unsigned long v25;  // cc_dep1
    char v8;  // x9
    unsigned long long v26;  // 4114
    unsigned long v27;  // x9
    unsigned long long v28;  // 4106
    unsigned long long v29;  // 4106
    char v30;  // x28
    unsigned long i;  // x9
    char v33;  // x22
    long long v34;  // x23
    char v35;  // x8
    char v9;  // x8
    unsigned long v36;  // cc_dep1
    unsigned long v37;  // cc_dep2
    long long v38;  // x9
    unsigned long long v39;  // 4108
    unsigned long long v40;  // 4108
    char v41;  // x9
    unsigned long long *v42;  // x8
    char v10;  // x10
    char v11;  // x9
    void* v12;  // x10
    char v13;  // x8
    char v14;  // x9
    void* v15;  // x8
    unsigned long v0;  // [bp-0x80]
    char node;  // [bp-0x78]
    char v2;  // [bp-0x70], Other Possible Types: unsigned long
    long long iter1;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = a3;
    iter1 = a2;
    node = 0;
    if (a1)
    {
        if (*(int *)a1 >= 1)
        {
            v6 = 0;
            iter = a1 + (*(int *)a1 - 1) * 24 + 8;
            do
            {
                if (!*(int *)&iter->padding_0[0])
                    continue;
                v8 = node;
                if (v8)
                {
                    v9 = v2;
                    if (v9)
                    {
                        if (v9 == 1)
                            v10 = 0;
                        else
                            v10 = 44;
                        *(char *)iter1 = v10;
                        iter1 += 1;
                        node = v8 + 1;
                        v11 = 0xffffffffffffffff;
                        v12 = &v2;
                    }
                    else
                    {
                        v12 = &node;
                        v9 = v8;
                        v11 = 1;
                    }
                    *(unsigned long long *)v12 = v9 + v11;
                }
                if (!(iter->field_c & 1))
                {
                    if (*(int *)&iter->padding_0[8] != 2)
                        goto LABEL_aa734c;
                    if (!v2)
                        goto LABEL_aa7310;
                    if (v2 != 1)
                    {
                        v13 = 45;
                        goto LABEL_aa7320;
                    }
                    goto LABEL_aa7308;
                }
                else
                {
                    if (!v2)
                    {
LABEL_aa7310:
                        v15 = &node;
                        v14 = 1;
                        goto LABEL_aa7340;
                    }
                    if (v2 == 1)
                    {
LABEL_aa7308:
                        v13 = 0;
                        goto LABEL_aa7320;
                    }
                    else
                    {
                        v13 = 63;
LABEL_aa7320:
                        *(char *)iter1 = v13;
                        iter1 += 1;
                        node += 1;
                        v14 = 0xffffffffffffffff;
                        v15 = &v2;
LABEL_aa7340:
                        *(long long *)v15 = *(long long *)v15 + v14;
LABEL_aa734c:
                        v16 = sub_aa7d48(a0, *(int *)&iter->padding_0[0]);
                        if (!v16)
                            return v16;
                        sub_aa7538();
                        if (*(int *)&iter->padding_0[8])
                        {
                            if (*(int *)&iter->padding_0[8] != 1)
                                continue;
                            if (v2)
                            {
                                if (v2 == 1)
                                    v17 = 0;
                                else
                                    v17 = 33;
                                *(char *)iter1 = v17;
                                iter1 += 1;
                                node += 1;
                                v18 = 0xffffffffffffffff;
                                v19 = &v2;
                            }
                            else
                            {
                                v19 = &node;
                                v18 = 1;
                            }
                            *(long long *)v19 = *(long long *)v19 + v18;
                        }
                        if (v2)
                        {
                            if (v2 == 1)
                                v20 = 0;
                            else
                                v20 = 61;
                            *(char *)iter1 = v20;
                            iter1 += 1;
                            node += 1;
                            v21 = 0xffffffffffffffff;
                            v22 = &v2;
                        }
                        else
                        {
                            v22 = &node;
                            v21 = 1;
                        }
                        *(long long *)v22 = *(long long *)v22 + v21;
                        if (*(int *)&iter->padding_0[4] != 1)
                        {
                            if (!*(int *)&iter->padding_0[4])
                            {
                                v23 = sub_aa7e10(a0, *(int *)&iter[1].padding_0[3]);
                                if (!v23)
                                    return v23;
                                sub_aa7538();
                            }
                            else
                            {
                                return 0;
                            }
                        }
                        v24 = *(long long *)&iter[1].padding_0[3];
                        v25 = v24;
                        v26 = arm64g_calculate_condition(84, v24, 0, 0);
                        if (v26 & 1)
                        {
                            v27 = v24;
                            v28 = arm64g_calculate_condition(164, v25, 0, 0);
                            if (!(v28 & 1))
                                goto LABEL_aa7456;
                            goto LABEL_aa7455;
                        }
                        else
                        {
                            v27 = -v24;
                            v29 = arm64g_calculate_condition(164, v25, 0, 0);
                            if (v29 & 1)
                            {
LABEL_aa7455:
                                v30 = 1;
                                goto LABEL_aa7458;
                            }
                            else
                            {
LABEL_aa7456:
                                v30 = 2;
LABEL_aa7458:
                                if (v27 >= 10)
                                {
                                    do
                                    {
                                        i = v27;
                                        v30 += 1;
                                        v27 = i / 10;
                                    } while (99 < i);
                                }
                                v33 = v2;
                                node += v30;
                                if (!v33)
                                    continue;
                                v34 = iter1;
                                v0 = v24;
                                sub_9d5b44(v34, v33, "%lld");
                                v35 = v33 - v30;
                                v36 = v33;
                                v37 = v30;
                                if (v33 < v30)
                                {
                                    v38 = v34 + v33;
                                    v39 = arm64g_calculate_condition(52, v36, v37, 0);
                                    if (!(v39 & 1))
                                        goto LABEL_aa74ae;
                                    goto LABEL_aa74ad;
                                }
                                else
                                {
                                    v38 = v34 + v30;
                                    v40 = arm64g_calculate_condition(52, v36, v37, 0);
                                    if (v40 & 1)
                                    {
LABEL_aa74ad:
                                        v35 = 0;
                                        goto LABEL_aa74b0;
                                    }
                                    else
                                    {
LABEL_aa74ae:
LABEL_aa74b0:
                                        v2 = v35;
                                        iter1 = v38;
                                    }
                                }
                            }
                        }
                    }
                }
            } while ((v6 += 1, iter = (char *)iter - 24, *(int *)a1 > v6));
            a3 = v2;
        }
        if (a3)
        {
            *(char *)iter1 = 0;
            node += 1;
            v41 = 0xffffffffffffffff;
            v42 = &v2;
        }
        else
        {
            v42 = &node;
            v41 = 1;
        }
        *v42 = *v42 + v41;
        return node;
    }
    else if (a3)
    {
        *(char *)a2 = 0;
        return 1;
    }
    else
    {
        return 1;
    }
}
