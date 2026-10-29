/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84f30..0x84fb8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned long long sub_84f30(unsigned long a0, unsigned long a1, long long a2, unsigned long a3, long long a4)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_7cdfc();
    if (a1 + v2 == a3)
        return sub_7cdfc(a0 + v2, a4, a2) + v2;
    return v2;
}
