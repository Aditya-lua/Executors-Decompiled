/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9853a4..0x9853f4 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9853a4(long long *a0, unsigned long long a1, long long a2, long long a3, long long a4, long long a5)
{
    unsigned long long v4;  // x30
    long long v0;  // [bp-0x20], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if ((unsigned int)a1 <= 3)
    {
        v1 = &v3;
        v2 = v4;
        *(unsigned int *)((char *)&v0 + 4) = 1;
        *(char *)&v0 = 0;
        return sub_984670(a0 + 2, *a0, a0[1], a1, a2, a3, a4, a5, v0);
    }
    return 0;
}
