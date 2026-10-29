/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9990ac..0x9991c0 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9990ac(long long a0, long long a1, long long a2, unsigned long long *a3)
{
    long long v3;  // x1
    unsigned long long v4;  // x9
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a1 || *(int *)(a0 + 4272))
    {
        if (sub_c68684(a2, 80 - a1, 0) && sub_c68ecc(a2, &v0))
        {
            v4 = sub_a6e990(a2) - v0;
            a3[4] = v4;
            a3[5] = v4;
            a3[1] = v0;
            return 1;
        }
        sub_a368c8();
        v3 = 1678;
    }
    else if (sub_a6e830(a2))
    {
        (*(long long *)(*(long long *)(a0 + 4416) + 16))();
    }
    else
    {
        sub_a368c8();
        v3 = 1661;
    }
    sub_a369bc("ssl/record/methods/tls_common.c", v3, "tls_prepare_for_encryption_default");
    sub_996e84(a0, 80, 0xc0103, 0);
    return 0;
}
