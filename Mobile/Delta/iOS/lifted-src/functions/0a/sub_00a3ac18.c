/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ac18..0xa3ac5c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a3ac18(unsigned int a0, unsigned int a1, unsigned int a2)
{
    unsigned int *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a4e0d0();
    if (!v2)
        return;
    *v2 = a0;
    v2[1] = a1;
    v2[2] = a2;
    v2[6] = 2;
    return;
}
