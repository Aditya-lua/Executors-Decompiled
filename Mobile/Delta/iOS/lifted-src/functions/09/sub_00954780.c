/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954780..0x95479c (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954780_0 {
    char padding_0[24];
    unsigned int field_18;
} st_954780_0;


unsigned int sub_954780(st_954780_0 *a0, st_954780_0 *a1)
{
    unsigned long v0;  // cc_dep1
    unsigned long v1;  // cc_dep2
    unsigned long long v3;  // 4106
    unsigned long long v4;  // 4106

    v0 = a0->field_18;
    v1 = a1->field_18;
    if (a0->field_18 < a1->field_18)
    {
        v3 = arm64g_calculate_condition(3, v0, v1, 0);
        if (!(v3 & 1))
            return 0xffffffff;
    }
    else
    {
        v4 = arm64g_calculate_condition(3, v0, v1, 0);
        if (!(v4 & 1))
            return 0;
    }
    return 0;
}
