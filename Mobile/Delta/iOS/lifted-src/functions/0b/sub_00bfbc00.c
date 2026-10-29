/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfbc00..0xbfbcdc (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfbc00_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_bfbc00_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_bfbc00_0;

typedef struct st_bfbc00_1 {
    unsigned long long field_0;
} st_bfbc00_1;


void sub_bfbc00(st_bfbc00_0 *a0)
{
    unsigned long long i;  // x20
    unsigned long long v3;  // x21
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long j;  // x23
    unsigned long long *v5;  // x22
    unsigned long long *v6;  // x22
    unsigned long long v8;  // 4131
    unsigned long long v9;  // 4133
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a0->field_38;
    if (i)
    {
        v3 = a0->field_18;
        j = a0->field_20;
        v5 = a0->field_28;
        do
        {
            if (!j)
            {
                do
                {
                    v6 = v5 + 1;
                    v3 -= 128;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v5)) & 0x8080808080808080;
                    v5 = v6;
                } while (!j);
                a0->field_28 = v6;
                a0->field_18 = v3;
                v5 = v6;
            }
            v8 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v9 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            j &= j - 1;
            a0->field_20 = j;
            i -= 1;
            a0->field_38 = i;
            do
            {
                /* unsupported instruction */;
                v10 = 4;
                v11 = /* unsupported instruction */;
                v12 = 1;
                v13 = 0;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v14 = arm64g_calculate_condition(20, v11, 1, 0);
            if (!(v14 & 1))
            {
                /* unsupported instruction */;
                sub_b86ac8();
            }
        } while (i);
    }
    if (a0->field_0)
    {
        v15 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
        v16 = arm64g_calculate_condition(20, (v15 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v16 & 1))
            return;
    }
    else
    {
        v17 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
        v18 = arm64g_calculate_condition(16, (v17 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v18 & 1))
            return;
    }
}
