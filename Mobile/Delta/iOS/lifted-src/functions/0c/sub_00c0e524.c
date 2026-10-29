/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0e524..0xc0e768 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0e524_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[24];
    unsigned long long field_28;
    char padding_30[24];
    unsigned long long field_48;
    unsigned long long field_50;
    long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    struct st_c0e524_1 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    long long field_88;
    unsigned long long field_90;
    unsigned long long field_98;
    long long field_a0;
    unsigned long long field_a8;
    unsigned long long field_b0;
    struct st_c0e524_1 *field_b8;
    char padding_c0[8];
    unsigned long long field_c8;
} st_c0e524_0;

typedef struct st_c0e524_1 {
    unsigned long long field_0;
} st_c0e524_1;


st_c0e524_0 * sub_c0e524(st_c0e524_0 *a0)
{
    st_c0e524_0 *v2;  // x0
    st_c0e524_0 *v3;  // x0
    unsigned long long v12;  // 4131
    unsigned long long v13;  // 4133
    unsigned long v14;  // x9
    unsigned long long v15;  // x9
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4102
    unsigned long v18;  // x8
    unsigned long j;  // x20
    unsigned long v20;  // x21
    unsigned long l;  // x23
    st_c0e524_0 *v4;  // x0
    unsigned long long *v22;  // x22
    unsigned long long *v23;  // x22
    unsigned long long v25;  // 4131
    unsigned long long v26;  // 4133
    unsigned long v27;  // x9
    unsigned long long v28;  // x9
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4102
    unsigned long v5;  // x8
    unsigned long i;  // x21
    unsigned long v7;  // x22
    unsigned long k;  // x24
    unsigned long long *v9;  // x23
    unsigned long long *v10;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_0)
    {
        v3 = a0;
        if (v3->field_8)
            sub_c055f8(&v3->field_8);
        v4 = a0;
        v2 = &v4->field_28;
        if (v4->field_28)
            v2 = sub_c0461c(v2);
    }
    v5 = a0->field_48;
    if (v5 != 9223372036854775809)
    {
        i = a0->field_80;
        if (i)
        {
            v7 = a0->field_60;
            k = a0->field_68;
            v9 = a0->field_70;
            do
            {
                if (!k)
                {
                    do
                    {
                        v10 = v9 + 1;
                        v7 -= 64;
                        k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v9)) & 0x8080808080808080;
                        v9 = v10;
                    } while (!k);
                    a0->field_70 = v10;
                    a0->field_60 = v7;
                    v9 = v10;
                }
                v12 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v13 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v14 = ((((v13 | v12) & 0xffff0000ffff0000) >> 16 | (v13 | v12) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v13 | v12) & 0xffff0000ffff0000) >> 16 | (v13 | v12) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v14)
                    v15 = 64;
                else
                    v15 = Clz(v14);
                k &= k - 1;
                a0->field_68 = k;
                i -= 1;
                a0->field_80 = i;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v16 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v16 & 1))
                {
                    /* unsupported instruction */;
                    v2 = sub_b86a90(*(long long *)(v7 - (v15 & 120) - 8));
                }
            } while (i);
            v5 = a0->field_48;
        }
        if (v5 && a0->field_50)
            v2 = _free(a0->field_58);
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v17 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v17 & 1))
        {
            /* unsupported instruction */;
            v2 = sub_b86a90(a0->field_88);
        }
    }
    v18 = a0->field_90;
    if (v18 == 9223372036854775809)
        return v2;
    j = a0->field_c8;
    if (j)
    {
        v20 = a0->field_a8;
        l = a0->field_b0;
        v22 = a0->field_b8;
        do
        {
            if (!l)
            {
                do
                {
                    v23 = v22 + 1;
                    v20 -= 64;
                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v22)) & 0x8080808080808080;
                    v22 = v23;
                } while (!l);
                a0->field_b8 = v23;
                a0->field_a8 = v20;
                v22 = v23;
            }
            v25 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v26 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v27)
                v28 = 64;
            else
                v28 = Clz(v27);
            l &= l - 1;
            a0->field_b0 = l;
            j -= 1;
            a0->field_c8 = j;
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
                v2 = sub_b86a90(*(long long *)(v20 - (v28 & 120) - 8));
            }
        } while (j);
        v18 = a0->field_90;
    }
    if (v18 && a0->field_98)
        v2 = _free(a0->field_a0);
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v30 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v30 & 1)
        return v2;
    /* unsupported instruction */;
    return sub_b86a90();
}
