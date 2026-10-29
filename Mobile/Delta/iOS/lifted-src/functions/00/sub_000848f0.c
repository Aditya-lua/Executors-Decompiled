/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x848f0..0x8495c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_848f0(long long a0, long long a1, unsigned long long i)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // x19
    unsigned long long v4;  // x22
    unsigned int v5;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!i)
        return 0;
    v2 = 0;
    do
    {
        v3 = i;
        v4 = v2;
        v5 = sub_83c9c(a0, a1);
        v2 = v4 + v5;
        a1 += 8;
        i = v3 - 1;
    } while (i);
    return v4 + v5;
}
