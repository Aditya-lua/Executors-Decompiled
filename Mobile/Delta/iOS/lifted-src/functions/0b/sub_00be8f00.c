/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe8f00..0xbe9174 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be8f00_0 {
    char padding_0[8];
    void* field_8;
    unsigned long long field_10;
} st_be8f00_0;

extern char g_e08114;

st_be8f00_0 * sub_be8f00(st_be8f00_0 *a0, void* a1, unsigned long i)
{
    unsigned long long v0;  // x8
    unsigned long long iter;  // x8
    unsigned long long v10;  // 4112
    unsigned long long v12;  // 4113
    unsigned long long v13;  // 4119
    unsigned long long v14;  // x13
    unsigned int v15;  // w13
    unsigned int v16;  // w14
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4113
    unsigned long long v19;  // 4119
    unsigned long v2;  // x12
    unsigned long long v20;  // 4119
    unsigned long long v3;  // x12
    unsigned int v4;  // w13
    unsigned long long v5;  // 4119
    unsigned long long v6;  // x13
    unsigned int v7;  // w13
    unsigned int v8;  // w14
    unsigned long long v9;  // 4112

    v0 = i - 15;
    if (i < 15)
        v0 = 0;
    if (i)
    {
        iter = 0;
        do
        {
            if (!(v2 >> 31 & 1))
            {
                if (-(a1 & 0x7) - (iter & 7))
                {
                    iter += 1;
                    continue;
                }
                else
                {
                    for (v2 = *((char *)a1 + iter); v0 > iter && !((*(long long *)((char *)a1 + iter + 8) | *(long long *)((char *)a1 + iter)) & 0x8080808080808080); iter += 16);
                    if (i <= iter)
                        continue;
                    do
                    {
                        if (*((char *)a1 + iter) < 0)
                            goto LABEL_be8f2c;
                    } while ((iter += 1, i != iter));
                }
            }
            v3 = (unsigned int)v2 & 0xff;
            v4 = (&g_e08114)[v2 & 0xff];
            if (v4 == 4)
            {
                v14 = iter + 1;
                if (i <= v14)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 0;
                    *((char *)&a0->field_10 + 1) = v3;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                v15 = *((char *)a1 + v14);
                if ((unsigned int)v3 != 240)
                {
                    v16 = (char)v15;
                    if ((unsigned int)v3 == 244)
                    {
                        v17 = arm64g_calculate_condition(209, v16, 113, 0);
                        if (!(v17 & 1))
                            goto LABEL_be9134;
                    }
                    else
                    {
                        if (2 < (unsigned int)v3 - 241)
                            goto LABEL_be9134;
                        v18 = arm64g_calculate_condition(161, v16, 64, 0);
                        if (v18 & 1)
                        {
                            a0->field_8 = iter;
                            *(char *)&a0->field_10 = 1;
                            *((char *)&a0->field_10 + 1) = 1;
                            *(unsigned long long *)a0->padding_0 = 1;
                            return a0;
                        }
                    }
                }
                else if (!(v15 - 144 < 48))
                {
                    goto LABEL_be9134;
                }
                v3 = iter + 2;
                if (i <= v3)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 0;
                    *((char *)&a0->field_10 + 1) = v3;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                v19 = arm64g_calculate_condition(193, *((char *)a1 + v3), 65, 0);
                if (v19 & 1)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 1;
                    *((char *)&a0->field_10 + 1) = 2;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                v3 = iter + 3;
                if (i <= v3)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 0;
                    *((char *)&a0->field_10 + 1) = v3;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                v20 = arm64g_calculate_condition(177, *((char *)a1 + v3), 64, 0);
                if (!(v20 & 1))
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 1;
                    *((char *)&a0->field_10 + 1) = 3;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                goto LABEL_be8f28;
            }
            if (v4 != 3)
            {
                if (v4 == 2)
                {
                    v3 = iter + 1;
                    if (i <= v3)
                    {
                        a0->field_8 = iter;
                        *(char *)&a0->field_10 = 0;
                        *((char *)&a0->field_10 + 1) = v3;
                        *(unsigned long long *)a0->padding_0 = 1;
                        return a0;
                    }
                    v5 = arm64g_calculate_condition(209, *((char *)a1 + v3), 65, 0);
                    if (!(v5 & 1))
                        goto LABEL_be9134;
                    goto LABEL_be8f28;
                }
                goto LABEL_be9134;
            }
            else
            {
                v6 = iter + 1;
                if (i <= v6)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 0;
                    *((char *)&a0->field_10 + 1) = v3;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                v7 = *((char *)a1 + v6);
                if ((unsigned int)v3 == 224)
                {
                    if ((v7 & 224) != 160)
                        goto LABEL_be9134;
                    goto LABEL_be90d4;
                }
                v8 = (char)v7;
                if ((unsigned int)v3 == 237)
                {
                    v9 = arm64g_calculate_condition(209, v8, 97, 0);
                    if (!(v9 & 1))
                        goto LABEL_be9134;
                    goto LABEL_be90d4;
                }
                if (12 > (unsigned int)v3 - 225)
                {
                    v10 = arm64g_calculate_condition(177, v8, 64, 0);
                    if (v10 & 1)
                        goto LABEL_be90d4;
LABEL_be9134:
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 1;
                    *((char *)&a0->field_10 + 1) = 1;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                if (((unsigned int)v3 & 254) != 0xee)
                    goto LABEL_be9134;
                v12 = arm64g_calculate_condition(161, v8, 64, 0);
                if (v12 & 1)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 1;
                    *((char *)&a0->field_10 + 1) = 1;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
LABEL_be90d4:
                v3 = iter + 2;
                if (i <= v3)
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 0;
                    *((char *)&a0->field_10 + 1) = v3;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
                v13 = arm64g_calculate_condition(209, *((char *)a1 + v3), 65, 0);
                if (!(v13 & 1))
                {
                    a0->field_8 = iter;
                    *(char *)&a0->field_10 = 1;
                    *((char *)&a0->field_10 + 1) = 2;
                    *(unsigned long long *)a0->padding_0 = 1;
                    return a0;
                }
LABEL_be8f28:
                iter = v3 + 1;
            }
LABEL_be8f2c:
        } while (i > iter);
    }
    a0->field_8 = a1;
    a0->field_10 = i;
    *(unsigned long long *)a0->padding_0 = 0;
    return a0;
}
