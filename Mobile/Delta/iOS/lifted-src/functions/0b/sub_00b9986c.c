/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9986c..0xb99930 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9986c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_b9986c_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_b9986c_0;

typedef struct st_b9986c_1 {
    unsigned long long field_0;
} st_b9986c_1;


st_b9986c_0 * sub_b9986c(st_b9986c_0 *a0)
{
    unsigned long long i;  // x20
    st_b9986c_0 *v3;  // x0
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long v4;  // x21
    unsigned long long j;  // x24
    unsigned long long *v6;  // x23
    unsigned long long *v7;  // x23
    unsigned long long v9;  // 4131
    unsigned long long v10;  // 4133
    unsigned long v11;  // cc_op
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_38;
    v3 = a0;
    if (i)
    {
        v4 = a0->field_18;
        j = a0->field_20;
        v6 = a0->field_28;
        do
        {
            v7 = v6;
            if (!j)
            {
                do
                {
                    v6 = v7 + 1;
                    v4 -= 1600;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7)) & 0x8080808080808080;
                    v7 = v6;
                } while (!j);
                a0->field_28 = v6;
                a0->field_18 = v4;
            }
            v9 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v10 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            j &= j - 1;
            a0->field_20 = j;
            i -= 1;
            a0->field_38 = i;
            v3 = sub_b98aa8();
        } while (i);
    }
    if (a0->field_0)
    {
        v15 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
        v16 = arm64g_calculate_condition(20, (v15 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v16 & 1))
            return v3;
    }
    else
    {
        v17 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
        v18 = arm64g_calculate_condition(16, (v17 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v18 & 1))
            return v3;
    }
}
