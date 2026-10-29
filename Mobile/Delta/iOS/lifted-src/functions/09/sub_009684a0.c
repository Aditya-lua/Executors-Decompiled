/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9684a0..0x9687c4 (804 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9684a0_1 {
    char padding_0[656];
    unsigned int field_290;
    char padding_294[4];
    unsigned int field_298;
    char padding_29c[980];
    struct st_9684a0_0 *field_670;
    unsigned long long field_678;
} st_9684a0_1;

typedef struct st_9684a0_6 {
    unsigned short field_0;
} st_9684a0_6;

typedef struct st_9684a0_3 {
    char padding_0[216];
    struct st_9684a0_2 *field_d8;
} st_9684a0_3;

typedef struct st_9684a0_5 {
    char padding_0[8];
    struct st_9684a0_1 *field_8;
    char padding_10[8];
    struct st_9684a0_3 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[44];
    unsigned int field_78;
    char padding_7c[644];
    struct st_9684a0_4 *field_300;
    char padding_308[1400];
    void* field_880;
    char padding_888[298];
    char field_9b2;
    char padding_9b3[213];
    unsigned long long field_a88;
    struct st_9684a0_6 *field_a90;
} st_9684a0_5;

typedef struct st_9684a0_4 {
    char padding_0[24];
    unsigned int field_18;
} st_9684a0_4;

typedef struct st_9684a0_0 {
    unsigned int field_0;
    char padding_4[20];
    unsigned int field_18;
    unsigned short field_1c;
} st_9684a0_0;

typedef struct st_9684a0_2 {
    char padding_0[80];
    unsigned int field_50;
} st_9684a0_2;

extern unsigned short g_d280f4;
extern unsigned int g_d28258;
extern unsigned int g_d2825a;

unsigned int sub_9684a0(st_9684a0_5 *a0, unsigned int a1)
{
    st_9684a0_1 *v4;  // x21
    unsigned long long v5;  // 4120
    unsigned long long v14;  // 4105
    unsigned long long v15;  // 4105
    unsigned int v16;  // w8
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // 4105
    unsigned long long v19;  // 4105
    unsigned int v20;  // x27
    unsigned int v21;  // w26
    unsigned short *v22;  // x8
    unsigned long v23;  // x9
    unsigned int v6;  // w10
    unsigned long v24;  // x9
    unsigned long v26;  // x9
    unsigned short *v27;  // x8
    unsigned long v28;  // x9
    unsigned short *v29;  // x9
    unsigned long long v30;  // x10
    unsigned int v31;  // x10
    unsigned long v32;  // x9
    st_9684a0_0 *v33;  // x8
    unsigned int v7;  // x28
    unsigned long v34;  // x9
    unsigned long v35;  // cc_dep1
    unsigned long long v36;  // x9
    unsigned long long v37;  // 4107
    unsigned long long v38;  // 4107
    unsigned long long v39;  // x10
    unsigned long v40;  // x20
    unsigned long long v41;  // 4118
    unsigned long long v42;  // 4116
    unsigned int v8;  // x22
    unsigned int v9;  // x23
    unsigned int v10;  // w8
    unsigned short *v11;  // x24
    unsigned long v12;  // x25
    unsigned long v13;  // cc_dep1
    unsigned int v0;  // [bp-0x68]
    unsigned short v1;  // [bp-0x62]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0->field_78)
    {
        v4 = a0->field_8;
        v5 = arm64g_calculate_condition(0x11, a1, 2, 0);
        if (v5 & 1)
        {
LABEL_96851c:
            if (!(a0->field_9b2 >> 6 & 1))
            {
                v8 = (unsigned int)a0[1].field_8;
                v9 = (unsigned int)a0[1].padding_0;
                v10 = (short)a0->field_880[30] & 3;
                if (1 >= (int)v10)
                {
                    if (!v10)
                    {
                        v11 = a0->field_a90;
                        if (a0->field_a90)
                        {
                            v12 = a0->field_a88;
                        }
                        else
                        {
                            v11 = *(long long *)&v4->field_298;
                            v12 = *(long long *)&v4->field_290;
                        }
                    }
                    else
                    {
                        v11 = &g_d28258;
                        v12 = 1;
                    }
                }
                else
                {
                    v13 = v10 & 0xffff;
                    if (v10 == 2)
                    {
                        v11 = &g_d2825a;
                        v14 = arm64g_calculate_condition(3, v13, 2, 0);
                        if (!(v14 & 1))
                            goto LABEL_96859e;
LABEL_96859d:
                        v12 = 1;
                    }
                    else
                    {
                        v11 = &g_d28258;
                        v15 = arm64g_calculate_condition(3, v13, 2, 0);
                        if (v15 & 1)
                            goto LABEL_96859d;
LABEL_96859e:
                        v12 = 2;
                    }
                }
            }
            else
            {
                v16 = (short)a0->field_880[30] & 3;
                if (1 >= (int)v16)
                {
                    if (!v16)
                    {
                        v8 = (unsigned int)a0->field_a90;
                        if (a0->field_a90)
                        {
                            v9 = a0->field_a88;
                        }
                        else
                        {
                            v8 = *(long long *)&v4->field_298;
                            v9 = *(long long *)&v4->field_290;
                        }
                    }
                    else
                    {
                        v8 = (unsigned int)&g_d28258;
                        v9 = 1;
                    }
                }
                else
                {
                    v17 = v16 & 0xffff;
                    if (v16 == 2)
                    {
                        v8 = (unsigned int)&g_d2825a;
                        v18 = arm64g_calculate_condition(3, v17, 2, 0);
                        if (!(v18 & 1))
                            goto LABEL_9685c6;
LABEL_9685c5:
                        v9 = 1;
                    }
                    else
                    {
                        v8 = (unsigned int)&g_d28258;
                        v19 = arm64g_calculate_condition(3, v17, 2, 0);
                        if (v19 & 1)
                            goto LABEL_9685c5;
LABEL_9685c6:
                        v9 = 2;
                    }
                }
                v11 = a0[1].field_8;
                v12 = (unsigned long)a0[1].padding_0;
            }
            if (v9)
            {
                v20 = 0;
                v21 = 0;
                v0 = a1;
                do
                {
                    v7 = *(short *)(v8 + v20 * 2);
                    v22 = v11;
                    v23 = v12;
                    if (v23)
                    {
                        do
                        {
                            v24 = v23;
                            if (*v22 == v7)
                            {
                                v26 = a0->field_8->field_678;
                                if (a0->field_8->field_678)
                                {
                                    v27 = &a0->field_8->field_670->field_1c;
                                    do
                                    {
                                        v28 = v26;
                                        if (*v27 == v7)
                                        {
                                            v1 = (unsigned short)((v7 & 0xff00) >> 8) | (unsigned short)v7 * 0x100 & 0xff00;
                                            if (v7)
                                            {
                                                v29 = &g_d280f4;
                                                v30 = 45;
                                                do
                                                {
                                                    v31 = v30;
                                                    if (*v29 == v7)
                                                        goto LABEL_9686c4;
                                                } while ((v29 += 4, v30 = v31 - 1, v31 != 1));
                                            }
LABEL_9686c4:
                                            if (!sub_959e54(a0, 0x20005, *(int *)((char *)v27 - 4)))
                                            {
                                                a1 = v0;
                                                break;
                                            }
                                            else
                                            {
                                                v32 = v4->field_678;
                                                if (v4->field_678)
                                                {
                                                    v33 = v4->field_670;
                                                    do
                                                    {
                                                        v34 = v32;
                                                        if (v33->field_1c == v7)
                                                        {
                                                            v35 = a0->field_18->field_d8->field_50 & 8;
                                                            if (!(a0->field_18->field_d8->field_50 & 8))
                                                            {
                                                                v36 = 32;
                                                                v37 = arm64g_calculate_condition(9, v35, 0, 0);
                                                                if (!(v37 & 1))
                                                                    goto LABEL_96872a;
                                                                goto LABEL_968729;
                                                            }
                                                            else
                                                            {
                                                                v36 = 40;
                                                                v38 = arm64g_calculate_condition(9, v35, 0, 0);
                                                                if (v38 & 1)
                                                                {
LABEL_968729:
                                                                    v39 = 36;
                                                                    goto LABEL_96872c;
                                                                }
                                                                else
                                                                {
                                                                    v39 = 44;
LABEL_96872a:
LABEL_96872c:
                                                                    v40 = *(int *)((char *)v33 + v39);
                                                                    v41 = arm64g_calculate_condition(1, v40 & 0xffffffff, 1, 0);
                                                                    if (v41 & 1 || *(int *)((char *)v33 + v36) && sub_9ae69c(a0, a0->field_48) >> 31 & 1 || (unsigned int)v40 && (int)sub_9ae69c(a0, a0->field_48, v40) > 0)
                                                                    {
                                                                        a1 = v0;
                                                                    }
                                                                    else
                                                                    {
                                                                        a1 = v0;
                                                                        if (a1 == v21)
                                                                            return v7 & 0xffff;
                                                                        v21 += 1;
                                                                    }
                                                                    goto LABEL_968624;
                                                                }
                                                            }
                                                        }
                                                    } while ((v33 = (char *)&v33[1].field_18 + 2, v32 = v34 - 1, v34 != 1));
                                                }
                                            }
                                        }
                                    } while ((v27 += 28, v26 = v28 - 1, v28 != 1));
                                }
                            }
                        } while ((v23 = v24 - 1, v22 += 1, v24 != 1));
                    }
LABEL_968624:
                } while ((v20 += 1, v20 != v9));
            }
            else
            {
                v21 = 0;
            }
            v42 = arm64g_calculate_condition(1, a1, 1, 0);
            if (v42 & 1)
                v7 = v21;
            else
                v7 = 0;
        }
        else if ((char)a0->field_880[30] & 3)
        {
            if (a0->field_300->field_18 == 50380844)
                v6 = 24;
            else
                v6 = 0;
            if (a0->field_300->field_18 == 50380843)
                v7 = 23;
            else
                v7 = v6;
        }
        else
        {
            a1 = 0;
            goto LABEL_96851c;
        }
    }
    else
    {
        v7 = 0;
    }
    return v7 & 0xffff;
}
