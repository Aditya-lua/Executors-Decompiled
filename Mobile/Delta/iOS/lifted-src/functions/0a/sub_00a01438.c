/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01438..0xa01490 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a01438(unsigned long long a0, long long *a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a0)
    {
    case 2:
        sub_a01fd4(*a1);
        *a1 = 0;
        return 2;
    case 0:
        v2 = sub_a01fc8();
        *a1 = v2;
        return (v2 != 0) * 2;
    default:
        return 1;
    }
}
