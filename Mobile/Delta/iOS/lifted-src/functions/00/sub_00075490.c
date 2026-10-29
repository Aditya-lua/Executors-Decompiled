/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x75490..0x75508 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_75490_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_75490_1;

typedef struct st_75490_0 {
    char field_0;
} st_75490_0;


long long sub_75490(st_75490_1 *a0, long long a1, long long a2)
{
    st_75490_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_75490_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a2 == a1)
        return a1;
    sub_6505c(a1, a2, a0->field_8 - a2);
    sub_c84c(a0, a0->field_8 + a1 - a2);
    return a1;
}
