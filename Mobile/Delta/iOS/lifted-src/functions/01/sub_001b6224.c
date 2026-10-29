/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6224..0x1b62b8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6224_1 {
    char padding_0[28];
    unsigned int field_1c;
    char padding_20[24];
    long long field_38;
} st_1b6224_1;

typedef struct st_1b6224_0 {
    char field_0;
} st_1b6224_0;


long long sub_1b6224(st_1b6224_1 *a0, long long a1, long long a2)
{
    long long v4;  // x0
    st_1b6224_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1b6224_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = sub_1a74dc();
    if (v4 == a1)
        return a1;
    return sub_1c480c(a0, v4, a2, a0->field_38, a0->field_1c + 1, a0->field_1c + 1);
}
