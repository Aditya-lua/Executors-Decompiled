/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f761c..0x9f76d8 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f761c(long long a0, long long a1, long long a2, unsigned long long a3, long long a4)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x25
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_ad69e4();
    if ((int)v3 < 1)
        return v3;
    v4 = 0;
    do
    {
        sub_9f7308(sub_ad69f8(a0, v4), a1, a2, a4);
        v6 = sub_ad69e4(a0);
        if ((int)((unsigned int)v6 - 1) > (int)v4)
        {
            v0 = a3;
            v6 = sub_9d524c(a1, "%s");
        }
    } while ((v4 = (unsigned int)v4 + 1, (unsigned int)v3 != (unsigned int)v4));
    return v6;
}
