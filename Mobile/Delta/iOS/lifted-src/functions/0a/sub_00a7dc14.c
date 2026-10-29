/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7dc14..0xa7dca0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7dc14_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_a7dc14_1;

typedef struct st_a7dc14_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[7];
    unsigned long long field_c;
    unsigned long long field_14;
    unsigned int field_1c;
} st_a7dc14_0;


int sub_a7dc14(unsigned long long *a0, st_a7dc14_0 *a1)
{
    unsigned long v2;  // x8
    unsigned int v3;  // w9
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // x8
    st_a7dc14_1 *v13;  // x21
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_0;
    v3 = *(int *)((char *)&a1->field_14 + 4);
    if (!(unsigned int)v2)
    {
        v4 = arm64g_calculate_condition(v10, v11, v6, v7);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? v3 : 0x40000000), (v4 & 1 ? 2 : 0), 0);
        if (!(v5 & 1))
            goto LABEL_a7dc40;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10, v11, v6, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? v3 : 0x40000000), (v8 & 1 ? 2 : 0), 0);
        if (!(v9 & 1))
        {
LABEL_a7dc40:
            if (v3 == 2)
            {
                v12 = (unsigned int)v2 + 1;
                (&a1->field_4)[v2] = 128;
                v2 = v12;
            }
            v13 = &a1->field_4;
            _bzero(&v13->padding_0[v2 & 0xffffffff], 8 - v2);
            sub_a7da88(a1, v13, 8);
        }
    }
    *a0 = *(long long *)(a1->padding_5)[1];
    a0[1] = *(long long *)((char *)&a1->field_c + 4);
    return 1;
}
