/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39178..0xb39248 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b39178(unsigned long a0, unsigned int a1, unsigned long a2, unsigned int a3)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned int idx;  // x0
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
        idx = sub_a6bffc(120, "providers/implementations/keymgmt/dh_kmgmt.c", 459);
        if (idx)
        {
            *(unsigned int *)(idx + 16) = a1;
            *(long long *)idx = v2;
            *(uint128_t *)(idx + 24) = 0xe00000000000000800;
            *(unsigned long long *)(idx + 80) = 0;
            *(unsigned int *)(idx + 56) = 0xffffffff;
            *(unsigned int *)(idx + 60) = a3 == 0x1000;
            *(unsigned int *)(idx + 72) = 0;
            *(double *)(idx + 64) = nan;
            *(unsigned int *)(idx + 112) = a3;
        }
        if (!sub_b38424())
        {
            sub_a6c2e4(idx, "providers/implementations/keymgmt/dh_kmgmt.c", 481);
            return 0;
        }
        return idx;
    }
    else
    {
        return 0;
    }
}
