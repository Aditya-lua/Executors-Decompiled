/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e58d0..0x9e5980 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9e58d0(unsigned long long *a0, unsigned long long *a1, int a2, unsigned long long a3)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x10
    unsigned long v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4110

    v0 = a2 - 1;
    if (a3 >> 31 & 1)
    {
        v1 = -(int)a3;
        do
        {
            if (a1[v1 + (int)v0])
                return 0xffffffff;
        } while ((v1 -= 1, v1));
    }
    if ((int)a3 >= 1)
    {
        v2 = (char *)a0 + ((long long)(v0 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v0, 3) & 0x7fffffff8 & 0x7ffffffff) + 8 * (a3 & 0xffffffff);
        v3 = (a3 & 0xffffffff) + 1;
        do
        {
            if (*(long long *)v2)
                return 1;
        } while ((v3 -= 1, v2 -= 8, 2 <= (long long)v3));
    }
    if (!a2)
        return 0;
    if (a0[(unsigned int)v0] != a1[(unsigned int)v0])
    {
        v6 = arm64g_calculate_condition(132, a0[(unsigned int)v0], a1[(unsigned int)v0], 0);
        if (!(v6 & 1))
            return 0xfffffffe;
    }
    else if (a2 >= 2)
    {
        while (1)
        {
            v0 = (unsigned int)v0 - 1;
            if (a0[v0 & 0xffffffff] != a1[v0 & 0xffffffff])
                break;
            if (1 > (int)v0)
                return 0;
        }
        v5 = arm64g_calculate_condition(132, a0[v0 & 0xffffffff], a1[v0 & 0xffffffff], 0);
        if (!(v5 & 1))
            return 0xfffffffe;
    }
    else
    {
        return 0;
    }
    return 1;
}
