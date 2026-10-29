/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94058..0xa940a8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a94058(char *a0, long long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((*a0 >> 2 & 14) + 2 != a2)
        return 0;
    _memcpy(a1, a0 + 16);
    return a2;
}
