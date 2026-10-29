/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b2d4c..0x9b2da8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b2d4c_1 {
    char padding_0[168];
    unsigned long long field_a8;
} st_9b2d4c_1;

typedef struct st_9b2d4c_2 {
    char padding_0[768];
    struct st_9b2d4c_0 *field_300;
    char padding_308[1400];
    struct st_9b2d4c_1 *field_880;
} st_9b2d4c_2;

typedef struct st_9b2d4c_0 {
    char padding_0[28];
    unsigned int field_1c;
} st_9b2d4c_0;


unsigned int sub_9b2d4c(st_9b2d4c_2 *a0)
{
    unsigned long v0;  // x8
    unsigned long v1;  // cc_dep1
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4102
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102

    v0 = a0->field_300->field_1c;
    if (v0 & 6)
        return 1;
    v1 = v0 & 72;
    if (v0 & 72)
    {
        if (!(v0 & 384))
        {
            v2 = arm64g_calculate_condition(10, v1, 0, 0);
            v3 = arm64g_calculate_condition(4, (v2 & 1 ? a0->field_880->field_a8 : 0), 0, 0);
            if (!(v3 & 1))
                return 1;
        }
        else
        {
            v4 = arm64g_calculate_condition(10, v1, 0, 0);
            v5 = arm64g_calculate_condition(0, (v4 & 1 ? a0->field_880->field_a8 : 0), 0, 0);
            if (!(v5 & 1))
                return 1;
        }
    }
    else
    {
        if (v0 & 384)
            return 1;
    }
    return __ROL__((unsigned int)v0, 27) & 4160749569 & 1;
}
