/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa52398..0xa52468 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a52398_1 {
    char padding_0[112];
    struct st_a52398_0 *field_70;
    char padding_78[40];
    struct st_a52398_2 *field_a0;
} st_a52398_1;

typedef struct st_a52398_2 {
    unsigned long long field_0;
} st_a52398_2;

typedef struct st_a52398_0 {
    struct st_a52398_0 *field_0;
} st_a52398_0;

extern char g_10002b0;

void sub_a52398(st_a52398_1 **a0)
{
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_a52398_1 *v15;  // x8
    char v0;  // [bp-0x84]
    st_a52398_0 **v1;  // [bp-0x80]
    st_a52398_0 **v2;  // [bp-0x70]
    st_a52398_0 **v3;  // [bp-0x60]
    st_a52398_0 **v4;  // [bp-0x50]
    st_a52398_0 **v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v7 = v12;
    v8 = v13;
    v9 = &v11;
    v10 = v14;
    v6 = *(long long *)&g_10002b0;
    v4 = (st_a52398_0 **)0;
    v5 = (st_a52398_0 **)0;
    v2 = (st_a52398_0 **)0;
    v3 = (st_a52398_0 **)0;
    v1 = (st_a52398_0 **)0;
    sub_a6ffac("state", &v0);
    v15 = *a0;
    if (!v15->field_70)
        v15->field_a0();
    v15->field_70();
}
