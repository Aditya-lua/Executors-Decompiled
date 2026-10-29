/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980d4c..0x980da4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980d4c_1 {
    unsigned long long field_0;
    long long field_8;
} st_980d4c_1;

typedef struct st_980d4c_0 {
    char padding_0[24];
    long long field_18;
} st_980d4c_0;

typedef struct st_980d4c_2 {
    char padding_0[40];
    struct st_980d4c_1 *field_28;
} st_980d4c_2;


void sub_980d4c(st_980d4c_2 *a0, st_980d4c_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a66994(a1->field_18, a0);
    sub_a66994(a0->field_28->field_8, a0);
    a0->field_28->field_0 = a0->field_28->field_0 - 1;
}
