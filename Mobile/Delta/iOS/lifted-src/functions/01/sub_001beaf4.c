/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1beaf4..0x1beb44 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1beaf4_0 {
    char field_0;
} st_1beaf4_0;


void sub_1beaf4(unsigned long long *a0, unsigned long a1)
{
    unsigned long long v6;  // 4138
    st_1beaf4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1beaf4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    v6 = arm64g_calculate_condition(2, *a0, 1, 0);
    if (!(v6 & 1))
    {
        v3 = a1;
        v2 = &v3;
        std::__1::__call_once();
    }
    return;
}
