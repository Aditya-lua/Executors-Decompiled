/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3837c..0xb383d4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b3837c(long long a0)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_9ffb30(sub_9f2aec(a0));
    if (!v2)
        return v2;
    sub_9ffde8();
    sub_9ffe04(v2, 0);
    return v2;
}
