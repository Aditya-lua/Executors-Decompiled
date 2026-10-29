/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x983424..0x983484 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_983424_0 {
    struct st_983424_0 *field_0;
    struct st_983424_0 *field_8;
    char padding_10[16];
    struct st_983424_0 *field_20;
    struct st_983424_0 *field_28;
    char padding_30[232];
    struct st_983424_0 *field_118;
} st_983424_0;

typedef struct st_983424_1 {
    char padding_0[48];
    struct st_983424_0 *field_30;
    struct st_983424_0 *field_38;
    unsigned long long field_40;
    char padding_48[992];
    struct st_983424_0 *field_428;
} st_983424_1;


void sub_983424(st_983424_1 *a0, st_983424_0 *a1)
{
    st_983424_0 *v0;  // x8

    *(char *)&a1->field_118 = 0;
    a1->field_20 = 0;
    a1->field_28 = 0;
    v0 = a0->field_38;
    if (v0)
        v0->field_0 = a1;
    a1->field_0 = 0;
    a1->field_8 = v0;
    a0->field_38 = a1;
    if (!a0->field_30)
        a0->field_30 = a1;
    a0->field_40 = a0->field_40 + 1;
    if (!a0->field_428)
        return;
    goto *((void *)(a0->field_428));
}
