/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x203d4..0x203f8 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_203d4(unsigned long long *a0, unsigned long long i, unsigned long long *a2)
{
    unsigned long long *iter;  // x8
    unsigned long long v1;  // x1
    unsigned long v2;  // x9

    if (!i)
        return a0;
    iter = a0 + 1;
    do
    {
        v1 = i;
        v2 = *a2;
        *iter = 0;
        iter[1] = 0;
        *(unsigned long *)((char *)iter - 8) = v2;
        iter += 3;
        i = v1 - 1;
    } while (i);
    return a0;
}
