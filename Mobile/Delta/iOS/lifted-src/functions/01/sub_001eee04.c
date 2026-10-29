/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eee04..0x1eee70 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eee04_0 {
    char field_0;
} st_1eee04_0;


long long * sub_1eee04(long long *a0, long long a1, unsigned long a2)
{
    long long *v4;  // x0
    st_1eee04_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1eee04_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (*a0 == a1)
        return a0;
    v4 = sub_1fb5d8();
    if (!a2)
        return v4;
    return _memmove(*a0, a1, a2 * 8);
}
