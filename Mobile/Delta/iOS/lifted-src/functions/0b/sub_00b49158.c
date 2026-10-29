/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49158..0xb491ac (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b49158(long long *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a0)
    {
        v2 = sub_a7c198(*a0);
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = sub_b49ad4(a0);
    if (!*a0)
        return v3;
    sub_a7c1b4(*a0);
    return v3;
}
