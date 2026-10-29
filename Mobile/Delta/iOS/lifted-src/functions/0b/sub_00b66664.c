/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb66664..0xb667c8 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b66664_0 {
    char padding_0[56];
    long long field_38;
    long long field_40;
    unsigned long long field_48;
    char padding_50[40];
    double *field_78;
    unsigned long long field_80;
    char padding_88[8];
    unsigned long long field_90;
} st_b66664_0;


void sub_b66664(st_b66664_0 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long long j;  // x24
    unsigned long long *v21;  // x23
    unsigned long long v23;  // 4131
    unsigned long long v24;  // 4133
    unsigned long long v25;  // 4102
    unsigned long long v26;  // x8
    unsigned long long v27;  // 4112
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x20
    unsigned long i;  // x21
    unsigned long long *v18;  // x23
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_80;
    if (v16)
    {
        i = a0->field_90;
        if (a0->field_90)
        {
            v18 = a0->field_78 + 1;
            j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_78)) & 0x8080808080808080;
            do
            {
                v21 = v18;
                if (!j)
                {
                    do
                    {
                        v21 = v18 + 1;
                        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v18)) & 0x8080808080808080;
                        v18 = v21;
                    } while (!j);
                }
                v18 = v21;
                v23 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v24 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                j &= j - 1;
                i -= 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v25 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v25 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec();
                }
            } while (i);
        }
        v26 = v16 * 16;
        v27 = arm64g_calculate_condition(2, v26 + v16, 25, 0);
        if (!(v27 & 1))
            _free((char *)a0->field_78 - v26 - 16);
    }
    sub_b65c48(a0);
    if (*(long long *)&a0->padding_50[0])
        _free(a0->field_48 - *(long long *)&a0->padding_50[0] * 8 - 8);
    sub_bffb80(a0->field_38, a0->field_40);
    if (*(long long *)&a0->padding_0[48])
        _free(a0->field_38);
    sub_bfbcdc();
    return;
}
