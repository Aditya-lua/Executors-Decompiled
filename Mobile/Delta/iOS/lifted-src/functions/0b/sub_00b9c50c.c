/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9c50c..0xb9c640 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9c50c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_b9c50c_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[56];
    unsigned long long field_80;
} st_b9c50c_0;

typedef struct st_b9c50c_1 {
    unsigned long long field_0;
} st_b9c50c_1;


unsigned long long * sub_b9c50c(st_b9c50c_0 *a0)
{
    unsigned long long v2;  // x8
    unsigned long v3;  // cc_op
    unsigned long long v13;  // 4131
    unsigned long long v14;  // 4133
    unsigned long long v15;  // x9
    unsigned long long v16;  // x9
    long long *v17;  // x26
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4110
    unsigned long v4;  // cc_dep1
    unsigned long long v22;  // 4102
    unsigned long long *v23;  // x0
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    unsigned long long i;  // x21
    unsigned long long v8;  // x22
    unsigned long long j;  // x25
    unsigned long long *v10;  // x24
    unsigned long long *v11;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    v3 = 4;
    v4 = v2;
    v5 = 9223372036854775809;
    v6 = 0;
    if (v2 != 9223372036854775809)
    {
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
                        v8 -= 320;
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
                v17 = v8 + (unsigned int)-(v16 >> 3) * 40;
                i -= 1;
                a0->field_38 = i;
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
                    sub_b86a90(*(long long *)((char *)v17 - 40));
                }
                sub_b98e3c((char *)v17 - 32);
            } while (i);
            v2 = a0->field_0;
        }
        if (v2)
        {
            v19 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
            v20 = arm64g_calculate_condition(4, (v19 & 1 ? a0->field_8 : 0x40000000), 0, 0);
            if (!(v20 & 1))
                goto LABEL_b9c5e0;
        }
        else
        {
            v21 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
            v22 = arm64g_calculate_condition(0, (v21 & 1 ? a0->field_8 : 0x40000000), 0, 0);
            if (!(v22 & 1))
            {
LABEL_b9c5e0:
                _free(a0->field_10);
            }
        }
    }
    v23 = &a0->field_40;
    if (a0->field_40 != 9223372036854775809)
        v23 = sub_b99bd4(v23);
    if (a0->field_80 != 9223372036854775809)
        return sub_b99bd4();
    return v23;
}
