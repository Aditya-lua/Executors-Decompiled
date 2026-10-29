/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5d6b0..0xa5d764 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5d6b0_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    struct st_a5d6b0_0 *field_18;
    long long field_20;
    char padding_28[16];
    struct st_a5d6b0_0 *field_38;
    struct st_a5d6b0_0 *field_40;
    char padding_48[48];
    struct st_a5d6b0_0 *field_78;
    long long field_80;
    long long field_88;
    long long field_90;
    char padding_98[16];
    long long field_a8;
} st_a5d6b0_0;


void sub_a5d6b0(st_a5d6b0_0 *a0)
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
    if (a0->field_78 && a0->field_78->field_18)
        a0->field_78->field_18();
    sub_a5d5bc(a0);
    sub_a6c2e4(a0->field_40, "crypto/evp/pmeth_lib.c", 1521);
    sub_a6c2e4(a0->field_38, "crypto/evp/pmeth_lib.c", 1522);
    a0->field_38 = 0;
    a0->field_40 = 0;
    sub_a55830(a0->field_20);
    sub_a6c2e4(a0->field_10, "crypto/evp/pmeth_lib.c", 403);
    sub_a5a4c8(a0->field_88);
    sub_a5a4c8(a0->field_90);
    sub_a32e7c(a0->field_80);
    sub_9e48d4(a0->field_a8);
    sub_a6c2e4();
    return;
}
