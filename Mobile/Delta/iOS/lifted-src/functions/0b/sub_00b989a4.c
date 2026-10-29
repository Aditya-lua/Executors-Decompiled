/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb989a4..0xb98aa8 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b989a4_0 {
    char padding_0[8];
    double *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_b989a4_0;


st_b989a4_0 * sub_b989a4(st_b989a4_0 *a0)
{
    unsigned long long i;  // x21
    st_b989a4_0 *v3;  // x0
    unsigned long long v12;  // x8
    unsigned long long v13;  // x8
    long long *v14;  // x25
    unsigned long long v15;  // 4102
    st_b989a4_0 *v16;  // x0
    unsigned long long v17;  // 4112
    double *v4;  // x22
    unsigned long long *v5;  // x23
    unsigned long long j;  // x24
    unsigned long long *v8;  // x23
    unsigned long long v10;  // 4128
    unsigned long long v11;  // 4130
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_10)
        return a0;
    i = a0->field_20;
    v3 = a0;
    if (v3->field_20)
    {
        v4 = a0->field_8;
        v5 = a0->field_8 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_8)) & 0x8080808080808080;
        do
        {
            v8 = v5;
            if (!j)
            {
                do
                {
                    v8 = v5 + 1;
                    v4 = (char *)v4 - 0x100;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v5)) & 0x8080808080808080;
                    v5 = v8;
                } while (!j);
            }
            v5 = v8;
            v10 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v11 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v12 = ((((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v12)
                v13 = 64;
            else
                v13 = Clz(v12);
            v14 = (char *)v4 - (v13 * 4 & 480);
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
                sub_b86a90(*(long long *)((char *)v14 - 32));
            }
            i -= 1;
            j &= j - 1;
            v3 = sub_bd0270((char *)v14 - 24);
        } while (i);
    }
    v16 = v3;
    v17 = arm64g_calculate_condition(2, a0->field_10 * 33, 41, 0);
    if (v17 & 1)
        return v16;
}
