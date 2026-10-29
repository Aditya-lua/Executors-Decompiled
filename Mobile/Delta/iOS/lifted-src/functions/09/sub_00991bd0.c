/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x991bd0..0x991c1c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_991bd0_1 {
    char padding_0[136];
    struct st_991bd0_0 *field_88;
} st_991bd0_1;

typedef struct st_991bd0_0 {
    char padding_0[8];
    long long field_8;
} st_991bd0_0;


st_991bd0_1 * sub_991bd0(st_991bd0_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_991bd0_1 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_88)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_991c1c();
    sub_954288(a0->field_88->field_8);
    v8 = sub_a6c2e4(a0->field_88, "ssl/record/rec_layer_d1.c", 47);
    a0->field_88 = 0;
    return v8;
}
