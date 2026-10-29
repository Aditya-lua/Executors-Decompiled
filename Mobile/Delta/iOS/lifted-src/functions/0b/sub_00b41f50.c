/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb41f50..0xb42020 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b41f50(unsigned long a0, unsigned int a1, unsigned int a2, long long a3)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned int idx;  // x20
    unsigned int v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    v3 = sub_a2f9e0(v2);
    if (!(a1 & 3))
    {
        return 0;
    }
    else if (v3)
    {
        idx = sub_a6bffc(88, "providers/implementations/keymgmt/rsa_kmgmt.c", 456);
        if (idx)
        {
            *(long long *)idx = v2;
            v5 = sub_9e4958();
            *(unsigned long long *)(idx + 32) = v5;
            if (v5 && sub_9e4d58())
            {
                *(unsigned long long *)(idx + 24) = 0x800;
                *(unsigned long long *)(idx + 40) = 2;
                *(unsigned int *)(idx + 16) = a2;
                if (sub_b41548(idx, a3))
                    return idx;
            }
            sub_9e48d4(*(long long *)(idx + 32));
        }
        sub_a6c2e4(idx, "providers/implementations/keymgmt/rsa_kmgmt.c", 476);
        return 0;
    }
    else
    {
        return 0;
    }
}
