/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36ae4..0xa36c8c (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a36ae4_0 {
    char padding_0[256];
    unsigned long long field_100;
    char padding_108[248];
    unsigned int field_200;
    char padding_204[380];
    int field_380;
} st_a36ae4_0;


st_a36ae4_0 * sub_a36ae4(unsigned int a0, unsigned int a1, unsigned int a2, long long a3)
{
    st_a36ae4_0 *v2;  // x0
    st_a36ae4_0 *v3;  // x19
    unsigned int v12;  // w0
    unsigned int v13;  // w26
    unsigned long v14;  // x25
    unsigned int v15;  // w25
    unsigned long idx;  // x26
    unsigned int *v17;  // x27
    unsigned long long *v18;  // x28
    unsigned int v19;  // w8
    unsigned long long v20;  // x9
    unsigned long long v21;  // x8
    unsigned long v4;  // x8
    unsigned long long v22;  // x8
    st_a36ae4_0 *v5;  // x9
    unsigned long v6;  // x24
    unsigned int v7;  // x22
    unsigned int v8;  // x0
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // 4105
    unsigned long long v11;  // 4105
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (!v2)
        return v2;
    v3 = v2;
    if (a2)
    {
        v4 = v3->field_380;
        v5 = &v3->padding_0[8 * v4];
        v6 = v5->field_100;
        v7 = *(long long *)&v5->padding_108[120];
        v5->field_100 = 0;
        (&v3->field_200)[v4] = 0;
        if (0x3ff >= v7)
        {
            v8 = sub_a6c1b4(v6, 0x400, "crypto/err/err_blocks.c", 84);
            v9 = v8;
            if (!v8)
            {
                v7 = v7;
                v10 = arm64g_calculate_condition(4, v9, 0, 0);
                if (!(v10 & 1))
                    goto LABEL_a36b6a;
LABEL_a36b69:
            }
            else
            {
                v7 = 0x400;
                v11 = arm64g_calculate_condition(4, v9, 0, 0);
                if (v11 & 1)
                    goto LABEL_a36b69;
LABEL_a36b6a:
                v6 = v8;
            }
        }
        if (v6)
        {
            v12 = sub_9d5ba4(v6, v7, a2, a3);
            v13 = v12 & ~((int)(v12) >> 31);
            *(char *)(v6 + v13) = 0;
        }
        else
        {
            v13 = 0;
        }
        v14 = v13 + 1;
        v2 = sub_a6c1b4(v6, v14, "crypto/err/err_blocks.c", 103);
        if (v2)
        {
            v2->padding_0[v13] = 0;
            v7 = v14;
            v6 = v2;
        }
        if (!v6)
            v15 = 0;
        else
            v15 = 3;
    }
    else
    {
        v7 = 0;
        v15 = 0;
        v6 = 0;
    }
    idx = v3->field_380;
    v17 = &v3->field_200;
    v18 = &v3->field_100;
    if (!(v17[idx] & 1))
    {
        v19 = 0;
        v20 = idx * 8;
        *(unsigned long long *)((char *)v18 + v20) = 0;
        *(unsigned long long *)&v3->padding_108[120 + v20] = 0;
    }
    else
    {
        if (!v18[idx])
            goto LABEL_a36c20;
        *(char *)v18[idx] = 0;
        v19 = 1;
    }
    v17[idx] = v19;
    idx = v3->field_380;
LABEL_a36c20:
    if (a0 != 2)
        v21 = a1 & 0x7fffff & 0x80000000 | (a1 & 0x7fffff & 0x807fffff | (a0 * 0x800000 | a0 >> 9) & 0x7f800000) & 0x7fffffff;
    else
        v21 = a1 | 0x80000000;
    *(unsigned long long *)&v3->padding_0[128 + 8 * idx] = v21;
    if (!a2)
        return v2;
    if (v17[idx] & 1)
        v2 = sub_a6c2e4(v18[idx], "crypto/err/err_local.h", 79);
    v22 = idx * 8;
    *(unsigned long *)((char *)v18 + v22) = v6;
    *(unsigned long long *)&v3->padding_108[120 + v22] = v7;
    v17[idx] = v15;
    return v2;
}
