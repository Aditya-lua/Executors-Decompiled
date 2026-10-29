/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9844dc..0x98452c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9844dc_1 {
    struct st_9844dc_0 *field_0;
    struct st_9844dc_0 *field_8;
    unsigned long long field_10;
} st_9844dc_1;

typedef struct st_9844dc_0 {
    char padding_0[72];
    struct st_9844dc_0 *field_48;
    struct st_9844dc_0 *field_50;
} st_9844dc_0;


st_9844dc_1 * sub_9844dc(st_9844dc_1 *a0, st_9844dc_0 *a1)
{
    st_9844dc_0 *v0;  // x8
    st_9844dc_0 *v1;  // x9
    st_9844dc_0 **v2;  // x1

    if (a0->field_0 == a1)
        a0->field_0 = a1->field_48;
    v0 = a1->field_50;
    if (a0->field_8 == a1)
        a0->field_8 = v0;
    v1 = a1->field_48;
    v2 = &a1->field_48;
    if (v0)
        v0->field_48 = v1;
    if (v1)
        v1->field_50 = v0;
    a0->field_10 = a0->field_10 - 1;
    *v2 = 0;
    v2[1] = 0;
    return a0;
}
