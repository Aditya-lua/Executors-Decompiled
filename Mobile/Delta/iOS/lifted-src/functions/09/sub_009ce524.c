/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ce524..0x9ceb40 (1564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ce524_0 {
    unsigned int field_0;
    unsigned int field_4;
    struct st_9ce524_0 *field_8;
} st_9ce524_0;

typedef struct st_9ce524_4 {
    char field_0;
    char padding_1[31];
    long long field_20;
} st_9ce524_4;

typedef struct st_9ce524_3 {
    char field_0;
    char padding_1[15];
    unsigned long long field_10;
    char padding_18[8];
    struct st_9ce524_1 *field_20;
    unsigned int field_28;
} st_9ce524_3;

typedef struct st_9ce524_1 {
    char padding_0[8];
    char field_8;
    char padding_9[39];
    struct st_9ce524_2 *field_30;
    struct st_9ce524_2 *field_38;
} st_9ce524_1;

typedef struct st_9ce524_2 {
    char field_0;
} st_9ce524_2;

extern unsigned long long g_c7c2eb;

unsigned long long sub_9ce524(long long a0, st_9ce524_0 **a1, unsigned long long a2, st_9ce524_3 *a3, char a4, char a5, char a6, st_9ce524_4 *a7)
{
    unsigned long long v7;  // x21
    st_9ce524_0 **v8;  // x22
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    char i;  // x27
    unsigned long v21;  // x24
    char v22;  // x0
    unsigned long long v23;  // x0
    unsigned long long v24;  // x0
    st_9ce524_0 *iter;  // x24
    char v26;  // x25
    long long v9;  // x19
    unsigned long long v27;  // 4110
    unsigned long v28;  // x0
    char v29;  // x1
    unsigned long long v31;  // x0
    unsigned long long v32;  // 4106
    st_9ce524_0 *v33;  // w8
    unsigned long long v34;  // 4118
    unsigned long long v35;  // 4118
    unsigned long long v36;  // x0
    st_9ce524_1 *v10;  // x24
    unsigned long long v37;  // x0
    unsigned long long v38;  // x0
    unsigned long long v39;  // x0
    char v11;  // x8
    char v12;  // x26
    unsigned long v13;  // x8
    char v14;  // w9
    unsigned long long v15;  // x0
    char v16;  // x8
    unsigned long v0;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x88]
    long long v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x70]
    st_9ce524_4 *v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a2;
    v8 = a1;
    v9 = a0;
    v10 = a3->field_20;
    if (v10)
    {
        v2 = v9;
        v3 = v7;
        v4 = a7;
        v11 = 40;
        if (!(v10->field_8 & 8))
            v11 = 24;
        v12 = *(long long *)&v10->padding_0[v11];
        v13 = a3->field_0;
        if (!(unsigned int)v13)
            goto LABEL_9ce59c;
    }
    else
    {
        v12 = 0;
        v13 = a3->field_0;
        if (!(unsigned int)v13)
        {
LABEL_9ce59c:
            if (*(long long *)&a3->padding_1[7] == 1)
                goto LABEL_9ce660;
        }
    }
    if (*v8)
    {
        v14 = (unsigned int)v13 & 0xff;
        if (3 >= v14)
        {
            if (v14)
            {
                if (v14 == 1)
                    goto LABEL_9ce6bc;
                if (v14 != 2)
                {
                    v0 = v13;
                    sub_9d524c(v9, "Unprocessed type %d\n");
                    return 0;
                }
                v15 = sub_9cf274(v8, a3);
                if (v15 >> 31 & 1 || !(v16 = v15 & 0xffffffff, a3->padding_18 > v16))
                {
                    v0 = v15;
                    return (int)sub_9d524c(v9, "ERROR: selector [%d] invalid\n") > 0;
                }
                v8 = sub_9cf574(v8, a3->field_10 + v16 * 40);
                goto LABEL_9ce674;
            }
LABEL_9ce660:
            if (!a3->field_10)
                goto LABEL_9ce708;
LABEL_9ce674:
            v18 = sub_9cec80(v9, v8, v7);
            if (!(unsigned int)v18)
                return v18;
        }
        else
        {
            if (v14 != 4)
            {
                if (v14 != 5)
                {
                    if (v14 != 6)
                    {
                        v0 = v13;
                        sub_9d524c(v9, "Unprocessed type %d\n");
                        return 0;
                    }
LABEL_9ce6bc:
                    if (!a6)
                    {
                        v19 = sub_9ceb40(v9, v7, a4, a5, a7);
                        if (!(unsigned int)v19)
                            return v19;
                    }
                    if ((a4 || a5) && (int)sub_9d4888(v9) < 1)
                        return 0;
                    if (v12)
                        v12();
                    if (a3->padding_18 >= 1)
                    {
                        i = 0;
                        v21 = a3->field_10;
                        do
                        {
                            v22 = sub_9cf584(*v8, v21, 1);
                            if (!v22)
                                return v22;
                            v23 = sub_9cec80(v9, sub_9cf574(v8, v22), (unsigned int)v7 + 2, v22, a7);
                            if (!(unsigned int)v23)
                                return v23;
                            i += 1;
                            v21 += 40;
                        } while (i < a3->padding_18);
                    }
                    if (a7->field_0 >> 1 & 1 && !(v0 = v7, v1 = &g_c7c2eb, !(sub_9d524c(v9, "%*s}\n") >> 31 & 1)))
                        goto LABEL_9cea68;
                }
                else
                {
LABEL_9ce708:
                    v24 = sub_9ceb40(v9, v7, a4, a5, a7);
                    if (!(unsigned int)v24)
                        return v24;
                    if (v10 && v10->field_38)
                        v10->field_38();
                    if (a3->field_0 == 5)
                    {
                        iter = *v8;
                        v26 = *v8->field_4 & 0xfffffffffffffeff;
                    }
                    else
                    {
                        v26 = *(long long *)&a3->padding_1[7];
                        if (v26 == 1)
                        {
                            iter = 0;
                        }
                        else
                        {
                            iter = *v8;
                            v27 = arm64g_calculate_condition(18, v26, 4, 0);
                            if (!(v27 & 1))
                            {
                                v28 = iter->field_0;
                                v26 = v28;
                                v8 = &iter->field_8;
                                iter = iter->field_8;
                                if (!(a7->field_0 >> 4 & 1))
                                    goto LABEL_9ce9dc;
                                goto LABEL_9ce964;
                            }
                        }
                    }
                    if (!(a7->field_0 >> 3 & 1))
                    {
LABEL_9ce964:
                        v29 = 0;
                        if (v26 == 5)
                            goto LABEL_9ce9ec;
                        goto LABEL_9ce970;
                    }
                    v28 = v26;
LABEL_9ce9dc:
                    v29 = sub_9c876c(v28);
                    v26 = v26;
                    switch (v26)
                    {
                    case 5:
LABEL_9ce9ec:
                        v37 = (int)sub_9d4888(v9, "NULL\n") > 0;
                        if (!(unsigned int)v37)
                            return v37;
                        break;
                    default:
LABEL_9ce970:
                        if (v29 && ((int)sub_9d4888(v9) < 1 || (int)sub_9d4888(v9, L":]⸥㜱g[{㨺⸀㼀☀䰀慵䕵業䍴污䙬敥扤捡k界畡楖瑲慵䉬䉣極摬牥䰀慵䉵瑹捥摯䍥獯䵴摯汥䰀慵䍵浯楰敬浅瑩敖瑣牯潄扵敬─汬d⸥朹\u202c⸥朹\u202c⸥朹─㤮Ⱨ┠㤮Ⱨ┠㤮Ⱨ┠㤮g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱g⸥㜱Ⱨ┠ㄮ朷\u202c⸥㜱Ⱨ┠ㄮ朷✀⸥猪⸧⸮✀尀╸㈰X挥✀⸮.⸥猪⸀⸥猪\u2000‽\u2000┣u⠠潣普楬瑣)⁽楳敺潮敤┽u\u2e7b⸮}汣獡\u2073⸥猪⠠牰灯㩳┠畺\u202c敭桴摯㩳┠畺") < 1))
                        {
LABEL_9cea68:
                            return 0;
                        }
                        if (v26 > 5)
                        {
                            if (v26 > 15)
                            {
                                if (v26 - 16 < 2)
                                    goto LABEL_9cea30;
                                if (v26 != 23)
                                {
                                    if (v26 != 24)
                                        goto LABEL_9ceb20;
                                    v31 = sub_9c0ef0(v9, iter);
                                    goto LABEL_9ceb30;
                                }
                                else
                                {
                                    v31 = sub_9c55ec(v9, iter);
                                    goto LABEL_9ceb30;
                                }
                            }
                            else
                            {
                                if (v26 != 6)
                                {
                                    if (v26 == 10)
                                    {
LABEL_9ceaa4:
                                        v31 = sub_9cef0c(v9, iter);
                                        goto LABEL_9ceb30;
                                    }
                                    else
                                    {
LABEL_9ceb20:
                                        v31 = sub_9c3c98(v9, iter, a7->field_20);
                                    }
                                }
                                else
                                {
                                    v31 = sub_9cef6c(v9, *v8);
                                    goto LABEL_9ceb30;
                                }
                            }
                        }
                        else
                        {
                            if (2 >= v26)
                            {
                                v32 = arm64g_calculate_condition(2, v26, 3, 0);
                                if (!(v32 & 1))
                                {
                                    if (v26 != 1)
                                    {
                                        if (v26 == 2)
                                            goto LABEL_9ceaa4;
                                        goto LABEL_9ceb20;
                                    }
                                    else
                                    {
                                        v33 = (st_9ce524_0 *)*(int *)v8;
                                        v34 = arm64g_calculate_condition(0x11, *(int *)v8, 1, 0);
                                        if (!(v34 & 1))
                                            v33 = (st_9ce524_0 *)a3->field_28;
                                        v35 = arm64g_calculate_condition(1, (unsigned long long)v33, 1, 0);
                                        v31 = (int)sub_9d4888() > 0;
                                    }
LABEL_9ceb30:
                                    if (!(unsigned int)v31)
                                        return v31;
LABEL_9ce64c:
                                    if (1 > (int)sub_9d4888(v9))
                                        return 0;
                                }
                                else
                                {
LABEL_9cea30:
                                    if ((int)sub_9d4888(v9, "\n") < 1)
                                        return 0;
                                    if (1 > (int)sub_9c8738(v9, iter->field_8, iter->field_0, v7, 0))
                                        return 0;
                                }
                            }
                            else
                            {
                                if (2 <= v26 - 3)
                                    goto LABEL_9ceb20;
                                v36 = sub_9cf018(v9, iter, v7);
                                if (!(unsigned int)v36)
                                    return v36;
                            }
                        }
                    }
                }
            }
            else
            {
                if (!a6)
                {
                    v38 = sub_9ceb40(v9, v7, a4, a5, a7);
                    if (!(unsigned int)v38)
                        return v38;
                    v10 = a3->field_20;
                }
                if (v10 && v10->field_30)
                    v10->field_30();
                if (a5 && (v0 = a5, 1 > (int)sub_9d524c(v9, ":EXTERNAL TYPE %s\n")))
                    goto LABEL_9cea68;
            }
        }
    }
    else if (a7->field_0 & 1)
    {
        if (!a6)
        {
            v39 = sub_9ceb40(v9, v7, a4, a5, a7);
            if (!(unsigned int)v39)
                return v39;
        }
        goto LABEL_9ce64c;
    }
    return 1;
}
