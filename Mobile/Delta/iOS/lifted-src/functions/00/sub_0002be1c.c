/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2be1c..0x2be54 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_2be1c(unsigned long long *a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 >= 0)
    {
        v2 = sub_121f8();
        *a0 = v2;
        a0[1] = v2;
        a0[2] = v2 + a1;
        return;
    }
    sub_ca34();
}
