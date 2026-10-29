/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3aea0..0x3aee0 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3aea0_0 {
    char padding_0[49];
    char field_31;
} st_3aea0_0;


void sub_3aea0(unsigned long a0, st_3aea0_0 *a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_31 != 1)
        return;
    if (sub_47e14() & 1)
        return;
    sub_45808(a2, "'export' may only be applied to top-level statements");
}
