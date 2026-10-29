/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f9ba8..0x1f9c1c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f9ba8_0 {
    char field_0;
} st_1f9ba8_0;


unsigned long long * sub_1f9ba8(unsigned long long *a0, unsigned long a1)
{
    long long v4;  // x8
    unsigned long long *dst;  // x0
    st_1f9ba8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1f9ba8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0[1] <= a1)
        return a0;
    v4 = *a0 + 40 * a1;
    dst = _memmove(v4, v4 + 40, (a0[1] + ~a1) * 40);
    a0[1] = a0[1] - 1;
    return dst;
}
