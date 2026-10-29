/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e1bdc..0x9e1d7c (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e1bdc_0 {
    uint128_t *field_0;
    unsigned int field_8;
} st_9e1bdc_0;


int sub_9e1bdc(st_9e1bdc_0 *a0, st_9e1bdc_0 *a1, st_9e1bdc_0 *a2)
{
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    unsigned long long v12;  // x12
    uint128_t *iter;  // x13
    uint128_t *iter1;  // x14
    uint128_t *iter2;  // x15
    unsigned long long j;  // x16
    unsigned long long v17;  // x16
    uint128_t v18;  // q1
    uint128_t v19;  // q3
    unsigned long long v21;  // x13
    st_9e1bdc_0 *v4;  // x20
    unsigned long long *v22;  // x11
    unsigned long long *v23;  // x10
    unsigned long long *v24;  // x9
    unsigned long long i;  // x12
    unsigned long long v26;  // x12
    unsigned long long *v27;  // x9
    unsigned long long *v28;  // x10
    unsigned long long v30;  // x9
    unsigned long v31;  // cc_dep1
    unsigned long long v5;  // 4105
    unsigned long v32;  // cc_dep2
    uint128_t *v33;  // x10
    uint128_t *v34;  // x11
    unsigned long long v35;  // x14
    unsigned long long v36;  // x12
    unsigned long long v37;  // x8
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4102
    unsigned long long v6;  // 4105
    unsigned long long v42;  // x8
    unsigned long long v43;  // x13
    unsigned long v44;  // x15
    uint128_t *v45;  // x14
    uint128_t *node;  // x15
    unsigned long long k;  // x16
    unsigned long long v48;  // x16
    uint128_t v49;  // q1
    unsigned long long v51;  // x12
    unsigned long long v7;  // x0
    unsigned long long *v52;  // x11
    unsigned long long *v53;  // x10
    unsigned long long l;  // x8
    unsigned long long v55;  // x8
    unsigned long long *v56;  // x10
    unsigned long long v8;  // x8
    uint128_t *v9;  // x9
    uint128_t *v10;  // x10
    uint128_t *v11;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    v3 = a2->field_8;
    if ((int)a1->field_8 < (int)a2->field_8)
    {
        v4 = a2;
        v5 = arm64g_calculate_condition(179, v2, v3, 0);
        if (!(v5 & 1))
            goto LABEL_9e1c02;
LABEL_9e1c01:
    }
    else
    {
        v4 = a1;
        v6 = arm64g_calculate_condition(179, v2, v3, 0);
        if (v6 & 1)
            goto LABEL_9e1c01;
LABEL_9e1c02:
        a1 = a2;
    }
    v7 = sub_9e4cdc();
    if (v7)
    {
        v8 = a1->field_8;
        if ((int)v8 >= 1)
        {
            v9 = v4->field_0;
            v10 = a1->field_0;
            v11 = a0->field_0;
            if (5 >= (unsigned int)v8)
            {
                v12 = 0;
            }
            else
            {
                v12 = 0;
                if (v11 - v9 >= 32 && v11 - v10 >= 32)
                {
                    v12 = v8 & 0x7ffffffc;
                    iter = v9 + 1;
                    iter1 = v10 + 1;
                    iter2 = v11 + 1;
                    j = v12;
                    do
                    {
                        v17 = j;
                        v18 = *iter;
                        v19 = *iter1;
                        *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)iter - 16) ^ *(int128_t *)((char *)iter1 - 16);
                        *iter2 = v18 ^ v19;
                        iter += 2;
                        iter1 += 2;
                        iter2 += 2;
                        j = v17 - 4;
                    } while (j);
                    if (v12 == v8)
                        goto LABEL_9e1c68;
                }
            }
            v21 = v12 * 8;
            v22 = (char *)v11 + v21;
            v23 = (char *)v10 + v21;
            v24 = (char *)v9 + v21;
            i = v8 - v12;
            do
            {
                v26 = i;
                v27 = v24 + 1;
                v28 = v23 + 1;
                *v22 = *v23 ^ *v24;
                v22 += 1;
                v24 = v27;
                v23 = v28;
                i = v26 - 1;
            } while (i);
        }
        else
        {
            v8 = 0;
        }
LABEL_9e1c68:
        v30 = v4->field_8;
        v31 = v8 & 0xffffffff;
        v32 = v30 & 0xffffffff;
        if ((int)v30 > (int)v8)
        {
            v33 = v4->field_0;
            v34 = a0->field_0;
            v35 = v8 & 0xffffffff;
            v36 = v30 - v35;
            v37 = v34 - v33;
            if (4 <= v36)
            {
                v38 = arm64g_calculate_condition(35, v31, v32, 0);
                v39 = arm64g_calculate_condition(132, (v38 & 1 ? v37 : 0), (v38 & 1 ? 31 : 0), 0);
                if (v39 & 1)
                    goto LABEL_9e1d00;
LABEL_9e1c94:
                v42 = v35;
            }
            else
            {
                v40 = arm64g_calculate_condition(35, v31, v32, 0);
                v41 = arm64g_calculate_condition(128, (v40 & 1 ? v37 : 0), (v40 & 1 ? 31 : 0), 0);
                if (!(v41 & 1))
                    goto LABEL_9e1c94;
LABEL_9e1d00:
                v43 = v36 & 0xfffffffffffffffc;
                v42 = v43 + v35;
                v44 = v35 * 8 + 16;
                v45 = (char *)v33 + v44;
                node = (char *)v34 + v44;
                k = v43;
                do
                {
                    v48 = k;
                    v49 = *v45;
                    *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v45 - 16);
                    *node = v49;
                    v45 += 2;
                    node += 2;
                    k = v48 - 4;
                } while (k);
                if (v36 == v43)
                    goto LABEL_9e1d5c;
            }
            v51 = v42 * 8;
            v52 = (char *)v34 + v51;
            v53 = (char *)v33 + v51;
            l = v30 - v42;
            do
            {
                v55 = l;
                v56 = v53 + 1;
                *v52 = *v53;
                v52 += 1;
                l = v55 - 1;
                v53 = v56;
            } while (l);
        }
LABEL_9e1d5c:
        a0->field_8 = v30;
        sub_9e5708(a0);
        v7 = 1;
    }
    return v7;
}
