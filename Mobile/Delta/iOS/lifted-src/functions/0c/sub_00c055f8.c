/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc055f8..0xc05778 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c055f8_0 {
    long long field_0;
    double *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_c055f8_0;


void sub_c055f8(unsigned long long *a0)
{
    unsigned long long i;  // x20
    st_c055f8_0 *v3;  // x24
    unsigned long long v13;  // 4131
    unsigned long long v14;  // 4133
    unsigned long long v15;  // x9
    unsigned long long v16;  // x9
    unsigned long long v17;  // 4102
    unsigned long long v18;  // x8
    unsigned long long v19;  // 4112
    unsigned long long v4;  // 4102
    unsigned long long v5;  // x25
    unsigned long j;  // x26
    double *v7;  // x27
    unsigned long long *v8;  // x28
    unsigned long long k;  // x19
    unsigned long long *v11;  // x28
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != (a0[3] - a0[1] >> 3) * 14757395258967641293)
    {
        v3 = a0[1] + 40 * i;
        i += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v4 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(v3->field_0);
        }
        v5 = *(long long *)&v3->padding_10[0];
        if (v5)
        {
            j = v3->field_20;
            if (v3->field_20)
            {
                v7 = v3->field_8;
                v8 = v3->field_8 + 1;
                k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*v3->field_8)) & 0x8080808080808080;
                do
                {
                    v11 = v8;
                    if (!k)
                    {
                        do
                        {
                            v11 = v8 + 1;
                            v7 = (char *)v7 - 64;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v8)) & 0x8080808080808080;
                            v8 = v11;
                        } while (!k);
                    }
                    v8 = v11;
                    v13 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v14 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v15 = ((((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v15)
                        v16 = 64;
                    else
                        v16 = Clz(v15);
                    k &= k - 1;
                    j -= 1;
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
                        sub_b86a90(*(long long *)((char *)v7 - (v16 & 120) - 8));
                    }
                } while (j);
            }
            v18 = v5 * 8;
            v19 = arm64g_calculate_condition(2, v18 + v5, 0x11, 0);
            if (!(v19 & 1))
                _free((char *)v3->field_8 - v18 - 8);
        }
    }
    if (!a0[2])
        return;
    _free();
    return;
}
