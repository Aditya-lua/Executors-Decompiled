/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d6c4..0x2d73c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2d6c4_0 {
    char field_0;
} st_2d6c4_0;


long long * sub_2d6c4(long long *ptr, long long a1, long long a2)
{
    long long v4;  // x0
    st_2d6c4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2d6c4_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(ptr, 0, 24);
    _memcpy(ptr + 3);
    if (!a2)
        return ptr;
    v4 = operatornew(268 * a2);
    *ptr = v4;
    ptr[1] = a2;
    sub_2e6d4(v4, a2, a1);
    return ptr;
}
