/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66080..0x66100 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66080_0 {
    char field_0;
} st_66080_0;


int sub_66080(long long a0, long long a1)
{
    unsigned long long v4;  // 4112
    st_66080_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_66080_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = arm64g_calculate_condition(1, sub_66808(a0 + 8, 5) & 0xffffffff, 1, 0);
    if (v4 & 1)
        return 3;
    return sub_65dac(0, a1, sub_66808(a0 + 8, 5), a0 + 80);
}
