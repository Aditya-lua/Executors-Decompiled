/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9580..0x2a95dc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2a9580(long long a0, long long i, long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (i == a2)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    do
    {
        sub_2a7898(a0, a0 + 8, i + 32, i + 32);
        i = sub_62b88(i);
    } while (i != a2);
    return i;
}
