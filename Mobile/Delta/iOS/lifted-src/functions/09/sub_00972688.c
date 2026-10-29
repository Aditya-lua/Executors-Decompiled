/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972688..0x97270c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_972688(char *a0, char a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_972498();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_972574();
    if (!a0[5] && !*(long long *)&a0[72])
    {
        a0[6] = 2;
        if (!(*a0 & 1))
            return v3;
    }
    a0[6] = 2;
    return v3;
}
