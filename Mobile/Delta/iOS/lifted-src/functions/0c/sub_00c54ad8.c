/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54ad8..0xc54f0c (1076 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c54ad8_0 {
    void* field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_c54ad8_0;

typedef struct st_c54ad8_1 {
    char padding_0[8];
    unsigned long long field_8;
    void* field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    void* field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    char field_48;
    unsigned long long field_49;
    unsigned short field_4a;
} st_c54ad8_1;


st_c54ad8_1 * sub_c54ad8(st_c54ad8_1 *a0, st_c54ad8_0 *a1)
{
    unsigned long long v0;  // x9
    void* v1;  // x8
    unsigned long long v10;  // x4
    unsigned long long v11;  // x13
    unsigned long long v12;  // x12
    unsigned long long v13;  // x11
    unsigned long long v14;  // x14
    unsigned long long v15;  // x15
    void* v16;  // x8
    unsigned long v17;  // x13
    unsigned long long v18;  // 4112
    unsigned long v19;  // cc_dep1
    unsigned long long v2;  // x10
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // x17
    unsigned long long v22;  // x16
    unsigned long v23;  // x15
    void* v24;  // x8
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v3;  // x13
    unsigned long long iter;  // x17
    unsigned long v31;  // cc_dep1
    unsigned int v32;  // w2
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4102
    unsigned long long v35;  // 4112
    unsigned long long v36;  // 4102
    unsigned long long v37;  // w5
    unsigned long long v38;  // x8
    unsigned long long v39;  // 4121
    void* v4;  // x16
    unsigned long long v40;  // x4
    unsigned long long v41;  // 4160
    unsigned long long v42;  // x4
    unsigned long long v43;  // 4160
    unsigned long v5;  // x3
    void* v6;  // x16
    unsigned long long v7;  // 4130
    unsigned long long v8;  // 4112
    unsigned long long v9;  // x2

    v0 = (unsigned long long)a1->padding_8;
    if (!v0)
    {
        *(unsigned long long *)a0->padding_0 = 2;
        return a0;
    }
    v1 = a1->field_0;
    if (v0 <= 3)
    {
LABEL_c54ea0:
        a1->field_0 = 1;
        *(unsigned long long *)a1->padding_8 = 0;
        a0->field_8 = 19;
        a0->field_10 = v1;
        *(unsigned long long *)a0->padding_0 = 3;
        return a0;
    }
    v2 = a1->field_10;
    v3 = v0 - 4;
    v4 = v1;
    v5 = *(int *)v4;
    v6 = v4 + 4;
    v7 = arm64g_calculate_condition(49, v5 & 0xffffffff, 16, 0);
    if (!(v7 & 1))
    {
        v8 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0);
        if (!(v8 & 1))
        {
            a1->field_0 = 1;
            *(unsigned long long *)a1->padding_8 = 0;
            a0->field_8 = 16;
            a0->field_10 = v1;
            *(unsigned long long *)a0->padding_0 = 3;
            return a0;
        }
        if (v3 > 7)
        {
            v11 = v0 - 12;
            v6 = v1 + 12;
            v12 = (char)v1[11] * 0x100000000000000 | ((int)v1[4] * 0x100 | ((short)v1[8] | (char)v1[10] * 0x10000) * 0x10000000000) >> 8;
            v13 = 8;
            v14 = v11 - v12;
            if (v12 <= v11)
                goto LABEL_c54b34;
        }
    }
    else
    {
        v13 = 4;
        v14 = v3 - v5;
        v12 = v5;
        if (v3 >= v12)
        {
LABEL_c54b34:
            a1->field_0 = v6 + v12;
            *(unsigned long long *)a1->padding_8 = v14;
            if (v12 > 1)
            {
                v15 = v12 - 2;
                v16 = v6;
                v17 = *(short *)v16;
                v1 = v16 + 2;
                if (3 > (unsigned int)v17 - 2)
                {
                    v18 = arm64g_calculate_condition(49, v5 & 0xffffffff, 16, 0);
                    if (!(v18 & 1))
                    {
                        v19 = v15;
                        v20 = 7;
                        if (v15 > 7)
                        {
                            v21 = v12 - 10;
                            v1 = v6 + 10;
                            v22 = (char)v6[9] * 0x100000000000000 | ((int)v6[2] * 0x100 | ((short)v6[6] | (char)v6[8] * 0x10000) * 0x10000000000) >> 8;
                            goto LABEL_c54c18;
                        }
                    }
                    else
                    {
                        v19 = v15;
                        v20 = 3;
                        if (v15 > 3)
                        {
                            v21 = v12 - 6;
                            v1 = v6 + 6;
                            v22 = (int)v6[2];
LABEL_c54c18:
                            if (v21)
                            {
                                v23 = *(char *)v1;
                                v24 = v1 + 1;
                                v9 = (unsigned int)v23 - 1;
                                v10 = (unsigned int)v23 & 15;
                                if (((unsigned int)v9 & 0xff) < (((unsigned int)v23 ^ (unsigned int)v9) & 0xff))
                                {
                                    v25 = arm64g_calculate_condition(132, v19, v20, 0);
                                    v26 = arm64g_calculate_condition(3, (v25 & 1 ? v10 & 0xffffffff : 0x40000000), 0, 0);
                                    if (v26 & 1)
                                    {
                                        a1->field_0 = 1;
                                        *(unsigned long long *)a1->padding_8 = 0;
                                        a0->field_8 = 25 | (v23 & 0xff) * 0x100;
                                        a0->field_10 = v24;
                                        *(unsigned long long *)a0->padding_0 = 3;
                                        return a0;
                                    }
                                    a1->field_10 = v2 + v0 - v14;
                                    *(unsigned long long *)a0->padding_0 = 0;
                                    a0->field_8 = v2;
                                    a0->field_10 = 0;
                                    a0->field_18 = v9;
                                    a0->field_20 = v10;
                                    a0->field_28 = v24;
                                    a0->field_30 = v21 - 1;
                                    a0->field_38 = v12;
                                    a0->field_40 = v22;
                                    a0->field_48 = v23;
                                    (&a0->field_48)[1] = v13;
                                    *(unsigned short *)&(&a0->field_48)[2] = v17;
                                    return a0;
                                }
                                else
                                {
                                    v27 = arm64g_calculate_condition(132, v19, v20, 0);
                                    v28 = arm64g_calculate_condition(0, (v27 & 1 ? v10 & 0xffffffff : 0x40000000), 0, 0);
                                    if (v28 & 1)
                                    {
                                        a1->field_0 = 1;
                                        *(unsigned long long *)a1->padding_8 = 0;
                                        a0->field_8 = 25 | (v23 & 0xff) * 0x100;
                                        a0->field_10 = v24;
                                        *(unsigned long long *)a0->padding_0 = 3;
                                        return a0;
                                    }
                                    a1->field_10 = v2 + v0 - v14;
                                    *(unsigned long long *)a0->padding_0 = 0;
                                    a0->field_8 = v2;
                                    a0->field_10 = 0;
                                    a0->field_18 = v9;
                                    a0->field_20 = v10;
                                    a0->field_28 = v24;
                                    a0->field_30 = v21 - 1;
                                    a0->field_38 = v12;
                                    a0->field_40 = v22;
                                    a0->field_48 = v23;
                                    (&a0->field_48)[1] = v13;
                                    *(unsigned short *)&(&a0->field_48)[2] = v17;
                                    return a0;
                                }
                            }
                        }
                    }
                }
                else
                {
                    if ((unsigned int)v17 != 5)
                    {
                        a1->field_0 = 1;
                        *(unsigned long long *)a1->padding_8 = 0;
                        a0->field_8 = 0x11;
                        a0->field_10 = v17;
                        *(unsigned long long *)a0->padding_0 = 3;
                        return a0;
                    }
                    if (v15)
                    {
                        v31 = v12;
                        if (v12 == 3)
                        {
                            a1->field_0 = 1;
                            *(unsigned long long *)a1->padding_8 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v6 + 3;
                            *(unsigned long long *)a0->padding_0 = 3;
                            return a0;
                        }
                        v23 = (char)v6[3];
                        v24 = (unsigned int)v23 - 1;
                        v32 = (unsigned int)v23 & 15;
                        if (((unsigned int)v24 & 0xff) < (((unsigned int)v23 ^ (unsigned int)v24) & 0xff))
                        {
                            v33 = arm64g_calculate_condition(132, v31, 3, 0);
                            v34 = arm64g_calculate_condition(19, (v33 & 1 ? v32 : 0x40000000), 0, 0);
                            if (!(v34 & 1))
                            {
                                a1->field_0 = 1;
                                *(unsigned long long *)a1->padding_8 = 0;
                                a0->field_8 = 25 | (v23 & 0xff) * 0x100;
                                a0->field_10 = v24;
                                *(unsigned long long *)a0->padding_0 = 3;
                                return a0;
                            }
                        }
                        else
                        {
                            v35 = arm64g_calculate_condition(132, v31, 3, 0);
                            v36 = arm64g_calculate_condition(16, (v35 & 1 ? v32 : 0x40000000), 0, 0);
                            if (!(v36 & 1))
                            {
                                a1->field_0 = 1;
                                *(unsigned long long *)a1->padding_8 = 0;
                                a0->field_8 = 25 | (v23 & 0xff) * 0x100;
                                a0->field_10 = v24;
                                *(unsigned long long *)a0->padding_0 = 3;
                                return a0;
                            }
                        }
                        v37 = (char)v6[2];
                        v38 = v12 - 4;
                        v39 = arm64g_calculate_condition(49, v5 & 0xffffffff, 16, 0);
                        if (!(v39 & 1))
                        {
                            if (v38 > 7)
                            {
                                iter = v12 - 12;
                                v1 = v6 + 12;
                                v22 = (char)v6[11] * 0x100000000000000 | ((int)v6[4] * 0x100 | ((short)v6[8] | (char)v6[10] * 0x10000) * 0x10000000000) >> 8;
                            }
                            else
                            {
                                a1->field_0 = 1;
                                *(unsigned long long *)a1->padding_8 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v6 + 4;
                                *(unsigned long long *)a0->padding_0 = 3;
                                return a0;
                            }
                        }
                        else
                        {
                            if (v38 > 3)
                            {
                                iter = v12 - 8;
                                v1 = v6 + 8;
                                v22 = (int)v6[4];
                            }
                            else
                            {
                                a1->field_0 = 1;
                                *(unsigned long long *)a1->padding_8 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v6 + 4;
                                *(unsigned long long *)a0->padding_0 = 3;
                                return a0;
                            }
                        }
                        if (3 >= v37)
                        {
                            if (v37 == 1)
                            {
                                v24 = v1;
                                a1->field_10 = v2 + v0 - v14;
                                *(unsigned long long *)a0->padding_0 = 0;
                                a0->field_8 = v2;
                                a0->field_10 = 0;
                                a0->field_18 = 0;
                                a0->field_20 = 66;
                                a0->field_28 = v24;
                                a0->field_30 = iter;
                                a0->field_38 = v12;
                                a0->field_40 = v22;
                                a0->field_48 = v23;
                                (&a0->field_48)[1] = v13;
                                *(unsigned short *)&(&a0->field_48)[2] = v17;
                                return a0;
                            }
                            if (v37 != 2)
                            {
                                if (v37 == 3)
                                {
                                    v24 = v1;
                                    a1->field_10 = v2 + v0 - v14;
                                    *(unsigned long long *)a0->padding_0 = 0;
                                    a0->field_8 = v2;
                                    a0->field_10 = 2;
                                    a0->field_18 = 0;
                                    a0->field_20 = 66;
                                    a0->field_28 = v24;
                                    a0->field_30 = iter;
                                    a0->field_38 = v12;
                                    a0->field_40 = v22;
                                    a0->field_48 = v23;
                                    (&a0->field_48)[1] = v13;
                                    *(unsigned short *)&(&a0->field_48)[2] = v17;
                                    return a0;
                                }
                                a1->field_0 = 1;
                                *(unsigned long long *)a1->padding_8 = 0;
                                a0->field_8 = 66;
                                a0->field_10 = v1;
                                *(unsigned long long *)a0->padding_0 = 3;
                                return a0;
                            }
                            if (iter > 7)
                            {
                                v40 = iter - 8;
                                v9 = (char)v1[7] * 0x100000000000000 | (*(int *)v1 * 0x100 | ((short)v1[4] | (char)v1[6] * 0x10000) * 0x10000000000) >> 8;
                                v41 = arm64g_calculate_condition(49, v5 & 0xffffffff, 16, 0);
                                if (!(v41 & 1))
                                {
                                    if (v40 > 7)
                                    {
                                        v10 = (char)v1[15] * 0x100000000000000 | ((int)v1[8] * 0x100 | ((short)v1[12] | (char)v1[14] * 0x10000) * 0x10000000000) >> 8;
                                        a1->field_10 = v2 + v0 - v14;
                                        *(unsigned long long *)a0->padding_0 = 0;
                                        a0->field_8 = v2;
                                        a0->field_10 = 1;
                                        a0->field_18 = v9;
                                        a0->field_20 = v10;
                                        a0->field_28 = v1 + 16;
                                        a0->field_30 = iter - 16;
                                        a0->field_38 = v12;
                                        a0->field_40 = v22;
                                        a0->field_48 = v23;
                                        (&a0->field_48)[1] = v13;
                                        *(unsigned short *)&(&a0->field_48)[2] = v17;
                                        return a0;
                                    }
                                }
                                else
                                {
                                    if (v40 > 3)
                                    {
                                        v10 = (int)v1[8];
                                        a1->field_10 = v2 + v0 - v14;
                                        *(unsigned long long *)a0->padding_0 = 0;
                                        a0->field_8 = v2;
                                        a0->field_10 = 1;
                                        a0->field_18 = v9;
                                        a0->field_20 = v10;
                                        a0->field_28 = v1 + 12;
                                        a0->field_30 = iter - 12;
                                        a0->field_38 = v12;
                                        a0->field_40 = v22;
                                        a0->field_48 = v23;
                                        (&a0->field_48)[1] = v13;
                                        *(unsigned short *)&(&a0->field_48)[2] = v17;
                                        return a0;
                                    }
                                }
LABEL_c54f00:
                                a1->field_0 = 1;
                                *(unsigned long long *)a1->padding_8 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v1 + 8;
                                *(unsigned long long *)a0->padding_0 = 3;
                                return a0;
                            }
                        }
                        else if (v37 != 4)
                        {
                            if (v37 != 5)
                            {
                                if (v37 != 6)
                                {
                                    a1->field_0 = 1;
                                    *(unsigned long long *)a1->padding_8 = 0;
                                    a0->field_8 = 66;
                                    a0->field_10 = v1;
                                    *(unsigned long long *)a0->padding_0 = 3;
                                    return a0;
                                }
                                if (iter > 7)
                                {
                                    v42 = iter - 8;
                                    v9 = (char)v1[7] * 0x100000000000000 | (*(int *)v1 * 0x100 | ((short)v1[4] | (char)v1[6] * 0x10000) * 0x10000000000) >> 8;
                                    v43 = arm64g_calculate_condition(49, v5 & 0xffffffff, 16, 0);
                                    if (!(v43 & 1))
                                    {
                                        if (v42 > 7)
                                        {
                                            v10 = (char)v1[15] * 0x100000000000000 | ((int)v1[8] * 0x100 | ((short)v1[12] | (char)v1[14] * 0x10000) * 0x10000000000) >> 8;
                                            a1->field_10 = v2 + v0 - v14;
                                            *(unsigned long long *)a0->padding_0 = 0;
                                            a0->field_8 = v2;
                                            a0->field_10 = 5;
                                            a0->field_18 = v9;
                                            a0->field_20 = v10;
                                            a0->field_28 = v1 + 16;
                                            a0->field_30 = iter - 16;
                                            a0->field_38 = v12;
                                            a0->field_40 = v22;
                                            a0->field_48 = v23;
                                            (&a0->field_48)[1] = v13;
                                            *(unsigned short *)&(&a0->field_48)[2] = v17;
                                            return a0;
                                        }
                                    }
                                    else
                                    {
                                        if (v42 > 3)
                                        {
                                            v10 = (int)v1[8];
                                            a1->field_10 = v2 + v0 - v14;
                                            *(unsigned long long *)a0->padding_0 = 0;
                                            a0->field_8 = v2;
                                            a0->field_10 = 5;
                                            a0->field_18 = v9;
                                            a0->field_20 = v10;
                                            a0->field_28 = v1 + 12;
                                            a0->field_30 = iter - 12;
                                            a0->field_38 = v12;
                                            a0->field_40 = v22;
                                            a0->field_48 = v23;
                                            (&a0->field_48)[1] = v13;
                                            *(unsigned short *)&(&a0->field_48)[2] = v17;
                                            return a0;
                                        }
                                    }
                                    goto LABEL_c54f00;
                                }
                            }
                            else if (iter > 7)
                            {
                                v10 = *(int *)v1 * 0x100;
                                v9 = (char)v1[7] * 0x100000000000000 | (v10 | ((short)v1[4] | (char)v1[6] * 0x10000) * 0x10000000000) >> 8;
                                a1->field_10 = v2 + v0 - v14;
                                *(unsigned long long *)a0->padding_0 = 0;
                                a0->field_8 = v2;
                                a0->field_10 = 4;
                                a0->field_18 = v9;
                                a0->field_20 = v10;
                                a0->field_28 = v1 + 8;
                                a0->field_30 = iter - 8;
                                a0->field_38 = v12;
                                a0->field_40 = v22;
                                a0->field_48 = v23;
                                (&a0->field_48)[1] = v13;
                                *(unsigned short *)&(&a0->field_48)[2] = v17;
                                return a0;
                            }
                        }
                        else
                        {
                            if (iter > 7)
                            {
                                v10 = *(int *)v1 * 0x100;
                                v9 = (char)v1[7] * 0x100000000000000 | (v10 | ((short)v1[4] | (char)v1[6] * 0x10000) * 0x10000000000) >> 8;
                                a1->field_10 = v2 + v0 - v14;
                                *(unsigned long long *)a0->padding_0 = 0;
                                a0->field_8 = v2;
                                a0->field_10 = 3;
                                a0->field_18 = v9;
                                a0->field_20 = v10;
                                a0->field_28 = v1 + 8;
                                a0->field_30 = iter - 8;
                                a0->field_38 = v12;
                                a0->field_40 = v22;
                                a0->field_48 = v23;
                                (&a0->field_48)[1] = v13;
                                *(unsigned short *)&(&a0->field_48)[2] = v17;
                                return a0;
                            }
                        }
                    }
                }
                goto LABEL_c54ea0;
            }
        }
    }
    a1->field_0 = 1;
    *(unsigned long long *)a1->padding_8 = 0;
    a0->field_8 = 19;
    a0->field_10 = v6;
    *(unsigned long long *)a0->padding_0 = 3;
    return a0;
}
