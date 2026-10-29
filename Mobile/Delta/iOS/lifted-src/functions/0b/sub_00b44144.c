/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44144..0xb441a0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44144_0 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[23];
    long long field_28;
    long long field_30;
} st_b44144_0;


void sub_b44144(st_b44144_0 *a0)
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
    sub_a644c4(a0->field_8);
    sub_afe028(&a0->field_10);
    sub_a6c4e8(a0->field_28, a0->field_30, "providers/implementations/macs/hmac_prov.c", 101);
}
