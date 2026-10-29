/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22910..0x2295c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22910_0 {
    char field_0;
} st_22910_0;


unsigned long long sub_22910(long long a0, long long a1)
{
    unsigned long long v4;  // x0
    st_22910_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_22910_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_dd5c();
    if (!(unsigned int)v4)
        return v4;
    return sub_dd5c(a0 + 8, a1 + 8);
}
