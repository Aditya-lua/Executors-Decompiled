/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3a31c..0xb3a3ac (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b3a31c(unsigned long a0, unsigned int a1, unsigned long a2)
{
    long long v2;  // x0
    unsigned int v3;  // w0
    unsigned int idx;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    v3 = sub_a2f9e0(v2);
    if (!(a1 & 135))
    {
        return 0;
    }
    else if (v3)
    {
        idx = sub_a6bffc(152, "providers/implementations/keymgmt/ec_kmgmt.c", 978);
        if (!idx)
            return idx;
        *(long long *)idx = v2;
        *(unsigned int *)(idx + 120) = a1;
        *(unsigned int *)(idx + 124) = 0;
        if (!sub_b3a440())
        {
            sub_b3aa44(idx);
            return 0;
        }
        return idx;
    }
    else
    {
        return 0;
    }
}
