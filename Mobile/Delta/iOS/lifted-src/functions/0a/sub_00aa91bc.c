/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa91bc..0xaa91f8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa91bc_0 {
    char padding_0[24];
    struct st_aa91bc_0 *field_18;
} st_aa91bc_0;


int sub_aa91bc(unsigned long a0, st_aa91bc_0 *a1)
{
    st_aa91bc_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (v2)
    {
        if (v2->field_18 == a1)
            v2->field_18 = 0;
        v2 = 1;
    }
    return (unsigned int)v2;
}
