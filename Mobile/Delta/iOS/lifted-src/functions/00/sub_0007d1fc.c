/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d1fc..0x7d294 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d1fc_0 {
    char field_0;
} st_7d1fc_0;


unsigned long long sub_7d1fc(long long a0, long long a1, long long a2, long long a3, long long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // 4106
    unsigned int v0;  // [bp-0x60]
    st_7d1fc_0 **v1;  // [bp-0x50], Other Possible Types: char
    st_7d1fc_0 *v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    v0 = 0;
    v5 = sub_82970();
    v6 = arm64g_calculate_condition(130, v5, 120, 0);
    if (v6 & 1)
        return v5;
    return sub_7ee8c(a0, a1, a2, a3, a4);
}
