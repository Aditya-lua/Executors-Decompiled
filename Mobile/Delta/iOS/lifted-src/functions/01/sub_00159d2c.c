/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x159d2c..0x159d74 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_159d2c_0 {
    char padding_0[8];
    struct st_159d2c_0 *field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
} st_159d2c_0;

typedef struct st_159d2c_1 {
    char field_0;
} st_159d2c_1;


st_159d2c_0 * sub_159d2c(st_159d2c_0 *a0)
{
    st_159d2c_0 *ptr;  // x0
    st_159d2c_1 **v0;  // [bp-0x20], Other Possible Types: char
    st_159d2c_1 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    ptr = a0;
    if (ptr->field_20)
    {
        a0->field_18 = 0;
        ptr = a0->field_8;
        if (ptr != &a0->field_20)
            ptr = _free(ptr);
    }
    return ptr;
}
