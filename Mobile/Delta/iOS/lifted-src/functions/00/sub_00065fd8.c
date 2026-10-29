/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65fd8..0x66080 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65fd8_1 {
    char padding_0[40];
    struct st_65fd8_2 *field_28;
} st_65fd8_1;

typedef struct st_65fd8_2 {
    unsigned long long field_0;
} st_65fd8_2;

typedef struct st_65fd8_3 {
    struct st_65fd8_1 *field_0;
} st_65fd8_3;

typedef struct st_65fd8_0 {
    char field_0;
} st_65fd8_0;


void sub_65fd8(st_65fd8_3 **a0, unsigned long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_65fd8_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_65fd8_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    (*(long long *)(*(long long *)*a0 + 40))();
}
