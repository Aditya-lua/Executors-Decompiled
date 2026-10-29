/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e7e8..0x1e820 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e7e8_1 {
    struct st_1e7e8_0 *field_0;
    unsigned long long field_8;
} st_1e7e8_1;

typedef struct st_1e7e8_0 {
    unsigned long long field_0;
    long long field_8;
} st_1e7e8_0;


st_1e7e8_1 * sub_1e7e8(st_1e7e8_1 *a0)
{
    st_1e7e8_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_0;
    sub_dd88(v2, v2->field_0 + a0->field_8 * 8, v2->field_8);
    return a0;
}
