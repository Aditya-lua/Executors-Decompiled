/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e548..0xb3e5bc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3e548(unsigned int a0, unsigned long long a1)
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
        if (!(a1 & 3))
            return 1;
        v3 = sub_a80000(a0, a1);
        if (!(unsigned int)v3)
            return v3;
        return 1;
    }
    else
    {
        return 0;
    }
}
