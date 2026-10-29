/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7f76c..0xa7f7d8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a7f76c(unsigned int *a0, long long a1)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long i;  // x8
    unsigned long long v7;  // x10
    char *v0;  // [bp-0x28], Other Possible Types: char
    char *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6e830(a1, 128, &v0);
    if (!(unsigned int)v4)
        return v4;
    v5 = 0;
    do
    {
        i = v5;
        v7 = i + 8;
        v1 = v0 + 1;
        *v0 = (char)*(int *)((char *)a0 + i) | (char)*(int *)((char *)a0 + i + 4) * 16;
        v0 = v1;
        v5 = v7;
    } while (i < 1016);
    return 1;
}
