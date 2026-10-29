/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63f48..0x64064 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63f48_1 {
    char padding_0[48];
    struct st_63f48_2 *field_30;
} st_63f48_1;

typedef struct st_63f48_2 {
    unsigned long long field_0;
} st_63f48_2;

typedef struct st_63f48_0 {
    char field_0;
} st_63f48_0;


void sub_63f48(st_63f48_1 **a0, unsigned long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_63f48_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_63f48_0 *v1;  // [bp-0x28]
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
    *a0->field_30();
}
