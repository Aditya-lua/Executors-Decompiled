/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47918..0xb47970 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b47918_0 {
    char padding_0[120];
    unsigned long long field_78;
} st_b47918_0;

typedef struct st_b47918_1 {
    char padding_0[240];
    struct st_b47918_0 *field_f0;
} st_b47918_1;


void sub_b47918(st_b47918_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b47918_0 *v8;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_f0;
    sub_a66ec0(&v8->padding_0[52], 32);
    sub_a66ec0(&v8->padding_0[84], 16);
    sub_a66ec0(&v8->padding_0[100], 16);
    sub_a66ec0(v8 + 1, 48);
    v8->field_78 = 0;
}
