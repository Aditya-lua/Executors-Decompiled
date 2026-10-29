/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2df7c..0xb2e00c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2df7c_0 {
    long long field_0;
    char field_8;
    char padding_9[159];
    unsigned long long field_a8;
    long long field_b0;
    long long field_b8;
    long long field_c0;
    long long field_c8;
} st_b2df7c_0;


void sub_b2df7c(st_b2df7c_0 *a0)
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

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_a57f0c(a0->field_0);
    sub_afe028(&a0->field_8);
    sub_a6c4e8(a0->field_b0, a0->field_c0, "providers/implementations/kdfs/hmacdrbg_kdf.c", 64);
    sub_a6c4e8(a0->field_b8, a0->field_c8, "providers/implementations/kdfs/hmacdrbg_kdf.c", 65);
    sub_a66ec0(a0, 216);
    a0->field_a8 = a0->field_a8;
}
