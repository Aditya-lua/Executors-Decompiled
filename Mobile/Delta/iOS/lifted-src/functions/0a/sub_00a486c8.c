/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa486c8..0xa4881c (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a486c8(long long a0, long long a1, long long a2, long long a3)
{
    long long i;  // x20
    long long v6;  // x22
    long long v7;  // x21
    long long v8;  // x0
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    long long v0;  // [bp-0x70]
    unsigned int v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x64]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    i = a3;
    v6 = a2;
    v7 = a1;
    if ((unsigned long long)a3 > 0x3fffffff)
    {
        do
        {
            v2 = sub_a507d0(a0);
            v8 = sub_9ffdd8(a0);
            v9 = sub_9ffdd8(a0);
            v10 = sub_9ffdd8(a0);
            *(unsigned int *)&v0 = sub_a50720(a0);
            sub_9f85e0(v6, v7, 0x40000000, v8, v9 + 128, v10 + 0x100, a0 + 40, &v2, v0);
            sub_a50868(a0, v2);
            i += 0xffffffffc0000000;
            v6 += 0x40000000;
            v7 += 0x40000000;
        } while ((unsigned long long)i > 0x3fffffff);
    }
    if (!i)
        return 1;
    v1 = sub_a507d0(a0);
    v11 = sub_9ffdd8(a0);
    v12 = sub_9ffdd8(a0);
    v13 = sub_9ffdd8(a0);
    *(unsigned int *)&v0 = sub_a50720(a0);
    sub_9f85e0(v6, v7, i, v11, v12 + 128, v13 + 0x100, a0 + 40, &v1, v0);
    sub_a50868(a0, v1);
    return 1;
}
