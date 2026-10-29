/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd724..0x9fd798 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9fd724(long long a0, long long a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a60188(sub_12738(), a1);
    if (!(unsigned int)v3)
        return v3;
    sub_9feb80(a0);
    if (!sub_a6fbc4(a1, "priv_len"))
        return 1;
    v4 = sub_a70424();
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_9ffd40(a0, v0);
    if (!(unsigned int)v5)
        return v5;
    return 1;
}
