/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36dc0..0xb36df4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36dc0_0 {
    struct st_b36dc0_0 *field_0;
    char padding_8[32];
    struct st_b36dc0_0 *field_28;
    struct st_b36dc0_0 *field_30;
} st_b36dc0_0;


int sub_b36dc0(void)
{
    st_b36dc0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(56, "providers/implementations/kem/ml_kem_kem.c", 44);
    if (v2)
    {
        v2->field_0 = 0;
        v2->field_28 = 0;
        *(unsigned int *)&v2->field_30 = 0;
    }
    return (unsigned int)v2;
}
