/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fa300..0x1fa568 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fa300_0 {
    char field_0;
} st_1fa300_0;


void* sub_1fa300(void* a0, void* a1)
{
    unsigned long v4;  // x9
    void* v5;  // x8
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // x16
    void* v16;  // x12
    unsigned int v17;  // w13
    unsigned int v18;  // w2
    unsigned long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v23;  // x12
    unsigned int v6;  // w10
    unsigned long v24;  // x12
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // x12
    unsigned long long idx;  // x14
    unsigned int v28;  // w15
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    void* v33;  // x0
    unsigned int v7;  // w11
    unsigned int v34;  // w10
    void* v35;  // x20
    void* v36;  // x14
    void* v37;  // x14
    void* v38;  // x0
    void* v39;  // x9
    unsigned int v40;  // w11
    unsigned long long v41;  // 4135
    unsigned long long v42;  // 4121
    void* v43;  // x9
    unsigned int v8;  // w15
    void* v44;  // x13
    void* v45;  // x12
    void* v46;  // x13
    unsigned long i;  // x17
    void* iter;  // x14
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    st_1fa300_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1fa300_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (long long)a0[8];
    if (!v4)
        return sub_1fd094();
    v5 = *(long long *)a0;
    v6 = *(int *)a1;
    v7 = (int)a1[4];
    if (v6)
    {
        v8 = v6 - 1;
        i = v4;
        iter = v5;
        do
        {
            v15 = i >> 1;
            v16 = iter + v15 * 8;
            v17 = *(int *)v16;
            v18 = v17 - 1;
            if (1 <= v17)
            {
                v19 = arm64g_calculate_condition(v11 | 32, v12, v13, v14);
                v11 = 3;
                v12 = (v19 & 1 ? v7 : 0x20000000);
                v13 = (v19 & 1 ? v18 : 0);
                v20 = arm64g_calculate_condition(0x33, v12, v13, 0);
                if (v20 & 1)
                    continue;
            }
            else
            {
                v21 = arm64g_calculate_condition(v11 | 32, v12, v13, v14);
                v11 = 0;
                v12 = (v21 & 1 ? v7 : 0x20000000);
                v13 = (v21 & 1 ? v18 : 0);
                v22 = arm64g_calculate_condition(48, v12, v13, 0);
                if (v22 & 1)
                    continue;
            }
            v11 = 3;
            v12 = (int)v16[4];
            v13 = v8;
            if (v8 <= (unsigned int)(int)v16[4])
                goto LABEL_1fa408;
            v23 = v15 + 1;
            iter += v23 * 8;
            v15 = i - v23;
            v14 = 0;
            i = v15;
        } while (i);
    }
    else
    {
        v24 = v4;
        v25 = v12;
        do
        {
            v26 = v24;
            idx = v26 >> 1;
            v17 = *(int *)((char *)v5 + 8 * idx);
            v28 = v17 - 1;
            if (1 <= v17)
            {
                v29 = arm64g_calculate_condition(v11 | 32, v25, v13, v14);
                v30 = arm64g_calculate_condition(35, (v29 & 1 ? v7 : 0x20000000), (v29 & 1 ? v28 : 0), 0);
                if (v30 & 1)
                    goto LABEL_1fa404;
                continue;
            }
            v31 = arm64g_calculate_condition(v11 | 32, v25, v13, v14);
            v32 = arm64g_calculate_condition(32, (v31 & 1 ? v7 : 0x20000000), (v31 & 1 ? v28 : 0), 0);
            if (v32 & 1)
            {
LABEL_1fa404:
                v16 = v5 + idx * 8;
LABEL_1fa408:
                if (v6 >= v17)
                {
                    v34 = (int)v16[4];
                    if (v34 < v7)
                        goto LABEL_1fa494;
LABEL_1fa41c:
                    v35 = v5;
                    if (v17)
                        goto LABEL_1fa4a4;
LABEL_1fa424:
                    if (v35 == v16)
                        goto LABEL_1fa4ec;
                }
                else
                {
                    *(unsigned int *)v16 = v6;
                    v17 = v6;
                    v34 = (int)v16[4];
                    if (v7 <= (unsigned int)(int)v16[4])
                        goto LABEL_1fa41c;
LABEL_1fa494:
                    *(unsigned int *)&v16[4] = v7;
                    v34 = v7;
                    v35 = v5;
                    if (!v17)
                        goto LABEL_1fa424;
LABEL_1fa4a4:
                    v36 = v16;
                    while (1)
                    {
                        v37 = v36;
                        if (v37 == v5)
                            break;
                        v36 = v37 - 8;
                        if (v17 - 1 > (unsigned int)*(int *)((char *)v37 - 4))
                        {
                            v35 = v36 + 8;
                            *(unsigned int *)v16 = v17;
                            if (v35 == v16)
                                goto LABEL_1fa4ec;
                            goto LABEL_1fa42c;
                        }
                    }
                    v35 = v5;
                    *(unsigned int *)v16 = v17;
                    if (v5 == v16)
                    {
LABEL_1fa4ec:
                        v35 = v16;
                        v39 = v5 + v4 * 8;
                        v40 = v34 + 1;
                        v42 = arm64g_calculate_condition(33, v34, 1, 0);
                        v38 = a0;
                        if (!(v42 & 1))
                        {
LABEL_1fa4fc:
                            v44 = v35 + 8;
                            do
                            {
                                v45 = v44;
                            } while (v44 != v39 && (v46 = v45, v44 = v46 + 8, (unsigned int)*(int *)v46 <= v40));
                            v43 = v45 - 8;
                            *(unsigned int *)&v35[4] = v34;
                            if (v43 == v35)
                                return v38;
LABEL_1fa52c:
                            if (v34 > (unsigned int)(int)v43[4])
                                *(unsigned int *)&v43[4] = v34;
                            *(int *)v43 = *(int *)v35;
                            return sub_1ef208();
                        }
LABEL_1fa46c:
                        v43 = v39 - 8;
                        *(unsigned int *)&v35[4] = v34;
                        if (v43 == v35)
                            return a0;
                        goto LABEL_1fa52c;
                    }
                }
LABEL_1fa42c:
                if (v17 > (unsigned int)*(int *)v35)
                    *(int *)v16 = *(int *)v35;
                sub_1ef208();
                v38 = a0;
                v34 = (int)v35[4];
                v39 = *(long long *)a0 + (long long)a0[8] * 8;
                v40 = v34 + 1;
                v41 = arm64g_calculate_condition(49, v34, 1, 0);
                if (v41 & 1)
                    goto LABEL_1fa4fc;
                goto LABEL_1fa46c;
            }
        } while ((v11 = 4, v13 = 2, v14 = 0, v24 = idx, v25 = v26, 2 <= v25));
        iter = v5;
    }
    v33 = sub_1ef50c();
    *(long long *)(*(long long *)a0 + iter - v5) = *(long long *)a1;
    return v33;
}
