/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9a380..0xb9a464 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9a380_0 {
    double *field_0;
    char padding_8[16];
    unsigned long long field_18;
} st_b9a380_0;


st_b9a380_0 * sub_b9a380(st_b9a380_0 *a0)
{
    unsigned long i;  // x21
    st_b9a380_0 *v3;  // x0
    unsigned long long v12;  // 4116
    unsigned long long *v4;  // x23
    unsigned long long j;  // x25
    unsigned long long *v7;  // x23
    unsigned long long v9;  // 4131
    unsigned long long v10;  // 4133
    st_b9a380_0 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(long long *)&a0->padding_8[0])
        return a0;
    i = a0->field_18;
    v3 = a0;
    if (v3->field_18)
    {
        v4 = a0->field_0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
        do
        {
            v7 = v4;
            if (!j)
            {
                do
                {
                    v4 = v7 + 1;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7)) & 0x8080808080808080;
                    v7 = v4;
                } while (!j);
            }
            v9 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v10 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            j &= j - 1;
            i -= 1;
            v3 = sub_b98d28();
        } while (i);
    }
    v11 = v3;
    v12 = arm64g_calculate_condition(2, *(long long *)&a0->padding_8[0] * 41, 49, 0);
    if (v12 & 1)
        return v11;
}
