/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadbc84..0xadbd00 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_adbc84(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long i;  // x21
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    i = a2;
    v3 = a1;
    if (a2 > 0xfffffffffffffff)
    {
        do
        {
            sub_adbd00(a0, v3, -0x8000000000000000);
            i += 0xf000000000000000;
            v3 += 0x1000000000000000;
        } while (i > 0xfffffffffffffff);
    }
    if (i)
        sub_adbd00(a0, v3, i * 8);
    return 1;
}
