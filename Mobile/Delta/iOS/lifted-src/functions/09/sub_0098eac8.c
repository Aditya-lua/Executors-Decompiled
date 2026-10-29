/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98eac8..0x98eb64 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_98eac8(long long a0, unsigned long a1, long long a2, long long a3)
{
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!sub_a6ed9c())
    {
        return 0;
    }
    else if (sub_a6ed9c(a0, a3))
    {
        if (!a3)
        {
            v0 = sub_a6e990(a0);
            if (!a2)
                return v0;
        }
        else if (!sub_a6e830(a0, a3, &v0))
        {
            return 0;
        }
        else if (!a2)
        {
            return v0;
        }
        _memcpy();
        return v0;
    }
    else
    {
        return 0;
    }
}
