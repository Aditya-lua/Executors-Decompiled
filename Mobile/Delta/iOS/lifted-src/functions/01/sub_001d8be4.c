/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8be4..0x1d8c2c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8be4_0 {
    char field_0;
} st_1d8be4_0;


int sub_1d8be4(void)
{
    unsigned long long v5;  // x0
    st_1d8be4_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_1d8be4_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_1da9ac();
    if (v5)
    {
        sub_1e4174();
        sub_1d6950(&v2);
        v5 = 1;
    }
    return v5;
}
