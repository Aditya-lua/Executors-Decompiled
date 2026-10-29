/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f8928..0x1f8994 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f8928_0 {
    char field_0;
} st_1f8928_0;


unsigned long long sub_1f8928(unsigned long long *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v4;  // x0
    st_1f8928_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f8928_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1fb614();
    if (a0[1] <= a1)
        return v4;
    return _memmove(*a0 + a1 * 4 + a2 * 4, *a0 + a1 * 4, (a0[1] - a1) * 4);
}
