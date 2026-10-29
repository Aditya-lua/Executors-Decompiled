/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66dc4..0x66e10 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66dc4_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_66dc4_1;

typedef struct st_66dc4_2 {
    char padding_0[8];
    struct st_66dc4_1 *field_8;
} st_66dc4_2;

typedef struct st_66dc4_0 {
    char field_0;
} st_66dc4_0;


int sub_66dc4(st_66dc4_2 *a0)
{
    unsigned long long v2;  // 4130
    st_66dc4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_66dc4_0 *v1;  // [bp-0x18]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_8)
        return 1;
    v2 = arm64g_calculate_condition(18, a0->field_8->field_8, 1, 0);
    return !(v2 & 1);
}
