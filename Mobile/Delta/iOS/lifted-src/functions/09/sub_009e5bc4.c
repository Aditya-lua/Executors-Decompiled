/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5bc4..0x9e5c0c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5bc4_0 {
    struct st_9e5bc4_1 *field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9e5bc4_0;

typedef struct st_9e5bc4_1 {
    unsigned long long field_0;
} st_9e5bc4_1;


unsigned int sub_9e5bc4(st_9e5bc4_0 *a0, unsigned long a1)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long long v2;  // cc_dep1
    unsigned long long v3;  // cc_dep2
    unsigned long v4;  // 4112
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // 4112
    unsigned long long v8;  // 4105

    v0 = a0->field_8;
    v1 = 3;
    v2 = v0;
    v3 = 1;
    if (v0 == 1)
    {
        v2 = *(long long *)a0->field_0;
        v1 = 4;
        v3 = a1;
        if (*(long long *)a0->field_0 == v3)
        {
            if (a1)
                return !a0->field_10;
            return 1;
        }
    }
    if (!a1)
    {
        v4 = arm64g_calculate_condition(v1, v2, v3, 0);
        v5 = 3;
        v6 = (v4 & 1 ? v0 : 0);
    }
    else
    {
        v7 = arm64g_calculate_condition(v1, v2, v3, 0);
        v5 = 0;
        v6 = (v7 & 1 ? v0 : 0);
    }
    v8 = arm64g_calculate_condition(v5 | 16, v6, 0, 0);
    return !(v8 & 1);
}
