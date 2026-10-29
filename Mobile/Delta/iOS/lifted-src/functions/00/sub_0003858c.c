/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3858c..0x385b8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_3858c(unsigned long long *a0, unsigned long long i, unsigned long long *a2)
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
        memset(iter, 0, 40);
        iter += 48;
        i = v1 - 1;
    } while (i);
    return a0;
}
