/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48948..0xa489fc (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a48948(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v2;  // x25
    unsigned long long i;  // x27
    long long v4;  // x0
    long long v5;  // x0
    long long v6;  // x0
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
        v5 = sub_9ffdd8(a0);
        v6 = sub_9ffdd8(a0);
        sub_9fbda0(a2 + i, a1 + i, v4, v5 + 128, v6 + 0x100, sub_a50720(a0));
        i += v2;
    } while (i <= a3 - v2);
    return 1;
}
