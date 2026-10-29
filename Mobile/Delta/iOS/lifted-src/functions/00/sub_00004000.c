/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4000..0x4048 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4000_1 {
    struct st_4000_2 *field_0;
    unsigned long long field_8;
} st_4000_1;

typedef struct st_4000_2 {
    unsigned long long field_0;
} st_4000_2;

typedef struct st_4000_0 {
    char field_0;
} st_4000_0;


st_4000_1 * sub_4000(st_4000_1 *a0)
{
    unsigned long long *v4;  // x0
    st_4000_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4000_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = operatornew(0x2008);
    a0->field_0 = v4;
    a0->field_8 = 0;
    *v4 = 0;
    return a0;
}
