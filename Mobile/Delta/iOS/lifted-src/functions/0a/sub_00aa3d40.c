/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa3d40..0xaa3e38 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aa3d40(unsigned long long *a0, unsigned long long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x24
    unsigned long long v4;  // x23
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (!v2)
    {
        v2 = sub_ad61b4(0);
        *a0 = v2;
        if (!v2)
            return v2;
    }
    v3 = sub_ad69e4(v2);
    if ((int)v3 >= 1)
    {
        v4 = 0;
        while (sub_a99eac(sub_af17c0(sub_ad69f8(*a0, v4), v4)) != (unsigned int)a1)
        {
            if ((unsigned int)v3 == (unsigned int)v4 + 1)
            {
                v4 = v3;
                goto LABEL_aa3dc0;
            }
        }
    }
    else
    {
        v4 = 0;
LABEL_aa3dc0:
        v5 = sub_ad68a0(*a0, 0);
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_af9580(a1, a2, a3);
    if (v6)
    {
        v7 = v4;
        sub_af9564(sub_ad69f8(*a0, v7), v7);
        sub_ad6a28(*a0, v4, v6);
        return 1;
    }
    if ((unsigned int)v4 != (unsigned int)v3)
        return 0;
    sub_ad692c(*a0);
    return 0;
}
