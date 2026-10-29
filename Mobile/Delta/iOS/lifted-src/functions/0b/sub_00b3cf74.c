/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3cf74..0xb3cfdc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_b3cf74(long long a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(16, "providers/implementations/keymgmt/kdf_legacy_kmgmt.c", 36);
    if (!v2)
        return v2;
    /* unsupported instruction */;
    *(unsigned int *)&v2[1] = 1;
    *v2 = sub_9f2aec(a0);
    return v2;
}
