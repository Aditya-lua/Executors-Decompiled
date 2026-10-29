/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3b8ac..0xc3bac4 (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3b8ac_0 {
    struct st_c3b8ac_1 *field_0;
    char padding_8[8];
    unsigned int field_10;
} st_c3b8ac_0;

typedef struct st_c3b8ac_1 {
    char field_0;
} st_c3b8ac_1;

typedef struct st_c3b8ac_2 {
    char padding_0[8];
    unsigned int field_8;
} st_c3b8ac_2;


void sub_c3b8ac(st_c3b8ac_2 *a0, st_c3b8ac_0 *a1)
{
    unsigned int i;  // x8
    unsigned int v3;  // x12
    unsigned long long v12;  // 4155
    unsigned int v13;  // x3
    unsigned long long v14;  // 4107
    unsigned long long v15;  // 4119
    unsigned long long v16;  // 4119
    unsigned int v17;  // x9
    unsigned int v18;  // x3
    unsigned int v19;  // x3
    unsigned int v20;  // x2
    unsigned long long v21;  // 4119
    unsigned int v4;  // x11
    unsigned long long v22;  // 4102
    unsigned long long v23;  // 4119
    unsigned int v24;  // x10
    unsigned long long v25;  // 4106
    char *v5;  // x10
    unsigned int v6;  // w13
    unsigned int iter;  // x2
    unsigned int v8;  // x1
    unsigned int v9;  // w13
    unsigned long long v10;  // x15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = (unsigned int)a1->padding_8;
    v3 = *(long long *)&a1->field_10;
    if (i > v3 && *(char *)&a1->field_0[v3] == 117)
    {
        v3 += 1;
        *(unsigned long long *)&a1->field_10 = v3;
        v4 = 1;
    }
    else
    {
        v4 = 0;
    }
    if (i > v3)
    {
        v5 = a1->field_0;
        v6 = v5[v3] - 48;
        if (10 > v6)
        {
            iter = v3 + 1;
            *(unsigned long long *)&a1->field_10 = iter;
            if ((char)v6)
            {
                v8 = v6 & 0xff;
                while (i != iter)
                {
                    v9 = v5[iter] - 48;
                    if (9 < v9)
                        goto LABEL_c3b968;
                    *(long long *)&a1->field_10 = iter + 1;
                    v10 = v8 * 10;
                    v12 = arm64g_calculate_condition(50, v10, v9 & 0xff, 0);
                    if (v8 * 10 > 0xffffffffffffffff || !(v8 = v10 + (v9 & 0xff), v12 & 1))
                    {
                        *(char *)&a0->field_8 = 0;
                        *(unsigned long long *)a0->padding_0 = 0;
                        return;
                    }
                }
                iter = i;
            }
            else
            {
                v8 = 0;
LABEL_c3b968:
                if (i > iter && v5[iter] == 95)
                {
                    iter += 1;
                    *(unsigned long long *)&a1->field_10 = iter;
                }
            }
            v13 = iter + v8;
            v14 = arm64g_calculate_condition(0x22, iter, v8, 0);
            if (!(v14 & 1))
            {
                *(unsigned long long *)&a1->field_10 = v13;
                if (v13 <= i)
                {
                    if ((!iter || i <= iter || (v15 = arm64g_calculate_condition(209, v5[iter], 65, 0), !(v15 & 1))) && (!v13 || i <= v13 || !(v16 = arm64g_calculate_condition(209, v5[v13], 65, 0), v16 & 1)))
                    {
                        i = (unsigned int)&v5[iter];
                        if (!(v4 & 1))
                        {
                            *(unsigned long long *)a0->padding_0 = i;
                            *(unsigned long long *)&a0->field_8 = v8;
                            *(unsigned long long *)&a0[1].padding_0[4] = 1;
                            *(unsigned long long *)a0[2].padding_0 = 0;
                            return;
                        }
                        v17 = 1;
                        v18 = v8;
                        while (1)
                        {
                            v19 = v18;
                            if (!v19)
                                break;
                            v20 = v19;
                            v18 = v19 - 1;
                            if (*(&v5[iter + v19] - 1) == 95)
                            {
                                if (v18)
                                {
                                    if (v8 > v18)
                                    {
                                        v21 = arm64g_calculate_condition(193, *(char *)(i + v18), 65, 0);
                                        if (!(v21 & 1))
                                            sub_c73cc8(i);
                                    }
                                    else
                                    {
                                        v22 = arm64g_calculate_condition(20, v18, v8, 0);
                                        if (v22 & 1)
                                            sub_c73cc8(i);
                                        if (!v20)
                                            goto LABEL_c3ba7c;
                                    }
                                }
                                if (v8 > v20)
                                {
                                    v23 = arm64g_calculate_condition(209, *(char *)(i + v20), 65, 0);
                                    if (!(v23 & 1))
                                    {
                                        v24 = v20;
                                        goto LABEL_c3ba80;
                                    }
                                }
                                else
                                {
                                    v24 = v8;
                                    v25 = arm64g_calculate_condition(4, v20, v8, 0);
                                    if (v25 & 1)
                                        goto LABEL_c3ba80;
                                }
                                v18 = v8;
                                a0 = sub_c73cc8(i);
LABEL_c3ba7c:
                                v24 = 0;
LABEL_c3ba80:
                                v8 -= v24;
                                v17 = i;
                                i += v24;
                                v19 = v18;
                                break;
                            }
                        }
                        if (v8)
                        {
                            *(unsigned long long *)a0->padding_0 = v17;
                            *(unsigned long long *)&a0->field_8 = v19;
                            *(unsigned long long *)&a0[1].padding_0[4] = i;
                            *(unsigned long long *)a0[2].padding_0 = v8;
                            return;
                        }
                        *(char *)&a0->field_8 = 0;
                        *(unsigned long long *)a0->padding_0 = 0;
                        return;
                    }
                    sub_c73cc8(v5, i);
                    sub_c73cc8(i);
                }
            }
        }
    }
    *(char *)&a0->field_8 = 0;
    *(unsigned long long *)a0->padding_0 = 0;
    return;
}
