/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989088..0x9890dc (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_989088_1 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
} st_989088_1;

typedef struct st_989088_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[32];
    struct st_989088_1 *field_38;
    char padding_40[8];
    unsigned long long field_48;
    char field_50;
} st_989088_0;


unsigned long long sub_989088(st_989088_0 *a0)
{
    unsigned long long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v2;  // 4110
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // 4110
    unsigned long long v7;  // 4105

    if ((a0->field_50 & 5) == 1)
        return 0;
    v0 = a0->field_10;
    if (!v0)
    {
        return 1;
    }
    else if (a0->field_48 == 1)
    {
        v1 = a0->field_38->field_18 + 1;
        if (!a0->field_38->field_10)
        {
            v2 = arm64g_calculate_condition(4, a0->field_48, 1, 0);
            v3 = 4;
            v4 = (v2 & 1 ? v1 : 0);
            v5 = (v2 & 1 ? v0 : 0);
        }
        else
        {
            v6 = arm64g_calculate_condition(4, a0->field_48, 1, 0);
            v3 = 0;
            v4 = (v6 & 1 ? v1 : 0);
            v5 = (v6 & 1 ? v0 : 0);
        }
        v7 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
        return !(v7 & 1);
    }
    else
    {
        return 0;
    }
}
