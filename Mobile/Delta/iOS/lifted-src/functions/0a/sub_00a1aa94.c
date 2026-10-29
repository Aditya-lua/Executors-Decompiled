/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1aa94..0xa1ab1c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a1aa94(long long *a0)
{
    long long v2;  // x19
    long long v3;  // x0
    long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9dddcc(a0[21]);
    sub_9e6c64(a0[18]);
    a0[18] = 0;
    if (!v2 || (v3 = sub_9e6c04(), a0[18] = v3, !v3))
    {
        v4 = 0;
    }
    else if (sub_9e6cc0())
    {
        v4 = 1;
    }
    else
    {
        sub_9e6c64(a0[18]);
        v4 = 0;
        a0[18] = 0;
    }
    sub_9dded4(v2);
    return v4;
}
