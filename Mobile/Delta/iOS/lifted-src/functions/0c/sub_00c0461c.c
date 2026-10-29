/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0461c..0xc04758 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0461c_0 {
    double *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_c0461c_0;


void sub_c0461c(unsigned long long *a0)
{
    unsigned long long i;  // x20
    st_c0461c_0 *v3;  // x23
    unsigned long long v12;  // 4131
    unsigned long long v13;  // 4133
    unsigned long long v14;  // x9
    unsigned long long v15;  // x9
    unsigned long long v16;  // 4102
    unsigned long long v17;  // x8
    unsigned long long v18;  // 4112
    unsigned long long v4;  // x24
    unsigned long j;  // x25
    double *v6;  // x26
    unsigned long long *v7;  // x27
    unsigned long long k;  // x28
    unsigned long long *v10;  // x27
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = 0;
    while (i != a0[3] - a0[1] >> 5)
    {
        v3 = a0[1] + i * 32;
        i += 1;
        v4 = *(long long *)&v3->padding_8[0];
        if (v4)
        {
            j = v3->field_18;
            if (v3->field_18)
            {
                v6 = v3->field_0;
                v7 = v3->field_0 + 1;
                k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*v3->field_0)) & 0x8080808080808080;
                do
                {
                    v10 = v7;
                    if (!k)
                    {
                        do
                        {
                            v10 = v7 + 1;
                            v6 = (char *)v6 - 64;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7)) & 0x8080808080808080;
                            v7 = v10;
                        } while (!k);
                    }
                    v7 = v10;
                    v12 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v13 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v14 = ((((v13 | v12) & 0xffff0000ffff0000) >> 16 | (v13 | v12) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v13 | v12) & 0xffff0000ffff0000) >> 16 | (v13 | v12) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v14)
                        v15 = 64;
                    else
                        v15 = Clz(v14);
                    k &= k - 1;
                    j -= 1;
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
                        sub_b86a90(*(long long *)((char *)v6 - (v15 & 120) - 8));
                    }
                } while (j);
            }
            v17 = v4 * 8;
            v18 = arm64g_calculate_condition(2, v17 + v4, 0x11, 0);
            if (!(v18 & 1))
                _free((char *)v3->field_0 - v17 - 8);
        }
    }
    if (!a0[2])
        return;
    _free();
    return;
}
