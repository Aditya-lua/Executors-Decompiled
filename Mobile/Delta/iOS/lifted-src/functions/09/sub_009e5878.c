/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5878..0x9e58d0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_9e5878(unsigned long long *a0, unsigned long long *a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    unsigned int v1;  // w8
    unsigned long long v2;  // 4110
    unsigned long long v3;  // 4110

    if (!(unsigned int)a2)
        return 0;
    v0 = ((long long)(a2 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(a2, 3) & 0x7fffffff8 & 0x7ffffffff) - 8;
    if (*(long long *)((char *)a0 + v0) != *(long long *)((char *)a1 + v0))
    {
        v3 = arm64g_calculate_condition(132, *(long long *)((char *)a0 + v0), *(long long *)((char *)a1 + v0), 0);
        if (!(v3 & 1))
            return 0xfffffffe;
    }
    else if ((int)a2 >= 2)
    {
        v1 = (unsigned int)a2 - 1;
        while (1)
        {
            v1 -= 1;
            if (a0[v1] != a1[v1])
                break;
            if (1 > (int)v1)
                return 0;
        }
        v2 = arm64g_calculate_condition(132, a0[v1], a1[v1], 0);
        if (!(v2 & 1))
            return 0xfffffffe;
    }
    else
    {
        return 0;
    }
    return 1;
}
