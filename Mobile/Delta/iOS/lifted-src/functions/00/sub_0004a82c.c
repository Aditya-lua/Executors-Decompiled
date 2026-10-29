/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a82c..0x4a864 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_4a82c(long long a0, long long i, long long a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (i == a2)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    do
    {
        i = sub_a070(i) + 40;
    } while (i != a2);
    return i;
}
