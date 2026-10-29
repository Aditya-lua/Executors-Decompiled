/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7d9b8..0xa7da88 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a7d9b8(unsigned int *a0, long long a1, long long a2)
{
    long long n;  // x21
    long long iter;  // x20
    unsigned long v4;  // x8
    long long n1;  // x23
    unsigned long v6;  // x22
    unsigned long long n2;  // x21
    unsigned long long v9;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    n = a2;
    iter = a1;
    v4 = *a0;
    if ((unsigned int)v4)
    {
        n1 = 8 - v4;
        v6 = a0 + 1;
        if ((unsigned long long)n1 > (unsigned long long)n)
        {
            _memcpy(v6 + v4, iter, n);
            *a0 = *a0 + (int)n;
            return 1;
        }
        _memcpy(v6 + v4, iter, n1);
        iter += n1;
        *a0 = 0;
        sub_a7da88(a0, v6, 8);
        n -= n1;
    }
    v9 = n & 0xfffffffffffffff8;
    if (n & 0xfffffffffffffff8)
        sub_a7da88(a0, iter, v9);
    n2 = n & 7;
    if (!(n & 7))
        return 1;
    _memcpy(a0 + 1, iter + v9, n2);
    *a0 = n2;
    return 1;
}
