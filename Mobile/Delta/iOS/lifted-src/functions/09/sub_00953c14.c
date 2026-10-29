/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953c14..0x953c68 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953c14_1 {
    char padding_0[1264];
    struct st_953c14_0 *field_4f0;
} st_953c14_1;

typedef struct st_953c14_0 {
    char padding_0[448];
    unsigned long long field_1c0;
} st_953c14_0;

extern unsigned long long g_e4e1c1;

unsigned long long sub_953c14(st_953c14_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_4f0->field_1c0)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a7c2c0();
    v9 = a0->field_4f0->field_1c0 - v8;
    if (a0->field_4f0->field_1c0 < v8)
        v9 = 0;
    return &g_e4e1c1 > v9;
}
