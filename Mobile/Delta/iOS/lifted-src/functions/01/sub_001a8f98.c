/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a8f98..0x1a9004 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_1a8f98(unsigned long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_1bf324();
    if (!v2)
        return 0;
    v3 = v2;
    while (1)
    {
        v3 = *(long long *)v3;
        if (!v3)
        {
            return v2;
        }
        else if (!(sub_1b01e8(v3 + 16, a1) & 1))
        {
            return v2;
        }
    }
}
