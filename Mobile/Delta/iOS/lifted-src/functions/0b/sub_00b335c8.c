/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb335c8..0xb33650 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b335c8_0 {
    unsigned long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    long long field_30;
} st_b335c8_0;


void sub_b335c8(st_b335c8_0 *ptr)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!ptr)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_a57f0c(ptr->field_8);
    sub_a57f0c(ptr->field_10);
    sub_a6c4e8(ptr->field_18, ptr->field_20, "providers/implementations/kdfs/tls1_prf.c", 144);
    sub_a6c4e8(ptr->field_28, ptr->field_30, "providers/implementations/kdfs/tls1_prf.c", 145);
    memset(ptr, 0, 56);
    ptr->field_0 = ptr->field_0;
}
