/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0e768..0xc0e87c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0e768_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_c0e768_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_c0e768_0;

typedef struct st_c0e768_1 {
    unsigned long long field_0;
} st_c0e768_1;


void sub_c0e768(st_c0e768_0 *a0)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // cc_op
    unsigned long long v13;  // 4131
    unsigned long long v14;  // 4133
    unsigned long long v15;  // x9
    unsigned long long v16;  // x9
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long v4;  // cc_dep1
    unsigned long long v22;  // 4102
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    unsigned long long i;  // x20
    unsigned long long v8;  // x21
    unsigned long long j;  // x23
    unsigned long long *v10;  // x22
    unsigned long long *v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = 4;
    v4 = v2;
    v5 = 9223372036854775809;
    v6 = 0;
    if (v2 == 9223372036854775809)
        return;
    i = a0->field_38;
    if (i)
    {
        v8 = a0->field_18;
        j = a0->field_20;
        v10 = a0->field_28;
        do
        {
            if (!j)
            {
                do
                {
                    v11 = v10 + 1;
                    v8 -= 64;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v10)) & 0x8080808080808080;
                    v10 = v11;
                } while (!j);
                a0->field_28 = v11;
                a0->field_18 = v8;
                v10 = v11;
            }
            v13 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v14 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v15 = ((((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v15)
                v16 = 64;
            else
                v16 = Clz(v15);
            j &= j - 1;
            a0->field_20 = j;
            i -= 1;
            a0->field_38 = i;
            do
            {
                /* unsupported instruction */;
                v3 = 4;
                v4 = /* unsupported instruction */;
                v5 = 1;
                v6 = 0;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v17 = arm64g_calculate_condition(20, v4, 1, 0);
            if (!(v17 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(*(long long *)(v8 - (v16 & 120) - 8));
            }
        } while (i);
        v2 = a0->field_0;
    }
    if (v2)
    {
        v18 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
        v19 = arm64g_calculate_condition(4, (v18 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v19 & 1))
            goto LABEL_c0e82c;
    }
    else
    {
        v20 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
        v21 = arm64g_calculate_condition(0, (v20 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v21 & 1))
        {
LABEL_c0e82c:
            _free(a0->field_10);
        }
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v22 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v22 & 1)
        return;
    /* unsupported instruction */;
    sub_b86a90();
    return;
}
