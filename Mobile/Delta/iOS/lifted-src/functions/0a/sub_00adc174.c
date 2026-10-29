/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadc174..0xadc1c0 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adc174_0 {
    char padding_0[16];
    struct st_adc174_1 *field_10;
} st_adc174_0;

typedef struct st_adc174_1 {
    long long field_0;
    long long field_8;
    long long field_10;
} st_adc174_1;

extern long long g_adc718;

void sub_adc174(st_adc174_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    long long *v8;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = &a0->field_10->field_0;
    sub_ad6958(v8[1], &g_adc718);
    sub_9ebcf4(*v8);
    sub_a7c1d0(v8[2]);
}
