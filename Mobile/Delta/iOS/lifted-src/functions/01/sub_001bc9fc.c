/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc9fc..0x1bca84 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc9fc_0 {
    char field_0;
} st_1bc9fc_0;


unsigned long long sub_1bc9fc(long long a0)
{
    unsigned long long v6;  // x0
    long long v7;  // x0
    unsigned long long v8;  // x0
    st_1bc9fc_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1bc9fc_0 *v1;  // [bp-0x48]
    st_1bc9fc_0 **v2;  // [bp-0x40], Other Possible Types: char
    char *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v6 = sub_6b08();
    if (!v6)
        return v6;
    v7 = sub_a0c8(a0);
    v8 = sub_a0c8(a0);
    return sub_1b7348(v7, v8 + sub_6b08(a0), &v3, &v2);
}
