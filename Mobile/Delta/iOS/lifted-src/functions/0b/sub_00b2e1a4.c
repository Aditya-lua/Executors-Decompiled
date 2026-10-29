/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e1a4..0xb2e21c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e1a4_0 {
    long long field_0;
    char field_8;
    char padding_9[159];
    unsigned long long field_a8;
    long long field_b0;
    long long field_b8;
    long long field_c0;
    long long field_c8;
} st_b2e1a4_0;


unsigned long long sub_b2e1a4(st_b2e1a4_0 *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a57f0c(a0->field_0);
    sub_afe028(&a0->field_8);
    sub_a6c4e8(a0->field_b0, a0->field_c0, "providers/implementations/kdfs/hmacdrbg_kdf.c", 64);
    sub_a6c4e8(a0->field_b8, a0->field_c8, "providers/implementations/kdfs/hmacdrbg_kdf.c", 65);
    v2 = sub_a66ec0(a0, 216);
    a0->field_a8 = a0->field_a8;
    return v2;
}
