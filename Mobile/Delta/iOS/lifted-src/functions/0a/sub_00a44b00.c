/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa44b00..0xa44bcc (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a44b00(long long a0, long long a1, long long a2, long long i)
{
    unsigned long long v12;  // x26
    unsigned long long v13;  // x25
    long long v22;  // x0
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    long long v21;  // x23
    unsigned int v0;  // [bp-0x54]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!i)
        return 1;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = &v11;
    v10 = v20;
    if ((unsigned long long)i < 0x40000000)
        v21 = i;
    else
        v21 = 0x40000000;
    do
    {
        v0 = sub_a507d0(a0);
        v22 = sub_9ffdd8(a0);
        sub_a940a8(a2, a1, v21, v22, a0 + 40, &v0, sub_a50720(a0), " )");
        sub_a50868(a0, v0);
        a2 += v21;
        a1 += v21;
        i -= v21;
        if ((unsigned long long)i < (unsigned long long)v21)
            v21 = i;
    } while (i);
    return 1;
}
