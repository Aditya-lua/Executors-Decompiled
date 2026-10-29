/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3d01c..0xc3d0c8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c3d01c_0 {
    struct st_c3d01c_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c3d01c_0;

typedef struct st_c3d01c_1 {
    char field_0;
} st_c3d01c_1;


void sub_c3d01c(unsigned long long *a0, st_c3d01c_0 *a1)
{
    unsigned long long v2;  // x1
    unsigned long v3;  // x2
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4119
    unsigned long long v17;  // 4102
    char *v4;  // x8
    unsigned long v5;  // x10
    unsigned long v6;  // x12
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // x3
    unsigned int v10;  // w11
    unsigned int v11;  // w14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_8;
    v3 = a1->field_10;
    v4 = a1->field_0;
    if (v2 < v3)
        v5 = v3;
    else
        v5 = v2;
    v6 = v3;
    while (1)
    {
        v7 = v5;
        v8 = v6;
        if (v5 == v6)
        {
            *(char *)&a0[1] = 0;
            *a0 = 0;
            return;
        }
        v9 = v6;
        v10 = v4[v6];
        v6 += 1;
        a1->field_10 = v6;
        v11 = v10 - 97;
        if (10 <= v10 - 48)
        {
            v12 = arm64g_calculate_condition(36, v7, v8, 0);
            v13 = arm64g_calculate_condition(0x33, (v12 & 1 ? v11 : 0), (v12 & 1 ? 6 : 0), 0);
            if (!(v13 & 1))
                break;
        }
        else
        {
            v14 = arm64g_calculate_condition(36, v7, v8, 0);
            v15 = arm64g_calculate_condition(48, (v14 & 1 ? v11 : 0), (v14 & 1 ? 6 : 0), 0);
            if (!(v15 & 1))
                break;
        }
    }
    if (v10 != 95)
    {
        *(char *)&a0[1] = 0;
        *a0 = 0;
        return;
    }
    if (v3)
    {
        if (v2 > v3)
        {
            v16 = arm64g_calculate_condition(161, v4[v3], 64, 0);
            if (!(v16 & 1))
                sub_c73cc8(v4);
        }
        else
        {
            v17 = arm64g_calculate_condition(20, v3, v2, 0);
            if (v17 & 1)
                sub_c73cc8(v4);
        }
    }
    if (v2 >= v9)
    {
        *a0 = &v4[v3];
        a0[1] = v9 - v3;
        return;
    }
    sub_c73cc8(v4);
}
