/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31164..0xb311f4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b31164_0 {
    char padding_0[8];
    long long field_8;
    struct st_b31164_0 *field_10;
    long long field_18;
    struct st_b31164_0 *field_20;
    char padding_28[8];
    uint128_t field_30;
    uint128_t field_40;
    long long field_50;
} st_b31164_0;


void sub_b31164(st_b31164_0 *a0)
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
    sub_a6c2e4(a0->field_8, "providers/implementations/kdfs/scrypt.c", 83);
    sub_a3f52c(a0->field_50);
    sub_a6c2e4(a0->field_20, "providers/implementations/kdfs/scrypt.c", 94);
    a0->field_20 = 0;
    sub_a6c4e8(a0->field_10, a0->field_18, "providers/implementations/kdfs/scrypt.c", 96);
    a0->field_10 = 0;
    a0->field_30 = 0x80000000000100000;
    a0->field_40 = 0x401000000000000000000001;
    sub_a6c2e4();
    return;
}
