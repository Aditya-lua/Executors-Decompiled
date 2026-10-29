/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0698..0x1f070c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0698_0 {
    char field_0;
} st_1f0698_0;


unsigned long long * sub_1f0698(unsigned long long *a0, long long a1, long long n)
{
    st_1f0698_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f0698_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!n)
        return a0;
    sub_1fbc08(a0, a0[1] + n);
    _memmove(*a0 + a0[1] - n, a1, n);
    return a0;
}
