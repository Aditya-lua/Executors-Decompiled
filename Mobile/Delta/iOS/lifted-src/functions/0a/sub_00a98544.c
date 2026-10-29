/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98544..0xa98764 (544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a98544(unsigned long a0, unsigned long long a1, long long a2, unsigned long long *a3, unsigned long long a4, unsigned long long *a5)
{
    unsigned long long n;  // x21
    unsigned long long v9;  // x26
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x78]
    char v3;  // [bp-0x74]
    unsigned long v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (a4 >= 16 && !(a4 & 0xffffffff80000007))
    {
        if (a4 == 16)
        {
            v1 = a1;
            a5();
        }
        else if (24 > a4)
        {
            sub_a66ec0(a2, a4);
        }
        else
        {
            v0 = a4 - 16;
            v1 = a1;
            n = a4 - 8;
            v9 = ((n >> 2) + (n >> 3)) * 2;
            v2 = *a3;
            _memmove(a2, a3 + 1, n, a3 + 1);
            *((char *)&v2 + 7) = *(char *)((void*)&v2 + 7) ^ (char)v9;
            if (v9 >= 0x100)
            {
                *((char *)&v2 + 6) = *(char *)((void*)&v2 + 6) ^ (char)((unsigned int)v9 >> 8);
                *((char *)&v2 + 5) = *(char *)((void*)&v2 + 5) ^ (char)((unsigned int)v9 >> 16);
                v3 = *(char *)((void*)&v2 + 4) ^ (char)((unsigned int)v9 >> 24);
            }
            v4 = *(long long *)(a4 + a2 - 16);
            a5();
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    ___stack_chk_fail();
}
