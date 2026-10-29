/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9a694..0xb9a794 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9a694_0 {
    double *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b9a694_0;


void sub_b9a694(st_b9a694_0 *a0)
{
    unsigned long i;  // x21
    double *v3;  // x22
    unsigned long long v12;  // x9
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4116
    unsigned long long *v4;  // x23
    unsigned long j;  // x25
    unsigned long long *v7;  // x23
    unsigned long long v9;  // 4131
    unsigned long long v10;  // 4133
    unsigned long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_8)
        return;
    i = a0->field_18;
    if (a0->field_18)
    {
        v3 = a0->field_0;
        v4 = a0->field_0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
        do
        {
            v7 = v4;
            if (!j)
            {
                do
                {
                    v7 = v4 + 1;
                    v3 = (char *)v3 - 320;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v4)) & 0x8080808080808080;
                    v4 = v7;
                } while (!j);
            }
            v4 = v7;
            v9 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v10 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v11 = ((((v10 | v9) & 0xffff0000ffff0000) >> 16 | (v10 | v9) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v10 | v9) & 0xffff0000ffff0000) >> 16 | (v10 | v9) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v11)
                v12 = 64;
            else
                v12 = Clz(v11);
            j &= j - 1;
            i -= 1;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v13 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v13 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)((char *)v3 + (unsigned int)-(v12 >> 3) * 40 - 40));
            }
        } while (i);
    }
    v14 = arm64g_calculate_condition(2, a0->field_8 * 41, 49, 0);
    if (v14 & 1)
        return;
}
