/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3f54..0x1a3ff4 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a3f54_4 {
    char padding_0[24];
    struct st_1a3f54_5 *field_18;
} st_1a3f54_4;

typedef struct st_1a3f54_2 {
    char padding_0[40];
    struct st_1a3f54_3 *field_28;
} st_1a3f54_2;

typedef struct st_1a3f54_3 {
    unsigned long long field_0;
} st_1a3f54_3;

typedef struct st_1a3f54_5 {
    struct st_1a3f54_2 *field_0;
} st_1a3f54_5;

typedef struct st_1a3f54_1 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[48];
    unsigned long long field_50;
} st_1a3f54_1;

typedef struct st_1a3f54_0 {
    char field_0;
} st_1a3f54_0;


void sub_1a3f54(st_1a3f54_4 *a0, st_1a3f54_1 *a1)
{
    st_1a3f54_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1a3f54_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_10 == a1->field_18)
    {
        a1->field_0 = 0xfffffc1f;
        a1->field_50 = 0;
        return;
    }
    (*(long long *)(*(long long *)a0->field_18 + 40))();
}
