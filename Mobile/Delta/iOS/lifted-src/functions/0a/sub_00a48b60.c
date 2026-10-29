/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48b60..0xa48c84 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a48b60(long long a0, long long a1, long long a2, long long a3)
{
    long long i;  // x19
    long long v4;  // x21
    long long v5;  // x20
    long long v6;  // x0
    long long v7;  // x0
    long long v8;  // x0
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    long long v0;  // [bp-0x70]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    i = a3;
    v4 = a2;
    v5 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            v6 = sub_9ffdd8(a0);
            v7 = sub_9ffdd8(a0);
            v8 = sub_9ffdd8(a0);
            *(unsigned int *)&v0 = sub_a50720(a0);
            sub_9f8794(v4, v5, 8, 0x40000000, v6, v7 + 128, v8 + 0x100, a0 + 40, v0);
            i += 0xffffffffc0000000;
            v4 += 0x40000000;
            v5 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (!i)
        return 1;
    v9 = sub_9ffdd8(a0);
    v10 = sub_9ffdd8(a0);
    v11 = sub_9ffdd8(a0);
    *(unsigned int *)&v0 = sub_a50720(a0);
    sub_9f8794(v4, v5, 8, i, v9, v10 + 128, v11 + 0x100, a0 + 40, v0);
    return 1;
}
