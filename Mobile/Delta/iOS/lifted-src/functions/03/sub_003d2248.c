/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d2248..0x3d22b8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d2248_1 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[8];
    struct st_3d2248_2 *field_20;
    char padding_28[152];
    unsigned long long field_c0;
    unsigned long long field_c8;
} st_3d2248_1;

typedef struct st_3d2248_2 {
    unsigned long long field_0;
} st_3d2248_2;

typedef struct st_3d2248_0 {
    char field_0;
} st_3d2248_0;


long long sub_3d2248(st_3d2248_1 *a0)
{
    st_3d2248_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3d2248_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_10)
        return a0->field_c0 >= a0->field_c8;
    a0->field_20();
}
