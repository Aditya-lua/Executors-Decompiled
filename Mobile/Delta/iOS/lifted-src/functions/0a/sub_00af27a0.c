/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf27a0..0xaf27d8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af27a0_1 {
    char padding_0[8];
    struct st_af27a0_0 *field_8;
} st_af27a0_1;

typedef struct st_af27a0_0 {
    char padding_0[40];
    struct st_af27a0_0 *field_28;
    char padding_30[40];
    struct st_af27a0_0 *field_58;
} st_af27a0_0;


unsigned int sub_af27a0(st_af27a0_1 *a0)
{
    st_af27a0_0 *v0;  // x8

    v0 = a0->field_8;
    if (!v0)
    {
        return 0xffffffff;
    }
    else if (v0->field_58)
    {
        goto *((void *)(v0->field_58));
    }
    else if (v0->field_28)
    {
        goto *((void *)(v0->field_28));
    }
    else
    {
        return 1;
    }
}
