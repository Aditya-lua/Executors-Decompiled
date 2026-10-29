/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66ec0..0xa66f20 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a66ec0(unsigned long long iter, unsigned long long node)
{
    unsigned long long v0;  // x0
    unsigned long long v1;  // x1

    if (!node)
        return iter;
    if (15 < node)
    {
        for (; iter & 7; node -= 1)
        {
            *(char *)iter = 0;
            iter += 1;
        }
        do
        {
            *(unsigned long long *)iter = 0;
            iter += 8;
            node -= 8;
        } while (node & 0xfffffffffffffff8);
        if (!node)
            return iter;
    }
    do
    {
        v0 = iter;
        v1 = node;
        *(char *)v0 = 0;
        node = v1 - 1;
        iter = v0 + 1;
    } while (node);
    return v0 + 1;
}
