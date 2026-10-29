/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e5bc..0xb3e630 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_b3e5bc(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(56, "providers/implementations/keymgmt/ml_dsa_kmgmt.c", 456);
        if (!v2)
            return v2;
        *v2 = a0;
        if (sub_b3e68c())
            return v2;
        sub_a6c2e4(v2, "providers/implementations/keymgmt/ml_dsa_kmgmt.c", 459);
    }
    return 0;
}
