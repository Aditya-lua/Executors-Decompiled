/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdc2b4..0xbdc3c0 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdc2b4_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long *field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
} st_bdc2b4_0;


st_bdc2b4_0 * sub_bdc2b4(st_bdc2b4_0 *a0)
{
    unsigned long v2;  // x20
    st_bdc2b4_0 *v3;  // x0
    unsigned long long v12;  // 4133
    unsigned long v13;  // x9
    unsigned long long v14;  // x9
    unsigned long long v15;  // 4102
    unsigned long long v16;  // x8
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4106
    unsigned long v19;  // x8
    unsigned long i;  // x21
    unsigned long long *v5;  // x22
    unsigned long long *v6;  // x23
    unsigned long v7;  // d0
    unsigned long j;  // x24
    unsigned long long *v9;  // x23
    unsigned long long v11;  // 4131
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    v3 = a0;
    if (v2)
    {
        i = a0->field_30;
        v3 = a0;
        if (v3->field_30)
        {
            v5 = a0->field_18;
            v6 = a0->field_18 + 1;
            v7 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)a0->field_18));
            j = __double_as_longlong(v7) & 0x8080808080808080;
            v3 = a0;
            do
            {
                v9 = v6;
                if (!j)
                {
                    do
                    {
                        v9 = v6 + 1;
                        v5 = (char *)v5 - 64;
                        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v6)) & 0x8080808080808080;
                        v6 = v9;
                    } while (!j);
                }
                v6 = v9;
                v11 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v12 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v13 = ((((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v13)
                    v14 = 64;
                else
                    v14 = Clz(v13);
                j &= j - 1;
                i -= 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v15 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v15 & 1))
                {
                    /* unsupported instruction */;
                    v3 = sub_b86a90(*(long long *)((char *)v5 - (v14 & 120) - 8));
                }
            } while (i);
        }
        v16 = v2 * 8;
        v17 = arm64g_calculate_condition(2, v16 + v2, 0x11, 0);
        if (!(v17 & 1))
            v3 = _free((char *)a0->field_18 - v16 - 8);
    }
    v18 = arm64g_calculate_condition(2, a0, 1, 0);
    if (v18 & 1)
        return v3;
    v19 = a0->field_8;
    a0->field_8 = v19 - 1;
    if (v19 == 1)
        return _free();
    return v3;
}
