/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1657e8..0x165820 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1657e8_0 {
    char field_0;
} st_1657e8_0;


void sub_1657e8(void)
{
    unsigned long long v4;  // 4106
    st_1657e8_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1657e8_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = arm64g_calculate_condition(2, sub_167278(), 1, 0);
    if (!(v4 & 1))
        return;
    sub_165560();
}
