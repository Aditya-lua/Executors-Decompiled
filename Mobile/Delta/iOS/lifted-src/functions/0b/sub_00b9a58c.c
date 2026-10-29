/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9a58c..0xb9a694 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9a58c_0 {
    double *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b9a58c_0;


st_b9a58c_0 * sub_b9a58c(st_b9a58c_0 *a0)
{
    unsigned long i;  // x21
    st_b9a58c_0 *v3;  // x0
    unsigned long v12;  // x8
    unsigned long long v13;  // x8
    long long *v14;  // x26
    unsigned long long v15;  // 4102
    st_b9a58c_0 *v16;  // x0
    unsigned long long v17;  // 4116
    unsigned long long *v4;  // x22
    unsigned long long *v5;  // x23
    unsigned long j;  // x25
    unsigned long long *v8;  // x23
    unsigned long long v10;  // 4128
    unsigned long long v11;  // 4130
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_8)
        return a0;
    i = a0->field_18;
    v3 = a0;
    if (v3->field_18)
    {
        v4 = a0->field_0;
        v5 = a0->field_0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
        do
        {
            v8 = v5;
            if (!j)
            {
                do
                {
                    v8 = v5 + 1;
                    v4 = (char *)v4 - 576;
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
            v14 = (char *)v4 + (unsigned int)-(v13 >> 3) * 72;
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
                sub_b86a90(*(long long *)((char *)v14 - 72));
            }
            i -= 1;
            j &= j - 1;
            v3 = sub_b990e0((char *)v14 - 64);
        } while (i);
    }
    v16 = v3;
    v17 = arm64g_calculate_condition(2, a0->field_8 * 73, 81, 0);
    if (v17 & 1)
        return v16;
}
