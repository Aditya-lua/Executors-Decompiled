/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa80cc..0xaa81a0 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa80cc(unsigned long a0, long long *a1, long long a2, unsigned long a3, long long a4, long long a5)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aa89f4();
    if (v2)
    {
        v3 = sub_a6bf4c(a2, "crypto/rand/prov_seed.c", 111);
        if (!v3)
            return 0;
        v4 = v3;
        if (sub_a520b0(v2, v4, a2, 0, 0, a4, a5))
        {
            *a1 = v4;
            return a2;
        }
        sub_a6c2e4(v4, "crypto/rand/prov_seed.c", 115);
        return 0;
    }
}
