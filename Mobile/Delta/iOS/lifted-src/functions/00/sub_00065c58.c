/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65c58..0x65cc8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65c58_0 {
    char field_0;
} st_65c58_0;


long long sub_65c58(void* a0)
{
    unsigned long v4;  // x0
    unsigned long long v5;  // 4158
    unsigned long v6;  // x0
    unsigned long long v7;  // 4118
    st_65c58_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_65c58_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (int)a0[8];
    v5 = arm64g_calculate_condition(1, v4 & 0xffffffff, 1, 0);
    if (!(v5 & 1))
        _close(v4);
    v6 = (int)a0[12];
    v7 = arm64g_calculate_condition(1, v6 & 0xffffffff, 1, 0);
    if (!(v7 & 1))
        _close(v6);
    *(unsigned long *)&a0[8] = 0xffffffffffffffff;
    return sub_655e8(a0);
}
