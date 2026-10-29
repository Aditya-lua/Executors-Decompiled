/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb293c4..0xb29428 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b293c4(long long a0)
{
    unsigned long v2;  // x0
    unsigned long long *v3;  // x20
    unsigned long long v4;  // d0
    unsigned long long v5;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return v5;
    v2 = sub_a6bffc(64, "providers/implementations/exchange/ecdh_exch.c", 90);
    if (!v2)
        return v4;
    v3 = v2;
    *v3 = sub_9f2aec(a0);
    v3[3] = 0xffffffff;
    return 0xffffffff;
}
