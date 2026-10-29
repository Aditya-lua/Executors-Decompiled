/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa449e8..0xa44b00 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a449e8(long long a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x19
    long long v3;  // x21
    long long v4;  // x20
    long long v5;  // x24
    long long v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = a2;
    v4 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            v5 = sub_9ffdd8(a0);
            if (!sub_a50720(a0))
                sub_a92eec(v3, v4, 0x40000000, v5);
            else
                sub_a92d00(v3, v4, 0x40000000, v5);
        } while ((v2 += 0xffffffffc0000000, v3 += 0x40000000, v4 += 0x40000000, (unsigned long long)v2 > 0x3fffffff));
    }
    if (!v2)
        return 1;
    v6 = sub_9ffdd8(a0);
    if (!sub_a50720(a0))
    {
        sub_a92eec(v3, v4, v2, v6);
        return 1;
    }
    sub_a92d00(v3, v4, v2, v6);
    return 1;
}
