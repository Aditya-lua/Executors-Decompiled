/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x84a88..0x84b04 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_84a88(long long a0, long long a1, unsigned long long i, unsigned long a3)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // x20
    unsigned long long v4;  // x23
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!i)
        return 0 + a3;
    v2 = 0;
    do
    {
        v3 = i;
        v4 = v2;
        v5 = sub_83c9c(a0, a1);
        v2 = v4 + (v5 >> 32);
        a1 += 8;
        i = v3 - 1;
    } while (i);
    return v4 + (v5 >> 32) + a3;
}
