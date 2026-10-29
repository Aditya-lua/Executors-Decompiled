/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3eda0..0xc3ef08 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3eda0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    char padding_31[7];
    char field_38;
    char padding_39[7];
    char field_40;
    char field_41;
} st_c3eda0_0;

extern long long g_efce48;

unsigned long long sub_c3eda0(st_c3eda0_0 *a0)
{
    unsigned long long v2;  // x22
    unsigned long v3;  // x25
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long i;  // x23
    unsigned long v14;  // x20
    unsigned long v15;  // x21
    unsigned int v16;  // x8
    unsigned int v17;  // x1
    unsigned int v18;  // x0
    unsigned long long v19;  // x0
    unsigned long v5;  // x24
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_41 & 1)
        return 0;
    v2 = a0->field_10;
    v3 = a0->field_18;
    i = a0->field_20;
    v5 = a0->field_28;
    if (v5 <= v3)
    {
        v6 = arm64g_calculate_condition(v8 | 144, v9, v10, v11);
        v7 = arm64g_calculate_condition(52, (v6 & 1 ? v5 : 0), (v6 & 1 ? i : 0), 0);
        if (!(v7 & 1))
            goto LABEL_c3ede0;
    }
    else
    {
        v12 = arm64g_calculate_condition(v8 | 144, v9, v10, v11);
        v13 = arm64g_calculate_condition(48, (v12 & 1 ? v5 : 0), (v12 & 1 ? i : 0), 0);
        if (!(v13 & 1))
        {
LABEL_c3ede0:
            v14 = a0->field_38;
            v15 = *((char *)a0 + v14 + 47);
            do
            {
                v16 = v5 - i;
                if (15 >= v16)
                {
                    v17 = 0;
                    if (v16)
                    {
                        do
                        {
                            if (*(char *)(v2 + i + v17) == (unsigned int)v15)
                            {
                                v18 = 1;
                                goto LABEL_c3ee4c;
                            }
                        } while ((v17 += 1, v16 != v17));
                        v18 = 0;
                        v17 = v5 - i;
                    }
                    else
                    {
                        v18 = 0;
                    }
                }
                else
                {
                    v17 = v2 + i;
                    v18 = sub_beaec8(v15, v17, v5 - i);
                }
LABEL_c3ee4c:
                if (v18 != 1)
                {
                    a0->field_20 = v5;
                    break;
                }
                i = i + v17 + 1;
                a0->field_20 = i;
                if (i >= v14 && v3 >= i)
                {
                    if (5 <= (unsigned int)v14)
                    {
                        sub_c73bb0(0, v14, 4, &g_efce48);
                    }
                    else if (!_memcmp(v2 + i - v14, &a0->field_30, v14))
                    {
                        v19 = v2 + a0->field_0;
                        a0->field_0 = i;
                        return v19;
                    }
                }
            } while (i <= v5);
        }
    }
    a0->field_41 = 1;
    if (!(a0->field_40 & 1) && a0->field_8 == a0->field_0)
        return 0;
    return v2 + a0->field_0;
}
