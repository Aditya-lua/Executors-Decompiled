/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988948..0x988a3c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988948_0 {
    long long field_0;
    char padding_8[8];
    long long field_10;
    char field_18;
} st_988948_0;

extern char g_10002b0;

char sub_988948(st_988948_0 *a0, long long a1, char a2, char a3, char a4)
{
    char v7;  // w8
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    char idx;  // x0
    char v17;  // x9
    unsigned long v18;  // x9
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    char v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    char v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (!(a0->field_18 & 1))
    {
        v0 = 0;
        v7 = v0;
        if (sub_c672c8(a0->field_0, &v2, &v0, a1, 16))
        {
            v8 = arm64g_calculate_condition(v14 | 16, v15, v10, v11);
            v9 = arm64g_calculate_condition(3, (v8 & 1 ? v7 : 0), (v8 & 1 ? 16 : 0), 0);
            if (v9 & 1)
                goto LABEL_9889e8;
            goto LABEL_9889b8;
        }
        else
        {
            v12 = arm64g_calculate_condition(v14 | 16, v15, v10, v11);
            v13 = arm64g_calculate_condition(0, (v12 & 1 ? v7 : 0), (v12 & 1 ? 16 : 0), 0);
            if (!(v13 & 1))
                goto LABEL_9889b8;
LABEL_9889e8:
            idx = sub_a66b6c(a0->field_10, &v1);
            if (a2 && idx)
            {
                v17 = a2 - 1;
                do
                {
                    idx = *(long long *)idx;
                    v18 = v17 - 1;
                } while (v17 >= 1 && (v17 = v18, idx));
            }
            if (idx)
            {
                if (a3)
                    *(long long *)a3 = *(long long *)(idx + 16);
                if (a4)
                    *(long long *)a4 = *(long long *)(idx + 24);
                idx = 1;
            }
        }
    }
    else
    {
LABEL_9889b8:
        idx = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return idx;
    ___stack_chk_fail();
}
