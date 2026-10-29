/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x69028..0x690ac (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_69028_0 {
    char field_0;
} st_69028_0;

extern long long g_f011f8;

int sub_69028(long long a0)
{
    long long v4;  // x0
    long long v5;  // x0
    long long len;  // x0
    unsigned long long v7;  // 4124
    st_69028_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_69028_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_a0c8(a0 + 48);
    v5 = sub_6b08(a0 + 48);
    len = _strlen(g_f011f8);
    v7 = arm64g_calculate_condition(2, sub_6516c(v4, v5, g_f011f8, 0, len), 1, 0);
    return !(v7 & 1);
}
