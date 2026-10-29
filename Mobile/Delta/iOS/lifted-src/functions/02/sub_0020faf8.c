/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20faf8..0x20fb1c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20faf8_0 {
    char padding_0[152];
    unsigned int field_98;
} st_20faf8_0;

typedef struct st_20faf8_1 {
    char padding_0[24];
    struct st_20faf8_0 *field_18;
} st_20faf8_1;


long long sub_20faf8(unsigned int a0, st_20faf8_1 *a1)
{
    unsigned long long v0;  // 4112

    v0 = arm64g_calculate_condition(1, a0, 1, 0);
    if (v0 & 1)
        return 1;
    return a1->field_18->field_98 == a0;
}
