/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8d64..0xaf8df4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af8d64(long long *a0, long long a1, long long *a2)
{
    long long *v2;  // x0
    unsigned long long v3;  // x19
    unsigned int v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99624(a1);
    if (!v2)
        return 0xfffffffe;
    if (!a0)
        return 0xffffffff;
    if (0 <= a2)
        v3 = a2;
    else
        v3 = 0xffffffff;
    v4 = sub_ad69e4();
    while (1)
    {
        v3 = (unsigned int)v3 + 1;
        if ((int)v4 <= (int)v3)
            break;
        if (!sub_a9ae30(*(long long *)sub_ad69f8(*a0, v3), v2))
            return v3;
    }
    return 0xffffffff;
}
