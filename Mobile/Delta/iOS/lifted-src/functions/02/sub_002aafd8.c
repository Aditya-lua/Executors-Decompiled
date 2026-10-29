/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aafd8..0x2ab044 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aafd8_1 {
    long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_2aafd8_1;

typedef struct st_2aafd8_0 {
    char field_0;
} st_2aafd8_0;


long long sub_2aafd8(st_2aafd8_1 *a0, long long a1)
{
    long long v4;  // x0
    long long v5;  // x0
    st_2aafd8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2aafd8_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_62b88(a1);
    if (a0->field_0 == a1)
        a0->field_0 = v4;
    v5 = a0->field_8;
    a0->field_10 = a0->field_10 - 1;
    sub_71e78(v5);
    return v4;
}
