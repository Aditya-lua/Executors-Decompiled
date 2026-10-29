/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82ea8..0x82ee0 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_82ea8(char *a0, unsigned long long a1)
{
    char *v0;  // x9
    unsigned long long v1;  // x10
    unsigned long long v2;  // x10
    char *v3;  // x9

    if (a1 < 2)
        return 1;
    v0 = a0 + 1;
    v1 = a1 - 1;
    while (1)
    {
        v2 = v1;
        v3 = v0 + 1;
        if (*v0 != *a0)
            return 0;
        v1 = v2 - 1;
        v0 = v3;
        if (v2 == 1)
            return 1;
    }
}
