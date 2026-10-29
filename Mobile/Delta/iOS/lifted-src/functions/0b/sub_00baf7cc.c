/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbaf7cc..0xbaf968 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_baf7cc_0 {
    double *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    double *field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_baf7cc_0;


st_baf7cc_0 * sub_baf7cc(st_baf7cc_0 *a0)
{
    unsigned long v2;  // x20
    st_baf7cc_0 *v3;  // x0
    unsigned long long v12;  // 4133
    unsigned long v13;  // x9
    unsigned long long v14;  // x9
    unsigned long long v15;  // 4102
    unsigned long long v16;  // x8
    unsigned long long v17;  // 4112
    unsigned long j;  // x21
    unsigned long long *v19;  // x22
    unsigned long long *v20;  // x23
    unsigned long i;  // x21
    unsigned long l;  // x24
    unsigned long long *v23;  // x23
    unsigned long long v25;  // 4131
    unsigned long long v26;  // 4133
    unsigned long v27;  // x9
    unsigned long long v28;  // x9
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4112
    unsigned long long *v5;  // x22
    unsigned long long *v6;  // x23
    unsigned long k;  // x24
    unsigned long long *v9;  // x23
    unsigned long long v11;  // 4131
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = a0;
    if (v2)
    {
        i = a0->field_18;
        v3 = a0;
        if (v3->field_18)
        {
            v5 = a0->field_0;
            v6 = a0->field_0 + 1;
            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
            v3 = a0;
            do
            {
                v9 = v6;
                if (!k)
                {
                    do
                    {
                        v9 = v6 + 1;
                        v5 = (char *)v5 - 64;
                        k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v6)) & 0x8080808080808080;
                        v6 = v9;
                    } while (!k);
                }
                v6 = v9;
                v11 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v12 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v13 = ((((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v13)
                    v14 = 64;
                else
                    v14 = Clz(v13);
                k &= k - 1;
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
            v3 = _free((char *)a0->field_0 - v16 - 8);
    }
    if (!a0->field_28)
        return v3;
    j = a0->field_38;
    if (a0->field_38)
    {
        v19 = a0->field_20;
        v20 = a0->field_20 + 1;
        l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_20)) & 0x8080808080808080;
        do
        {
            v23 = v20;
            if (!l)
            {
                do
                {
                    v23 = v20 + 1;
                    v19 = (char *)v19 - 64;
                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v20)) & 0x8080808080808080;
                    v20 = v23;
                } while (!l);
            }
            v20 = v23;
            v25 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v26 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v27)
                v28 = 64;
            else
                v28 = Clz(v27);
            l &= l - 1;
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
                v3 = sub_b86a90(*(long long *)((char *)v19 - (v28 & 120) - 8));
            }
        } while (j);
    }
    v30 = arm64g_calculate_condition(2, a0->field_28 * 9, 0x11, 0);
    if (v30 & 1)
        return v3;
    return _free();
}
