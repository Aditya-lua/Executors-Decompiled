/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4839c..0xa48470 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a4839c(long long a0, long long a1, long long a2, long long a3)
{
    long long i;  // x19
    long long v3;  // x21
    long long v4;  // x20
    long long v5;  // x0
    long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a3;
    v3 = a2;
    v4 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            v5 = sub_9ffdd8(a0);
            sub_9f8f74(v3, v4, 8, 0x40000000, v5, a0 + 40, sub_a50720(a0));
            i += 0xffffffffc0000000;
            v3 += 0x40000000;
            v4 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (!i)
        return 1;
    v7 = sub_9ffdd8(a0);
    sub_9f8f74(v3, v4, 8, i, v7, a0 + 40, sub_a50720(a0));
    return 1;
}
