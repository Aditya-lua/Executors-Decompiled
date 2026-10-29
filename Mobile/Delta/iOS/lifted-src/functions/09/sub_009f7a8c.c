/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7a8c..0x9f7b1c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f7a8c(long long a0, unsigned long a1)
{
    unsigned long long v2;  // w0
    unsigned long long v3;  // x23
    unsigned long long v4;  // x19
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 1;
    v2 = (unsigned int)sub_ad69e4();
    if (v2 >= 1)
    {
        v3 = 0;
        v4 = 1;
        while (1)
        {
            if (sub_ad69f8(a0, v3))
            {
                v5 = sub_9f7918();
                if (v5 >> 31 & 1)
                    return 0xffffffff;
                v4 = (unsigned int)v5 & (unsigned int)v4;
            }
            v3 = (unsigned int)v3 + 1;
            if (v2 == (unsigned int)v3)
                return v4;
        }
    }
    return 1;
}
