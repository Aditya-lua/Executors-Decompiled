/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x970748..0x970794 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_970748(long long a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long v8;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a5ba1c();
    if ((int)sub_a5aec8(v8, a0) <= 0)
    {
        sub_a5a4c8(v8);
        v8 = 0;
    }
    return v8;
}
