/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb98fd0..0xb990e0 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b98fd0_0 {
    long long field_0;
    double *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_b98fd0_0;


st_b98fd0_0 * sub_b98fd0(st_b98fd0_0 *a0)
{
    unsigned long long v2;  // 4102
    st_b98fd0_0 *v3;  // x0
    unsigned long long v12;  // 4133
    unsigned long long v13;  // x9
    unsigned long long v14;  // x9
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    unsigned long long i;  // x21
    unsigned long long *v5;  // x22
    unsigned long long *v6;  // x23
    unsigned long long j;  // x24
    unsigned long long *v9;  // x23
    unsigned long long v11;  // 4131
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    v3 = a0;
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        v3 = sub_b86a90(a0->field_0);
    }
    if (!a0->field_10)
        return v3;
    i = a0->field_20;
    if (a0->field_20)
    {
        v5 = a0->field_8;
        v6 = a0->field_8 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_8)) & 0x8080808080808080;
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
    v16 = arm64g_calculate_condition(2, a0->field_10 * 9, 0x11, 0);
    if (v16 & 1)
        return v3;
}
