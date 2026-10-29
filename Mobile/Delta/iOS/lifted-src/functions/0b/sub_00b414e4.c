/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb414e4..0xb4153c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b414e4(void)
{
    long long v2;  // x0
    unsigned long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    if (!sub_a2f9e0(v2))
        return 0;
    v3 = sub_ab1354(v2);
    if (!v3)
        return v3;
    sub_ab1ca0();
    sub_ab1cbc(v3, 0);
    return v3;
}
