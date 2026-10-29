/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb17d4..0xbb1d1c (1352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb17d4_0 {
    long long field_0;
    struct st_bb17d4_1 *field_8;
    char padding_10[8];
    struct st_bb17d4_1 *field_18;
} st_bb17d4_0;

typedef struct st_bb17d4_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    char field_20;
    char padding_21[505];
    unsigned short field_21a;
} st_bb17d4_2;

typedef struct st_bb17d4_1 {
    unsigned long long field_0;
} st_bb17d4_1;

extern long long g_ef8cb0;
extern long long g_ef8cc8;

void sub_bb17d4(unsigned long long *a0, st_bb17d4_2 *a1, unsigned long long iter, st_bb17d4_0 *a3)
{
    long long v2;  // x11
    unsigned long long *v3;  // x8
    char v13;  // x16
    unsigned long long l;  // w16
    unsigned long long *v15;  // x11
    unsigned long long v16;  // x15
    unsigned long long v17;  // x13
    char v19;  // x16
    unsigned long long m;  // w16
    unsigned long long v21;  // x13
    unsigned long long v4;  // x12
    unsigned long long v22;  // x15
    unsigned long long *v23;  // x12
    unsigned long long v24;  // x16
    unsigned long long v25;  // x15
    char v27;  // x17
    unsigned long long j;  // w17
    unsigned long long v29;  // x12
    unsigned long long *v30;  // x15
    unsigned long long v31;  // x16
    unsigned long long *v5;  // x9
    unsigned long long v32;  // x12
    char v34;  // x17
    unsigned long long k;  // w17
    unsigned long long v36;  // x10
    st_bb17d4_2 *v37;  // x16
    st_bb17d4_2 *v38;  // x1
    unsigned long long *v39;  // x11
    unsigned long long n;  // x3
    unsigned long long v41;  // x17
    unsigned long long v6;  // 4102
    char v43;  // x4
    unsigned long long v44;  // w4
    unsigned long long *v45;  // x11
    unsigned long long i0;  // x3
    unsigned long long v47;  // x17
    char v49;  // x4
    unsigned long long v50;  // w4
    unsigned long v51;  // cc_dep1
    unsigned long long v7;  // x10
    unsigned long long v52;  // 4106
    unsigned long long v53;  // 4106
    unsigned long long *v54;  // x12
    unsigned long long v55;  // x3
    unsigned long long v56;  // x17
    char v58;  // x4
    unsigned long long i1;  // w4
    unsigned long long *v60;  // x17
    unsigned long long v61;  // x3
    unsigned long long v8;  // x13
    unsigned long long v62;  // x12
    char v64;  // x4
    unsigned long long i2;  // w4
    unsigned long long *v9;  // x11
    unsigned long long v10;  // x15
    unsigned long long v11;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3->field_0;
    v3 = a3->field_8;
    v4 = (unsigned long long)a3->padding_10;
    v5 = a3->field_18;
    if (v2)
    {
        if (v2 == 1)
        {
            if (!v4)
                goto LABEL_bb1820;
            switch (v4)
            {
            case 1:
                if (*v3 == *v5)
                    sub_c73b38("range start and end are equal and excluded in BTreeMap", 109, &g_ef8cb0);
                v6 = arm64g_calculate_condition(148, *v3, *v5, 0);
                if (!(v6 & 1))
                {
                    sub_c73b38("range start is greater than range end in BTreeMapassertion failed: self.height > 0assertion failed: old_right_len + count <= CAPACITYassertion failed: old_left_len >= countassertion failed: old_left_len + count <= CAPACITYassertion failed: old_right_len >= countinternal error: entered unreachable code: empty internal nodeassertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_node, other_edge)assertion failed: first_to_sc_edges.len() == 1assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n      ", 99, &g_ef8cc8);
                    sub_c73b38("range start and end are equal and excluded in BTreeMap", 109, &g_ef8cb0);
                }
                break;
            }
        }
    }
    else
    {
        if (!v4 || v4 == 1)
        {
LABEL_bb1820:
            if (*v5 < *v3)
            {
                sub_c73b38("range start is greater than range end in BTreeMapassertion failed: self.height > 0assertion failed: old_right_len + count <= CAPACITYassertion failed: old_left_len >= countassertion failed: old_left_len + count <= CAPACITYassertion failed: old_right_len >= countinternal error: entered unreachable code: empty internal nodeassertion failed: assign.right.len() == 1assertion failed: skip_over_node(function, pattern.first_node, other_edge)assertion failed: first_to_sc_edges.len() == 1assertion failed: second_to_sc_edges.len() == 1assertion failed: new_upvalues_in.contains(&value)assertion failed: self.incomplete_params.is_empty()assertion failed: function.predecessor_blocks(function.entry().unwrap()).next().is_none()assertion failed: new_rvalue.is_none()assertion failed: table.0.iter().filter(|(k, _)| k.is_none()).count() == set_list.index - 1assertion failed: !table.0.last().map_or(false,\n        |(k, v)|\n            k.is_none() &&\n                matches!(v, ast::RValue::VarArg(_) | ast::RValue::Call(_) |\n      ", 99, &g_ef8cc8);
                sub_c73b38("range start and end are equal and excluded in BTreeMap", 109, &g_ef8cb0);
            }
        }
    }
    if (v2 <= 1)
        goto LABEL_bb199c;
    else
        goto LABEL_bb183c;
    while (1)
    {
LABEL_bb1984:
        if (!iter)
        {
            *a0 = 0;
            a0[3] = 0;
            return;
        }
        a1 = *(long long *)&(a1[1].padding_0)[v7 + 4];
        iter -= 1;
        if (1 < v2)
        {
LABEL_bb183c:
            if (v2 == 2)
            {
                v7 = 0;
                if ((long long)v4 <= 1)
                    goto LABEL_bb1878;
                goto LABEL_bb1850;
            }
            else
            {
                v7 = a1->field_21a;
                v2 = 3;
                if (1 >= (long long)v4)
                    goto LABEL_bb1878;
                goto LABEL_bb1850;
            }
        }
LABEL_bb199c:
        if (!v2)
        {
            v9 = &a1->field_8;
            v7 = a1->field_21a;
            v10 = v7 * 24;
            v11 = 0xffffffffffffffff;
            do
            {
                if (!v10)
                {
                    v2 = 0;
                    if (1 >= (long long)v4)
                        goto LABEL_bb1878;
                    goto LABEL_bb1850;
                }
                if (*v9 <= *v3)
                    v13 = *v3 > *v9;
                else
                    v13 = 0xff;
                v11 += 1;
                v10 -= 24;
                l = v13;
                v9 += 3;
            } while (l == 1);
            if (!l)
            {
                v2 = 3;
                v7 = v11;
                if (1 >= (long long)v4)
                    goto LABEL_bb1878;
                goto LABEL_bb1850;
            }
            v2 = 0;
            v7 = v11;
            if (1 >= (long long)v4)
                goto LABEL_bb1878;
            goto LABEL_bb1850;
        }
        else
        {
            v15 = &a1->field_8;
            v7 = a1->field_21a;
            v16 = v7 * 24;
            v17 = 0xffffffffffffffff;
            do
            {
                if (!v16)
                {
                    v2 = 1;
                    if ((long long)v4 <= 1)
                        goto LABEL_bb1878;
                    goto LABEL_bb1850;
                }
                if (*v15 <= *v3)
                    v19 = *v3 > *v15;
                else
                    v19 = 0xff;
                v17 += 1;
                v16 -= 24;
                m = v19;
                v15 += 3;
            } while (m == 1);
            if (!m)
            {
                v7 = v17 + 1;
                v2 = 2;
                if (1 >= (long long)v4)
                    goto LABEL_bb1878;
                goto LABEL_bb1850;
            }
            v2 = 1;
            v7 = v17;
            if (1 < (long long)v4)
            {
LABEL_bb1850:
                if (v4 == 2)
                {
                    v8 = a1->field_21a;
                    if (v8 > v7)
                        break;
                }
                else
                {
                    v8 = v7;
                    if (0)
                        break;
                }
            }
            else
            {
LABEL_bb1878:
                v21 = v7 * 3;
                if (!v4)
                {
                    v22 = v21 * 8;
                    v8 = a1->field_21a;
                    v23 = &a1->padding_0[v22 + 8];
                    v24 = (unsigned int)v8 * 24 - v22;
                    v25 = 0xffffffffffffffff;
                    do
                    {
                        if (!v24)
                        {
                            v4 = 0;
                            if (v8 > v7)
                                goto LABEL_bb1a98;
                            goto LABEL_bb1984;
                        }
                        if (*v23 <= *v5)
                            v27 = *v5 > *v23;
                        else
                            v27 = 0xff;
                        v25 += 1;
                        v24 -= 24;
                        j = v27;
                        v23 += 3;
                    } while (j == 1);
                    if (!j)
                    {
                        v8 = v7 + v25 + 1;
                        v4 = 3;
                        if (v8 > v7)
                            break;
                        continue;
                    }
                    v4 = 0;
                    v8 = v25 + v7;
                    if (v7 < v8)
                        break;
                }
                else
                {
                    v29 = v21 * 8;
                    v8 = a1->field_21a;
                    v30 = &a1->padding_0[v29 + 8];
                    v31 = (unsigned int)v8 * 24 - v29;
                    v32 = 0xffffffffffffffff;
                    do
                    {
                        if (!v31)
                            goto LABEL_bb1954;
                        if (*v30 <= *v5)
                            v34 = *v5 > *v30;
                        else
                            v34 = 0xff;
                        v32 += 1;
                        v31 -= 24;
                        k = v34;
                        v30 += 3;
                    } while (k == 1);
                    v8 = v32 + v7;
                    if (!k)
                    {
                        v4 = 2;
                        if (v8 > v7)
                            break;
                    }
                    else
                    {
LABEL_bb1954:
                        v4 = 1;
                        if (v8 <= v7)
                            continue;
                        break;
                    }
                }
            }
        }
    }
LABEL_bb1a98:
    v36 = v7;
    if (iter)
    {
        v37 = a1;
        do
        {
            v38 = a1;
            v37 = *(long long *)&(v37[1].padding_0)[v36 + 4];
            if (1 >= v2)
            {
                if (!v2)
                {
                    v39 = &v37->field_8;
                    v36 = v37->field_21a;
                    n = v36 * 24;
                    v41 = 0xffffffffffffffff;
                    while (n)
                    {
                        if (*v39 <= *v3)
                            v43 = *v3 > *v39;
                        else
                            v43 = 0xff;
                        v41 += 1;
                        n -= 24;
                        v44 = v43;
                        v39 += 3;
                        if (v44 != 1)
                        {
                            if (!v44)
                                v2 = 3;
                            else
                                v2 = 0;
                            v36 = v41;
                            a1 = *(long long *)&(v38[1].padding_0)[v8 + 4];
                            if (1 >= (long long)v4)
                                goto LABEL_bb1bd8;
                            goto LABEL_bb1b4c;
                        }
                    }
                    v2 = 0;
                    a1 = *(long long *)&(v38[1].padding_0)[v8 + 4];
                    if ((long long)v4 <= 1)
                        goto LABEL_bb1bd8;
                    goto LABEL_bb1b4c;
                }
                else
                {
                    v45 = &v37->field_8;
                    v36 = v37->field_21a;
                    i0 = v36 * 24;
                    v47 = 0xffffffffffffffff;
                    while (i0)
                    {
                        if (*v45 <= *v3)
                            v49 = *v3 > *v45;
                        else
                            v49 = 0xff;
                        v47 += 1;
                        i0 -= 24;
                        v50 = v49;
                        v45 += 3;
                        if (v50 != 1)
                        {
                            v51 = v50;
                            if (!v50)
                            {
                                v2 = 2;
                                v52 = arm64g_calculate_condition(19, v51, 0, 0);
                                if (!(v52 & 1))
                                    goto LABEL_bb1ba6;
                            }
                            else
                            {
                                v2 = 1;
                                v53 = arm64g_calculate_condition(19, v51, 0, 0);
                                if (!(v53 & 1))
                                {
LABEL_bb1ba6:
                                    v36 = v47 + 1;
LABEL_bb1ba8:
                                    a1 = *(long long *)&(v38[1].padding_0)[v8 + 4];
                                    if (1 >= (long long)v4)
                                        goto LABEL_bb1bd8;
                                    goto LABEL_bb1b4c;
                                }
                            }
                            v36 = v47;
                            goto LABEL_bb1ba8;
                        }
                    }
                    v2 = 1;
                    a1 = *(long long *)&(v38[1].padding_0)[v8 + 4];
                    if (1 >= (long long)v4)
                        goto LABEL_bb1bd8;
                    goto LABEL_bb1b4c;
                }
            }
            if (v2 == 2)
            {
                v36 = 0;
                a1 = *(long long *)&(v38[1].padding_0)[v8 + 4];
                if ((long long)v4 <= 1)
                    goto LABEL_bb1bd8;
                goto LABEL_bb1b4c;
            }
            else
            {
                v36 = v37->field_21a;
                v2 = 3;
                a1 = *(long long *)&(v38[1].padding_0)[v8 + 4];
                if (1 < (long long)v4)
                {
LABEL_bb1b4c:
                    if (v4 == 2)
                        v8 = a1->field_21a;
                    else
                        v8 = 0;
                }
                else
                {
LABEL_bb1bd8:
                    if (!v4)
                    {
                        v54 = &a1->field_8;
                        v8 = a1->field_21a;
                        v55 = v8 * 24;
                        v56 = 0xffffffffffffffff;
                        do
                        {
                            if (!v55)
                            {
                                v4 = 0;
                                goto LABEL_bb1ab0;
                            }
                            if (*v54 <= *v5)
                                v58 = *v5 > *v54;
                            else
                                v58 = 0xff;
                            v56 += 1;
                            v55 -= 24;
                            i1 = v58;
                            v54 += 3;
                        } while (i1 == 1);
                        if (!i1)
                        {
                            v8 = v56 + 1;
                            v4 = 3;
                        }
                        else
                        {
                            v4 = 0;
                            v8 = v56;
                        }
                    }
                    else
                    {
                        v60 = &a1->field_8;
                        v8 = a1->field_21a;
                        v61 = v8 * 24;
                        v62 = 0xffffffffffffffff;
                        do
                        {
                            if (!v61)
                                goto LABEL_bb1c7c;
                            if (*v60 <= *v5)
                                v64 = *v5 > *v60;
                            else
                                v64 = 0xff;
                            v62 += 1;
                            v61 -= 24;
                            i2 = v64;
                            v60 += 3;
                        } while (i2 == 1);
                        v8 = v62;
                        if (!i2)
                        {
                            v4 = 2;
                        }
                        else
                        {
LABEL_bb1c7c:
                            v4 = 1;
                        }
                    }
                }
            }
LABEL_bb1ab0:
            iter -= 1;
        } while (iter);
    }
    else
    {
        v37 = a1;
    }
    *a0 = v37;
    a0[1] = 0;
    a0[2] = v36;
    a0[3] = a1;
    a0[4] = 0;
    a0[5] = v8;
    return;
}
