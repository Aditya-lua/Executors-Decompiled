/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad9b6c..0xad9be4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad9b6c_2 {
    struct st_ad9b6c_0 *field_0;
    long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[15];
    char field_28;
    char padding_29[7];
    long long field_30;
} st_ad9b6c_2;

typedef struct st_ad9b6c_0 {
    char padding_0[56];
    struct st_ad9b6c_1 *field_38;
} st_ad9b6c_0;

typedef struct st_ad9b6c_1 {
    unsigned long long field_0;
} st_ad9b6c_1;

extern long long g_ad9be4;

void sub_ad9b6c(st_ad9b6c_2 *a0)
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
    if (a0->field_28 >> 1 & 1)
        a0->field_0->field_38();
    sub_ad6958(a0->field_8, &g_ad9be4);
    sub_a6a9e8(11, a0, &a0->field_18);
    sub_a7c1d0(a0->field_30);
}
