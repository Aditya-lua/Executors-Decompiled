/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4939c..0xa49410 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a4939c(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v2;  // x23
    unsigned long long i;  // x24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)(sub_a2d030() + 4);
    if (a3 < v2)
        return 1;
    i = 0;
    do
    {
        sub_a66074(a2 + i, a1 + i, sub_9ffdd8(a0));
        i += v2;
    } while (i <= a3 - v2);
    return 1;
}
