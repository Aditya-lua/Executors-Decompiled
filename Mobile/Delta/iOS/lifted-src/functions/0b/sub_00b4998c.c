/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4998c..0xb49ad4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4998c_2 {
    char padding_0[221];
    char field_dd;
} st_b4998c_2;

typedef struct st_b4998c_1 {
    char padding_0[224];
    unsigned int field_e0;
    char padding_e4[12];
    struct st_b4998c_0 *field_f0;
} st_b4998c_1;

typedef struct st_b4998c_0 {
    char padding_0[24];
    long long field_18;
    unsigned int field_20;
    char padding_24[4];
    char field_28;
    char padding_29[220];
    char field_105;
} st_b4998c_0;


long long sub_b4998c(st_b4998c_1 *a0, char a1, unsigned int a2, long long a3)
{
    st_b4998c_0 *v3;  // x20
    long long v4;  // x21
    char *iter;  // x8
    unsigned int i;  // x12
    unsigned int v15;  // x12
    unsigned int v16;  // w13
    unsigned int v18;  // x11
    unsigned long v19;  // cc_op
    unsigned int node;  // x10
    unsigned long long v21;  // x9
    unsigned int v22;  // x11
    unsigned long v5;  // x0
    unsigned long v23;  // 4110
    unsigned long long v24;  // 4105
    unsigned long v25;  // 4110
    unsigned long long v26;  // 4105
    unsigned long v6;  // x0
    st_b4998c_2 *v7;  // x24
    unsigned long v8;  // x0
    unsigned long v9;  // x0
    unsigned long v10;  // x0
    unsigned int v11;  // x9
    unsigned int v12;  // w10
    char v0;  // [bp-0x41]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    v3 = a0->field_f0;
    v4 = v3->field_18;
    v5 = sub_a3fe04(v4, sub_954340(v3), 0);
    if (!(unsigned int)v5)
        return v5;
    v6 = sub_a3fe10(v4, &v0, 1);
    if (!(unsigned int)v6)
        return v6;
    v7 = &v3->field_28;
    v8 = sub_a3fe10(v4, v7, *(long long *)&a0->field_e0);
    if (!(unsigned int)v8)
        return v8;
    if (a2)
    {
        v9 = sub_a3fe10(v4, a2, a3);
        if (!(unsigned int)v9)
            return v9;
    }
    v10 = sub_a3ff18(v4, v3 + 1, 0);
    if (!(unsigned int)v10)
        return v10;
    v11 = *(long long *)&v3->field_20;
    if (!v11)
        return 1;
    v12 = 0;
    iter = &v7->padding_0[*(long long *)&a0->field_e0] - 1;
    i = v11;
    do
    {
        v15 = i;
        v16 = v12 + *iter + (&v3->field_105)[v15];
        v12 = v16 >> 8;
        *iter = v16;
        iter -= 1;
        i = v15 - 1;
    } while (i);
    if (v16 >= 0x100)
    {
        v18 = *(long long *)&a0->field_e0;
        v19 = 4;
        if (v18 != v11)
        {
            node = 0;
            v21 = v11 - v18 + 1;
            while (1)
            {
                v22 = iter[node] + 1;
                iter[node] = v22;
                if (!v22)
                {
                    v23 = arm64g_calculate_condition(v19, v18, v11, 0);
                    v19 = 4;
                    v18 = (v23 & 1 ? v21 : 0x40000000);
                    v11 = (v23 & 1 ? node : 0);
                    node -= 1;
                    v24 = arm64g_calculate_condition(20, v18, v11, 0);
                    if (!(v24 & 1))
                        return 1;
                }
                else
                {
                    v25 = arm64g_calculate_condition(v19, v18, v11, 0);
                    v19 = 0;
                    v18 = (v25 & 1 ? v21 : 0x40000000);
                    v11 = (v25 & 1 ? node : 0);
                    node -= 1;
                    v26 = arm64g_calculate_condition(16, v18, v11, 0);
                    if (!(v26 & 1))
                        return 1;
                }
            }
        }
    }
    return 1;
}
