/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1af75c..0x1af7b8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1af75c_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_1af75c_1;

typedef struct st_1af75c_0 {
    char field_0;
} st_1af75c_0;


long long sub_1af75c(st_1af75c_1 *a0)
{
    st_1af75c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1af75c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!sub_6b08(a0 + 1))
        return a0->field_18;
    return sub_6b08(a0 + 1);
}
