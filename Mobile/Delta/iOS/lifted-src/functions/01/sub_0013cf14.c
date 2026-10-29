/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13cf14..0x13cf74 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13cf14_0 {
    char field_0;
} st_13cf14_0;

extern unsigned long long g_f0f398;

int sub_13cf14(unsigned int a0, unsigned long a1)
{
    unsigned long long v6;  // 4141
    st_13cf14_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_13cf14_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x20]
    unsigned long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    v6 = arm64g_calculate_condition(2, g_f0f398, 1, 0);
    if (!(v6 & 1))
    {
        v3 = a1;
        v2 = &v3;
        a0 = std::__1::__call_once(&g_f0f398, &v2, 0x13d180);
    }
    return a0;
}
