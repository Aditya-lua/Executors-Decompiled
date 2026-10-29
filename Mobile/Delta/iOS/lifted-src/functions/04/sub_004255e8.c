/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4255e8..0x42577c (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4255e8_1 {
    char padding_0[32];
    unsigned long long field_20;
} st_4255e8_1;

typedef struct st_4255e8_0 {
    char field_0;
} st_4255e8_0;

extern unsigned long long g_e80800;
extern unsigned long long g_e80808;

void sub_4255e8(st_4255e8_1 *a0)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_4255e8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4255e8_0 *v1;  // [bp-0x38]
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
    if (!a0->field_20)
        (g_e80800 - 0x443bbe00)();
    (g_e80808 - 0x3a02fd00)();
}
