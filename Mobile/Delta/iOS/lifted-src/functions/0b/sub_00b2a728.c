/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a728..0xb2a808 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a728_0 {
    char padding_0[16];
    struct st_b2a728_0 *field_10;
    unsigned int field_18;
    char padding_1c[4];
    struct st_b2a728_0 *field_20;
    unsigned int field_28;
    char padding_2c[4];
    struct st_b2a728_0 *field_30;
    unsigned int field_38;
    char padding_3c[4];
    struct st_b2a728_0 *field_40;
    unsigned int field_48;
    char padding_4c[60];
    long long field_88;
    long long field_90;
    long long field_98;
} st_b2a728_0;


void sub_b2a728(st_b2a728_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_10)
        sub_a6c4e8(a0->field_10, a0->field_18, "providers/implementations/kdfs/argon2.c", 989);
    if (a0->field_20)
        sub_a6c4e8(a0->field_20, a0->field_28, "providers/implementations/kdfs/argon2.c", 992);
    if (a0->field_30)
        sub_a6c4e8(a0->field_30, a0->field_38, "providers/implementations/kdfs/argon2.c", 995);
    if (a0->field_40)
        sub_a6c4e8(a0->field_40, a0->field_48, "providers/implementations/kdfs/argon2.c", 998);
    sub_a3f52c(a0->field_88);
    sub_a58aa4(a0->field_90);
    sub_a6c2e4(a0->field_98, "providers/implementations/kdfs/argon2.c", 1003);
    memset(a0, 0, 160);
    sub_a6c2e4();
    return;
}
