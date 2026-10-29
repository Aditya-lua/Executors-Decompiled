/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2d974..0xa2d9d0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2d974_0 {
    unsigned long long field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[8];
    struct st_a2d974_0 *field_28;
} st_a2d974_0;

extern long long g_a2c910;

void sub_a2d974(st_a2d974_0 *a0)
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
    if (a0->field_28)
        a0->field_28();
    sub_ad6958(a0->field_18, &g_a2c910);
    sub_a76d20(a0[1].padding_8);
}
