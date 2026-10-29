/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1af2c..0x1af68 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1af2c_1 {
    struct st_1af2c_0 *field_0;
    unsigned long long field_8;
} st_1af2c_1;

typedef struct st_1af2c_0 {
    unsigned long long field_0;
    long long field_8;
} st_1af2c_0;


st_1af2c_1 * sub_1af2c(st_1af2c_1 *a0)
{
    st_1af2c_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    sub_23e3c(v2, v2->field_0 + 24 * a0->field_8, v2->field_8);
    return a0;
}
