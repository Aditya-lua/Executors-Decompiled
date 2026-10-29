/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5af9c..0xb5b058 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b5af9c(long long a0, long long a1, unsigned long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a2)
    {
    case 0:
        v4 = sub_c68640(a0);
        if (!(unsigned int)v4)
            return v4;
        break;
    case 4096:
        v2 = sub_c68640(a0);
        if (!(unsigned int)v2)
            return v2;
        if (!sub_ab8c18(a3))
        {
            v3 = sub_c6b29c(a0, 0xffffffff, a3);
            if (!(unsigned int)v3)
                return v3;
        }
        break;
    default:
        return 0;
    }
    v5 = sub_c68354(a0, 0xffffffff);
    if (!(unsigned int)v5)
        return v5;
    return sub_a69b58(a0, a1) != 0;
}
