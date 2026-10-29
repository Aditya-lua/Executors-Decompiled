/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa49580..0xa49620 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a49580(long long a0, long long a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    long long v13;  // x8
    long long v14;  // x11
    unsigned int v0;  // [bp-0x34]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a1)
        return 0;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    if ((int)sub_a4d5dc() >= 1)
    {
        v13 = 58;
        v14 = 120;
        if (v0 != 64)
            v14 = 0;
        if (v0 == 128)
            v14 = v13;
        if (v0 == 40)
            v14 = 160;
    }
    else
    {
        v14 = 0;
    }
    return sub_9c96ac(a1, v14, a0 + 24, sub_a4fbf0(a0));
}
