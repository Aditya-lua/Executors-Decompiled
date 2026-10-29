/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68d10..0xc68d5c (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68d10_0 {
    struct st_c68d10_0 *field_0;
    struct st_c68d10_0 *field_8;
    struct st_c68d10_0 *field_10;
    unsigned long long field_18;
} st_c68d10_0;

typedef struct st_c68d10_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_c68d10_0 *field_28;
} st_c68d10_1;


void sub_c68d10(st_c68d10_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_c68d10_0 *v8;  // x0
    st_c68d10_0 *v9;  // x8
    unsigned long long v10;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_28)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a6ee2c();
        if (v8)
        {
            v9 = a0->field_28;
            a0->field_28 = v8;
            v10 = a0->field_18;
            v8->field_10 = 0;
            v8->field_18 = v10;
            v8->field_0 = v9;
            v8->field_8 = 0;
        }
    }
}
