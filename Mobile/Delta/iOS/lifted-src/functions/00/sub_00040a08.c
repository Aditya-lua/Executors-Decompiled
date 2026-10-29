/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40a08..0x40b1c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40a08_3 {
    char padding_0[144];
    struct st_40a08_2 *field_90;
} st_40a08_3;

typedef struct st_40a08_1 {
    unsigned long long field_0;
} st_40a08_1;

typedef struct st_40a08_2 {
    struct st_40a08_1 *field_0;
} st_40a08_2;

typedef struct st_40a08_0 {
    char field_0;
} st_40a08_0;


void sub_40a08(unsigned long a0, st_40a08_3 *a1)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    st_40a08_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_40a08_0 *v1;  // [bp-0x30]
    st_40a08_3 *v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    (*(long long *)*(long long *)a1->field_90)();
}
