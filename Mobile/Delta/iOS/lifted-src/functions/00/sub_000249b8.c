/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x249b8..0x249f4 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_249b8(unsigned long long a0, unsigned long a1, unsigned long long i, unsigned long a3, unsigned long long a4)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (i == a4)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    do
    {
        v8 = i;
        i = v8 - 48;
    } while (i != a4);
    return v8 - 24;
}
