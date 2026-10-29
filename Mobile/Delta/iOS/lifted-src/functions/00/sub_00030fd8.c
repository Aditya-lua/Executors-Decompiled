/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30fd8..0x310a8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30fd8_0 {
    char padding_0[48];
    long long field_30;
    char padding_38[16];
    long long field_48;
    char padding_50[16];
    long long field_60;
    char padding_68[16];
    long long field_78;
    char padding_80[16];
    long long field_90;
    char padding_98[16];
    long long field_a8;
    char padding_b0[40];
    long long field_d8;
    char padding_e0[24];
    char field_f8;
    char padding_f9[71];
    char field_140;
    char padding_141[295];
    char field_268;
    char padding_269[39];
    long long field_290;
    char padding_298[16];
    long long field_2a8;
    char padding_2b0[16];
    long long field_2c0;
    char padding_2c8[16];
    long long field_2d8;
    char padding_2e0[112];
    long long field_350;
} st_30fd8_0;


void sub_30fd8(st_30fd8_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long *v8;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_c84c(&a0->field_30, a0->field_30);
    sub_c84c(&a0->field_48, a0->field_48);
    sub_c84c(&a0->field_60, a0->field_60);
    sub_c84c(&a0->field_78, a0->field_78);
    sub_c84c(&a0->field_90, a0->field_90);
    sub_c84c(&a0->field_d8, a0->field_d8);
    v8 = &a0->field_a8;
    sub_c84c(v8, a0->field_a8);
    sub_c84c(v8 + 61, v8[61]);
    sub_c84c(v8 + 64, v8[64]);
    sub_c84c(v8 + 67, v8[67]);
    sub_c84c(v8 + 70, v8[70]);
    sub_30788(v8 + 10, 32);
    sub_3131c(v8 + 19, 32);
    sub_2d334(v8 + 56, 32);
    sub_c84c(v8 + 0x55, v8[0x55]);
}
