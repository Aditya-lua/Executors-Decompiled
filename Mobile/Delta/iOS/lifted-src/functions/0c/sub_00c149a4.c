/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc149a4..0xc14a18 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c149a4_2 {
    struct st_c149a4_0 *field_0;
    struct st_c149a4_0 *field_8;
} st_c149a4_2;

typedef struct st_c149a4_1 {
    char padding_0[40];
    long long field_28;
    struct st_c149a4_2 *field_30;
} st_c149a4_1;

typedef struct st_c149a4_0 {
    unsigned long long field_0;
} st_c149a4_0;


void sub_c149a4(st_c149a4_1 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_c149a4_0 **v12;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_30;
    if (*v12)
        (*v12)();
    if (v12[1])
        _free(a0->field_28);
    _free();
    return;
}
