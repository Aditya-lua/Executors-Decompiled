/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d82d8..0x9d8328 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9d82d8(long long *a0, long long a1, unsigned int a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
    {
        return 0;
    }
    else if ((int)a0[5])
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!_fwrite(a1, a2, 1, a0[8]))
            v8 = 0;
        else
            v8 = a2;
        return v8;
    }
    else
    {
        return 0;
    }
}
