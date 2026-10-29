/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3140c..0xa31468 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3140c_0 {
    char padding_0[16];
    long long field_10;
} st_a3140c_0;

typedef struct st_a3140c_2 {
    unsigned long long field_0;
} st_a3140c_2;

typedef struct st_a3140c_1 {
    char padding_0[112];
    struct st_a3140c_2 *field_70;
} st_a3140c_1;


void sub_a3140c(unsigned long a0, st_a3140c_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_a3140c_1 *v12;  // x0
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
    v12 = sub_a2d030(a1->field_10);
    sub_9f2aec(a1->field_10);
    v12->field_70();
}
