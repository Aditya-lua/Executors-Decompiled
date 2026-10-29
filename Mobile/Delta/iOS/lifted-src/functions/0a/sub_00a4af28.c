/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4af28..0xa4b0e8 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4af28_1 {
    char padding_0[84];
    char field_54;
} st_a4af28_1;

typedef struct st_a4af28_0 {
    int field_0;
    unsigned int field_4;
    char field_8;
    char padding_9[83];
    char field_5c;
} st_a4af28_0;


char sub_a4af28(st_a4af28_0 *a0, long long a1, unsigned int *a2, long long a3, unsigned long long a4)
{
    long long node;  // x20
    unsigned int v3;  // w3
    unsigned long v12;  // x8
    unsigned long v13;  // x9
    unsigned long long v14;  // x8
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long v4;  // x22
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long v5;  // x8
    unsigned long long n;  // x23
    long long iter;  // x21
    st_a4af28_1 *v8;  // x22
    unsigned int v9;  // w0
    char iter1;  // x23
    unsigned int v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a2 = 0;
    if ((int)a4 < 1)
        return 0;
    node = a3;
    v3 = a0->field_4;
    if (81 > (int)v3)
    {
        v4 = a4;
        v5 = a0->field_0;
        n = v3 - v5;
        if ((int)n > (int)a4)
        {
            _memcpy(&(&a0->field_8)[v5], node, v4 & 0xffffffff);
            a0->field_0 = a0->field_0 + (unsigned int)v4;
        }
        else
        {
            iter = a1;
            if ((unsigned int)v5)
            {
                v8 = &a0->field_8;
                _memcpy(&v8->padding_0[v5], node, n);
                node += n;
                v9 = sub_a4b0e8(a0, iter, v8, a0->field_4);
                a0->field_0 = 0;
                iter1 = v9;
                iter += iter1;
                if (!(a0->field_5c & 1))
                {
                    *(char *)iter = 10;
                    iter += 1;
                    iter1 += 1;
                }
                *(char *)iter = 0;
                v4 = a4 - n;
                if ((int)a0->field_4 <= (int)v4)
                    goto LABEL_a4b020;
            }
            else
            {
                iter1 = 0;
                if ((int)v4 >= (int)v3)
                {
LABEL_a4b020:
                    if (iter1 <= 0x7fffffff)
                    {
                        while (1)
                        {
                            v11 = sub_a4b0e8(a0, iter, node);
                            v12 = a0->field_4;
                            v13 = v11;
                            iter += v13;
                            iter1 += v13;
                            if (!(a0->field_5c & 1))
                            {
                                *(char *)iter = 10;
                                iter += 1;
                                iter1 += 1;
                            }
                            node += v12;
                            v4 -= v12;
                            *(char *)iter = 0;
                            v14 = iter1 >> 31;
                            if ((int)a0->field_4 <= (int)v4)
                            {
                                v19 = arm64g_calculate_condition(v15 | 160, v16, v17, v18);
                                v20 = arm64g_calculate_condition(20, (v19 & 1 ? v14 : 0), 0, 0);
                                if (v20 & 1)
                                    break;
                            }
                            else
                            {
                                v21 = arm64g_calculate_condition(v15 | 160, v16, v17, v18);
                                v22 = arm64g_calculate_condition(16, (v21 & 1 ? v14 : 0), 0, 0);
                                if (v22 & 1)
                                    break;
                            }
                        }
                    }
                }
            }
            if (iter1 > 0x7fffffff)
            {
                *a2 = 0;
                return 0;
            }
            if ((unsigned int)v4)
                _memcpy(&a0->field_8, node, (int)v4);
            a0->field_0 = v4;
            *a2 = iter1;
        }
        return 1;
    }
    sub_a69928("assertion failed: ctx->length <= (int)sizeof(ctx->enc_data)", "crypto/evp/encode.c", 162);
}
