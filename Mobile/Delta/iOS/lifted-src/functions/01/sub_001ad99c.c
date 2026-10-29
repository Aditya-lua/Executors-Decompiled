/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ad99c..0x1ad9ec (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ad99c_0 {
    char field_0;
} st_1ad99c_0;


int sub_1ad99c(unsigned long a0, unsigned int *a1, unsigned long a2)
{
    unsigned int v4;  // w0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4126
    st_1ad99c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ad99c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1c6fbc();
    v5 = arm64g_calculate_condition(1, v4, 1, 0);
    if (!(v5 & 1))
        *a1 = v4;
    v6 = arm64g_calculate_condition(1, v4, 1, 0);
    return !(v6 & 1);
}
