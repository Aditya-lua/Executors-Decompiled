/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac3d30..0xac3e68 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac3d30_1 {
    char padding_0[128];
    struct st_ac3d30_1 *field_80;
    char padding_88[16];
    struct st_ac3d30_1 *field_98;
    struct st_ac3d30_0 *field_a0;
} st_ac3d30_1;

typedef struct st_ac3d30_0 {
    char padding_0[16];
    unsigned int field_10;
} st_ac3d30_0;


st_ac3d30_1 * sub_ac3d30(st_ac3d30_1 *a0, long long a1, st_ac3d30_1 *a2)
{
    st_ac3d30_1 *v4;  // x0
    st_ac3d30_1 *v5;  // x22
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    st_ac3d30_1 *v6;  // x20
    unsigned long long v9;  // 4110
    st_ac3d30_1 *v0;  // [bp-0x40]
    st_ac3d30_1 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!v4)
        return (unsigned int)a0;
    v5 = a0->field_a0->field_10 * 4;
    v6 = v5 >> 1;
    if (a2 && sub_a6fbc4(a1, "priv"))
    {
        v0 = a0;
        v4 = sub_a71440();
        if (!(unsigned int)v4)
            return (unsigned int)v4;
        if (v1 == v5)
        {
            *(unsigned int *)&a0->field_98 = 1;
            a0->field_80 = &a0->padding_0[2 * a0->field_a0->field_10];
            return 1;
        }
        if (v1 != v6)
            goto LABEL_ac3e18;
        *(unsigned int *)&a0->field_98 = 1;
    }
    v0 = &a0->padding_0[2 * a0->field_a0->field_10];
    if (sub_a6fbc4(a1, "pub"))
    {
        if (sub_a71440())
        {
            v9 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
            v10 = arm64g_calculate_condition(4, (v9 & 1 ? v1 : 0), (v9 & 1 ? v6 : 0), 0);
            if (v10 & 1)
            {
                a0->field_80 = v0;
                return 1;
            }
        }
        else
        {
            v15 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
            v16 = arm64g_calculate_condition(0, (v15 & 1 ? v1 : 0), (v15 & 1 ? v6 : 0), 0);
            if (v16 & 1)
            {
                a0->field_80 = v0;
                return 1;
            }
        }
    }
LABEL_ac3e18:
    sub_a66ec0(a0, 128);
    a0->field_80 = 0;
    if (!(int)a0->field_98)
        return 0;
    *(unsigned int *)&a0->field_98 = 0;
    sub_a66ec0(a0, 128);
    return 0;
}
