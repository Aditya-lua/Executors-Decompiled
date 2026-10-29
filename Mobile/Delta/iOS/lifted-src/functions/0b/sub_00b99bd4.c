/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb99bd4..0xb99d6c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b99bd4_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_b99bd4_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_b99bd4_0;

typedef struct st_b99bd4_1 {
    unsigned long long field_0;
} st_b99bd4_1;


void sub_b99bd4(st_b99bd4_0 *a0)
{
    st_b99bd4_0 *v3;  // x19
    unsigned long i;  // x20
    unsigned long long v14;  // 4131
    unsigned long long v15;  // 4133
    unsigned long v16;  // x9
    unsigned long long v17;  // x9
    void* v18;  // x25
    unsigned long long v19;  // x26
    unsigned long k;  // x27
    double *v21;  // x22
    unsigned long long *v22;  // x28
    unsigned long long v5;  // x21
    unsigned long l;  // x19
    unsigned long long *v25;  // x28
    unsigned long long v27;  // 4131
    unsigned long long v28;  // 4133
    unsigned long v29;  // x9
    unsigned long long v30;  // x9
    unsigned long long v31;  // 4102
    unsigned long long v32;  // x8
    unsigned long j;  // x24
    unsigned long long v33;  // x9
    unsigned long long v34;  // 4116
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long *v7;  // x23
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long *v12;  // x23
    st_b99bd4_0 *v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    i = a0->field_38;
    if (i)
    {
        v5 = v3->field_18;
        j = v3->field_20;
        v7 = v3->field_28;
        v0 = v3;
        do
        {
            if (!j)
            {
                do
                {
                    v12 = v7 + 1;
                    v5 -= 384;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7)) & 0x8080808080808080;
                    v7 = v12;
                } while (!j);
                v3->field_28 = v12;
                v3->field_18 = v5;
                v7 = v12;
            }
            v14 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v15 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v16 = ((((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v15 | v14) & 0xffff0000ffff0000) >> 16 | (v15 | v14) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v16)
                v17 = 64;
            else
                v17 = Clz(v16);
            j &= j - 1;
            v3->field_20 = j;
            v18 = v5 + (unsigned int)-(v17 >> 3) * 48;
            i -= 1;
            v3->field_38 = i;
            v19 = *(long long *)((char *)v18 - 24);
            if (v19)
            {
                k = *(long long *)((char *)v18 - 8);
                if (*(long long *)((char *)v18 - 8))
                {
                    v21 = *(long long *)((char *)v18 - 32);
                    v22 = *(long long *)((char *)v18 - 32) + 8;
                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)*(long long *)((char *)v18 - 32))) & 0x8080808080808080;
                    do
                    {
                        v25 = v22;
                        if (!l)
                        {
                            do
                            {
                                v25 = v22 + 1;
                                v21 = (char *)v21 - 64;
                                l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v22)) & 0x8080808080808080;
                                v22 = v25;
                            } while (!l);
                        }
                        v22 = v25;
                        v27 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v28 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v29 = ((((v28 | v27) & 0xffff0000ffff0000) >> 16 | (v28 | v27) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v28 | v27) & 0xffff0000ffff0000) >> 16 | (v28 | v27) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v29)
                            v30 = 64;
                        else
                            v30 = Clz(v29);
                        l &= l - 1;
                        k -= 1;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v31 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v31 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b86a90(*(long long *)((char *)v21 - (v30 & 120) - 8));
                        }
                    } while (k);
                }
                v32 = v19 * 8;
                v33 = v32 + v19;
                v8 = 2;
                v9 = v33;
                v10 = 0x11;
                v11 = 0;
                v34 = arm64g_calculate_condition(2, v33, 0x11, 0);
                v3 = v0;
                if (!(v34 & 1))
                {
                    _free(*(long long *)((char *)v18 - 32) - v32 - 8);
                    v3 = v0;
                }
            }
        } while (i);
    }
    if (v3->field_0)
    {
        v35 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v36 = arm64g_calculate_condition(20, (v35 & 1 ? v3->field_8 : 0x40000000), 0, 0);
        if (!(v36 & 1))
            return;
    }
    else
    {
        v37 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
        v38 = arm64g_calculate_condition(16, (v37 & 1 ? v3->field_8 : 0x40000000), 0, 0);
        if (!(v38 & 1))
            return;
    }
    _free();
    return;
}
