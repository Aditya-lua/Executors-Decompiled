/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2009ec..0x200a1c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2009ec_0 {
    char padding_0[160];
    unsigned int field_a0;
} st_2009ec_0;

typedef struct st_2009ec_1 {
    char padding_0[24];
    struct st_2009ec_0 *field_18;
} st_2009ec_1;


st_2009ec_0 * sub_2009ec(unsigned int a0, st_2009ec_1 *a1)
{
    unsigned long long v0;  // 4112

    v0 = arm64g_calculate_condition(1, a0, 1, 0);
    if (v0 & 1)
    {
        return 1;
    }
    else if (a1->field_18)
    {
        return a1->field_18->field_a0 == a0;
    }
    else
    {
        return 0;
    }
}
