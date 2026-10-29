/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ce304..0x3ce37c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ce304_0 {
    char field_0;
} st_3ce304_0;


int sub_3ce304(uint128_t *a0)
{
    unsigned int v4;  // w0
    unsigned int v5;  // w0
    unsigned long long v6;  // 4118
    st_3ce304_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3ce304_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3d706c();
    v5 = sub_3d706c(a0);
    if (v4 == 80)
    {
        v6 = arm64g_calculate_condition(145, v5 - 55, 3, 0);
        if (!(v6 & 1))
            return 1;
    }
    a0[12] = a0[13];
    return 0;
}
