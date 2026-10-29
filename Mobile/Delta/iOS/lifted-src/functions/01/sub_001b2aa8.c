/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2aa8..0x1b2ae4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1b2aa8(unsigned long a0, unsigned long a1)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_71c98();
    if (*v2)
        return *v2 + 56;
    sub_31d1c("map::at:  key not found");
}
