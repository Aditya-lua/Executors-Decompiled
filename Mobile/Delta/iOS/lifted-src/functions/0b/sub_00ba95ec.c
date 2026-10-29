/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xba95ec..0xba997c (912 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ba95ec_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    unsigned long long field_18;
    char padding_20[40];
    char field_48;
    char padding_49[151];
    double *field_e0;
    char padding_e8[16];
    unsigned long long field_f8;
    char field_100;
    char padding_101[31];
    char field_120;
    char padding_121[31];
    char field_140;
    char padding_141[31];
    char field_160;
    char padding_161[31];
    double *field_180;
    char padding_188[16];
    unsigned long long field_198;
    char field_1a0;
    char padding_1a1[31];
    char field_1c0;
    char padding_1c1[31];
    double *field_1e0;
    char padding_1e8[16];
    unsigned long long field_1f8;
} st_ba95ec_0;


unsigned long long sub_ba95ec(st_ba95ec_0 *a0)
{
    unsigned long long v2;  // x20
    unsigned long i;  // x21
    unsigned long long v12;  // x9
    unsigned long long v13;  // x9
    unsigned long long v14;  // 4102
    unsigned long long v15;  // x8
    unsigned long long v16;  // 4112
    unsigned long long v17;  // x20
    unsigned long j;  // x21
    double *v19;  // x22
    unsigned long long *v20;  // x23
    double *v4;  // x22
    unsigned long long m;  // x25
    unsigned long long *v23;  // x23
    unsigned long long v25;  // 4131
    unsigned long long v26;  // 4133
    unsigned long long v27;  // x9
    unsigned long long v28;  // x9
    unsigned long long v29;  // 4102
    unsigned long long v30;  // x8
    unsigned long long v31;  // 4116
    unsigned long long *v5;  // x23
    unsigned long long v32;  // x0
    unsigned long long v33;  // x20
    unsigned long k;  // x21
    unsigned long long *v35;  // x23
    unsigned long long n;  // x25
    unsigned long long *v38;  // x23
    unsigned long long v40;  // 4128
    unsigned long long v41;  // 4130
    unsigned long long v42;  // x8
    unsigned long long v43;  // 4116
    unsigned long long v44;  // x8
    unsigned long long v45;  // 4118
    unsigned long long l;  // x24
    unsigned long long *v8;  // x23
    unsigned long long v10;  // 4131
    unsigned long long v11;  // 4133
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)&a0->padding_20[0])
        _free(a0->field_18 - (*(long long *)&a0->padding_20[0] * 8 + 15 & 0xfffffffffffffff8));
    sub_b9ee34(a0->field_8, a0->field_10);
    if (a0->field_0)
        _free(a0->field_8);
    v2 = *(long long *)&a0->padding_e8[0];
    if (v2)
    {
        i = a0->field_f8;
        if (a0->field_f8)
        {
            v4 = a0->field_e0;
            v5 = a0->field_e0 + 1;
            l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_e0)) & 0x8080808080808080;
            do
            {
                v8 = v5;
                if (!l)
                {
                    do
                    {
                        v8 = v5 + 1;
                        v4 = (char *)v4 - 64;
                        l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v5)) & 0x8080808080808080;
                        v5 = v8;
                    } while (!l);
                }
                v5 = v8;
                v10 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v11 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v12 = ((((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v12)
                    v13 = 64;
                else
                    v13 = Clz(v12);
                l &= l - 1;
                i -= 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v14 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v14 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(*(long long *)((char *)v4 - (v13 & 120) - 8));
                }
            } while (i);
        }
        v15 = v2 * 8;
        v16 = arm64g_calculate_condition(2, v15 + v2, 0x11, 0);
        if (!(v16 & 1))
            _free((char *)a0->field_e0 - v15 - 8);
    }
    sub_b9a264(&a0->field_100);
    sub_b9a148(&a0->field_120);
    sub_b98884(&a0->field_140);
    sub_b98884(&a0->field_160);
    v17 = *(long long *)&a0->padding_188[0];
    if (v17)
    {
        j = a0->field_198;
        if (a0->field_198)
        {
            v19 = a0->field_180;
            v20 = a0->field_180 + 1;
            m = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_180)) & 0x8080808080808080;
            do
            {
                v23 = v20;
                if (!m)
                {
                    do
                    {
                        v23 = v20 + 1;
                        v19 = (char *)v19 - 320;
                        m = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v20)) & 0x8080808080808080;
                        v20 = v23;
                    } while (!m);
                }
                v20 = v23;
                v25 = ((((((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v26 = (((((((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((m & 0xaaaaaaaaaaaaaaaa) >> 1 | m * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v27)
                    v28 = 64;
                else
                    v28 = Clz(v27);
                m &= m - 1;
                j -= 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v29 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v29 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(*(long long *)((char *)v19 + (unsigned int)-(v28 >> 3) * 40 - 40));
                }
            } while (j);
        }
        v30 = v17 * 40;
        v31 = arm64g_calculate_condition(2, v30 + v17, 49, 0);
        if (!(v31 & 1))
            _free((char *)a0->field_180 - v30 - 40);
    }
    sub_b9a464(&a0->field_1a0);
    sub_baeed4(&a0->field_48);
    v32 = sub_b99f34(&a0->field_1c0);
    v33 = *(long long *)&a0->padding_1e8[0];
    if (v33)
    {
        k = a0->field_1f8;
        if (a0->field_1f8)
        {
            v35 = a0->field_1e0 + 1;
            n = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_1e0)) & 0x8080808080808080;
            do
            {
                v38 = v35;
                if (!n)
                {
                    do
                    {
                        v38 = v35 + 1;
                        n = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v35)) & 0x8080808080808080;
                        v35 = v38;
                    } while (!n);
                }
                v35 = v38;
                v40 = ((((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v41 = (((((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v32 = sub_b98b8c();
                n &= n - 1;
                k -= 1;
            } while (k);
        }
        v42 = v33 * 72;
        v43 = arm64g_calculate_condition(2, v42 + v33, 81, 0);
        if (!(v43 & 1))
            v32 = _free((char *)a0->field_1e0 - v42 - 72);
    }
    v44 = a0[1].field_8;
    if (!v44)
        return v32;
    v45 = arm64g_calculate_condition(2, v44 + (v44 * 4 + 11 & 0xfffffffffffffff8), 9, 0);
    if (v45 & 1)
        return v32;
    return _free();
}
