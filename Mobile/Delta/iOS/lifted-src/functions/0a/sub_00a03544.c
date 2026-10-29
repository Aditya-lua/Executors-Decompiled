/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa03544..0xa03638 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a03544_0 {
    struct st_a03544_0 *field_0;
    struct st_a03544_0 *field_8;
} st_a03544_0;


st_a03544_0 * sub_a03544(st_a03544_0 *a0, unsigned long a1, st_a03544_0 *a2)
{
    st_a03544_0 *v2;  // x19
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long v4;  // cc_op
    unsigned long v5;  // cc_dep1
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    st_a03544_0 *v8;  // x0
    st_a03544_0 *v9;  // x1
    unsigned long long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 < 0)
        return 0;
    if (!a0 || (v2 = a0->field_0, !a0->field_0))
    {
        v2 = sub_a6bffc(16, "crypto/dsa/dsa_sign.c", 36);
        if (!v2)
            return v2;
    }
    v8 = v2->field_0;
    if (v8)
    {
        v9 = v2->field_8;
        if (!v9)
            goto LABEL_a03624;
    }
    else
    {
        v8 = sub_9e4958(NULL);
        v2->field_0 = v8;
        v9 = v2->field_8;
        if (!v9)
        {
LABEL_a03624:
            v9 = sub_9e4958();
            v2->field_8 = v9;
            v8 = v2->field_0;
        }
    }
    if (v8)
    {
        v11 = arm64g_calculate_condition(v4 | 16, v5, v6, v7);
        v12 = arm64g_calculate_condition(4, (v11 & 1 ? v9 : 0x40000000), 0, 0);
        if (!(v12 & 1))
            goto LABEL_a035a8;
    }
    else
    {
        v13 = arm64g_calculate_condition(v4 | 16, v5, v6, v7);
        v14 = arm64g_calculate_condition(0, (v13 & 1 ? v9 : 0x40000000), 0, 0);
        if (!(v14 & 1))
        {
LABEL_a035a8:
            if (sub_a67718())
            {
                if (!a0 || a0->field_0)
                    return v2;
                a0->field_0 = v2;
                return v2;
            }
        }
    }
    if (!a0 || !a0->field_0)
    {
        sub_9e4838(v2->field_0);
        sub_9e4838(v2->field_8);
        sub_a6c2e4(v2, "crypto/dsa/dsa_sign.c", 47);
    }
    return 0;
}
