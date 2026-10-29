/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98e19c..0x98e1ac (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98e19c_0 {
    unsigned long long field_0;
    struct st_98e19c_0 *field_8;
} st_98e19c_0;

typedef struct st_98e19c_1 {
    char padding_0[104];
    struct st_98e19c_0 *field_68;
} st_98e19c_1;


st_98e19c_1 * sub_98e19c(st_98e19c_1 *a0, st_98e19c_0 *a1)
{
    st_98e19c_0 *v0;  // x8

    v0 = a0->field_68;
    a1->field_0 = 0;
    a1->field_8 = v0;
    a0->field_68 = a1;
    return a0;
}
