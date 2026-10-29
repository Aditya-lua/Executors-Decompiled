/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43b7c..0x43ba0 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_43b7c(unsigned long long *a0, unsigned long long i, unsigned long long *a2)
{
    unsigned long long *iter;  // x8
    unsigned long long v1;  // x1

    if (!i)
        return a0;
    iter = a0 + 1;
    do
    {
        v1 = i;
        *(unsigned long long *)((char *)iter - 8) = *a2;
        *iter = 0;
        *(unsigned int *)&iter[1] = 0;
        iter += 3;
        i = v1 - 1;
    } while (i);
    return a0;
}
