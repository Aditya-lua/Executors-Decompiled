/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe694..0xafe6f0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_afe694(unsigned long long a0, unsigned long long a1, unsigned long long *a2, unsigned long long *a3)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = a1;
        v3 = sub_a6dac4();
        *a2 = v3;
        if (!v3)
            return v3;
    }
    else
    {
        v2 = 0;
        *a2 = 0;
    }
    *a3 = v2;
    return 1;
}
