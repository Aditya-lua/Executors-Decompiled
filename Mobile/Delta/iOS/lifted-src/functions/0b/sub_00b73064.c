/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb73064..0xb73420 (956 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b73064_0 {
    unsigned long long field_0[2];
    long long field_8;
    unsigned int field_10;
} st_b73064_0;


double sub_b73064(st_b73064_0 *a0, void* a1)
{
    unsigned long v8;  // x9
    unsigned int v9;  // x23
    unsigned long v18;  // x13
    unsigned long v19;  // cc_dep1
    unsigned long long v20;  // 4104
    unsigned long long v21;  // 4104
    unsigned int v22;  // x19
    unsigned int v23;  // x26
    unsigned long long *iter;  // x24
    unsigned long long v25;  // 4110
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4110
    unsigned int v10;  // x20
    unsigned long long v28;  // 4102
    unsigned long v29;  // d0
    unsigned long long *v30;  // x20
    unsigned long long v31;  // x9
    unsigned int v32;  // x27
    unsigned int ptr;  // x0
    unsigned int v34;  // x10
    unsigned int v35;  // x9
    unsigned int idx;  // x20
    unsigned int v37;  // x8
    unsigned long long *v11;  // x8
    unsigned int v38;  // x21
    unsigned int v39;  // x28
    unsigned int v40;  // x22
    unsigned int v41;  // x25
    unsigned long long *v42;  // x10
    unsigned long v43;  // x10
    unsigned long v44;  // cc_dep1
    unsigned long long v45;  // 4111
    unsigned long long v46;  // 4111
    unsigned long long v47;  // 4106
    unsigned long v12;  // cc_dep1
    unsigned long long v48;  // 4106
    unsigned long long v49;  // 4112
    unsigned int v50;  // x8
    unsigned long long v51;  // x9
    unsigned long long v52;  // x10
    unsigned int v53;  // x9
    unsigned long v54;  // d0
    long long v55;  // x0
    unsigned int v13;  // x10
    unsigned int v15;  // x12
    unsigned long long v17;  // 4105
    st_b73064_0 *v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x7c]
    uint128_t v3;  // [bp-0x78], Other Possible Types: unsigned int
    long long v4;  // [bp-0x70]
    unsigned int v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = *(long long *)a1;
    v9 = (long long)a1[16];
    v10 = (long long)a1[24];
    v11 = (long long)a1[64];
    v1 = (long long)a1[72];
    switch (v8)
    {
    case 0:
LABEL_b730e8:
        if (v9 & 1 && !(*(unsigned long long *)&a1[24] = 0, !v10))
        {
            v0 = a0;
            v23 = 0;
            v22 = 0;
            v9 = 1;
            iter = v11;
        }
        else
        {
            *(unsigned long long *)a1 = 2;
LABEL_b73114:
            v23 = v10;
            if (v11)
            {
                v25 = arm64g_calculate_condition(20, v12, 2, 0);
                v26 = arm64g_calculate_condition(20, (v25 & 1 ? v11 : 0x40000000), (v25 & 1 ? v1 : 0), 0);
                if (v26 & 1)
                    goto LABEL_b73180;
LABEL_b73128:
                if ((long long)a1[32])
                {
                    if ((long long)a1[32] == 2)
                    {
                        a0->field_0[0] = 0;
                        a0->field_0[1] = 8;
                        a0->field_8 = 0;
                        return v29;
                    }
                    v10 = (long long)a1[40];
                    *(unsigned long long *)&a1[40] = 0;
                    if (v10)
                        goto LABEL_b73160;
                    *(unsigned long long *)&a1[32] = 0;
                }
                if ((long long)a1[48] != 1)
                {
                    a0->field_0[0] = 0;
                    a0->field_0[1] = 8;
                    a0->field_8 = 0;
                    return v29;
                }
                v10 = (long long)a1[56];
                *(unsigned long long *)&a1[56] = 0;
                if (!v10)
                {
                    a0->field_0[0] = 0;
                    a0->field_0[1] = 8;
                    a0->field_8 = 0;
                    return v29;
                }
LABEL_b73160:
                v0 = a0;
                v22 = 2;
                iter = v11;
            }
            else
            {
                v27 = arm64g_calculate_condition(20, v12, 2, 0);
                v28 = arm64g_calculate_condition(16, (v27 & 1 ? 0 : 0x40000000), (v27 & 1 ? v1 : 0), 0);
                if (!(v28 & 1))
                    goto LABEL_b73128;
LABEL_b73180:
                v0 = a0;
                iter = v11 + 16;
                *(unsigned long long **)&a1[64] = iter;
                v30 = v11;
                v31 = *v30;
                v10 = (unsigned int)(v30 + 8);
                v9 = 1;
                *(unsigned long long *)&a1[16] = 1;
                *(unsigned long long *)&a1[24] = v10;
                *(unsigned long long *)a1 = 1;
                *(unsigned long long *)&a1[8] = 0;
                if (v31 == 12)
                {
                    v23 = 0;
                    v22 = 0;
                    *(unsigned long long *)a1 = 0;
                    *(unsigned long long *)&a1[24] = 0;
                    v9 = 1;
                }
                else
                {
                    v23 = v10;
                    v10 = (unsigned int)v11;
                    v22 = 1;
                }
            }
        }
LABEL_b731cc:
        v32 = (long long)a1[32];
        ptr = _malloc(32);
        if (ptr)
        {
            *(unsigned long long *)ptr = v10;
            v3 = CONCAT(ptr, 4);
            v5 = 1;
            v34 = (long long)a1[8];
            v35 = (long long)a1[40];
            v2 = (int)a1[48];
            idx = 1;
            v37 = (long long)a1[56];
            while (1)
            {
                if (!v22)
                {
                    v38 = v34;
                }
                else if (v22 == 2)
                {
                    v38 = v34;
                    goto LABEL_b732a4;
                }
                else
                {
                    v38 = 0;
                    if (v34)
                    {
                        v39 = v37;
                        v40 = v35;
                        v41 = v23;
                        v23 = v34;
                        goto LABEL_b7333c;
                    }
                }
                if (v9 & 1)
                {
                    v41 = 0;
                    if (v23)
                    {
                        v22 = 0;
                        v39 = v37;
                        v40 = v35;
                        v9 = 1;
                        goto LABEL_b7333c;
                    }
                    goto LABEL_b732a8;
                }
LABEL_b732a4:
                v41 = v23;
LABEL_b732a8:
                if (iter && iter != v1)
                {
                    v42 = iter;
                    v43 = v42 + 8;
                    v44 = *v42;
                    if (*v42 != 12)
                    {
                        v23 = (unsigned int)iter;
                        iter += 16;
                        v45 = arm64g_calculate_condition(20, v44, 12, 0);
                        if (!(v45 & 1))
                            goto LABEL_b732d2;
                    }
                    else
                    {
                        v23 = v43;
                        iter += 16;
                        v46 = arm64g_calculate_condition(20, v44, 12, 0);
                        if (!(v46 & 1))
                        {
LABEL_b732d2:
                            v41 = 0;
                            v48 = arm64g_calculate_condition(4, v44, 12, 0);
                            if (!(v48 & 1))
                            {
LABEL_b732da:
                                v9 = 1;
                                v38 = 0;
LABEL_b732dc:
                                v49 = arm64g_calculate_condition(4, v44, 12, 0);
                                v22 = !(v49 & 1);
                                v39 = v37;
                                v40 = v35;
                                goto LABEL_b7333c;
                            }
LABEL_b732d9:
                            goto LABEL_b732dc;
                        }
                    }
                    v41 = v43;
                    v47 = arm64g_calculate_condition(4, v44, 12, 0);
                    if (!(v47 & 1))
                        goto LABEL_b732da;
                    goto LABEL_b732d9;
                }
                else
                {
                    switch (v32)
                    {
                    case 0:
                        v40 = v35;
                        break;
                    case 2:
                        *(uint128_t *)v0->field_0 = v3;
                        v0->field_8 = v5;
                        return v54;
                    default:
                        v40 = 0;
                        if (v35)
                        {
                            v39 = v37;
                            v22 = 2;
                            v23 = v35;
                            goto LABEL_b7333c;
                        }
                    }
                    if ((v2 & v37 != 0) != 1)
                    {
                        *(uint128_t *)v0->field_0 = v3;
                        v0->field_8 = v5;
                        return v54;
                    }
                    v39 = 0;
                    v32 = 0;
                    v22 = 2;
                    v23 = v37;
LABEL_b7333c:
                    if (idx != *(unsigned long long *)&v3)
                    {
LABEL_b73230:
                        *(unsigned long long *)(ptr + idx * 8) = v23;
                        idx += 1;
                        v5 = idx;
                        v37 = v39;
                        v35 = v40;
                        v34 = v38;
                        v23 = v41;
                    }
                    else
                    {
                        if (v22 == 2)
                        {
                            v50 = 0;
                            if (!v32)
                                goto LABEL_b733b0;
                        }
                        else
                        {
                            v50 = v41 != 0;
                            if (!(v9 & 1))
                                v50 = 0;
                            v51 = v38 != 0;
                            if (!v41)
                                v52 = v51;
                            else
                                v52 = v51 + 1;
                            if (v9 & 1)
                                v51 = v52;
                            if (v22 == 1)
                                v50 = v51;
                            if (!v32)
                            {
LABEL_b733b0:
                                if (v2 & 1)
                                {
                                    v53 = v39 != 0;
LABEL_b73210:
                                    sub_c6c0cc(&v3, idx, v50 + v53 + 1, 8, 8);
                                    ptr = *(unsigned long long *)((void*)&v3 + 8);
                                    goto LABEL_b73230;
                                }
LABEL_b7320c:
                                v53 = 0;
                                goto LABEL_b73210;
                            }
                        }
                        if (v32 != 2)
                        {
                            v53 = v40 != 0;
                            if (v2 & 1)
                            {
                                if (v39)
                                    v53 += 1;
                                goto LABEL_b73210;
                            }
                        }
                        goto LABEL_b7320c;
                    }
                }
            }
        }
        else
        {
            v55 = sub_c6b970(8, 32);
            if (v3)
                _free(v4);
            __Unwind_Resume(v55);
        }
    case 2:
        v12 = v8;
        goto LABEL_b73114;
    default:
        v12 = v8;
        v13 = (long long)a1[8];
        *(unsigned long long *)&a1[8] = 0;
        if (v13)
        {
            v0 = a0;
            v15 = v9 & 1;
            v17 = arm64g_calculate_condition(4, v8, 2, 0);
            if (v17 & 1)
                v18 = v8;
            else
                v18 = 1;
            v19 = v8;
            if (!v8)
            {
                v9 &= 1;
                v20 = arm64g_calculate_condition(4, v19, 0, 0);
                if (!(v20 & 1))
                    goto LABEL_b730d2;
LABEL_b730d1:
                v22 = 0;
            }
            else
            {
                v9 = v15;
                v21 = arm64g_calculate_condition(4, v19, 0, 0);
                if (v21 & 1)
                    goto LABEL_b730d1;
LABEL_b730d2:
                v22 = v18;
            }
            v23 = v10;
            iter = v11;
            v10 = v13;
            goto LABEL_b731cc;
        }
        else
        {
            *(unsigned long long *)a1 = 0;
            goto LABEL_b730e8;
        }
    }
}
