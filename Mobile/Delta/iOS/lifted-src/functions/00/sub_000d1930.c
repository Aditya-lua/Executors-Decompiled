/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd1930..0xd19b4 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d1930_0 {
    char field_0;
} st_d1930_0;


long long sub_d1930(unsigned long a0, long long a1)
{
    st_d1930_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_d1930_0 *v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x30]
    char v3;  // [bp-0x28], Other Possible Types: long long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a0;
    v0 = &v1;
    memset(a0, 0, 24);
    v3 = 0;
    if (a1)
    {
        sub_2be1c(a0);
        sub_31f20(a0, a1);
    }
    v3 = 1;
    sub_cecf4(&v2);
    return a0;
}
