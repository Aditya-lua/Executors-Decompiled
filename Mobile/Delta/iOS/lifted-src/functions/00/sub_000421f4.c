/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x421f4..0x42214 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_421f4(unsigned long long *a0, unsigned long long i, unsigned long long *a2)
{
    char *iter;  // x8
    unsigned long long v1;  // x1

    if (!i)
        return a0;
    iter = a0 + 1;
    do
    {
        v1 = i;
        *(unsigned long long *)(iter - 8) = *a2;
        *iter = 0;
        iter += 16;
        i = v1 - 1;
    } while (i);
    return a0;
}
