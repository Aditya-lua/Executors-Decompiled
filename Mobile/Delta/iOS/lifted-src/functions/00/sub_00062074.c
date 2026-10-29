/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x62074..0x620ac (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_62074_0 {
    struct st_62074_0 *field_0;
    struct st_62074_0 *field_8;
    struct st_62074_0 *field_10;
} st_62074_0;


st_62074_0 * sub_62074(st_62074_0 *a0)
{
    st_62074_0 *v0;  // x8
    st_62074_0 *v1;  // x9
    st_62074_0 *v2;  // x9

    v0 = a0->field_8;
    v1 = v0->field_0;
    a0->field_8 = v1;
    if (v1)
        v1->field_10 = a0;
    v2 = a0->field_10;
    v0->field_10 = v2;
    (&v2->field_0)[v2->field_0 != a0] = v0;
    v0->field_0 = a0;
    a0->field_10 = v0;
    return a0;
}
