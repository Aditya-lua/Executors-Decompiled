/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa610f8..0xa6116c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a610f8(long long *a0, long long *a1, unsigned int a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9e5528(*a0, *a1) && !sub_9e5528(a0[2], a1[2]))
    {
        if (a2)
            return 1;
        return !sub_9e5528(a0[1], a1[1]);
    }
    return 0;
}
