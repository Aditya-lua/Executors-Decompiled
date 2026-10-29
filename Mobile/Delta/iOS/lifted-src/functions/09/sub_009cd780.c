/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cd780..0x9cd960 (480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cd780_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9cd780_1 *field_8;
    char field_10;
    char padding_11[3];
    unsigned int field_14;
} st_9cd780_1;

typedef struct st_9cd780_0 {
    char field_0;
    char padding_1[7];
    struct st_9cd780_0 *field_8;
    char field_10;
    char padding_11[3];
    unsigned int field_14;
} st_9cd780_0;


unsigned long long sub_9cd780(st_9cd780_0 **a0, st_9cd780_1 *a1, char *a2, char *a3)
{
    char v4;  // w9
    char v5;  // w8
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4112
    st_9cd780_0 *v16;  // x9
    st_9cd780_0 *v17;  // w8
    unsigned long long v18;  // 4118
    unsigned long long v19;  // 4110
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4106
    unsigned long v8;  // cc_dep1
    char v9;  // x8
    char v10;  // x19
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4112
    char v0;  // [bp-0x29]
    st_9cd780_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    if (*(long long *)&a3[32] && *(long long *)(*(long long *)&a3[32] + 48))
        goto *((void *)(*(long long *)(*(long long *)&a3[32] + 48)));
    v4 = *a3;
    if (v4)
    {
        if (*a0)
        {
            if (v4 == 5)
            {
                v5 = *(int *)&*a0->padding_1[3];
                goto LABEL_9cd7f8;
            }
            v6 = arm64g_calculate_condition(2, *(long long *)&a3[8], 4, 0);
            if (v6 & 1)
                goto LABEL_9cd7f0;
            goto LABEL_9cd85c;
        }
    }
    else
    {
        if (*(long long *)&a3[8] == 1)
        {
LABEL_9cd85c:
            v5 = *(int *)a2;
            if (2 < v5)
            {
LABEL_9cd804:
                if (5 >= v5)
                {
                    switch (v5)
                    {
                    case 3:
                        return sub_9c0270();
                    case 5:
                        return 0;
                    default:
LABEL_9cd880:
                        v16 = *a0;
                        if (*(long long *)&a3[40] == 0x800)
                        {
LABEL_9cd890:
                            if (v16->field_10 >> 4 & 1)
                            {
                                if (a1)
                                {
                                    v16->field_8 = a1;
                                    *(unsigned int *)&v16->field_0 = 0;
                                    return 0xfffffffe;
                                }
                                return 0xfffffffe;
                            }
                        }
                    }
                    goto LABEL_9cd898;
                }
                v8 = v5;
                switch (v5)
                {
                case 6:
                    v9 = *(long long *)&(*a0)[1].field_0;
                    v10 = *a0->field_14;
                    if (v9)
                    {
                        v11 = arm64g_calculate_condition(19, v8, 6, 0);
                        v12 = arm64g_calculate_condition(19, (v11 & 1 ? v10 & 0xffffffff : 0x40000000), 0, 0);
                        if (v12 & 1)
                            goto LABEL_9cd900;
                        break;
                    }
                    else
                    {
                        v13 = arm64g_calculate_condition(19, v8, 6, 0);
                        v14 = arm64g_calculate_condition(16, (v13 & 1 ? v10 & 0xffffffff : 0x40000000), 0, 0);
                        if (v14 & 1)
                            goto LABEL_9cd900;
                        break;
                    }
                case 10:
LABEL_9cd834:
                    return sub_9c1048();
                default:
LABEL_9cd880:
                    v16 = *a0;
                    if (*(long long *)&a3[40] == 0x800)
                        goto LABEL_9cd890;
LABEL_9cd898:
                    v9 = (char)v16->field_8;
                    v10 = *(int *)&v16->field_0;
                    goto LABEL_9cd900;
                }
            }
            else
            {
LABEL_9cd868:
                v15 = arm64g_calculate_condition(1, v5, 1, 0);
                if (v15 & 1)
                    return 0xfffffffe;
                if (v5 != 1)
                {
                    if (v5 == 2)
                        goto LABEL_9cd834;
                    goto LABEL_9cd880;
                }
                v17 = (st_9cd780_0 *)*(int *)a0;
                v18 = arm64g_calculate_condition(1, (unsigned long long)v17, 1, 0);
                if (!(v18 & 1))
                {
                    v19 = arm64g_calculate_condition(18, *(long long *)&a3[8], 4, 0);
                    if (!(v19 & 1))
                    {
LABEL_9cd8f4:
                        v0 = (char)v17;
                        v10 = 1;
                        v9 = (char)&v0;
LABEL_9cd900:
                        if (!a1)
                            return v10;
                        if (v10)
                        {
                            _memcpy(a1, v9, v10);
                            return v10;
                        }
                        return v10;
                    }
                    else
                    {
                        if (v17)
                        {
                            if (0 >= *(long long *)&a3[40])
                                goto LABEL_9cd8f4;
                        }
                        else
                        {
                            if (*(long long *)&a3[40])
                                goto LABEL_9cd8f4;
                        }
                    }
                }
            }
        }
        else if (*a0)
        {
            v7 = arm64g_calculate_condition(18, *(long long *)&a3[8], 4, 0);
            if (!(v7 & 1))
            {
LABEL_9cd7f0:
                v5 = *(int *)&*a0->field_0;
                a0 = &*a0->field_8;
LABEL_9cd7f8:
                *(unsigned int *)a2 = v5;
                if (v5 <= 2)
                    goto LABEL_9cd868;
                goto LABEL_9cd804;
            }
            goto LABEL_9cd85c;
        }
    }
    return 0xffffffff;
}
