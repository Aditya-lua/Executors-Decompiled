/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ebaf8..0x9ebbfc (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ebaf8_0 {
    unsigned long long *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_9ebaf8_0;


unsigned long long sub_9ebaf8(st_9ebaf8_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x0
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v4;  // x0
    unsigned long long *iter;  // x8
    unsigned long long i;  // x10
    unsigned int v7;  // w9
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long long v10;  // w11
    unsigned long long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 1;
    v2 = a1;
    if (sub_9e4828())
    {
        v3 = sub_9e4d58(a0, v2);
        if (!(unsigned int)v3)
            return v3;
        sub_9e5858(a0, 1);
        return v3;
    }
    else if ((int)a0->field_10)
    {
        *(unsigned int *)&a0->field_10 = 0;
        v4 = sub_9eb9e0(a0, v2);
        *(unsigned int *)&a0->field_10 = 1;
        return v4;
    }
    else
    {
        iter = a0->field_0;
        i = *iter;
        v7 = (int)a0->field_8 - 1;
        if ((int)a0->field_8 == 1 && v2 > i)
        {
            *iter = v2 - i;
            *(unsigned int *)&a0->field_10 = 1;
            return 1;
        }
        v8 = i;
        v9 = v2;
        if (v2 > i)
        {
            *iter = i - v2;
            i = iter[1];
            iter += 1;
            if (i)
            {
                v2 = 1;
                v10 = 1;
            }
            else
            {
                v2 = 1;
                v10 = 1;
                do
                {
                    *iter = 0xffffffffffffffff;
                    i = iter[1];
                    iter += 1;
                    v10 += 1;
                } while (!i);
            }
        }
        else
        {
            v10 = 0;
        }
        *iter = i - v2;
        if (i == v2)
        {
            v11 = arm64g_calculate_condition(4, v8, v9, 0);
            v12 = arm64g_calculate_condition(19, (v11 & 1 ? v10 : 0), (v11 & 1 ? v7 : 0), 0);
            if (!(v12 & 1))
                goto LABEL_9ebbe8;
        }
        else
        {
            v13 = arm64g_calculate_condition(4, v8, v9, 0);
            v14 = arm64g_calculate_condition(16, (v13 & 1 ? v10 : 0), (v13 & 1 ? v7 : 0), 0);
            if (!(v14 & 1))
            {
LABEL_9ebbe8:
                *(unsigned int *)&a0->field_8 = v10;
            }
        }
    }
    return 1;
}
