/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3b3f0..0xb3b454 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b3b3f0(long long *a0, unsigned long a1)
{
    long long v2;  // w0
    long long v3;  // x20
    long long v4;  // x0
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
        v4 = sub_9ffdd0(*a0);
        if (!v4)
        {
            return v4;
        }
        else if (sub_a1abcc() == 1172)
        {
            *a0 = 0;
            return v3;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
