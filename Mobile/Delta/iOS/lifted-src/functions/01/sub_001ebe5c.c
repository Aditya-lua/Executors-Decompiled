/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ebe5c..0x1ebec8 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ebe5c_0 {
    char field_0;
} st_1ebe5c_0;


unsigned long long * sub_1ebe5c(unsigned long long *a0, unsigned long a1)
{
    long long v4;  // x8
    unsigned long long *dst;  // x0
    st_1ebe5c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ebe5c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0[1] <= a1)
        return a0;
    v4 = *a0 + a1 * 8;
    dst = _memmove(v4, v4 + 8, (a0[1] + ~a1) * 8);
    a0[1] = a0[1] - 1;
    return dst;
}
