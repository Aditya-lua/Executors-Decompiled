/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce68c..0x3ce6d0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_3ce68c(unsigned long long a0)
{
    unsigned long long idx;  // x8
    unsigned int v1;  // w9

    idx = a0 + 0x4000;
    *(unsigned long long *)(a0 + 18464) = 0;
    *(unsigned int *)(idx + 2092) = 0;
    *(unsigned int *)(idx + 2008) = 0;
    *(unsigned int *)(idx + 1912) = 0;
    *(unsigned int *)(idx + 1816) = 0;
    *(unsigned int *)(idx + 1720) = 0;
    *(char *)(idx + 2088) = 0xff;
    v1 = *(int *)(idx + 2152);
    if (!*(int *)(idx + 2152))
        v1 = 0x7fffffff;
    *(unsigned int *)(idx + 2156) = v1;
    *(unsigned int *)(idx + 2116) = 0;
    return 0;
}
