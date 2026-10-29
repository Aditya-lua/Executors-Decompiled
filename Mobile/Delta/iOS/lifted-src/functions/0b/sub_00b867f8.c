/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb867f8..0xb86900 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b867f8_0 {
    double *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b867f8_0;


void sub_b867f8(st_b867f8_0 *a0)
{
    unsigned long i;  // x21
    double *v3;  // x22
    unsigned long long v13;  // 4128
    unsigned long long v14;  // 4130
    unsigned long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long *v17;  // x8
    unsigned long long v18;  // x10
    unsigned long long v19;  // x9
    unsigned long long v20;  // x10
    unsigned long v21;  // 4110
    unsigned long long *v4;  // x23
    unsigned long long v22;  // 4102
    unsigned long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v25;  // 4116
    unsigned long j;  // x25
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long *v11;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_8)
        return;
    i = a0->field_18;
    if (a0->field_18)
    {
        v3 = a0->field_0;
        v4 = a0->field_0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
        do
        {
            v11 = v4;
            if (!j)
            {
                do
                {
                    v11 = v4 + 1;
                    v3 = (char *)v3 - 448;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v4)) & 0x8080808080808080;
                    v4 = v11;
                } while (!j);
            }
            v4 = v11;
            v13 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v14 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v15 = ((((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v15)
                v16 = 64;
            else
                v16 = Clz(v15);
            v17 = (char *)v3 + (unsigned int)-(v16 >> 3) * 56;
            v18 = *(long long *)((char *)v17 - 40);
            v19 = v18 * 4 + 11 & 0xfffffffffffffff8;
            v20 = v18 + v19;
            if (v18)
            {
                v21 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
                v7 = 2;
                v8 = (v21 & 1 ? v20 : 0x40000000);
                v9 = (v21 & 1 ? 9 : 0);
                v10 = 0;
                v22 = arm64g_calculate_condition(2, v8, v9, 0);
                if (v22 & 1)
                    continue;
            }
            else
            {
                v23 = arm64g_calculate_condition(v7 | 16, v8, v9, v10);
                v7 = 0;
                v8 = (v23 & 1 ? v20 : 0x40000000);
                v9 = (v23 & 1 ? 9 : 0);
                v10 = 0;
                v24 = arm64g_calculate_condition(0, v8, v9, 0);
                if (v24 & 1)
                    continue;
            }
            _free(*(long long *)((char *)v17 - 48) - v19);
            j &= j - 1;
            i -= 1;
        } while (i);
    }
    v25 = arm64g_calculate_condition(2, a0->field_8 * 57, 65, 0);
    if (v25 & 1)
        return;
    _free();
    return;
}
