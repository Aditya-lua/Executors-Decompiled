/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ee86c..0x1ee8d0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ee86c_1 {
    long long field_0;
    unsigned long long field_8;
} st_1ee86c_1;

typedef struct st_1ee86c_0 {
    char field_0;
} st_1ee86c_0;


unsigned long long * sub_1ee86c(unsigned long long *a0, unsigned long a1, st_1ee86c_1 *a2)
{
    st_1ee86c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1ee86c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2->field_8)
        return a0;
    sub_1f8928();
    return _memmove(*a0 + a1 * 4, a2->field_0, a2->field_8 * 4);
}
