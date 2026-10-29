/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9a148..0xb9a264 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9a148_0 {
    double *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b9a148_0;


st_b9a148_0 * sub_b9a148(st_b9a148_0 *a0)
{
    unsigned long v2;  // x20
    unsigned long v3;  // x21
    unsigned long long v12;  // 4133
    unsigned long v13;  // x9
    unsigned long long v14;  // x9
    void* v15;  // x25
    unsigned long long v16;  // 4102
    unsigned long long v17;  // x9
    unsigned long long v18;  // 4112
    double *v4;  // x22
    double *v5;  // x23
    unsigned long long *v6;  // x23
    unsigned long v7;  // d0
    unsigned long i;  // x24
    unsigned long long *v9;  // x23
    unsigned long long v11;  // 4131
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (!v2)
        return a0;
    v3 = a0->field_18;
    if (v3)
    {
        v4 = a0->field_0;
        v5 = v4;
        v6 = v5 + 1;
        v7 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*v5));
        i = __double_as_longlong(v7) & 0x8080808080808080;
        while (1)
        {
            v9 = v6;
            if (!i)
            {
                do
                {
                    v9 = v6 + 1;
                    v4 = (char *)v4 - 128;
                    i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v6)) & 0x8080808080808080;
                    v6 = v9;
                } while (!i);
            }
            v6 = v9;
            v11 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v12 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v13 = ((((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v12 | v11) & 0xffff0000ffff0000) >> 16 | (v12 | v11) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v13)
                v14 = 64;
            else
                v14 = Clz(v13);
            i &= i - 1;
            v15 = (char *)v4 - (v14 * 2 & 240);
            v3 -= 1;
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
                a0 = sub_b86a90(*(long long *)((char *)v15 - 16));
            }
            v17 = *(long long *)*(long long *)((char *)v15 - 8);
            *(unsigned long long *)*(long long *)((char *)v15 - 8) = v17 - 1;
            if (v17 == 1)
            {
                a0 = sub_bdc23c(*(long long *)((char *)v15 - 8));
                if (!v3)
                    break;
            }
            else if (!v3)
            {
                break;
            }
        }
    }
    v18 = arm64g_calculate_condition(2, v2 * 0x11, 25, 0);
    if (v18 & 1)
        return a0;
}
