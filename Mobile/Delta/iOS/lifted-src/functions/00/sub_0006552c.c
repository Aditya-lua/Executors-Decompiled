/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6552c..0x655b0 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6552c_1 {
    struct st_6552c_1 *field_0;
} st_6552c_1;

typedef struct st_6552c_0 {
    char field_0;
} st_6552c_0;


unsigned long long sub_6552c(long long a0, long long a1, long long a2, st_6552c_1 **a3)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4116
    st_6552c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_6552c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a3 && *a3)
        *a3 = 0;
    while (1)
    {
        v4 = _poll(a0, a1, a2);
        v5 = arm64g_calculate_condition(0x11, v4 & 0xffffffff, 1, 0);
        if (v5 & 1)
        {
            return v4;
        }
        else if (*(int *)___error() != 4)
        {
            return v4;
        }
    }
}
