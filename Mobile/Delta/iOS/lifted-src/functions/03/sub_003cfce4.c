/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cfce4..0x3cfd40 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_3cfce4(unsigned long long a0, unsigned long long a1, unsigned long long a2, unsigned int a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_3c9590();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_3c9590(a0 * a1, a2);
    if (!(unsigned int)v3)
        return v3;
    return (int)(a3 ^ 0x7fffffff) >= (int)((unsigned int)a2 * (unsigned int)a0 * (unsigned int)a1);
}
