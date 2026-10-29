/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29f54..0x29fc0 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_29f54(unsigned long a0, unsigned long i, unsigned long a2)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long v9;  // x20
    unsigned long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (i == a2)
        return a0;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    do
    {
        v9 = i;
        v0 = v9 + 88;
        sub_1aedc(&v0);
        i = v9 + 0x88;
    } while (i != a2);
    return v9;
}
