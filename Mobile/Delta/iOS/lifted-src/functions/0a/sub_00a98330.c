/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98330..0xa98544 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned int * sub_a98330(unsigned long a0, unsigned int *a1, unsigned long long *ptr, long long ptr1, unsigned long long n, unsigned long long *a5)
{
    unsigned long long n1;  // x22
    long long v6;  // x24
    unsigned long v7;  // x25
    unsigned long long v8;  // x26
    unsigned long long *v9;  // x22
    unsigned long long v0;  // [bp-0x78]
    unsigned long v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (0xffffffff80000001 <= n + 0xffffffff80000000)
    {
        n1 = n + 7 & 0xfffffffffffffff8;
        v6 = n1 - n;
        if (a1)
            v7 = *a1;
        else
            v7 = 2790873510;
        v8 = n >> 24;
        if (n1 == 8)
        {
            v9 = ptr + 1;
            _memmove(v9, ptr1, n);
            *ptr = __builtin_bswap64(n & 0xffffff) | v8 * 0x100000000 | v7;
            _bzero((char *)v9 + n, v6);
            a5();
        }
        _memmove(ptr, ptr1, n);
        _bzero((char *)ptr + n, v6);
        if (n1 + 0xffffffff7fffffff >= 0xffffffff8000000f)
        {
            _memmove(ptr + 1, ptr, n1);
            v0 = __builtin_bswap64(n & 0xffffff) | v8 * 0x100000000 | v7;
            v1 = ptr[1];
            a5();
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return 0;
    ___stack_chk_fail();
}
