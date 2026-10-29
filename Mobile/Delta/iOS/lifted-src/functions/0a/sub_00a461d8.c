/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa461d8..0xa4622c (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a461d8(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a50904();
    if (v2 >> 31 & 1)
        return 0;
    sub_9d1c6c(sub_9ffdd8(a0), v2, a1);
    return 1;
}
