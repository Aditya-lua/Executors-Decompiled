/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4fa98..0x4fb14 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4fa98_2 {
    char padding_0[40];
    struct st_4fa98_1 *field_28;
} st_4fa98_2;

typedef struct st_4fa98_3 {
    char padding_0[64];
    unsigned long long field_40;
    unsigned long long field_48;
} st_4fa98_3;

typedef struct st_4fa98_0 {
    char field_0;
} st_4fa98_0;

typedef struct st_4fa98_1 {
    char padding_0[8];
    unsigned int field_8;
} st_4fa98_1;

extern unsigned int g_f00b40;

unsigned long long sub_4fa98(st_4fa98_3 *a0, st_4fa98_2 *a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    st_4fa98_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4fa98_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    sub_4ee84();
    v10 = 1;
    if (a1->field_28->field_8 != g_f00b40)
        v10 = 2;
    v11 = v10 + a0->field_40;
    a0->field_40 = (v11 & 0x8080808080808080) - ((v11 & 0x8080808080808080) >> 7) | v11 & 0x7f7f7f7f7f7f7f7f;
    a0->field_48 = 0;
    return 1;
}
