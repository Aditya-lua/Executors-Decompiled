/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a704..0xa2a7c8 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2a704(long long a0, unsigned long a1, unsigned long a2)
{
    long long v5;  // x21
    long long v6;  // w2
    long long v7;  // x0
    long long v0;  // [bp-0x48]
    int v1;  // [bp-0x3c], Other Possible Types: long long
    char v2;  // [bp-0x38], Other Possible Types: long long, unsigned long long
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!sub_9ca8cc(0, &v2, &v1, &v0, a0))
        return 0;
    v5 = sub_9cf0d4(0, &v2, v1);
    if (v5)
    {
        v2 = sub_c4c40(v5);
        v6 = (unsigned int)sub_9c7b68(v5);
    }
    else
    {
        v6 = 0;
        v2 = 0;
    }
    v1 = v6;
    v7 = sub_a2a41c(v0);
    sub_9cf0f4(v5);
    return v7;
}
