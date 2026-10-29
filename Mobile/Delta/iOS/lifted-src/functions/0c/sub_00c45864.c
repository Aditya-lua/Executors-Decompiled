/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc45864..0xc45c88 (1060 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c45864_1 {
    char field_0;
    char field_1;
} st_c45864_1;

typedef struct st_c45864_0 {
    struct st_c45864_1 *field_0;
    unsigned long long field_8;
    char padding_10[40];
    char field_38;
    char field_39;
    char field_3a;
} st_c45864_0;

extern long long g_efd840;
extern long long g_efd858;
extern long long g_efd870;
extern long long g_efd888;

void* sub_c45864(void* a0, st_c45864_0 *a1)
{
    unsigned long long v7;  // x8
    unsigned long v8;  // x10
    unsigned long long v17;  // x8
    char *v19;  // x21
    unsigned long long i;  // x23
    st_c45864_0 *v21;  // x22
    unsigned long long v22;  // x8
    unsigned long v23;  // x8
    unsigned long v24;  // 4112
    unsigned long v25;  // cc_op
    unsigned long long v9;  // w9
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long v28;  // 4112
    unsigned long long v29;  // 4102
    st_c45864_0 *v30;  // x1
    void* v31;  // x0
    unsigned long long v32;  // x8
    unsigned long long v33;  // x8
    unsigned long long v34;  // 4102
    unsigned long long v35;  // x8
    unsigned long v10;  // x19
    unsigned long long v36;  // x8
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4105
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4105
    st_c45864_0 *v16;  // x21
    char v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x68]
    uint128_t v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a1->field_38;
    if ((unsigned int)v7 != 3)
    {
        v8 = a1->field_3a;
        v9 = a1->field_39;
        v10 = a1->field_8;
        v11 = v7 & 0xff;
        if (1 < (unsigned int)v7)
        {
            if (2 <= v9)
            {
                v24 = arm64g_calculate_condition(35, v11, 1, 0);
                v25 = 3;
                v26 = (v24 & 1 ? v9 & 0xff : 0x40000000);
                v27 = (v24 & 1 ? 3 : 0);
            }
            else
            {
                v28 = arm64g_calculate_condition(35, v11, 1, 0);
                v25 = 0;
                v26 = (v28 & 1 ? v9 & 0xff : 0x40000000);
                v27 = (v28 & 1 ? 3 : 0);
            }
            if (v8 & 1)
            {
                v29 = arm64g_calculate_condition(v25, v26, v27, 0);
                if (!(v29 & 1))
                {
                    if (v9 == 2)
                    {
                        v30 = a1;
                        if (v10)
                        {
                            sub_c5cbcc(&v0);
                            v32 = v0;
                            *(uint128_t *)a0 = v1;
                            *(uint128_t *)&a0[16] = v2;
                            *(uint128_t *)&a0[32] = v3;
                            *(unsigned long *)&a0[48] = v4;
                            i = v10 - v32;
                            if (v10 < v32)
                            {
                                v23 = i;
                                sub_c73bb0(0, v23, v10, &g_efd870);
                                sub_c73bb0(0, v23, 0, &g_efd840);
                            }
                            a1->field_8 = i;
                            if (*(char *)a0 != 10)
                                return a0;
                            v30 = a1;
                            v31 = a0;
                            while (i)
                            {
                                sub_c5cbcc(&v0);
                                v33 = v0;
                                *(uint128_t *)a0 = v1;
                                *(uint128_t *)&a0[16] = v2;
                                *(uint128_t *)&a0[32] = v3;
                                *(unsigned long *)&a0[48] = v4;
                                v7 = i - v33;
                                if (i < v33)
                                    goto LABEL_c45c08;
                                v30 = a1;
                                a1->field_8 = v7;
                                i = v7;
                                v31 = a0;
                                if (*(char *)v31 != 10)
                                    return a0;
                            }
                        }
                        goto LABEL_c45bd4;
                    }
                    goto LABEL_c45c24;
                }
            }
            else
            {
                v34 = arm64g_calculate_condition(v25, v26, v27, 0);
                if (!(v34 & 1))
                {
                    if (v9 != 2)
                        goto LABEL_c45c24;
                    v30 = a1;
                    if (v10)
                    {
                        sub_c5cbcc(&v0);
                        v35 = v0;
                        *(uint128_t *)a0 = v1;
                        *(uint128_t *)&a0[16] = v2;
                        *(uint128_t *)&a0[32] = v3;
                        *(unsigned long *)&a0[48] = v4;
                        i = v10 - v35;
                        if (v10 < v35)
                        {
                            v23 = i;
                            sub_c73bb0(0, v23, v10, &g_efd870);
                            sub_c73bb0(0, v23, 0, &g_efd840);
                        }
                        a1->field_8 = i;
                        if (*(char *)a0 != 10)
                            return a0;
                        v30 = a1;
                        while (1)
                        {
                            if (!i)
                                goto LABEL_c45bd4;
                            sub_c5cbcc(&v0);
                            v36 = v0;
                            *(uint128_t *)a0 = v1;
                            *(uint128_t *)&a0[16] = v2;
                            *(uint128_t *)&a0[32] = v3;
                            *(unsigned long *)&a0[48] = v4;
                            v7 = i - v36;
                            if (i < v36)
                                break;
                            v30 = a1;
                            a1->field_8 = v7;
                            i = v7;
                            if (*(char *)v31 != 10)
                                return a0;
                        }
LABEL_c45c08:
                        v10 = i;
LABEL_c45c0c:
                        sub_c73bb0(0, v7, v10, &g_efd870);
LABEL_c45c24:
                        sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_efd888);
LABEL_c45c3c:
                        sub_c73bb0(0, v7, 0, &g_efd858);
                        v23 = i;
                        sub_c73bb0(0, v23, v10, &g_efd870);
                        sub_c73bb0(0, v23, 0, &g_efd840);
                    }
                    else
                    {
LABEL_c45bd4:
                        v30->field_39 = 1;
                    }
                }
            }
        }
        else if (v9 != 3)
        {
            v12 = arm64g_calculate_condition(19, v11, 1, 0);
            v13 = arm64g_calculate_condition(147, (v12 & 1 ? v7 & 0xff : 0x20000000), (v12 & 1 ? v9 & 0xff : 0), 0);
            v7 = !(v13 & 1);
            if (!(v8 & 1))
                goto LABEL_c45a14;
LABEL_c458d0:
            if (!(v7 & 1))
            {
                while (1)
                {
                    if (v9 != 1)
                    {
                        if (v9 != 2)
                            goto LABEL_c45c24;
                        if (1 >= v10)
                        {
                            v9 = 1;
                            a1->field_39 = 1;
                        }
                        else
                        {
                            v16 = a1;
                            sub_c5cbcc(&v0);
                            v17 = v0;
                            *(uint128_t *)a0 = v1;
                            *(uint128_t *)&a0[16] = v2;
                            *(uint128_t *)&a0[32] = v3;
                            *(unsigned long *)&a0[48] = v4;
                            v7 = v10 - v17;
                            if (v10 < v17)
                                break;
                            a1 = v16;
                            v16->field_8 = v7;
                            v9 = 2;
                            v10 = v7;
                            if (*(char *)a0 != 10)
                                return a0;
                        }
                    }
                    else
                    {
                        a1->field_39 = 3;
                        v7 = v10 - 1;
                        if (v10)
                        {
                            a1->field_8 = v7;
                            *(char *)a0 = 6;
                            return a0;
                        }
                        goto LABEL_c45c3c;
                    }
                }
                goto LABEL_c45c0c;
            }
        }
        else
        {
            v14 = arm64g_calculate_condition(19, v11, 1, 0);
            v15 = arm64g_calculate_condition(144, (v14 & 1 ? v7 & 0xff : 0x20000000), (v14 & 1 ? v9 & 0xff : 0), 0);
            v7 = !(v15 & 1);
            if (v8 & 1)
                goto LABEL_c458d0;
LABEL_c45a14:
            if (!(v7 & 1))
            {
                v19 = &a1->field_0->field_0;
                while (1)
                {
                    if (v9 == 1)
                    {
                        a1->field_39 = 3;
                        if (!v10)
                            break;
                        v23 = v10 - 1;
                        if (v10 == 1)
                        {
                            if (*v19 != 46)
                                break;
                        }
                        else
                        {
                            if (*v19 != 46 || v19[1] != 47)
                                break;
                        }
                        if (v10)
                        {
                            a1->field_8 = v23;
                            *(char *)a0 = 7;
                            return a0;
                        }
                        sub_c73bb0(0, v23, 0, &g_efd840);
                    }
                    if (v9 != 2)
                        goto LABEL_c45c24;
                    v7 = v10;
                    if (v7)
                    {
                        if (v10 == 1)
                        {
                            if (*v19 != 46)
                                goto LABEL_c45a6c;
                            goto LABEL_c45a64;
                        }
                        else if (*v19 == 46 && v19[1] == 47)
                        {
LABEL_c45a64:
                            v7 = 1;
                        }
                        else
                        {
LABEL_c45a6c:
                            v7 = 0;
                        }
                    }
                    if (v7 >= v10)
                    {
                        v9 = 1;
                        a1->field_39 = 1;
                    }
                    else
                    {
                        v21 = a1;
                        sub_c5cbcc(&v0);
                        v22 = v0;
                        *(uint128_t *)a0 = v1;
                        *(uint128_t *)&a0[16] = v2;
                        *(uint128_t *)&a0[32] = v3;
                        *(unsigned long *)&a0[48] = v4;
                        v7 = v10 - v22;
                        i = a0;
                        if (v10 < v22)
                            goto LABEL_c45c0c;
                        a1 = v21;
                        v21->field_8 = v7;
                        v9 = 2;
                        v10 = v7;
                        i = a0;
                        if (*(char *)i != 10)
                            return a0;
                    }
                }
            }
        }
    }
    *(char *)a0 = 10;
    return a0;
}
