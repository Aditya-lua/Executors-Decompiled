/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f080..0x1f158 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f080_2 {
    unsigned int field_0;
} st_1f080_2;

typedef struct st_1f080_1 {
    char padding_0[96];
    char field_60;
    char padding_61[31];
    unsigned int field_80;
    unsigned int field_84;
    char padding_88[32];
    unsigned int field_a8;
    char padding_ac[316];
    struct st_1f080_2 *field_1e8;
} st_1f080_1;

typedef struct st_1f080_0 {
    char field_0;
} st_1f080_0;


unsigned int sub_1f080(st_1f080_1 *a0, char a1, unsigned long a2, unsigned int a3)
{
    unsigned long v5;  // x20
    unsigned long v6;  // x8
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long v15;  // cc_op
    unsigned long long v16;  // 4110
    unsigned int v7;  // w9
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    st_1f080_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1f080_0 *v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a1;
    v1 = &v0;
    v0 = &v1;
    if (a3)
    {
        v6 = a0->field_80;
        v7 = v6 == v5;
        if (a0->field_a8 == a0->field_84)
        {
            v8 = arm64g_calculate_condition(v15, v10, v11, v12);
            v9 = arm64g_calculate_condition(4, (v8 & 1 ? v6 : 0x40000000), (v8 & 1 ? v5 : 0), 0);
            if (!(v9 & 1))
                goto LABEL_1f0cc;
        }
        else
        {
            v13 = arm64g_calculate_condition(v15, v10, v11, v12);
            v14 = arm64g_calculate_condition(0, (v13 & 1 ? v6 : 0x40000000), (v13 & 1 ? v5 : 0), 0);
            if (!(v14 & 1))
            {
                while (1)
                {
LABEL_1f0cc:
                    if (*(int *)&a0->field_1e8[v6])
                        return 0;
                    sub_f8d0(a0);
                    v6 = a0->field_80;
                    v7 = v6 == v5;
                    if (a0->field_a8 == a0->field_84)
                    {
                        v16 = arm64g_calculate_condition(v15, v10, v11, v12);
                        v17 = arm64g_calculate_condition(20, (v16 & 1 ? v6 : 0x40000000), (v16 & 1 ? v5 : 0), 0);
                        if (!(v17 & 1))
                            break;
                    }
                    else
                    {
                        v18 = arm64g_calculate_condition(v15, v10, v11, v12);
                        v19 = arm64g_calculate_condition(16, (v18 & 1 ? v6 : 0x40000000), (v18 & 1 ? v5 : 0), 0);
                        if (!(v19 & 1))
                            break;
                    }
                }
            }
        }
        if (!v7)
            return 0;
    }
    else
    {
        sub_b1a4(&a0->field_60);
        if (v2 != v5)
            return 0;
        sub_f8d0(a0);
    }
    sub_f8d0(a0);
    return 1;
}
