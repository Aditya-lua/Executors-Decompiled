/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd0d44..0xd0d98 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_d0d44(long long a0, long long a1, long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == a1)
        return a0;
    while (!sub_20b98(a0, a2))
    {
        a0 += 24;
        if (a0 == a1)
            return a0;
    }
    return a0;
}
