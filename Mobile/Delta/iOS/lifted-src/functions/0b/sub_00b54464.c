/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54464..0xb54500 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54464_0 {
    char padding_0[16];
    long long field_10;
    char field_18;
    char padding_19[319];
    long long field_158;
    long long field_160;
    long long field_168;
    long long field_170;
    long long field_178;
} st_b54464_0;


unsigned long long sub_b54464(st_b54464_0 *a0)
{
    unsigned long v2;  // x8
    unsigned long long v3;  // x19
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    if (!(v2 & 1))
        return 1;
    a0->field_18 = (char)v2 & 254;
    v3 = sub_a6bffc(a0->field_168, "providers/implementations/signature/sm2_sig.c", 271);
    if (v3 && sub_ac80e8(v3, a0->field_158, a0->field_170, a0->field_178, a0->field_10) && sub_a3fe10(a0->field_160, v3, a0->field_168))
        v4 = 1;
    else
        v4 = 0;
    sub_a6c2e4(v3, "providers/implementations/signature/sm2_sig.c", 277);
    return v4;
}
