/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60cac..0xa60d24 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a60cac(long long *a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (a1)
    {
        v2 = *a0;
        if (v2 != a1)
        {
            v2 = sub_9e48d4(v2);
            *a0 = a1;
        }
    }
    if (a2)
    {
        v2 = a0[1];
        if (v2 != a2)
        {
            v2 = sub_9e48d4(v2);
            a0[1] = a2;
        }
    }
    if (!a3)
        return v2;
    v3 = a0[2];
    if (v3 == a3)
        return v3;
    v4 = sub_9e48d4(v3);
    a0[2] = a3;
    return v4;
}
