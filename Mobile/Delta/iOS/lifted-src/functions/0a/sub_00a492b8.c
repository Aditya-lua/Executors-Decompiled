/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa492b8..0xa4939c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a492b8(long long a0, long long a1, long long a2, long long a3)
{
    long long i;  // x20
    long long v5;  // x22
    long long v6;  // x21
    unsigned int v0;  // [bp-0x48]
    unsigned int v1;  // [bp-0x44]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a3;
    v5 = a2;
    v6 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            v1 = sub_a507d0(a0);
            sub_a660f4(v5, v6, 0x40000000, sub_9ffdd8(a0), a0 + 40, &v1);
            sub_a50868(a0, v1);
            i += 0xffffffffc0000000;
            v5 += 0x40000000;
            v6 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (!i)
        return 1;
    v0 = sub_a507d0(a0);
    sub_a660f4(v5, v6, i, sub_9ffdd8(a0), a0 + 40, &v0);
    sub_a50868(a0, v0);
    return 1;
}
