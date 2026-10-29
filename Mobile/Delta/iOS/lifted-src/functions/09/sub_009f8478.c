/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8478..0x9f8504 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f8478(unsigned long long *a0)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f7078();
    if (!v2)
    {
        return v2;
    }
    else if ((int)sub_ad69e4(v2) >= 1)
    {
        v3 = 0;
        while (sub_9f78f0(sub_ad69f8(v2, v3), 2) == 1)
        {
            v3 = (unsigned int)v3 + 1;
            if ((int)v3 >= (int)sub_ad69e4(v2))
                return v2;
        }
        sub_9f7788(v2);
        *a0 = 0;
        return 0;
    }
    else
    {
        return v2;
    }
}
