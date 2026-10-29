/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb30fc0..0xb31020 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b30fc0(void)
{
    long long v2;  // x0
    unsigned long long *v3;  // x0
    unsigned long v4;  // d0
    unsigned long v5;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    if (!sub_a2f9e0(v2))
        return v5;
    v3 = sub_a6bffc(88, "providers/implementations/kdfs/scrypt.c", 65);
    if (!v3)
        return v4;
    *v3 = v2;
    *(uint128_t *)&v3[6] = 0x80000000000100000;
    *(uint128_t *)&v3[8] = 0x401000000000000000000001;
    return 0x100000;
}
