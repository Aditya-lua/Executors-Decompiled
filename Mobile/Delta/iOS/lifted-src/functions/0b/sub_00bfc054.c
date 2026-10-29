/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfc054..0xbfc140 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfc054_0 {
    double *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_bfc054_0;


void sub_bfc054(st_bfc054_0 *a0)
{
    unsigned long long i;  // x21
    unsigned long long *v3;  // x23
    unsigned long long j;  // x24
    unsigned long long *v6;  // x23
    unsigned long long v8;  // 4131
    unsigned long long v9;  // 4133
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4112
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(long long *)&a0->padding_8[0])
        return;
    i = a0->field_18;
    if (a0->field_18)
    {
        v3 = a0->field_0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
        do
        {
            v6 = v3;
            if (!j)
            {
                do
                {
                    v6 = v3 + 1;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v3)) & 0x8080808080808080;
                    v3 = v6;
                } while (!j);
            }
            v3 = v6;
            v8 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v9 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            j &= j - 1;
            i -= 1;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v10 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v10 & 1))
            {
                /* unsupported instruction */;
                sub_b86ac8();
            }
        } while (i);
    }
    v11 = arm64g_calculate_condition(2, *(long long *)&a0->padding_8[0] * 0x11, 25, 0);
    if (v11 & 1)
        return;
}
