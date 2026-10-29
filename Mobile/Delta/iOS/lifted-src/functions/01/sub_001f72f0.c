/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f72f0..0x1f7364 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f72f0_0 {
    char field_0;
} st_1f72f0_0;


unsigned long long * sub_1f72f0(unsigned long long *a0, long long a1, unsigned long a2)
{
    st_1f72f0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f72f0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return a0;
    sub_1fb5d8(a0, a0[1] + a2);
    _memmove(*a0 + a0[1] * 8 - a2 * 8, a1, a2 * 8);
    return a0;
}
