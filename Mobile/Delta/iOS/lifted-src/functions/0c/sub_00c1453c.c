/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1453c..0xc14584 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1453c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_c1453c_0 *field_10;
} st_c1453c_1;

typedef struct st_c1453c_0 {
    struct st_c1453c_0 *field_0;
} st_c1453c_0;


st_c1453c_0 ** sub_c1453c(st_c1453c_1 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_0 == 1)
        return a0->field_10;
    if (6 > a0->field_8)
        return &a0->field_10;
    v0 = &v2;
    v1 = v3;
    sub_c73bb0(0);
}
