/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ea5c..0x4eb3c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ea5c_3 {
    char padding_0[40];
    struct st_4ea5c_2 *field_28;
} st_4ea5c_3;

typedef struct st_4ea5c_1 {
    unsigned long long field_0;
} st_4ea5c_1;

typedef struct st_4ea5c_2 {
    struct st_4ea5c_1 *field_0;
} st_4ea5c_2;

typedef struct st_4ea5c_0 {
    char field_0;
} st_4ea5c_0;


void sub_4ea5c(unsigned long long *a0, st_4ea5c_3 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_4ea5c_2 **v14;  // x0
    st_4ea5c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4ea5c_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    sub_4f204();
    v14 = a1->field_28;
    a0[8] = 0;
    a0[9] = 0;
    (*(long long *)*v14)();
}
