/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3a0a8..0xa3a100 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a3a0a8(long long a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3f728();
    if (!v2)
        return 0;
    sub_9d3d2c(a0, 1);
    sub_9d3d24(a0, v2);
    return 1;
}
