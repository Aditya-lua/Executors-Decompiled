/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3a100..0xa3a144 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a3a100(long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        sub_a3f73c(sub_975ffc());
        sub_9d3d24(a0, 0);
        sub_9d3d2c(a0, 0);
        a0 = 1;
    }
    return a0;
}
