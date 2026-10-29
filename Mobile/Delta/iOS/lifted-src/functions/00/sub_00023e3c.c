/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23e3c..0x23ea0 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23e3c_1 {
    char padding_0[8];
    long long field_8;
} st_23e3c_1;

typedef struct st_23e3c_0 {
    char field_0;
} st_23e3c_0;


long long sub_23e3c(st_23e3c_1 *a0, long long a1, long long a2)
{
    st_23e3c_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_23e3c_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x21]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (a2 == a1)
        return a1;
    sub_18018(&v2, a2, a0->field_8, a1);
    sub_c84c(a0);
    return a1;
}
