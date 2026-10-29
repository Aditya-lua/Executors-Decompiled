/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1750c..0xa17584 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a1750c(long long a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x21
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = sub_a19700();
    v3 = sub_a1bda8(a1, v2, sub_a19708(a0));
    v4 = sub_a19718(a0, v3) != 0;
    sub_a1a174(v3);
    return v4;
}
