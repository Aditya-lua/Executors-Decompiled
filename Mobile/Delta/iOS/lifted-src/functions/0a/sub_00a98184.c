/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa98184..0xa98330 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a98184(unsigned long a0, unsigned long a1, unsigned long long *a2, unsigned long long *a3, unsigned long a4, unsigned long long *a5)
{
    unsigned long long n;  // x19
    unsigned long long v7;  // x24
    unsigned long long v8;  // x25
    unsigned long v0;  // [bp-0x78]
    char v1;  // [bp-0x74]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (!(a4 & 7) && a4 + 0xffffffff7ffffff7 > 0xffffffff8000000e)
    {
        n = a4 - 8;
        v7 = ((n >> 2) + (n >> 3)) * 2;
        v0 = *a3;
        _memmove(a2, a3 + 1, n, a3 + 1);
        v8 = 1;
        do
        {
            if (n)
            {
                *((char *)&v0 + 7) = *(char *)((void*)&v0 + 7) ^ (char)v7;
                if (v7 >= 0x100)
                {
                    *((char *)&v0 + 6) = *(char *)((void*)&v0 + 6) ^ (char)((unsigned int)v7 >> 8);
                    *((char *)&v0 + 5) = *(char *)((void*)&v0 + 5) ^ (char)((unsigned int)v7 >> 16);
                    v1 = *(char *)((void*)&v0 + 4) ^ (char)((unsigned int)v7 >> 24);
                }
                v2 = *(long long *)((char *)a2 + a4 - 16);
                a5();
            }
        } while ((v8 += 1, v8 != 7));
    }
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}
