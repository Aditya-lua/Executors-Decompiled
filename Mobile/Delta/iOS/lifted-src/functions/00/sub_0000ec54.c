/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xec54..0xeccc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ec54_1 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    long long field_18;
    long long field_20;
} st_ec54_1;

typedef struct st_ec54_0 {
    char field_0;
} st_ec54_0;


st_ec54_1 * sub_ec54(st_ec54_1 *a0, unsigned long a1, unsigned long a2, long long a3)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x9
    st_ec54_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_ec54_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_18 = 0;
    a0->field_20 = a3;
    if (a1)
        v4 = sub_12a38(a3, a1);
    else
        v4 = 0;
    v5 = v4 + a2 * 8;
    a0->field_0 = v4;
    a0->field_8 = v5;
    a0->field_10 = v5;
    a0->field_18 = v4 + a1 * 8;
    return a0;
}
