/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb79024..0xb7954c (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b79024_6 {
    long long field_0;
    struct st_b79024_4 *field_8;
} st_b79024_6;

typedef struct st_b79024_2 {
    char padding_0[8];
    unsigned long long field_8;
    char field_10;
} st_b79024_2;

typedef struct st_b79024_4 {
    char padding_0[24];
    struct st_b79024_5 *field_18;
} st_b79024_4;

typedef struct st_b79024_5 {
    unsigned long long field_0;
} st_b79024_5;

extern unsigned long long g_b7e018;
extern unsigned long long g_b7fa48;
extern unsigned long long g_b96074;
extern long long g_cb89da;
extern long long g_cba67f;

unsigned long long sub_b79024(st_b79024_6 **a0, void* a1)
{
    unsigned long v6;  // x8
    unsigned long long v7;  // x9
    st_b79024_6 **v16;  // x0
    uint128_t v17;  // q0
    unsigned long long v18;  // 4125
    unsigned long long v8;  // 4122
    unsigned long v9;  // x20
    char *v10;  // x23
    st_b79024_6 *v11;  // x24
    st_b79024_6 *v12;  // x21
    st_b79024_2 *v13;  // x1
    unsigned int v14;  // w9
    unsigned long long v15;  // x8
    uint128_t v0;  // [bp-0xf0]
    void* v1;  // [bp-0xe0]
    char *v2;  // [bp-0x80], Other Possible Types: void*, void* *
    unsigned long long v3;  // [bp-0x78]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = a1;
    v6 = *(long long *)a1;
    if ((long long)v6 > 6)
    {
        if ((long long)v6 > 8)
        {
            if (v6 != 9)
            {
                if (v6 != 10)
                {
                    if (v6 == 11)
                    {
                        v8 = arm64g_calculate_condition(0x44, (long long)a1[8], 0, 0);
                        switch (v7)
                        {
                        case 0:
                            v2 = &v1;
                            v3 = &g_b7e018;
                            return sub_be769c(*a0->field_0, *a0->field_8, &g_cba67f, &v2);
                        default:
                            break;
                        }
                    }
                    else
                    {
                        v2 = &v1;
                        v3 = &g_b7e018;
                        return sub_be769c(*a0->field_0, *a0->field_8, &g_cba67f, &v2);
                    }
                }
            }
            else
            {
                v9 = (char)a1[24];
                v10 = a1 + 24;
                if (sub_b94cf4(*(long long *)(v10 - 16), v9) & 1)
                    *a0->field_8->field_18();
                if (!(sub_b79024(a0, *(long long *)(v10 - 16)) & 1))
                {
                    v11 = *a0;
                    v2 = v10;
                    v3 = &g_b96074;
                    if (!(sub_be769c(v11->field_0, v11->field_8, &g_cb89da, &v2) & 1))
                    {
                        if (sub_b94e50((long long)a1[16], v9) & 1)
                            v11->field_8->field_18();
                        if (!(sub_b79024(a0, (long long)a1[16]) & 1))
                            return 0;
                    }
                }
            }
        }
        else
        {
            if (v6 != 7)
            {
                if (v6 == 8)
                {
                    v12 = *a0;
                    v2 = a1 + 16;
                    v3 = &g_b7fa48;
                    if (!(sub_be769c(v12->field_0, v12->field_8, &g_cba67f, &v2) & 1))
                    {
                        v13 = (long long)a1[8];
                        v14 = (char)a1[16];
                        if (v13->padding_0 != 8)
                        {
                            v16 = a0;
                            if (v13->padding_0 == 9 && v13[1].padding_0[7] != 5)
                                v12->field_8->field_18();
                            if (v14 == 1)
                            {
                                switch (v15)
                                {
                                case 6:
                                    if (v13->field_8 == 9223372036854775810 && 0x7fefffffffffffff >= (*(long long *)&v13->field_10 & 0x7fffffffffffffff) && *(long long *)&v13->field_10 < 0)
                                        v12->field_8->field_18();
                                    break;
                                case 8:
LABEL_b793ec:
                                    if (v13->field_10 == 1)
                                        v12->field_8->field_18();
                                    break;
                                default:
                                    break;
                                }
                            }
                        }
                        else
                        {
                            v16 = a0;
                            if (v14 != 1)
                                goto LABEL_b79494;
                            else
                                goto LABEL_b793ec;
                        }
LABEL_b79494:
                        if (!(sub_b79024(v16, v13) & 1))
                            return 0;
                    }
                }
                else
                {
                    v2 = &v1;
                    v3 = &g_b7e018;
                    return sub_be769c(*a0->field_0, *a0->field_8, &g_cba67f, &v2);
                }
            }
        }
        return 1;
    }
    else if (4 >= (long long)v6)
    {
        if (v6 != 2 && v6 != 3)
        {
            v2 = &v1;
            v3 = &g_b7e018;
            return sub_be769c(*a0->field_0, *a0->field_8, &g_cba67f, &v2);
        }
    }
    else
    {
        if (v6 != 5 && v6 == 6 && (long long)a1[8] == 9223372036854775810)
        {
            v17 = __double_as_longlong((double)a1[16]);
            if (*(unsigned long long *)&*(unsigned long long *)(void*)&v17 == 0x7ff0000000000000)
            {
                v0 = v17;
                *a0->field_8->field_18();
            }
            v18 = arm64g_calculate_condition(96, (((((char)(CmpF(*(unsigned long long *)&v17, *(unsigned long long *)&v17)) >> 5 & 3 | isnan(*(unsigned long long *)&v17)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(*(unsigned long long *)&v17)) * 0x10000000, 0, 0);
            if (v18 & 1)
                *a0->field_8->field_18();
        }
    }
}
