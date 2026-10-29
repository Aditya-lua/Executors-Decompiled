/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10a2c..0x10a78 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_10a2c(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (384307168202282326 > a1)
    {
        v2 = sub_174c0();
        *a0 = v2;
        a0[1] = v2;
        a0[2] = v2 + 48 * a1;
        return;
    }
    sub_ca34();
}
