/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3a1a4..0xb3a220 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b3a1a4(long long *a0, long long a1, long long a2)
{
    unsigned long long *v2;  // x22
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 5;
    sub_a6c4e8(a0[5], a0[6], "providers/implementations/keymgmt/dsa_kmgmt.c", 451);
    *v2 = 0;
    v2[1] = 0;
    if (!a1)
    {
        return 1;
    }
    else if (a2)
    {
        v3 = sub_a6dac4(a1, a2, "providers/implementations/keymgmt/dsa_kmgmt.c", 455);
        *v2 = v3;
        if (!v3)
            return v3;
        a0[6] = a2;
        return 1;
    }
    else
    {
        return 1;
    }
}
