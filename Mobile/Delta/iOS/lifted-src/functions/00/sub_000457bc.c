/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x457bc..0x45808 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_457bc(unsigned long long a0, unsigned long a1, unsigned long i, unsigned long a3, unsigned long a4)
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

    if (i == a4)
        return a0;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    do
    {
        v0 = i - 24;
        v9 = sub_10344(&v0);
        i -= 48;
    } while (i != a4);
    return v9;
}
