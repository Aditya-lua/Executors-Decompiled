/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x75454..0x75490 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_75454(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long i;  // x9
    unsigned long long v1;  // x8
    unsigned long long v2;  // x8

    i = *a0;
    if (*a0 == *a1)
        return 0;
    v1 = 0;
    do
    {
        v2 = v1;
        i += 1;
        *a0 = i;
        v1 = v2 + 1;
    } while (i != *a1);
    return v2 + 1;
}
