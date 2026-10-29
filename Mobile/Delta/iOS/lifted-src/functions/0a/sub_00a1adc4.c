/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1adc4..0xa1afd8 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1adc4_2 {
    struct st_a1adc4_0 *field_0;
    char padding_8[24];
    unsigned int field_20;
} st_a1adc4_2;

typedef struct st_a1adc4_0 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
    char padding_8[40];
    struct st_a1adc4_1 *field_30;
} st_a1adc4_0;

typedef struct st_a1adc4_1 {
    unsigned long long field_0;
} st_a1adc4_1;

typedef struct st_a1adc4_3 {
    char padding_0[4];
    unsigned int field_4;
} st_a1adc4_3;


unsigned long long sub_a1adc4(st_a1adc4_2 *a0, st_a1adc4_3 **a1, char a2)
{
    unsigned long v2;  // cc_dep1
    unsigned long v3;  // cc_dep2
    char v4;  // x19
    unsigned int v5;  // w9
    char v6;  // w10
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    char v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0->field_4;
    v3 = *a1->field_4;
    if (a0->field_0->field_4 != *a1->field_4)
        return 1;
    v4 = a2;
    v5 = a0->field_20;
    if (v5)
    {
        v6 = (int)a1[4];
        if (v6)
        {
            v7 = arm64g_calculate_condition(19, v2, v3, 0);
            v8 = arm64g_calculate_condition(19, (v7 & 1 ? v5 : 0x40000000), (v7 & 1 ? v6 : 0), 0);
            if (v8 & 1)
                return 1;
        }
        else
        {
            v9 = arm64g_calculate_condition(19, v2, v3, 0);
            v10 = arm64g_calculate_condition(16, (v9 & 1 ? v5 : 0x40000000), (v9 & 1 ? v6 : 0), 0);
            if (v10 & 1)
                return 1;
        }
    }
    if (a0->field_0->field_0 >> 1 & 1)
        return 0;
    if (v4)
    {
        v11 = 0;
    }
    else
    {
        v4 = sub_9dde10();
        v11 = v4;
        if (!v11)
            return 0xffffffff;
    }
    sub_9de064(v4);
    sub_9de208(v4);
    sub_9de208(v4);
    sub_9de208(v4);
    sub_9de208(v4);
    sub_9de208(v4);
    if (!sub_9de208(v4))
    {
        sub_9de17c(v4);
        sub_9dded4(v11);
        return 0xffffffff;
    }
    a0->field_0->field_30();
}
