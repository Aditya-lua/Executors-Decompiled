/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a70c..0xa1a764 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_a1a70c(long long *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a19fb4(a0[21], a0[22], *a0);
    if (v8)
    {
        v8 = v8;
        if (!sub_a1a2e8())
        {
            sub_a1a174(v8);
            v8 = 0;
        }
    }
    return v8;
}
