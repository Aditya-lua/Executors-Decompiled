/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c42c..0x4c464 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_4c42c(long long a0, unsigned long a1, long long i, unsigned long a3, long long a4)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
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
        i = sub_a070(i - 40);
    } while (i != a4);
    return i;
}
