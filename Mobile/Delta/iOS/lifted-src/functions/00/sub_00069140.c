/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69140..0x691a4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69140_1 {
    struct st_69140_0 *field_0;
} st_69140_1;

typedef struct st_69140_0 {
    char field_0;
} st_69140_0;


unsigned long long sub_69140(long long a0)
{
    unsigned long long v6;  // x0
    st_69140_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_69140_0 *v1;  // [bp-0x48]
    st_69140_0 *v2;  // [bp-0x40], Other Possible Types: st_69140_1 **
    st_69140_0 **v3;  // [bp-0x38], Other Possible Types: st_69140_1 **, char
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v2 = &v3;
    v3 = &v2;
    v6 = sub_6b08();
    if (!v6)
        return v6;
    v2 = &v3;
    v3 = &v2;
    return sub_6b08(a0 + 24) != 0;
}
