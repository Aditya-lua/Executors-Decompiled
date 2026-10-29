/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2770..0xaf27a0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2770_1 {
    char padding_0[8];
    struct st_af2770_0 *field_8;
} st_af2770_1;

typedef struct st_af2770_0 {
    char padding_0[40];
    struct st_af2770_0 *field_28;
    char padding_30[40];
    struct st_af2770_0 *field_58;
} st_af2770_0;


unsigned int sub_af2770(st_af2770_1 *a0)
{
    st_af2770_0 *v0;  // x8

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
