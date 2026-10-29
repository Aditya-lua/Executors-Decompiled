/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b52a0..0x1b5334 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b52a0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_1b52a0_1;

typedef struct st_1b52a0_3 {
    struct st_1b52a0_1 *field_0;
    struct st_1b52a0_1 *field_8;
    unsigned int field_10;
} st_1b52a0_3;

typedef struct st_1b52a0_0 {
    struct st_1b52a0_1 *field_0;
    struct st_1b52a0_1 *field_8;
    struct st_1b52a0_1 *field_10;
    struct st_1b52a0_1 *field_18;
    unsigned int field_20;
} st_1b52a0_0;

typedef struct st_1b52a0_2 {
    char field_0;
} st_1b52a0_2;


float sub_1b52a0(st_1b52a0_0 *a0, st_1b52a0_0 *a1)
{
    unsigned long long *v4;  // x8
    unsigned long long *v5;  // x10
    unsigned long long *v6;  // x10
    unsigned int v7;  // s0
    unsigned long long *v8;  // x8
    st_1b52a0_3 *v9;  // x19
    unsigned long long idx;  // x0
    st_1b52a0_2 **v0;  // [bp-0x40], Other Possible Types: char
    st_1b52a0_2 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v4 = &a1->field_0->field_0;
    v5 = &a1->field_8->field_0;
    a1->field_0 = 0;
    a0->field_0 = v4;
    a0->field_8 = v5;
    a1->field_8 = 0;
    v6 = &a1->field_18->field_0;
    v7 = a1->field_20;
    v8 = &a1->field_10->field_0;
    v9 = &a1->field_10;
    v0 = &v1;
    a0->field_10 = v8;
    a0->field_18 = v6;
    a0->field_20 = v7;
    if (!v6)
        return v7;
    idx = sub_10c04(v8[1], a0->field_8);
    (&a0->field_0->field_0)[idx] = &a0->field_10;
    v9->field_0 = 0;
    v9->field_8 = 0;
    return v7;
}
