/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c1c94..0x1c1ccc (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c1c94_1 {
    char padding_0[16];
    long long field_10;
} st_1c1c94_1;

typedef struct st_1c1c94_0 {
    char field_0;
} st_1c1c94_0;


long long sub_1c1c94(st_1c1c94_1 *a0)
{
    st_1c1c94_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1c1c94_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    return (int)sub_95fa60(a0->field_10) > 0;
}
