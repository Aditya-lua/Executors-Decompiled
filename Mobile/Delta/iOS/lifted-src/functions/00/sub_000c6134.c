/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6134..0xc61c0 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6134_0 {
    char field_0;
} st_c6134_0;


unsigned long long sub_c6134(unsigned long long index)
{
    unsigned long long idx;  // x21
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    st_c6134_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_c6134_0 *v1;  // [bp-0x48]
    st_c6134_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_c6134_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (!*(long long *)(index + 30192))
        return index;
    idx = index + 0x7000;
    v7 = sub_c61c0(*(long long *)(index + 30216), *(int *)(idx + 1284));
    if (!v7)
        return v7;
    v3 = &v2;
    v2 = &v3;
    v8 = sub_c4b20(*(long long *)(index + 30184));
    *(unsigned long long *)(index + 30184) = 0;
    *(int *)(idx + 1528) = *(int *)(idx + 1284);
    *(unsigned long long *)(index + 30192) = v7;
    *(unsigned int *)(idx + 0x600) = 0xffffffff;
    return v8;
}
