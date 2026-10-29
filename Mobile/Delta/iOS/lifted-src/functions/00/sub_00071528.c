/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71528..0x715b0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71528_0 {
    char field_0;
} st_71528_0;


unsigned long long sub_71528(long long *a0, long long a1)
{
    long long v4;  // x20
    long long v5;  // x0
    long long v6;  // x0
    unsigned long long v7;  // x0
    st_71528_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_71528_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_717b8(a1);
    v5 = sub_715e0(a1);
    v6 = sub_717b0(a1);
    v7 = sub_715d8(*a0, v5, v4);
    if (!(unsigned int)v7)
        return v7;
    return sub_715d8(a0[1], v6, v4);
}
