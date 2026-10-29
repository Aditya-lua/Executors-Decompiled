/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x628f8..0x6292c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_628f8_0 {
    struct st_628f8_0 *field_0;
    struct st_628f8_0 *field_8;
    struct st_628f8_0 *field_10;
} st_628f8_0;


st_628f8_0 * sub_628f8(st_628f8_0 *a0)
{
    st_628f8_0 *v0;  // x8
    st_628f8_0 *v1;  // x9
    st_628f8_0 *v2;  // x9

    v0 = a0->field_0;
    v1 = v0->field_8;
    a0->field_0 = v1;
    if (v1)
        v1->field_10 = a0;
    v2 = a0->field_10;
    (&v2->field_0)[v2->field_0 != a0] = v0;
    v0->field_8 = a0;
    v0->field_10 = v2;
    a0->field_10 = v0;
    return a0;
}
