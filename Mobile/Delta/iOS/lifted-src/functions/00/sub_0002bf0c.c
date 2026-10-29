/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2bf0c..0x2bf68 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_2bf0c(unsigned long long a0, unsigned long i, unsigned long a2)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // x0
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
        v0 = i + 32;
        sub_1aedc(&v0);
        v0 = i + 8;
        v9 = sub_1aedc(&v0);
        i += 56;
    } while (i != a2);
    return v9;
}
