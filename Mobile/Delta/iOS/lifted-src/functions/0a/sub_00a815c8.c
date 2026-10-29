/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa815c8..0xa81754 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a815c8(unsigned int *a0, long long a1, int a2, long long a3, long long a4, unsigned int a5)
{
    unsigned long v5;  // x22
    unsigned long long index;  // x23
    long long v7;  // w8
    long long v8;  // x21
    unsigned long long idx;  // x9
    unsigned int v10;  // w10
    char v0;  // [bp-0xe0]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (sub_a3f7f0(a3, a4, 0) == 1 && sub_a3fe10(a3, a1, a2) == 1 && sub_a403bc(a3, &v0, 0x88) == 1)
    {
        v5 = __double_as_longlong((double)v0);
        _bzero(a0, 0x400);
        if (0xff >= 0x100 - a5)
        {
            v7 = 8;
            while (v7 != 0x88 || !(v7 = 0, v8 = 0, !sub_a403bc(a3, &v0, 0x88)))
            {
                idx = (&v0)[v7];
                v7 += 1;
                if (idx > index)
                    continue;
                a0[index] = a0[idx];
                v10 = ((unsigned int)v5 * 2 | (unsigned int)v5 >> 31) & 2 & 3;
                v8 = 1;
                a0[idx] = ~((int)(1 - v10) >> 31) & 1 - v10 | (int)(1 - v10) >> 31 & (v10 ^ 0x7fe002);
                v5 >>= 1;
                if (index == 0xff)
                    break;
            }
        }
        else
        {
            v8 = 1;
        }
    }
    else
    {
        v8 = 0;
    }
    sub_a66ec0(&v0, 0x88);
    if (*(long long *)&g_10002b0 == v2)
        return v8;
    ___stack_chk_fail();
}
