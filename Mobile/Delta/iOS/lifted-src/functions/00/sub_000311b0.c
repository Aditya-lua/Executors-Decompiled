/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x311b0..0x311ec (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_311b0(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 <= 0xfffffffffffffff)
    {
        v2 = sub_12ad0();
        *a0 = v2;
        a0[1] = v2;
        a0[2] = v2 + a1 * 16;
        return;
    }
    sub_ca34();
}
