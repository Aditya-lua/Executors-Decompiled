/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x211f0..0x2123c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_211f0(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (461168601842738791 > a1)
    {
        v2 = sub_166ec();
        *a0 = v2;
        a0[1] = v2;
        a0[2] = v2 + 40 * a1;
        return;
    }
    sub_ca34();
}
