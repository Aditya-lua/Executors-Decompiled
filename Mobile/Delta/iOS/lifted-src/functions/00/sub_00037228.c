/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x37228..0x3729c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_37228_1 {
    long long field_0;
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_37228_1;

typedef struct st_37228_0 {
    char field_0;
} st_37228_0;


st_37228_1 * sub_37228(st_37228_1 *ptr, unsigned long long *a1, long long a2)
{
    long long v4;  // x0
    st_37228_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_37228_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(ptr, 0, 24);
    ptr->field_18 = *a1;
    if (!a2)
        return ptr;
    v4 = operatornew(a2 * 16);
    ptr->field_0 = v4;
    ptr->field_8 = a2;
    sub_36f8c(v4, a2, a1);
    return ptr;
}
