/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb095a8..0xb0968c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b095a8_0 {
    char padding_0[8];
    struct st_b095a8_1 *field_8;
} st_b095a8_0;

typedef struct st_b095a8_2 {
    char padding_0[168];
    struct st_b095a8_0 *field_a8;
} st_b095a8_2;

typedef struct st_b095a8_1 {
    unsigned long long field_0;
} st_b095a8_1;

extern char g_10002b0;

void sub_b095a8(st_b095a8_2 *a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    unsigned long v0;  // [bp-0x48]
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
    v0 = *(long long *)&g_10002b0;
    a0->field_a8->field_8();
}
