/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c060..0xb3c0c0 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3c060(unsigned long long a0, unsigned long long a1)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        if (a1 >> 1 & 1)
        {
            v3 = *(char *)(a0 + 16) & 1;
            if (!(a1 & 1))
                return v3;
            if (!(unsigned int)v3)
                return v3;
        }
        else if (!(a1 & 1))
        {
            return 1;
        }
        return *(long long *)(a0 + 80) != 0;
    }
    else
    {
        return 0;
    }
}
