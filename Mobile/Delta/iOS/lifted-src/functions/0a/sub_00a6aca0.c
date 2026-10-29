/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6aca0..0xa6acdc (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6aca0_0 {
    struct st_a6aca0_0 *field_0;
} st_a6aca0_0;


void sub_a6aca0(unsigned long a0, st_a6aca0_0 **a1)
{
    st_a6aca0_0 **v2;  // x0
    st_a6aca0_0 **v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!a1)
        return;
    if (v2)
        v3 = *v2;
    else
        v3 = 0;
    *a1 = v3;
    return;
}
