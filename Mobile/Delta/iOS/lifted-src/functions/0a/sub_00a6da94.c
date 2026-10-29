/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6da94..0xa6dac4 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6da94(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long *v0;  // x8
    unsigned long long *v1;  // x9
    unsigned long long v2;  // x1

    v0 = a0;
    if (a1)
    {
        v1 = (char *)a0 + a1;
        v0 = a0;
        while (1)
        {
            v2 = a1;
            if (!*(char *)v0)
                break;
            v0 = (char *)v0 + 1;
            a1 = v2 - 1;
            if (v2 == 1)
            {
                v0 = v1;
                break;
            }
        }
    }
    return v0 - a0;
}
