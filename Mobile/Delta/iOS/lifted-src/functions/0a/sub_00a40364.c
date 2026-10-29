/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa40364..0xa403bc (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a40364_1 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a40364_0 *field_28;
    struct st_a40364_1 *field_30;
    char padding_38[152];
    struct st_a40364_1 *field_d0;
} st_a40364_1;

typedef struct st_a40364_0 {
    char padding_0[272];
    struct st_a40364_1 *field_110;
} st_a40364_0;


st_a40364_1 * sub_a40364(st_a40364_1 **a0)
{
    st_a40364_1 *v0;  // x9

    v0 = a0[5];
    if (v0 && (v0->field_0 == 0x100 || v0->field_0 == 128) && v0->field_30 && v0->field_28->field_110)
        goto *((void *)(v0->field_28->field_110));
    if (!a0[1])
    {
        return 0;
    }
    else if (a0[1]->field_d0)
    {
        goto *((void *)(a0[1]->field_d0));
    }
    else
    {
        return 0;
    }
}
