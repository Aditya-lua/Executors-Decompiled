/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40d14..0xa40d6c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40d14_1 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a40d14_0 *field_28;
    struct st_a40d14_1 *field_30;
    char padding_38[160];
    struct st_a40d14_1 *field_d8;
} st_a40d14_1;

typedef struct st_a40d14_0 {
    char padding_0[256];
    struct st_a40d14_1 *field_100;
} st_a40d14_0;


st_a40d14_1 * sub_a40d14(st_a40d14_1 **a0)
{
    st_a40d14_1 *v0;  // x9

    v0 = a0[5];
    if (v0 && (v0->field_0 == 0x100 || v0->field_0 == 128) && v0->field_30 && v0->field_28->field_100)
        goto *((void *)(v0->field_28->field_100));
    if (!a0[1])
    {
        return 0;
    }
    else if (a0[1]->field_d8)
    {
        goto *((void *)(a0[1]->field_d8));
    }
    else
    {
        return 0;
    }
}
