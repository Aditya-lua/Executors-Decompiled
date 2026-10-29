/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa46d34..0xa46dec (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a46d34(long long a0, long long a1, long long a2, long long i)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    long long v17;  // x23
    long long v18;  // x0
    unsigned int v0;  // [bp-0x44]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!i)
        return 1;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    if ((unsigned long long)i < 0x40000000)
        v17 = i;
    else
        v17 = 0x40000000;
    do
    {
        v0 = sub_a507d0(a0);
        v18 = sub_9ffdd8(a0);
        sub_9ed0f0(a2, a1, v17, v18, a0 + 40, &v0, sub_a50720(a0));
        sub_a50868(a0, v0);
        a2 += v17;
        a1 += v17;
        i -= v17;
        if ((unsigned long long)i < (unsigned long long)v17)
            v17 = i;
    } while (i);
    return 1;
}
