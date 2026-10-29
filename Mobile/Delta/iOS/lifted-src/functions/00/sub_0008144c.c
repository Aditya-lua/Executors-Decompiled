/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8144c..0x814e8 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8144c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
} st_8144c_0;


unsigned long long sub_8144c(st_8144c_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // cc_op
    unsigned long long v10;  // x10
    unsigned long long v11;  // x13
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // x9
    unsigned int v17;  // w9
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    unsigned long v4;  // x9
    unsigned long long v5;  // x8
    unsigned long v6;  // x10
    unsigned int v7;  // w11
    unsigned int v8;  // w8
    unsigned long long v9;  // x12

    if (!a2)
        return 1;
    v0 = a0->field_0;
    if (!a3 && !(v1 = 4, v2 = v0, v3 = a1, v0 != a1))
    {
        v4 = a0->field_10;
        v5 = 1;
        v6 = a0->field_18;
        v7 = a0->field_1c;
    }
    else
    {
        v4 = a0->field_8;
        v6 = v0 - v4;
        v7 = a0->field_18;
        a0->field_18 = v6;
        a0->field_1c = v7;
        a0->field_8 = a1 - v6;
        a0->field_10 = v4;
        v8 = v6 - v7;
        v1 = 3;
        v2 = v8;
        v3 = 7;
        if (7 >= v8)
        {
            v5 = 0;
            a0->field_1c = v6;
            v7 = v6;
        }
        else
        {
            v5 = 0;
        }
    }
    v9 = a1 + a2;
    a0->field_0 = v9;
    v10 = v6 & 0xffffffff;
    v11 = v4 + v10;
    if (v4 + v7 < v9)
    {
        v12 = arm64g_calculate_condition(v1 | 128, v2, v3, 0);
        v13 = arm64g_calculate_condition(148, (v12 & 1 ? v11 : 0), (v12 & 1 ? a1 : 0), 0);
        if (v13 & 1)
            return v5;
    }
    else
    {
        v14 = arm64g_calculate_condition(v1 | 128, v2, v3, 0);
        v15 = arm64g_calculate_condition(144, (v14 & 1 ? v11 : 0), (v14 & 1 ? a1 : 0), 0);
        if (v15 & 1)
            return v5;
    }
    v16 = v9 - v4;
    if (v10 < v16)
        v17 = v10;
    else
        v17 = v16;
    a0->field_1c = v17;
    return v5;
}
