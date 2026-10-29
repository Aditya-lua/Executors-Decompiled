/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x624a8..0x62524 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_624a8_0 {
    char field_0;
} st_624a8_0;


long long sub_624a8(long long a0, long long a1)
{
    long long v4;  // x0
    st_624a8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_624a8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_62e64();
    if (a0 + 8 != v4 && !sub_6926c(a0, a1, v4 + 32))
        return v4;
    return a0 + 8;
}
