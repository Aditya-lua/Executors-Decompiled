/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db89c..0x9db928 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_9db89c(unsigned long long *iter, unsigned long long *node, int i)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x8
    unsigned long v2;  // x8
    unsigned long v3;  // x8
    unsigned long long *iter1;  // x8
    int v5;  // w2
    unsigned long v6;  // x9

    if (i < 1)
        return iter;
    if ((unsigned int)i >= 4)
    {
        do
        {
            v0 = *node;
            *iter = v0 * v0;
            iter[1] = v0 * v0 >> 64;
            v1 = node[1];
            iter[2] = v1 * v1;
            iter[3] = v1 * v1 >> 64;
            v2 = node[2];
            iter[4] = v2 * v2;
            iter[5] = v2 * v2 >> 64;
            v3 = node[3];
            iter[6] = v3 * v3;
            iter[7] = v3 * v3 >> 64;
            node += 4;
            iter += 8;
            i -= 4;
        } while (4 <= (unsigned int)i);
        if (!i)
            return iter;
    }
    iter1 = iter + 1;
    do
    {
        v5 = i;
        v6 = *node;
        node += 1;
        *(unsigned long *)((char *)iter1 - 8) = v6 * v6;
        *iter1 = v6 * v6 >> 64;
        iter1 += 2;
        i = v5 - 1;
    } while (i);
    return iter;
}
