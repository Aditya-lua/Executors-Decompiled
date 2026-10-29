/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a74f8..0x2a753c (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a74f8_0 {
    char field_0;
} st_2a74f8_0;


unsigned long long sub_2a74f8(st_2a74f8_0 **a0)
{
    char *v2;  // x9
    unsigned long long v3;  // x8
    st_2a74f8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2a74f8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a0;
    if (v2 == a0[1])
        return 0xffffffff;
    v3 = *v2;
    *a0 = v2 + 1;
    return v3;
}
