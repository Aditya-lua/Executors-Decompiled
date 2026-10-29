/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3dc30..0xb3dcec (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b3dc30(long long a0, long long a1, long long a2)
{
    unsigned long v2;  // x19
    unsigned int v3;  // w0
    unsigned int v4;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a7f9e4(sub_9f2aec(a0), a1, a2);
    if (!v2)
        return v2;
    v3 = sub_b5b200(a0, "ml-dsa.retain_seed", 1);
    v4 = sub_b5b200(a0, "ml-dsa.prefer_seed", 1);
    sub_a7f888(v2, v4 != 0 | (v3 != 0) * 2, !v4 | (!v3) * 2, 0, 0, 0, 0);
    return v2;
}
