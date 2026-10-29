/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4663c..0x46684 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4663c_1 {
    char padding_0[8];
    struct st_4663c_1 *field_8;
} st_4663c_1;

typedef struct st_4663c_0 {
    char field_0;
} st_4663c_0;


st_4663c_1 * sub_4663c(long long a0, unsigned long a1)
{
    st_4663c_1 *v5;  // x0
    st_4663c_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_4663c_0 *v1;  // [bp-0x20]
    unsigned long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v5 = sub_3a7e0(a0 + 264, &v2);
    if (!v5)
        return v5;
    return (int)v5->field_8 != 0;
}
