/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60d78..0xa60e00 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a60d78(long long *a0, long long a1, long long a2)
{
    unsigned long long *v2;  // x22
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 4;
    if (a0[4])
    {
        if (a0[4] != a1)
            sub_a6c2e4();
        else
            return 1;
    }
    if (a1 && a2)
    {
        v3 = sub_a6dac4(a1, a2, "crypto/ffc/ffc_params.c", 92);
        *v2 = v3;
        if (!v3)
            return v3;
        a0[5] = a2;
        return 1;
    }
    *v2 = 0;
    v2[1] = 0;
    return 1;
}
