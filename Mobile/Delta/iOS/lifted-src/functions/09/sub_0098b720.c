/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b720..0x98b7b0 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b720_0 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[144];
    struct st_98b720_1 *field_138;
    struct st_98b720_1 *field_140;
    struct st_98b720_1 *field_148;
    unsigned long long field_150;
} st_98b720_0;

typedef struct st_98b720_1 {
    unsigned long long field_0;
} st_98b720_1;


unsigned long long * sub_98b720(st_98b720_0 *a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3, unsigned long a4)
{
    unsigned long long *v2;  // x0
    unsigned long long *v3;  // x8
    unsigned long v4;  // cc_dep1
    unsigned long long *v5;  // x9
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9857e0(a0->field_a0);
    if (a2)
    {
        v3 = v2;
        v4 = v3;
        if (v3 <= a2)
            return 0;
        v5 = (char *)v3 - 160;
        if (161 <= v3)
        {
            v6 = arm64g_calculate_condition(36, v4, a2, 0);
            v7 = arm64g_calculate_condition(52, (v6 & 1 ? v5 : 0), (v6 & 1 ? a2 : 0), 0);
            if (v7 & 1)
                return 0;
        }
        else
        {
            v8 = arm64g_calculate_condition(36, v4, a2, 0);
            v9 = arm64g_calculate_condition(48, (v8 & 1 ? v5 : 0), (v8 & 1 ? a2 : 0), 0);
            if (v9 & 1)
                return 0;
        }
    }
    if (a0->field_138 && a0->field_148)
        a0->field_148();
    a0->field_138 = a1;
    a0->field_140 = a2;
    a0->field_148 = a3;
    a0->field_150 = a4;
    return 1;
}
