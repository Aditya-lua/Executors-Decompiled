/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef208..0x1ef280 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef208_0 {
    char field_0;
} st_1ef208_0;


unsigned long long * sub_1ef208(unsigned long long *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v4;  // x8
    long long v5;  // x8
    st_1ef208_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ef208_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[1] - a1;
    if (a0[1] <= a1)
        return a0;
    if (v4 > a2)
    {
        v5 = *a0 + a1 * 8;
        _memmove(v5, v5 + a2 * 8, (v4 - a2) * 8);
        a1 = a0[1] - a2;
    }
    a0[1] = a1;
    return a0;
}
