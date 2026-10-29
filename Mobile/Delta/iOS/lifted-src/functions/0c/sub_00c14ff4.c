/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc14ff4..0xc15184 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c14ff4_0 {
    unsigned long long field_0;
    struct st_c14ff4_1 *field_8;
    unsigned long long field_10;
    char field_18;
    char padding_19[71];
    long long field_60;
    long long field_68;
    char padding_70[32];
    unsigned long long field_90;
    unsigned long long field_98;
    char padding_a0[16];
    double *field_b0;
    unsigned long long field_b8;
    char padding_c0[8];
    unsigned long long field_c8;
} st_c14ff4_0;

typedef struct st_c14ff4_1 {
    long long field_0;
} st_c14ff4_1;


unsigned long long sub_c14ff4(st_c14ff4_0 *a0)
{
    unsigned long long v2;  // x22
    unsigned long v3;  // x22
    unsigned long long *v12;  // x23
    unsigned long long j;  // x24
    unsigned long long *v15;  // x23
    unsigned long long v17;  // 4128
    unsigned long long v18;  // 4130
    unsigned long long v19;  // x8
    unsigned long long v20;  // x8
    long long *v21;  // x8
    unsigned long v4;  // x22
    unsigned long long v22;  // 4112
    unsigned long long v5;  // 4102
    unsigned long long v6;  // x0
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // 4118
    unsigned long long i;  // x21
    double *v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_60 >= 1)
        _free(a0->field_68);
    v2 = 0;
    while (1)
    {
        v3 = v2;
        if (v3 == a0->field_10)
            break;
        v4 = v3 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v4;
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&a0->field_8[v3]);
            v2 = v4;
        }
    }
    if (a0->field_0)
        _free(a0->field_8);
    v6 = sub_c25730(&a0->field_18);
    v7 = a0->field_98;
    if (v7)
    {
        v8 = v7 * 4 + 11 & 0xfffffffffffffff8;
        v9 = arm64g_calculate_condition(2, v7 + v8, 9, 0);
        if (!(v9 & 1))
            v6 = _free(a0->field_90 - v8);
    }
    if (!a0->field_b8)
        return v6;
    i = a0->field_c8;
    if (a0->field_c8)
    {
        v11 = a0->field_b0;
        v12 = a0->field_b0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_b0)) & 0x8080808080808080;
        do
        {
            v15 = v12;
            if (!j)
            {
                do
                {
                    v15 = v12 + 1;
                    v11 = (char *)v11 - 0x100;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v12)) & 0x8080808080808080;
                    v12 = v15;
                } while (!j);
            }
            v12 = v15;
            v17 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v18 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v19 = ((((v18 | v17) & 0xffff0000ffff0000) >> 16 | (v18 | v17) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v18 | v17) & 0xffff0000ffff0000) >> 16 | (v18 | v17) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v19)
                v20 = 64;
            else
                v20 = Clz(v19);
            v21 = (char *)v11 - (v20 * 4 & 480);
            if (*(long long *)((char *)v21 - 32))
                v6 = _free(*(long long *)((char *)v21 - 24));
            j &= j - 1;
            i -= 1;
        } while (i);
    }
    v22 = arm64g_calculate_condition(2, a0->field_b8 * 33, 41, 0);
    if (v22 & 1)
        return v6;
    return _free();
}
