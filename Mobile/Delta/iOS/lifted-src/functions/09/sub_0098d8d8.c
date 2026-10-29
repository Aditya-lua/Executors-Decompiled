/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98d8d8..0x98d9b4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98d8d8_2 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[16];
    long long field_b8;
    char padding_c0[40];
    struct st_98d8d8_0 *field_e8;
} st_98d8d8_2;

typedef struct st_98d8d8_0 {
    char padding_0[48];
    struct st_98d8d8_1 *field_30;
} st_98d8d8_0;

typedef struct st_98d8d8_1 {
    unsigned long long field_0;
} st_98d8d8_1;


void sub_98d8d8(st_98d8d8_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_985420(a0->field_a0, 0))
        v8 = sub_975dd0(a0->field_b8, 0);
    else
        v8 = 0xffffffffffffffff;
    if (sub_985420(a0->field_a0, 1))
    {
        v9 = sub_975dd0(a0->field_b8, 2);
        if (v8 >= v9)
            v8 = v9;
    }
    if (sub_985420(a0->field_a0, 2))
    {
        v10 = sub_975dd0(a0->field_b8, 1);
        if (v8 >= v10)
            v8 = v10;
    }
    a0->field_e8->field_30();
}
