/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e30b8..0x1e3148 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e30b8_1 {
    struct st_1e30b8_1 *field_0;
    char field_3;
    char padding_4[4];
    struct st_1e30b8_1 *field_8;
    char field_c;
    char padding_d[11];
    unsigned long long field_18;
    char padding_20[8];
    struct st_1e30b8_1 *field_28;
    char padding_30[16];
    struct st_1e30b8_1 *field_40;
} st_1e30b8_1;

typedef struct st_1e30b8_0 {
    char field_0;
} st_1e30b8_0;

extern unsigned long long g_f10c38;

st_1e30b8_1 * sub_1e30b8(st_1e30b8_1 *a0)
{
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    st_1e30b8_1 *v10;  // x9
    st_1e30b8_1 *v11;  // x9
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    st_1e30b8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1e30b8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return a0;
    if (*((char *)&a0->field_0 + 3) == 1)
    {
        v4 = arm64g_calculate_condition(v2, v3, v8, v9);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? g_f10c38 : 0x40000000), 0, 0);
        if (v5 & 1)
            return 0;
    }
    else
    {
        v6 = arm64g_calculate_condition(v2, v3, v8, v9);
        v7 = arm64g_calculate_condition(0, (v6 & 1 ? g_f10c38 : 0x40000000), 0, 0);
        if (v7 & 1)
            return 0;
    }
    if ((unsigned long long)*(long long *)&a0->padding_30[0] <= a0->field_18)
        return 0;
    v10 = *(long long *)(*(long long *)&a0->padding_30[0] + 8);
    if (!v10)
    {
        return 0;
    }
    else if (*(int *)&v10->padding_4[3] == 8)
    {
        v11 = v10->field_0;
        if (!v11)
        {
            return 0;
        }
        else if (*((char *)&v11->field_0 + 3) != 1)
        {
            return 0;
        }
        else if (v11->field_18)
        {
            return 0;
        }
        else
        {
            return *(long long *)&v11->field_c == g_f10c38;
        }
    }
    else
    {
        return 0;
    }
}
