/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96c6cc..0x96c74c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_96c6cc(long long a0, long long a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_97725c(a1);
    if ((int)sub_ad69e4(a0) >= 1)
    {
        v3 = 0;
        do
        {
            if (!sub_af1860(v2, sub_ad69f8(a0, v3)))
                return 1;
        } while ((v3 = (unsigned int)v3 + 1, (int)v3 < (int)sub_ad69e4(a0)));
    }
    return 0;
}
