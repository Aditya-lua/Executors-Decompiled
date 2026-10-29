/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a174..0xa1a254 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a174_0 {
    struct st_a1a174_1 *field_0;
    struct st_a1a174_0 *field_8;
    long long field_10;
    long long field_18;
    char padding_20[16];
    long long field_30;
    char padding_38[88];
    long long field_90;
    unsigned int field_98;
    char padding_9c[4];
    struct st_a1a174_0 *field_a0;
    char padding_a8[8];
    long long field_b0;
} st_a1a174_0;

typedef struct st_a1a174_1 {
    char padding_0[16];
    struct st_a1a174_0 *field_10;
    char padding_18[64];
    struct st_a1a174_0 *field_58;
} st_a1a174_1;


void sub_a1a174(st_a1a174_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_a1a174_0 *v8;  // x20
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
    if (a0->field_0->field_10)
        a0->field_0->field_10();
    if (a0->field_98 == 6)
    {
        sub_a1c668(a0->field_a0);
    }
    else if (a0->field_98 == 5)
    {
        sub_a224e4(a0->field_a0);
    }
    a0->field_a0 = 0;
    sub_9e6c64(a0->field_90);
    v8 = a0->field_8;
    if (v8)
    {
        if (v8->field_0->field_58)
            v8->field_0->field_58();
        sub_a6c2e4(v8, "crypto/ec/ec_lib.c", 754);
    }
    sub_9e48d4(a0->field_10);
    sub_9e48d4(a0->field_18);
    sub_a6c2e4(a0->field_30, "crypto/ec/ec_lib.c", 0x88);
    sub_a6c2e4(a0->field_b0, "crypto/ec/ec_lib.c", 137);
    sub_a6c2e4();
    return;
}
