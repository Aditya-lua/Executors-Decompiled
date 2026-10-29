/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd6538..0xbd6848 (784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd6538_2 {
    char padding_0[8];
    struct st_bd6538_0 *field_8;
} st_bd6538_2;

typedef struct st_bd6538_0 {
    char padding_0[24];
    struct st_bd6538_1 *field_18;
} st_bd6538_0;

typedef struct st_bd6538_1 {
    unsigned long long field_0;
} st_bd6538_1;


void sub_bd6538(unsigned long long *a0, st_bd6538_2 *a1)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v0;  // [bp-0x98]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    v0 = *a0 + 16;
    a1->field_8->field_18();
}
