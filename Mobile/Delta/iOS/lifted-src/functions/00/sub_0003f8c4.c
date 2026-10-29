/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f8c4..0x3f8e8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_3f8c4(unsigned long long *a0, unsigned long long i, unsigned long long *a2)
{
    unsigned long iter;  // x8
    unsigned long long v1;  // x1

    if (!i)
        return a0;
    iter = a0 + 1;
    do
    {
        v1 = i;
        *(unsigned long long *)(iter - 8) = *a2;
        memset(iter, 0, 24);
        iter += 32;
        i = v1 - 1;
    } while (i);
    return a0;
}
