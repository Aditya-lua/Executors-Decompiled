/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa93a14..0xa93ccc (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a93a14_0 {
    char field_0;
    char field_1;
    char padding_2[13];
    char field_f;
    unsigned long long field_10;
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
    struct st_a93a14_1 *field_28;
} st_a93a14_0;

typedef struct st_a93a14_1 {
    unsigned long long field_0;
} st_a93a14_1;


unsigned int sub_a93a14(st_a93a14_0 *a0, double *a1, unsigned long a2, unsigned long long a3, unsigned long long *a4)
{
    double *v2;  // x22
    unsigned long v3;  // x26
    unsigned long v12;  // x11
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long *iter;  // x0
    unsigned long long v17;  // x8
    unsigned long long k;  // x9
    double *v19;  // x11
    unsigned long long v20;  // x9
    unsigned long long *v4;  // x27
    unsigned long v22;  // d0
    char *v24;  // x9
    char *node;  // x10
    unsigned long long j;  // x8
    unsigned long long v27;  // x8
    unsigned long long v5;  // x8
    unsigned long v6;  // x28
    unsigned long long v7;  // x8
    st_a93a14_0 *iter1;  // x9
    unsigned long long v9;  // x10
    unsigned long long i;  // x10
    unsigned long long v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = a0->field_0;
    v4 = a0->field_28;
    if (!(v3 >> 6 & 1))
        v4();
    v5 = v3 & 7;
    a0->field_0 = v5;
    v6 = v5 ^ 15;
    if ((unsigned int)v5)
    {
        v7 = 0;
        iter1 = &(&a0->field_0)[v6];
        v9 = 14 - v6;
        if (14 < v6)
            v9 = 0;
        i = v9 + 1;
        do
        {
            v11 = i;
            v12 = iter1->field_0;
            iter1->field_0 = 0;
            iter1 = &iter1->field_1;
            v7 = (v7 | v12) * 0x100;
            i = v11 - 1;
        } while (i);
    }
    else
    {
        v7 = 0;
    }
    v14 = v7 | a0->field_f;
    a0->field_f = 1;
    if (v14 != a3)
        return 0xffffffff;
    v15 = a0->field_20 + (a3 + 15 >> 3 | 1);
    a0->field_20 = v15;
    if (v15 > 0x2000000000000000)
        return 0xfffffffe;
    if (16 <= a3)
    {
        a4();
    }
    else if (a3)
    {
        iter = &a0->field_10;
        if (a3 < 8 || (char *)v2 + a3 > iter && &(&a0->field_0)[a3 + 16] > v2)
        {
            v17 = 0;
        }
        else
        {
            v17 = a3 & 8;
            k = v17;
            v19 = v2;
            do
            {
                v20 = k;
                v22 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v19 ^ *(unsigned long long *)&*(double *)iter);
                *iter = v22;
                iter += 1;
                k = v20 - 8;
                v19 += 1;
            } while (k);
            if (a3 == v17)
                v4();
        }
        v24 = (char *)v2 + v17;
        node = &(&a0->field_0)[v17 + 16];
        j = a3 - v17;
        do
        {
            v27 = j;
            *node = *node ^ *v24;
            node += 1;
            j = v27 - 1;
            v24 += 1;
        } while (j);
        v4();
    }
    else
    {
        _bzero(&(&a0->field_0)[v6 & 0xffffffff], 16 - v6);
        v4();
    }
}
