/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa51e0..0xaa5208 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa51e0_0 {
    char padding_0[8];
    char field_8;
} st_aa51e0_0;


void sub_aa51e0(void)
{
    st_aa51e0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
        return;
    v2->field_8 = v2->field_8 | 1;
    return;
}
