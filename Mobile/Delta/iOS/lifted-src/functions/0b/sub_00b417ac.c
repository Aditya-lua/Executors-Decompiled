/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb417ac..0xb41808 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b417ac(long long *a0, unsigned long a1)
{
    long long v2;  // w0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a2f9e0();
    if (a1 != 8)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = *a0;
        if (!sub_ab1cb0(*a0, 0xf000))
        {
            *a0 = 0;
            return v3;
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
