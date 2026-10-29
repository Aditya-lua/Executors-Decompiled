/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb509b4..0xb50a70 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b509b4_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char padding_18[8];
    long long field_20;
    long long field_28;
    char padding_30[64];
    long long field_70;
    char padding_78[64];
    long long field_b8;
    char padding_c0[8];
    struct st_b509b4_0 *field_c8;
} st_b509b4_0;


void sub_b509b4(st_b509b4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w0
    st_b509b4_0 *v9;  // x0
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
    sub_a3f73c(a0->field_28);
    sub_a3f52c(a0->field_20);
    sub_a3f52c(a0->field_70);
    sub_a6c2e4(a0->field_b8, "providers/implementations/signature/rsa_sig.c", 1344);
    sub_a6c2e4(a0->field_8, "providers/implementations/signature/rsa_sig.c", 1345);
    if (a0->field_c8)
    {
        v8 = sub_aafbcc(a0->field_10);
        sub_a66ec0(a0->field_c8, v8);
        v9 = a0->field_c8;
    }
    else
    {
        v9 = 0;
    }
    sub_a6c2e4(v9, "providers/implementations/signature/rsa_sig.c", 628);
    a0->field_c8 = 0;
    sub_ab1360(a0->field_10);
}
