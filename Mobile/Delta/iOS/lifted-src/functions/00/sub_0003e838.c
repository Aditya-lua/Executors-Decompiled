/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e838..0x3e8a4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e838_3 {
    char padding_0[8];
    long long field_8;
    char field_10;
} st_3e838_3;

typedef struct st_3e838_1 {
    char padding_0[32];
    struct st_3e838_2 *field_20;
    unsigned long long field_28;
} st_3e838_1;

typedef struct st_3e838_2 {
    long long field_0;
} st_3e838_2;

typedef struct st_3e838_0 {
    char field_0;
} st_3e838_0;


char sub_3e838(st_3e838_3 *a0, st_3e838_1 *a1)
{
    char v4;  // x8
    st_3e838_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3e838_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_28 == 1)
        v4 = (char)sub_4489c(a0->field_8, *(long long *)a1->field_20) ^ 1;
    else
        v4 = 0;
    a0->field_10 = a0->field_10 & v4;
    return 0;
}
