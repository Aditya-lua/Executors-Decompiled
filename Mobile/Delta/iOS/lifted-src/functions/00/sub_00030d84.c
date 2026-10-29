/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30d84..0x30de8 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30d84_2 {
    struct st_30d84_1 *field_0;
    struct st_30d84_1 *field_8;
    char padding_10[7];
    struct st_30d84_1 *field_17;
} st_30d84_2;

typedef struct st_30d84_1 {
    struct st_30d84_1 *field_0;
} st_30d84_1;

typedef struct st_30d84_0 {
    char field_0;
} st_30d84_0;


void sub_30d84(st_30d84_2 *a0)
{
    st_30d84_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_30d84_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_6b08();
    if ((char)(a0->padding_10)[1] < 0)
    {
        *(char *)&a0->field_0->field_0 = 0;
        a0->field_8 = 0;
        return;
    }
    *(char *)&a0->field_0 = 0;
    (a0->padding_10)[1] = 0;
    return;
}
