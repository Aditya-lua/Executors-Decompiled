/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98fc3c..0x98fdbc (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98fc3c_0 {
    void* field_0;
    unsigned long long field_8;
} st_98fc3c_0;

typedef struct st_98fc3c_2 {
    char padding_0[20];
    uint128_t field_14;
} st_98fc3c_2;

typedef struct st_98fc3c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char field_10;
    char field_11;
    char padding_12[19];
    uint128_t field_25;
} st_98fc3c_1;


double sub_98fc3c(st_98fc3c_0 *a0, st_98fc3c_1 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v9;  // x20
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v25;  // x20
    unsigned long long v26;  // x9
    void* v27;  // x0
    unsigned long long v28;  // x8
    unsigned long long v10;  // x19
    unsigned long long v29;  // x20
    unsigned long long v30;  // x0
    unsigned long long v31;  // x10
    void* v32;  // x1
    unsigned long long v33;  // x9
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v38;  // x20
    unsigned long long v11;  // x30
    unsigned long long v39;  // x9
    unsigned long long v40;  // 4136
    st_98fc3c_2 *v41;  // x21
    unsigned long long v42;  // x8
    unsigned long long v43;  // x9
    unsigned long v44;  // d0
    unsigned long long v12;  // x20
    unsigned long v45;  // d0
    unsigned long v46;  // d0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x10
    void* v15;  // x0
    unsigned long long v16;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_8)
        return v46;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (a0->field_8 < v12)
        return v45;
    v13 = sub_a7b0d8(a0->field_0);
    v14 = a0->field_8;
    v15 = a0->field_0 + v12;
    v16 = v14 - v12;
    a0->field_0 = v15;
    a0->field_8 = v16;
    if (v13 == 24)
    {
        v21 = arm64g_calculate_condition(v17, v18, v19, v20);
        v22 = arm64g_calculate_condition(4, (v21 & 1 ? v14 : 0x40000000), (v21 & 1 ? v12 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_98fc9c;
    }
    else
    {
        v23 = arm64g_calculate_condition(v17, v18, v19, v20);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? v14 : 0x40000000), (v23 & 1 ? v12 : 0), 0);
        if (!(v24 & 1))
        {
LABEL_98fc9c:
            v25 = 1 << ((char)(*(char *)v15) >> 6 & 63);
            if (v16 >= v25)
            {
                a1->field_0 = sub_a7b0d8();
                v26 = a0->field_8;
                v27 = a0->field_0 + v25;
                v28 = v26 - v25;
                a0->field_0 = v27;
                a0->field_8 = v28;
                if (v26 != v25 && (v29 = 1 << ((char)(*(char *)v27) >> 6 & 63), v28 >= v29))
                {
                    v30 = sub_a7b0d8();
                    a1->field_8 = v30;
                    v31 = a0->field_8;
                    v32 = a0->field_0 + v29;
                    v33 = v31 - v29;
                    a0->field_0 = v32;
                    a0->field_8 = v33;
                    if (v30 <= a1->field_0)
                    {
                        v34 = arm64g_calculate_condition(v17 | 32, v18, v19, v20);
                        v35 = arm64g_calculate_condition(4, (v34 & 1 ? v31 : 0x40000000), (v34 & 1 ? v29 : 0), 0);
                        if (!(v35 & 1))
                            goto LABEL_98fd10;
                    }
                    else
                    {
                        v36 = arm64g_calculate_condition(v17 | 32, v18, v19, v20);
                        v37 = arm64g_calculate_condition(0, (v36 & 1 ? v31 : 0x40000000), (v36 & 1 ? v29 : 0), 0);
                        if (!(v37 & 1))
                        {
LABEL_98fd10:
                            v38 = *(char *)v32;
                            v39 = v33 - 1;
                            a0->field_0 = v32 + 1;
                            a0->field_8 = v39;
                            v40 = arm64g_calculate_condition(49, (unsigned int)v38 - 21, 20, 0);
                            if (!(v40 & 1))
                            {
                                a1->field_10 = v38;
                                if (v39 >= v38)
                                {
                                    v41 = &a1->field_11;
                                    _memcpy(v41);
                                    v42 = a0->field_8 - v38;
                                    a0->field_0 = a0->field_0 + v38;
                                    a0->field_8 = v42;
                                    if (19 >= (unsigned int)v38)
                                    {
                                        _bzero(&v41->padding_0[v38], 20 - v38);
                                        v42 = a0->field_8;
                                    }
                                    if (16 <= v42)
                                    {
                                        *(int128_t *)&(a1->padding_12)[1] = *(int128_t *)a0->field_0;
                                        v43 = a0->field_8 - 16;
                                        a0->field_0 = a0->field_0 + 16;
                                        a0->field_8 = v43;
                                        return v44;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return v45;
}
