/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63b98..0x63bc8 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_63b98(long long *a0)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    a0[2] = v2;
    if (!v2)
        return v2;
    v3 = sub_63d8c(v2);
    a0[1] = v3;
    return v3;
}
