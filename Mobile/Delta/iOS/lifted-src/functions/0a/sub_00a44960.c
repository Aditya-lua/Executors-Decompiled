/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa44960..0xa449e8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a44960(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v2;  // x23
    unsigned long long i;  // x25
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)(sub_a2d030() + 4);
    if (a3 < v2)
        return 1;
    i = 0;
    do
    {
        v4 = sub_9ffdd8(a0);
        sub_a50720(a0);
        sub_9bf33c(a2 + i, a1 + i, v4);
        i += v2;
    } while (i <= a3 - v2);
    return 1;
}
