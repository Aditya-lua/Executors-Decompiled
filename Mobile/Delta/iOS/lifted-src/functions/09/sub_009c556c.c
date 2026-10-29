/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c556c..0x9c55ec (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9c556c(long long a0, unsigned long a1, unsigned long long a2, long long a3)
{
    long long v4;  // x0
    char v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a1;
    v4 = sub_a6e2fc(&v1, &v0);
    if (!v4)
        return v4;
    if (!(unsigned int)a2 && !a3 || sub_a6e324(v4, a2, a3))
        return sub_9c4de8(a0, v4, 23);
    return 0;
    return sub_9c4de8(a0, v4, 23);
}
