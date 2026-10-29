/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb866a8..0xb867f8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b866a8_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_b866a8_1 *field_28;
    char padding_30[8];
    unsigned long long field_38;
} st_b866a8_0;

typedef struct st_b866a8_1 {
    unsigned long long field_0;
} st_b866a8_1;


st_b866a8_0 * sub_b866a8(st_b866a8_0 *a0)
{
    unsigned long v11;  // x20
    st_b866a8_0 *v12;  // x0
    unsigned long long v21;  // x9
    unsigned long long *v22;  // x24
    unsigned long long v23;  // 4102
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // cc_ndep
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long long v30;  // 4110
    unsigned long v13;  // x21
    unsigned long long v31;  // 4102
    unsigned long i;  // x23
    unsigned long long *v15;  // x22
    unsigned long long *v16;  // x22
    unsigned long long v18;  // 4131
    unsigned long long v19;  // 4133
    unsigned long v20;  // x9
    unsigned long v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long v7;  // [bp-0x50]
    unsigned long v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_38;
    v12 = a0;
    if (v11)
    {
        v13 = a0->field_18;
        i = a0->field_20;
        v15 = a0->field_28;
        while (1)
        {
            if (!i)
            {
                do
                {
                    v16 = v15 + 1;
                    v13 -= 0x100;
                    i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v15)) & 0x8080808080808080;
                    v15 = v16;
                } while (!i);
                a0->field_28 = v16;
                a0->field_18 = v13;
                v15 = v16;
            }
            v18 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v19 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v20 = ((((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v19 | v18) & 0xffff0000ffff0000) >> 16 | (v19 | v18) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v20)
                v21 = 64;
            else
                v21 = Clz(v20);
            i &= i - 1;
            a0->field_20 = i;
            v22 = v13 - (v21 * 4 & 480);
            v11 -= 1;
            a0->field_38 = v11;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v23 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v23 & 1))
            {
                /* unsupported instruction */;
                sub_b869ec();
            }
            if (*(long long *)((char *)v22 - 24))
            {
                v1 = 0;
                v2 = *(long long *)((char *)v22 - 24);
                v5 = 0;
                v6 = v2;
                v7 = *(long long *)((char *)v22 - 16);
                v8 = *(long long *)((char *)v22 - 8);
                v0 = 1;
                v3 = *(long long *)((char *)v22 - 16);
                v4 = 1;
                v12 = sub_b86c48(&v0);
                if (!v11)
                    break;
            }
            else
            {
                v0 = 0;
                v4 = 0;
                v8 = 0;
                v12 = sub_b86c48(&v0);
                if (!v11)
                    break;
            }
        }
    }
    if (a0->field_0)
    {
        v28 = arm64g_calculate_condition(v24 | 16, v25, v26, v27);
        v29 = arm64g_calculate_condition(20, (v28 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v29 & 1))
            return v12;
    }
    else
    {
        v30 = arm64g_calculate_condition(v24 | 16, v25, v26, v27);
        v31 = arm64g_calculate_condition(16, (v30 & 1 ? a0->field_8 : 0x40000000), 0, 0);
        if (!(v31 & 1))
            return v12;
    }
}
