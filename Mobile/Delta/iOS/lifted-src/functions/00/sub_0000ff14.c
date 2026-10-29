/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xff14..0xff50 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_ff14(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 <= 0x1fffffffffffffff)
    {
        v2 = sub_12a38();
        *a0 = v2;
        a0[1] = v2;
        a0[2] = v2 + a1 * 8;
        return;
    }
    sub_ca34();
}
