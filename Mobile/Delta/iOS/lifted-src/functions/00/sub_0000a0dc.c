/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0dc..0xa0f4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a0dc(uint128_t *iter, unsigned long long i, uint128_t *a2)
{
    unsigned long long v0;  // x1
    unsigned long v2;  // d0

    if (i)
    {
        do
        {
            v0 = i;
            *iter = *a2;
            iter += 1;
            i = v0 - 1;
        } while (i);
    }
    return v2;
}
