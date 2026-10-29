/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaddb74..0xaddbd8 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_addb74_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
    long long field_10;
    long long field_18;
} st_addb74_0;

extern long long g_ae5950;

void sub_addb74(st_addb74_0 *a0)
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
    sub_9c3580(a0->field_8);
    if (!(a0->field_0 >> 2 & 1))
        sub_ad6958(a0->field_10, &g_ae5950);
    sub_ad6958(a0->field_18, sub_9c3580);
}
