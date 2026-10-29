/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67ee8..0x67f38 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_67ee8_0 {
    char field_0;
} st_67ee8_0;


void sub_67ee8(unsigned long long *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v7;  // 4138
    st_67ee8_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_67ee8_0 *v1;  // [bp-0x30]
    char *v2;  // [bp-0x28]
    unsigned long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    v7 = arm64g_calculate_condition(2, *a0, 1, 0);
    if (!(v7 & 1))
    {
        v3 = a1;
        v4 = a2;
        v2 = &v3;
        std::__1::__call_once();
    }
    return;
}
