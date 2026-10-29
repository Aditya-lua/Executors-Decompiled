/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x364dc..0x36528 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_364dc_0 {
    char field_0;
} st_364dc_0;


unsigned long long sub_364dc(long long a0, unsigned long a1, long long a2)
{
    unsigned long long v4;  // x0
    st_364dc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_364dc_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1935c();
    if (!(unsigned int)v4)
        return v4;
    return sub_1935c(a0 + 8, a2);
}
