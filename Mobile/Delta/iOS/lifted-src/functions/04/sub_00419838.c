/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x419838..0x4199f8 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_419838_1 {
    char field_0[2];
    char field_1;
} st_419838_1;

typedef struct st_419838_0 {
    char field_0;
} st_419838_0;

extern unsigned long long g_e80480;

long long sub_419838(st_419838_1 *a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned int a4)
{
    st_419838_1 *iter;  // x19
    unsigned long v5;  // x20
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long v6;  // x21
    unsigned long v18;  // 4112
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long long v22;  // 4102
    unsigned long v23;  // 4112
    unsigned long long v24;  // 4102
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long v29;  // x22
    unsigned long long n;  // x20
    unsigned long long v31;  // x22
    unsigned long n1;  // x21
    st_419838_1 *v33;  // x0
    char *ptr;  // x20
    unsigned long v35;  // x21
    unsigned long v7;  // 4112
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    st_419838_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_419838_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    iter = a0;
    v1 = &v0;
    v0 = &v1;
    v5 = (a2 + 1 ^ a1) + (a2 + 1 & a1) * 2;
    v6 = (unsigned int)v5 - 1;
    if ((int)a1 <= (int)v6)
    {
        v7 = arm64g_calculate_condition(v12 | 160, v13, v14, v15);
        v8 = 3;
        v9 = (v7 & 1 ? v6 & 0xffffffff : 0);
        v10 = (v7 & 1 ? /* unsupported instruction */ : 0);
        v11 = arm64g_calculate_condition(211, v9, v10, 0);
        if (v11 & 1)
        {
            v35 = (int)v6;
            _memset(&iter->field_0[a1], 48, v35 + a1 + (v35 + (-a1 | ~v35) + (-a1 & ~v35)) * 2 + 2);
            iter->field_0[v35] = 46;
            iter->field_0[(unsigned int)v5] = 48;
            return &iter->field_0[v35 + 2];
        }
    }
    else
    {
        v16 = arm64g_calculate_condition(v12 | 160, v13, v14, v15);
        v8 = 0;
        v9 = (v16 & 1 ? v6 & 0xffffffff : 0);
        v10 = (v16 & 1 ? /* unsupported instruction */ : 0);
        v17 = arm64g_calculate_condition(208, v9, v10, 0);
        if (v17 & 1)
        {
            v35 = (int)v6;
            _memset(&iter->field_0[a1], 48, v35 + a1 + (v35 + (-a1 | ~v35) + (-a1 & ~v35)) * 2 + 2);
            iter->field_0[v35] = 46;
            iter->field_0[(unsigned int)v5] = 48;
            return &iter->field_0[v35 + 2];
        }
    }
    if (1 <= (int)v6)
    {
        v18 = arm64g_calculate_condition(v8 | 160, v9, v10, 0);
        v19 = 3;
        v20 = (v18 & 1 ? v6 & 0xffffffff : 0);
        v21 = (v18 & 1 ? /* unsupported instruction */ : 0);
        v22 = arm64g_calculate_condition(211, v20, v21, 0);
        if (v22 & 1)
        {
            ptr = &iter->field_0[v6];
            _memmove(ptr + 1, ptr, v6 + a1 + (-v6 & ~a1) * 2 + (a1 - v6 - (-v6 | a1)) * 2);
            *ptr = 46;
            return &iter->field_0[a1 + 1];
        }
    }
    else
    {
        v23 = arm64g_calculate_condition(v8 | 160, v9, v10, 0);
        v19 = 0;
        v20 = (v23 & 1 ? v6 & 0xffffffff : 0);
        v21 = (v23 & 1 ? /* unsupported instruction */ : 0);
        v24 = arm64g_calculate_condition(208, v20, v21, 0);
        if (v24 & 1)
        {
            ptr = &iter->field_0[v6];
            _memmove(ptr + 1, ptr, v6 + a1 + (-v6 & ~a1) * 2 + (a1 - v6 - (-v6 | a1)) * 2);
            *ptr = 46;
            return &iter->field_0[a1 + 1];
        }
    }
    if ((int)a3 < (int)v6)
    {
        v25 = arm64g_calculate_condition(v19 | 192, v20, v21, 0);
        v26 = arm64g_calculate_condition(211, (v25 & 1 ? v6 & 0xffffffff : 0), 0, 0);
        if (v26 & 1)
        {
            n = 1 - v5;
            v31 = n + 2;
            n1 = a1;
            _memmove(&iter->field_0[v31], iter, n1);
            v33 = iter;
            *(unsigned short *)v33->field_0 = 11824;
            _memset(&v33->field_1, 48, n);
            return &iter->field_0[(v31 ^ n1 + 1) + 2 * (v31 & n1 + 1)] - 1;
        }
    }
    else
    {
        v27 = arm64g_calculate_condition(v19 | 192, v20, v21, 0);
        v28 = arm64g_calculate_condition(208, (v27 & 1 ? v6 & 0xffffffff : 0), 0, 0);
        if (v28 & 1)
        {
            n = 1 - v5;
            v31 = n + 2;
            n1 = a1;
            _memmove(&iter->field_0[v31], iter, n1);
            v33 = iter;
            *(unsigned short *)v33->field_0 = 11824;
            _memset(&v33->field_1, 48, n);
            return &iter->field_0[(v31 ^ n1 + 1) + 2 * (v31 & n1 + 1)] - 1;
        }
    }
    if (a1 != 1)
    {
        v29 = a1;
        _memmove(&iter->field_1, &iter->field_0[1], v29 + a1 * 2 + ~v29 * 2 + 1);
        iter->field_0[1] = 46;
        iter = &iter->field_0[v29];
    }
    iter->field_0[1] = 101;
    (g_e80480 - 0x7db63500)();
}
