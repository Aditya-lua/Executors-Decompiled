/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbffb80..0xbffc2c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bffb80_0 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_bffb80_0;


unsigned long long sub_bffb80(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x0
    unsigned long long v12;  // x9
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    st_bffb80_0 *v4;  // x23
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4102
    unsigned long long v10;  // x9
    unsigned long long v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = a0;
    if (!a1)
        return a0;
    while (1)
    {
        v4 = a0 + 48 * v2;
        v2 += 1;
        do
        {
            /* unsupported instruction */;
            v5 = 4;
            v6 = /* unsupported instruction */;
            v7 = 1;
            v8 = 0;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v9 = arm64g_calculate_condition(20, v6, 1, 0);
        if (!(v9 & 1))
        {
            /* unsupported instruction */;
            v3 = sub_b86a90(v4->field_0);
        }
        v10 = v4->field_10;
        v11 = v10 * 16;
        v12 = v11 + v10;
        if (v10)
        {
            v13 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v14 = arm64g_calculate_condition(18, (v13 & 1 ? v12 : 0x40000000), (v13 & 1 ? 25 : 0), 0);
            if (v14 & 1)
                goto LABEL_bffbe4;
            goto LABEL_bffbd8;
        }
        else
        {
            v15 = arm64g_calculate_condition(v5 | 16, v6, v7, v8);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v12 : 0x40000000), (v15 & 1 ? 25 : 0), 0);
            if (!(v16 & 1))
            {
LABEL_bffbd8:
                if (v2 == a1)
                    return v3;
            }
            else
            {
LABEL_bffbe4:
                v3 = _free(v4->field_8 - v11 - 16);
                if (v2 == a1)
                    return v3;
            }
        }
    }
}
