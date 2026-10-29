/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb99930..0xb99a34 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b99930_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_b99930_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_b99930_0;

typedef struct st_b99930_1 {
    unsigned long long field_0;
} st_b99930_1;


void sub_b99930(st_b99930_0 *a0)
{
    unsigned long long i;  // x20
    unsigned long long v3;  // x21
    long long *v12;  // x24
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4110
    unsigned long long j;  // x23
    unsigned long long v22;  // 4102
    unsigned long long *v5;  // x22
    unsigned long long *v6;  // x22
    unsigned long long v8;  // 4131
    unsigned long long v9;  // 4133
    unsigned long long v10;  // x9
    unsigned long long v11;  // x9
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
            v10 = ((((v9 | v8) & 0xffff0000ffff0000) >> 16 | (v9 | v8) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v9 | v8) & 0xffff0000ffff0000) >> 16 | (v9 | v8) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v10)
                v11 = 64;
            else
                v11 = Clz(v10);
            j &= j - 1;
            a0->field_20 = j;
            v12 = v3 - (v11 * 2 & 240);
            i -= 1;
            a0->field_38 = i;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v13 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v13 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)((char *)v12 - 16));
            }
            do
            {
                /* unsupported instruction */;
                v14 = 4;
                v15 = /* unsupported instruction */;
                v16 = 1;
                v17 = 0;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v18 = arm64g_calculate_condition(20, v15, 1, 0);
            if (!(v18 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)((char *)v12 - 8));
            }
        } while (i);
    }
    if (a0->field_0)
    {
        v19 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v20 = arm64g_calculate_condition(20, (v19 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v20 & 1))
            return;
    }
    else
    {
        v21 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v22 = arm64g_calculate_condition(16, (v21 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v22 & 1))
            return;
    }
}
