/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7280..0x1f72f0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7280_0 {
    char field_0;
} st_1f7280_0;


long long * sub_1f7280(long long *a0, long long *a1)
{
    st_1f7280_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1f7280_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (*a0 == *a1)
        return a0;
    sub_1fb5d8(a0, a1[1]);
    if (!a1[1])
        return a0;
    _memmove(*a0, *a1, a1[1] * 8);
    return a0;
}
