/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdb640..0xbdb7a8 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdb640_0 {
    long long field_0;
    double *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_bdb640_0;


void sub_bdb640(unsigned long long *a0)
{
    unsigned long long i;  // x20
    st_bdb640_0 *v4;  // x24
    unsigned long long v14;  // 4131
    unsigned long long v15;  // 4133
    unsigned long long v16;  // x9
    unsigned long long v17;  // x9
    unsigned long long v18;  // 4102
    unsigned long long v19;  // x8
    unsigned long long v20;  // 4112
    unsigned long long v5;  // 4102
    unsigned long long v6;  // x25
    unsigned long long j;  // x26
    double *v8;  // x27
    unsigned long long *v9;  // x28
    unsigned long long k;  // x21
    unsigned long long *v12;  // x28
    unsigned long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = 0;
    v0 = a0[2];
    while (i != a0[1])
    {
        v4 = *a0 + 40 * i;
        i += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(v4->field_0);
        }
        v6 = v4->field_10;
        if (v6)
        {
            j = v4->field_20;
            if (v4->field_20)
            {
                v8 = v4->field_8;
                v9 = v4->field_8 + 1;
                k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*v4->field_8)) & 0x8080808080808080;
                do
                {
                    v12 = v9;
                    if (!k)
                    {
                        do
                        {
                            v12 = v9 + 1;
                            v8 = (char *)v8 - 64;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v9)) & 0x8080808080808080;
                            v9 = v12;
                        } while (!k);
                    }
                    v9 = v12;
                    v14 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v15 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v16 = ((((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v16)
                        v17 = 64;
                    else
                        v17 = Clz(v16);
                    k &= k - 1;
                    j -= 1;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v18 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v18 & 1))
                    {
                        /* unsupported instruction */;
                        sub_b86a90(*(long long *)((char *)v8 - (v17 & 120) - 8));
                    }
                } while (j);
            }
            v19 = v6 * 8;
            v20 = arm64g_calculate_condition(2, v19 + v6, 0x11, 0);
            if (!(v20 & 1))
                _free((char *)v4->field_8 - v19 - 8);
        }
    }
    if (!v0)
        return;
    _free();
    return;
}
