/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac7ec..0x1ac828 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ac7ec_0 {
    char field_0;
} st_1ac7ec_0;


int sub_1ac7ec(unsigned long a0, unsigned int *a1)
{
    unsigned long v4;  // x0
    unsigned long long v5;  // 4146
    st_1ac7ec_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1ac7ec_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a1;
    v5 = arm64g_calculate_condition(1, v4 & 0xffffffff, 1, 0);
    if (!(v5 & 1))
        v4 = _shutdown(v4, 2);
    return v4;
}
