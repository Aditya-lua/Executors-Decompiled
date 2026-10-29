/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa663dc..0xa66520 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a663dc_0 {
    char padding_0[168];
    char field_a8;
    char padding_a9[15];
    unsigned int field_b8;
    unsigned int field_bc;
    unsigned int field_c0;
    unsigned int field_c4;
    unsigned int field_c8;
    unsigned int field_cc;
} st_a663dc_0;


double sub_a663dc(st_a663dc_0 *a0, void* a1)
{
    long long v0;  // w8
    unsigned int *v1;  // x10
    unsigned int *v10;  // x10
    long long v11;  // x12
    long long j;  // x13
    long long v13;  // x15
    unsigned long long v14;  // x16
    long long v15;  // x14
    long long v16;  // x0
    long long v17;  // x14
    unsigned long v19;  // d0
    void* iter;  // x11
    long long v3;  // x12
    long long i;  // x13
    long long v5;  // x15
    unsigned long long v6;  // x16
    long long v7;  // x14
    long long v8;  // x0
    long long v9;  // x14

    v0 = 0;
    v1 = &a0->field_c0;
    iter = a1;
    v3 = *v1;
    if (!(int)v3)
        goto LABEL_a6644c;
    while (1)
    {
        i = 65537 - (int)v3 * (unsigned int)(65537 / v3);
        if ((int)i)
        {
            v5 = 0;
            v6 = 65537;
            v7 = 1;
            do
            {
                v8 = i;
                v9 = v5 - v7 * (v6 - i) / v3;
                i = v3 - v8 * v3 / v8;
                v3 = v8;
                v5 = v7;
                v6 = v3;
                v7 = v9;
            } while (i);
            if (v9 < 0)
                v3 = v9 + 65537 & 0xffffffff;
            else
                v3 = v9 & 0xffffffff;
        }
        else
        {
            v3 = 1;
        }
        do
        {
LABEL_a6644c:
            v10 = v1;
            *(int *)iter = v3;
            *(unsigned int *)&iter[4] = -v10[2] & 0xffff;
            *(unsigned int *)&iter[8] = -v10[1] & 0xffff;
            v11 = v10[3];
            if ((int)v11)
            {
                j = 65537 - (int)v11 * (unsigned int)(65537 / v11);
                if ((int)j)
                {
                    v13 = 0;
                    v14 = 65537;
                    v15 = 1;
                    do
                    {
                        v16 = j;
                        v17 = v13 - v15 * (v14 - j) / v11;
                        j = v11 - v16 * v11 / v16;
                        v11 = v16;
                        v13 = v15;
                        v14 = v11;
                        v15 = v17;
                    } while (j);
                    if (v17 < 0)
                        v11 = v17 + 65537 & 0xffffffff;
                    else
                        v11 = v17 & 0xffffffff;
                }
                else
                {
                    v11 = 1;
                }
            }
            *(int *)&iter[12] = v11;
            if (v0 == 8)
            {
                *(unsigned long long *)&a1[4] = __dirty_unsupported_Iop_ZeroHI64ofV128(reverse(__double_as_longlong((double)a1[4])));
                v19 = __dirty_unsupported_Iop_ZeroHI64ofV128(reverse(__double_as_longlong((double)a1[196])));
                *(unsigned long *)&a1[196] = v19;
                return v19;
            }
            *(int *)&iter[16] = *(int *)((char *)v10 - 8);
            v1 = (char *)v10 - 24;
            *(int *)&iter[20] = *(int *)((char *)v10 - 4);
            iter += 24;
            v0 += 1;
            v3 = *v1;
        } while (!(int)v3);
    }
}
