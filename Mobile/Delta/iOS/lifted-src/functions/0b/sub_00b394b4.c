/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb394b4..0xb395a8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_b394b4(unsigned long a0, unsigned int a1, unsigned long a2)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned int idx;  // x0
    long long *v5;  // x20
    long long *v6;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    v3 = sub_a2f9e0(v2);
    if (!(a1 & 7))
    {
        return 0;
    }
    else if (v3)
    {
        idx = sub_a6bffc(104, "providers/implementations/keymgmt/dsa_kmgmt.c", 415);
        if (idx)
        {
            *(unsigned int *)(idx + 16) = a1;
            *(long long *)idx = v2;
            *(uint128_t *)(idx + 24) = 0xe00000000000000800;
            *(uint128_t *)(idx + 56) = 0xffffffff00000002ffffffff;
            v5 = (long long *)idx;
            if (sub_b395f0())
                return v5;
            v6 = v5;
            sub_a6c2e4(v5[9], "providers/implementations/keymgmt/dsa_kmgmt.c", 694);
            sub_a6c2e4(v6[10], "providers/implementations/keymgmt/dsa_kmgmt.c", 695);
            sub_a6c4e8(v6[5], v6[6], "providers/implementations/keymgmt/dsa_kmgmt.c", 696);
            sub_a6c2e4(v6, "providers/implementations/keymgmt/dsa_kmgmt.c", 697);
        }
        else
        {
            sub_b395f0();
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
