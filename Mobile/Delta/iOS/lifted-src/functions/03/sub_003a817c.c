/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a817c..0x3a8204 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3a817c_0 {
    char field_0;
} st_3a817c_0;


unsigned long long sub_3a817c(unsigned int *a0)
{
    unsigned long long v4;  // 4150
    unsigned long long v5;  // x20
    unsigned int *v6;  // x19
    unsigned long long v7;  // x20
    st_3a817c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3a817c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = arm64g_calculate_condition(146, a0, 61, 0);
    if (!(v4 & 1))
        return 0;
    v5 = 0;
    v6 = a0;
    while (1)
    {
        v7 = v5;
        if (sub_3a8204(*v6))
            return v7;
        v5 = (unsigned int)v7 + 4;
        v6 += 1;
        if (v6 > a0 + 15)
            return (unsigned int)v7 + 4;
    }
}
