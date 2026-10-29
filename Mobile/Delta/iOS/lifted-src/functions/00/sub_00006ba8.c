/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ba8..0x6c54 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ba8_0 {
    char padding_0[384];
    struct st_6ba8_1 *field_180;
} st_6ba8_0;

typedef struct st_6ba8_1 {
    unsigned long long field_0;
} st_6ba8_1;


void sub_6ba8(unsigned long a0, st_6ba8_0 **a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_6ba8_0 **v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v0 = a1;
    *a1->field_180();
}
