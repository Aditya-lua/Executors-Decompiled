/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20b98..0x20c34 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20b98_0 {
    char field_0;
} st_20b98_0;


long long sub_20b98(long long a0, long long a1)
{
    long long v4;  // x20
    long long v5;  // x0
    st_20b98_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_20b98_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_6b08();
    if (v4 != sub_6b08(a1))
        return 0;
    v5 = sub_a0c8(a0);
    return !_memcmp(v5, sub_a0c8(a1), v4);
}
