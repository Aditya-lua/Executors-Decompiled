/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e490..0xb2e538 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b2e490(unsigned long long *a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "mac");
    if (v2)
    {
        if (*a0)
        {
            v3 = sub_a71468(v2, sub_c4ba8(sub_954340(*a0)));
            if (!(unsigned int)v3)
                return v3;
        }
        else
        {
            return 0;
        }
    }
    v4 = sub_a6fbc4(a1, "digest");
    if (v4)
    {
        v5 = sub_954340(a0 + 1);
        if (!v5)
            return v5;
        v6 = sub_a71468(v4, sub_a50a58());
        if (!(unsigned int)v6)
            return v6;
    }
    return 1;
}
