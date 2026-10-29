/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49d84..0xb49f34 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b49d84(long long *a0, long long iter, long long n, unsigned long long a3, unsigned long long a4)
{
    long long v2;  // x25
    unsigned long v3;  // x23
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x2
    unsigned long long v10;  // x0
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    v3 = a0 + 13;
    if (a3 && a4)
    {
        v4 = sub_b4a2fc(a0, 0, a3, a4, 0, 0, 0, 0);
        if (!(unsigned int)v4)
            return v4;
        v5 = sub_b4a2fc(a0, 1, a3, a4, 0, 0, 0, 0);
        if (!(unsigned int)v5)
            return v5;
    }
    v6 = sub_a58104(v2, a0 + 5, a0[4], 0);
    if (!(unsigned int)v6)
        return v6;
    while (1)
    {
        v7 = sub_a58164(v2);
        if (!(unsigned int)v7)
            return v7;
        if ((unsigned long long)n <= (unsigned long long)a0[4])
            break;
        v8 = sub_a58170(v2, iter, 0, n);
        if (!(unsigned int)v8)
            return v8;
        v9 = a0[4];
        iter += v9;
        n -= v9;
        v10 = sub_a58104(v2, a0 + 5, v9, 0);
        if (!(unsigned int)v10)
            return v10;
    }
    v11 = sub_a58170(v2, v3, 0, 64);
    if (!(unsigned int)v11)
        return v11;
    _memcpy(iter, v3, n);
    if (!sub_b4a2fc(a0, 0, a3, a4, 0, 0, 0, 0))
        return 0;
    if (!a4)
    {
        return 1;
    }
    else if (sub_b4a2fc(a0, 1, a3, a4, 0, 0, 0, 0))
    {
        return 1;
    }
    return 0;
}
