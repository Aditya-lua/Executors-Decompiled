/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc09b4..0xc0a60 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c09b4_0 {
    char field_0;
} st_c09b4_0;


unsigned long long sub_c09b4(unsigned long a0, long long a1, long long a2, unsigned long a3, unsigned long long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // 4106
    st_c09b4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_c09b4_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_c4714();
    v5 = arm64g_calculate_condition(130, v4, 120, 0);
    if (v5 & 1)
    {
        return v4;
    }
    else if (a4 > v4)
    {
        return sub_c41bc(a1, a2, a3 + v4);
    }
    else
    {
        return 0xffffffffffffffb8;
    }
}
