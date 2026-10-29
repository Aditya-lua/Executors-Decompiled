/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e524..0x1e5a4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e524_2 {
    struct st_1e524_0 *field_0;
    char padding_8[16];
    struct st_1e524_2 *field_18;
} st_1e524_2;

typedef struct st_1e524_0 {
    char padding_0[16];
    struct st_1e524_1 *field_10;
    struct st_1e524_1 *field_18;
} st_1e524_0;

typedef struct st_1e524_1 {
    unsigned long long field_0;
} st_1e524_1;


void sub_1e524(st_1e524_2 *a0, st_1e524_2 *a1)
{
    st_1e524_2 *v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = a1->field_18;
    if (!v5)
    {
        a0->field_18 = 0;
        return;
    }
    v0 = v6;
    v1 = v7;
    v2 = &v4;
    v3 = v8;
    if (v5 == a1)
    {
        a0->field_18 = a0;
        a1->field_18->field_0->field_18();
    }
    v5->field_0->field_10();
}
