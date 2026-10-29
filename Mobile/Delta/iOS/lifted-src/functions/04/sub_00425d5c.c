/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x425d5c..0x425d80 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_425d5c_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_425d5c_0;


st_425d5c_0 * sub_425d5c(st_425d5c_0 *a0, st_425d5c_0 *a1)
{
    char v0;  // x8
    unsigned long long v1;  // x8

    v0 = a0->field_0;
    a0->field_0 = a1->field_0;
    a1->field_0 = v0;
    v1 = a0->field_8;
    a0->field_8 = a1->field_8;
    a1->field_8 = v1;
    return a0;
}
