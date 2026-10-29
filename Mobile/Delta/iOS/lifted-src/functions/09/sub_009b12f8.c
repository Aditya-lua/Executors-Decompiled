/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b12f8..0x9b1634 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b12f8_0 {
    char padding_0[216];
    struct st_9b12f8_1 *field_d8;
} st_9b12f8_0;

typedef struct st_9b12f8_2 {
    char padding_0[24];
    struct st_9b12f8_0 *field_18;
    char padding_20[40];
    char field_48;
    char padding_49[2183];
    unsigned int field_8d0;
    char padding_8d4[256];
    char field_9d4;
} st_9b12f8_2;

typedef struct st_9b12f8_4 {
    char padding_0[648];
    struct st_9b12f8_3 *field_288;
} st_9b12f8_4;

typedef struct st_9b12f8_3 {
    char padding_0[760];
    void* field_2f8;
    unsigned long long field_300;
} st_9b12f8_3;

typedef struct st_9b12f8_1 {
    char padding_0[80];
    char field_50;
} st_9b12f8_1;

extern void g_e89520;
extern void g_e895b0;

char sub_9b12f8(st_9b12f8_2 *a0, st_9b12f8_4 *a1, long long a2)
{
    st_9b12f8_0 *v3;  // x9
    char v4;  // w10
    char v13;  // w9
    unsigned long long v14;  // 4108
    char v15;  // x21
    unsigned long node;  // x24
    char v17;  // w8
    unsigned long v18;  // x9
    unsigned long v19;  // x9
    unsigned long long v20;  // x22
    char v21;  // w9
    unsigned long long v22;  // 4112
    char v5;  // w8
    char v23;  // x0
    char v24;  // x0
    char v25;  // w23
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // 4123
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4108
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4108
    char v32;  // w11
    void* v6;  // x10
    unsigned int v33;  // w21
    char v34;  // w25
    unsigned int *iter;  // x26
    char v36;  // w10
    unsigned long long v37;  // 4108
    char v7;  // w9
    st_9b12f8_3 *v8;  // x11
    unsigned long v9;  // x10
    void* v10;  // x9
    char v11;  // x23
    char v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_18;
    v4 = *(int *)&v3->padding_0[0];
    v5 = *(int *)&a1->padding_0[4];
    *(unsigned int *)&a0->field_9d4 = v5;
    switch (v4)
    {
    case 65536:
LABEL_9b1368:
        v6 = &g_e89520;
        break;
    case 131071:
        v6 = &g_e895b0;
        break;
    default:
        if (!(v3->field_d8->field_50 >> 3 & 1))
        {
            if (v4 >= 772 && v4 != 0x10000)
                goto LABEL_9b1368;
            if (*(int *)&a0->field_48 > v5)
                return 266;
        }
        else
        {
            v7 = *(int *)&a0->field_48;
            if (v5 != v7)
            {
                if (v5 == 0x100)
                    v5 = 0xff00;
                if (v7 == 0x100)
                    v7 = 0xff00;
                if (v7 < v5)
                    return 266;
            }
        }
        *(unsigned int *)a2 = 0;
        return 0;
    }
    v8 = a1->field_288;
    if (*(int *)&v8[1].padding_0[0])
    {
        if (v3->field_d8->field_50 >> 3 & 1)
            goto LABEL_9b13dc;
        v0 = 0;
        *(unsigned int *)&v8[1].padding_0[4] = 1;
        v9 = v8->field_300;
        if (!v9)
            return 159;
        v10 = v8->field_2f8;
        v11 = v9 - 1;
        if (v11 != *(char *)v10)
            return 159;
        v8->field_2f8 = v10 + v9;
        v8->field_300 = 0;
        if (769 > v5)
        {
            return 292;
        }
        else if (3 > v9)
        {
            v13 = 258;
            v14 = arm64g_calculate_condition(4, v11, 0, 0);
            if (!(v14 & 1))
                return 159;
        }
        else
        {
            v15 = 0;
            node = v10 + 1;
            while (1)
            {
                if (v15 == 0x100)
                    v17 = 0xff00;
                else
                    v17 = v15;
                node += 2;
                v18 = v11 - 2;
                while (1)
                {
                    v11 = v18;
                    v19 = *(short *)(node - 2);
                    v20 = (unsigned int)((v19 & 0xff00) >> 8) | (unsigned int)v19 * 0x100 & 0xff00ff00;
                    if ((unsigned int)v20 != v15)
                    {
                        if (a0->field_18->field_d8->field_50 >> 3 & 1)
                        {
                            if ((unsigned int)v20 == 0x100)
                                v21 = 0xff00;
                            else
                                v21 = v20;
                            if (v21 <= v17)
                                goto LABEL_9b15b4;
                        }
                        else if ((int)v20 >= v15)
                        {
LABEL_9b15b4:
                            if (!sub_9b0e34(a0, v20, &v0))
                                v15 &= 0xffffffff;
                            else
                                v15 = v20 & 0xffffffff;
                            if (1 >= v11)
                            {
LABEL_9b15d4:
                                if (v11)
                                {
                                    return 159;
                                }
                                else if (!v15)
                                {
                                    return 258;
                                }
                                else if (a0->field_8d0)
                                {
                                    if (v15 == 772)
                                        v23 = 0;
                                    else
                                        v23 = 258;
                                    return v23;
                                }
                                else
                                {
                                    sub_9b1634(a0, v15, a2);
                                    *(unsigned int *)&a0->field_48 = v15;
                                    a0->field_18 = v0;
                                    if (!sub_c64b00(a0, v15))
                                        v24 = 786691;
                                    else
                                        v24 = 0;
                                    return v24;
                                }
                            }
                            break;
                        }
                    }
                    node += 2;
                    v18 = v11 - 2;
                    v22 = arm64g_calculate_condition(0x22, v18, 2, 0);
                    if (v22 & 1)
                        goto LABEL_9b15d4;
                }
            }
        }
    }
    else
    {
        if (a0->field_8d0)
            return 258;
LABEL_9b13dc:
        v25 = 0x303;
        v26 = v5;
        if (v5 != 772)
        {
            v27 = arm64g_calculate_condition(211, v26, 772, 0);
            if (v27 & 1)
            {
                v28 = arm64g_calculate_condition(211, v26, 772, 0);
                v29 = arm64g_calculate_condition(3, (v28 & 1 ? v5 : 0x40000000), (v28 & 1 ? 0x100 : 0), 0);
                if (!(v29 & 1))
                    goto LABEL_9b13fa;
LABEL_9b13f9:
                v32 = v5;
            }
            else
            {
                v30 = arm64g_calculate_condition(211, v26, 772, 0);
                v31 = arm64g_calculate_condition(0, (v30 & 1 ? v5 : 0x40000000), (v30 & 1 ? 0x100 : 0), 0);
                if (v31 & 1)
                    goto LABEL_9b13f9;
LABEL_9b13fa:
                v32 = 0x303;
            }
            if (v5 >= 0x303)
                v5 = 0x303;
            if (v3->field_d8->field_50 & 8)
                v25 = v32;
            else
                v25 = v5;
        }
        v33 = *(int *)v6;
        if (!*(int *)v6)
            return 396;
        if (v25 == 0x100)
            v34 = 0xff00;
        else
            v34 = v25;
        iter = v6 + 24;
        do
        {
            if (*(long long *)((char *)iter - 8))
            {
                if (v25 == v33)
                {
                    (*(long long *)((char *)iter - 8))();
                }
                else if (a0->field_18->field_d8->field_50 >> 3 & 1)
                {
                    if (v33 == 0x100)
                        v36 = 0xff00;
                    else
                        v36 = v33;
                    if (v34 <= v36)
                        (*(long long *)((char *)iter - 8))();
                }
                else if (v25 >= (int)v33)
                {
                    (*(long long *)((char *)iter - 8))();
                }
            }
        } while ((v33 = *iter, iter += 6, v33));
        v13 = 396;
        v37 = arm64g_calculate_condition(3, 0, 0, 0);
        if (!(v37 & 1))
            return 258;
    }
    return v13;
}
