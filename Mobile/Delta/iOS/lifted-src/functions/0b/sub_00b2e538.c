/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e538..0xb2e59c (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b2e538(unsigned long a0)
{
    unsigned long long *v2;  // x0
    double v3;  // d0
    double v4;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return v4;
    v2 = sub_a6bffc(112, "providers/implementations/kdfs/kbkdf.c", 121);
    if (!v2)
        return v3;
    *v2 = a0;
    *(unsigned int *)&v2[3] = 32;
    *(unsigned int *)&v2[13] = 1;
    *(double *)&v2[12] = 5e-324;
    return 5e-324;
}
