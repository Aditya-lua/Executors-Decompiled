/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5130..0xaf51d0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af5130_0 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_af5130_0 *field_20;
    char padding_28[96];
    struct st_af5130_0 *field_88;
    char padding_90[8];
    struct st_af5130_0 *field_98;
    struct st_af5130_0 *field_a0;
    char padding_a8[48];
    struct st_af5130_0 *field_d8;
    struct st_af5130_0 *field_e0;
    struct st_af5130_0 *field_e8;
    char padding_f0[32];
    long long field_110;
} st_af5130_0;


void sub_af5130(st_af5130_0 *a0)
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
    if (a0->field_88)
        a0->field_88();
    if (a0->field_20)
    {
        if (!a0->field_d8)
            sub_af82fc();
        a0->field_20 = 0;
    }
    sub_ade218(a0->field_a0);
    a0->field_a0 = 0;
    sub_aded90(a0->field_98);
    a0->field_98 = 0;
    sub_a6a9e8(5, a0, &a0->field_e0);
    a0->field_e0 = 0;
    a0->field_e8 = 0;
    sub_a6c2e4(a0->field_110, "crypto/x509/x509_vfy.c", 2499);
    sub_a6c2e4();
    return;
}
