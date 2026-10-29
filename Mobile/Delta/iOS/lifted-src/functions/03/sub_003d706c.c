/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d706c..0x3d70e0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d706c_0 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[140];
    struct st_3d706c_1 *field_c0;
    struct st_3d706c_1 *field_c8;
} st_3d706c_0;

typedef struct st_3d706c_1 {
    char field_0;
} st_3d706c_1;


long long sub_3d706c(st_3d706c_0 *a0)
{
    char *v4;  // x8
    st_3d706c_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d706c_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_c0;
    if (a0->field_c0 >= a0->field_c8)
    {
        if (a0->field_30)
        {
            sub_3ce5fc();
            v4 = a0->field_c0;
        }
        else
        {
            return 0;
        }
    }
    a0->field_c0 = v4 + 1;
    return *v4;
}
