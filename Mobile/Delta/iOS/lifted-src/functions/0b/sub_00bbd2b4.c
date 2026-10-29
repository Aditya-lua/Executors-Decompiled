/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbbd2b4..0xbbd404 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bbd2b4_0 {
    unsigned long long field_0;
    struct st_bbd2b4_1 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
    char padding_28[8];
    double *field_30;
    unsigned long long field_38;
    char padding_40[8];
    unsigned long long field_48;
} st_bbd2b4_0;

typedef struct st_bbd2b4_1 {
    long long field_0;
} st_bbd2b4_1;


st_bbd2b4_0 * sub_bbd2b4(st_bbd2b4_0 *a0)
{
    unsigned long long v2;  // x20
    st_bbd2b4_0 *v3;  // x0
    unsigned long long *v12;  // x23
    unsigned long long v14;  // 4131
    unsigned long long v15;  // 4133
    unsigned long long v16;  // x9
    unsigned long long v17;  // x9
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4112
    unsigned long long v4;  // x20
    unsigned long long v5;  // x20
    unsigned long long v6;  // 4102
    unsigned long long i;  // x21
    unsigned long long *v8;  // x22
    unsigned long long *v9;  // x23
    unsigned long long j;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = a0;
    while (1)
    {
        v4 = v2;
        if (v4 == a0->field_10)
            break;
        v5 = v4 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v5;
        if (!(v6 & 1))
        {
            /* unsupported instruction */;
            v3 = sub_b86a90(*(long long *)&a0->field_8[2 * v4]);
            v2 = v5;
        }
    }
    if (a0->field_0)
        v3 = _free(a0->field_8);
    if (a0->field_18)
        v3 = _free(a0->field_20);
    if (!a0->field_38)
        return v3;
    i = a0->field_48;
    if (a0->field_48)
    {
        v8 = a0->field_30;
        v9 = a0->field_30 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_30)) & 0x8080808080808080;
        do
        {
            v12 = v9;
            if (!j)
            {
                do
                {
                    v12 = v9 + 1;
                    v8 = (char *)v8 - 128;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v9)) & 0x8080808080808080;
                    v9 = v12;
                } while (!j);
            }
            v9 = v12;
            v14 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v15 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v16 = ((((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v16)
                v17 = 64;
            else
                v17 = Clz(v16);
            j &= j - 1;
            i -= 1;
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
                v3 = sub_b86a90(*(long long *)((char *)v8 - (v17 * 2 & 240) - 16));
            }
        } while (i);
    }
    v19 = arm64g_calculate_condition(2, a0->field_38 * 0x11, 25, 0);
    if (v19 & 1)
        return v3;
    return _free();
}
