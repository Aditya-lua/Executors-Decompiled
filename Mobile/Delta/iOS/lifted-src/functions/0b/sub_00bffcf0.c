/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbffcf0..0xbffd28 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_bffcf0(long long a0, unsigned long long i)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!i)
        return a0;
    do
    {
        v2 = sub_bffd28(a0);
        a0 += 144;
        i -= 1;
    } while (i);
    return v2;
}
