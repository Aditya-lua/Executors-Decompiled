/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b8324..0x1b83b0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b8324_0 {
    char field_0;
} st_1b8324_0;


unsigned long long sub_1b8324(unsigned int a0)
{
    unsigned int v4;  // w8
    unsigned long long v5;  // w8
    st_1b8324_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b8324_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_58440())
        return 1;
    v4 = a0 - 33;
    if (63 >= v4 && 1 << ((char)v4 & 63) & 16140901064495871613)
        return 1;
    if (a0 == 126)
        v5 = 1;
    else
        v5 = 0;
    if (a0 != 124)
        return v5;
    return 1;
}
