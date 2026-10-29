/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9589bc..0x958a1c (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9589bc(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_af3b1c(a2);
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (sub_958910(a0, a1, a2))
    {
        return 1;
    }
    else
    {
        sub_afc404(a2);
        return 0;
    }
}
