/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa830a4..0xa83238 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a830a4_1 {
    unsigned short field_0;
} st_a830a4_1;

typedef struct st_a830a4_3 {
    uint128_t field_0;
    uint128_t field_10;
} st_a830a4_3;

typedef struct st_a830a4_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    char padding_38[16];
    struct st_a830a4_1 *field_48;
} st_a830a4_0;

typedef struct st_a830a4_2 {
    struct st_a830a4_0 *field_0;
    char padding_8[40];
    struct st_a830a4_3 *field_30;
    struct st_a830a4_3 *field_38;
    struct st_a830a4_1 *field_40;
    char padding_48[8];
    struct st_a830a4_1 *field_50;
    struct st_a830a4_3 *field_58;
} st_a830a4_2;


unsigned short * sub_a830a4(unsigned long long *a0, unsigned long a1, st_a830a4_2 *a2)
{
    unsigned short *v0;  // x9
    st_a830a4_0 *v1;  // x8
    unsigned short *v10;  // w16
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // 4106
    unsigned long long v13;  // 4106
    st_a830a4_0 *v14;  // x11
    unsigned short *v15;  // w12
    unsigned long long *v16;  // x9
    uint128_t *v17;  // x10
    unsigned short *v18;  // x13
    unsigned long long *v19;  // x14
    unsigned short *v2;  // w10
    unsigned short *j;  // w12
    unsigned short *v21;  // x15
    unsigned short *v22;  // x0
    unsigned short *v23;  // w17
    unsigned long long *node;  // x16
    unsigned long v25;  // x3
    unsigned short *v26;  // w1
    unsigned long v27;  // cc_dep1
    unsigned long long v28;  // 4106
    unsigned long long v29;  // 4106
    unsigned long long *v3;  // x11
    uint128_t *v30;  // x11
    uint128_t v31;  // q1
    uint128_t *v32;  // x8
    uint128_t v33;  // q1
    uint128_t v34;  // q1
    unsigned short *i;  // w10
    unsigned short *v5;  // x12
    unsigned short *v6;  // x15
    unsigned short *v7;  // w14
    unsigned long long *iter;  // x13
    unsigned long v9;  // x17

    v0 = a2->field_50;
    if (!v0)
        return 0;
    v1 = a2->field_0;
    if (v1->field_8 != a1)
        return 0;
    v2 = (unsigned short *)(int)v1->field_48;
    if (v2 >= 1)
    {
        v3 = a0;
        do
        {
            i = v2;
            v5 = 0;
            v6 = 0;
            v7 = (unsigned short *)0;
            iter = v3;
            do
            {
                v9 = *(short *)(v0 + v5);
                v10 = v7 + 6;
                if (0x33 < v7)
                {
                    *iter = v9 << ((char)v7 & 63) | v6;
                    iter += 1;
                    v11 = v10;
                    if (v10 == 64)
                    {
                        v6 = 0;
                        v12 = arm64g_calculate_condition(3, v11, 64, 0);
                        if (!(v12 & 1))
                            goto LABEL_a83116;
                    }
                    else
                    {
                        v6 = v9 >> ((char)-v7 & 63);
                        v13 = arm64g_calculate_condition(3, v11, 64, 0);
                        if (!(v13 & 1))
                        {
LABEL_a83116:
                            v7 = (char *)v7 - 52;
                            continue;
                        }
                    }
                    v7 = (unsigned short *)0;
                    continue;
                }
                else
                {
                    v6 |= v9 << ((char)v7 & 63);
                    v7 = v10;
                }
            } while ((v5 += 1, 0x1fe > (char *)v5 - 2));
            v0 += 0x100;
            v3 += 48;
            v2 = (char *)i - 1;
        } while (i > 1);
        v14 = a2->field_0;
        v15 = (unsigned short *)(int)v14->field_48;
        v16 = (char *)a0 + v1->field_30;
        v17 = &a2->field_30->field_0;
        if (v15 >= 1)
        {
            v18 = a2->field_40;
            v19 = v16;
            do
            {
                j = v15;
                v21 = 0;
                v22 = 0;
                v23 = (unsigned short *)0;
                node = v19;
                do
                {
                    v25 = *(short *)(v18 + v21);
                    v26 = v23 + 6;
                    if (0x33 < v23)
                    {
                        *node = v25 << ((char)v23 & 63) | v22;
                        node += 1;
                        v27 = v26;
                        if (v26 == 64)
                        {
                            v22 = 0;
                            v28 = arm64g_calculate_condition(3, v27, 64, 0);
                            if (!(v28 & 1))
                                goto LABEL_a831be;
                        }
                        else
                        {
                            v22 = v25 >> ((char)-v23 & 63);
                            v29 = arm64g_calculate_condition(3, v27, 64, 0);
                            if (!(v29 & 1))
                            {
LABEL_a831be:
                                v23 = (char *)v23 - 52;
                                continue;
                            }
                        }
                        v23 = (unsigned short *)0;
                        continue;
                    }
                    else
                    {
                        v22 |= v25 << ((char)v23 & 63);
                        v23 = v26;
                    }
                } while ((v21 += 1, 0x1fe > (char *)v21 - 2));
                v18 += 0x100;
                v19 += 48;
                v15 = (char *)j - 1;
            } while (j > 1);
        }
    }
    else
    {
        v16 = (char *)a0 + v1->field_30;
        v17 = &a2->field_30->field_0;
        v14 = v1;
    }
    v30 = (char *)v16 + v14->field_30;
    v31 = v17[1];
    *v30 = *v17;
    v30[1] = v31;
    v32 = (char *)v16 + v1->field_18;
    v33 = a2->field_38->field_10;
    *v32 = a2->field_38->field_0;
    v32[1] = v33;
    v34 = a2->field_58->field_10;
    v32[2] = a2->field_58->field_0;
    v32[3] = v34;
    return 1;
}
