/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b684c..0x1b6898 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b684c_0 {
    char field_0;
} st_1b684c_0;


int sub_1b684c(unsigned long a0, unsigned int *a1)
{
    unsigned long v4;  // x0
    unsigned long long v5;  // 4154
    st_1b684c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1b684c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a1;
    v5 = arm64g_calculate_condition(1, v4 & 0xffffffff, 1, 0);
    if (!(v5 & 1))
    {
        v4 = _close(v4);
        *a1 = 0xffffffff;
    }
    return v4;
}
