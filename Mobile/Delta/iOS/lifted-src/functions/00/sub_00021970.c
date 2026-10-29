/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21970..0x219bc (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_21970_0 {
    char field_0;
} st_21970_0;


long long sub_21970(long long *a0)
{
    st_21970_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_21970_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!*a0)
        return 1;
    return _strcmp(*a0) != 0;
}
