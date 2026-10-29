/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53420..0xc534b0 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c53420(long long a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4106
    unsigned long long v4;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c53520(a0 + 16);
    v3 = arm64g_calculate_condition(2, a0, 1, 0);
    if (v3 & 1)
        return v2;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v4 & 1)
        return v2;
    /* unsupported instruction */;
    return _free();
}
