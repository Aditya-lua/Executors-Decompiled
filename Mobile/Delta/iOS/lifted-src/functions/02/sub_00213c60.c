/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x213c60..0x213ca0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_213c60_2 {
    char padding_0[24];
    struct st_213c60_1 *field_18;
} st_213c60_2;

typedef struct st_213c60_1 {
    char padding_0[5];
    char field_5;
} st_213c60_1;

typedef struct st_213c60_0 {
    char field_0;
} st_213c60_0;


long long sub_213c60(unsigned int a0, st_213c60_2 *a1)
{
    unsigned long long v2;  // 4129
    st_213c60_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_213c60_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = arm64g_calculate_condition(1, a0, 1, 0);
    if (v2 & 1)
        return 1;
    return a1->field_18->field_5 == a0;
}
