/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc010e0..0xc012d0 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c010e0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_c010e0_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[8];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[8];
    unsigned long long field_60;
    unsigned long long field_68;
    struct st_c010e0_1 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[8];
    unsigned long long field_90;
} st_c010e0_0;

typedef struct st_c010e0_1 {
    unsigned long long field_0;
} st_c010e0_1;


unsigned long long * sub_c010e0(st_c010e0_0 *a0)
{
    unsigned long long *v2;  // x0
    unsigned long long v3;  // x8
    unsigned long long v12;  // x9
    unsigned long long v13;  // x9
    unsigned long long v14;  // 4102
    unsigned long long v15;  // x8
    unsigned long long j;  // x20
    unsigned long long v17;  // x21
    unsigned long long l;  // x23
    unsigned long long *v19;  // x22
    unsigned long long *v20;  // x22
    unsigned long long i;  // x21
    unsigned long long v22;  // 4131
    unsigned long long v23;  // 4133
    unsigned long long v24;  // x9
    unsigned long long v25;  // x9
    unsigned long long v26;  // 4102
    unsigned long long v5;  // x22
    unsigned long long k;  // x24
    unsigned long long *v7;  // x23
    unsigned long long *v8;  // x23
    unsigned long long v10;  // 4131
    unsigned long long v11;  // 4133
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_90;
    if (a0->field_90)
        v2 = sub_c0461c(v2);
    v3 = a0->field_0;
    if (v3 != 9223372036854775809)
    {
        i = a0->field_38;
        if (i)
        {
            v5 = a0->field_18;
            k = a0->field_20;
            v7 = a0->field_28;
            do
            {
                if (!k)
                {
                    do
                    {
                        v8 = v7 + 1;
                        v5 -= 64;
                        k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7)) & 0x8080808080808080;
                        v7 = v8;
                    } while (!k);
                    a0->field_28 = v8;
                    a0->field_18 = v5;
                    v7 = v8;
                }
                v10 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v11 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v12 = ((((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v12)
                    v13 = 64;
                else
                    v13 = Clz(v12);
                k &= k - 1;
                a0->field_20 = k;
                i -= 1;
                a0->field_38 = i;
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
                    v2 = sub_b86a90(*(long long *)(v5 - (v13 & 120) - 8));
                }
            } while (i);
            v3 = a0->field_0;
        }
        if (v3 && a0->field_8)
            v2 = _free(a0->field_10);
    }
    v15 = a0->field_48;
    if (v15 == 9223372036854775809)
        return v2;
    j = a0->field_80;
    if (j)
    {
        v17 = a0->field_60;
        l = a0->field_68;
        v19 = a0->field_70;
        do
        {
            if (!l)
            {
                do
                {
                    v20 = v19 + 1;
                    v17 -= 64;
                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v19)) & 0x8080808080808080;
                    v19 = v20;
                } while (!l);
                a0->field_70 = v20;
                a0->field_60 = v17;
                v19 = v20;
            }
            v22 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v23 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v24 = ((((v23 | v22) & 0xffff0000ffff0000) >> 16 | (v23 | v22) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v23 | v22) & 0xffff0000ffff0000) >> 16 | (v23 | v22) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v24)
                v25 = 64;
            else
                v25 = Clz(v24);
            l &= l - 1;
            a0->field_68 = l;
            j -= 1;
            a0->field_80 = j;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v26 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v26 & 1))
            {
                /* unsupported instruction */;
                v2 = sub_b86a90(*(long long *)(v17 - (v25 & 120) - 8));
            }
        } while (j);
        v15 = a0->field_48;
    }
    if (!v15)
    {
        return v2;
    }
    else if (!a0->field_50)
    {
        return v2;
    }
    else
    {
        return _free();
    }
}
