/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa348a4..0xa348f0 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a348a4_0 {
    char padding_0[8];
    long long field_8;
    struct st_a348a4_0 *field_10;
} st_a348a4_0;


void sub_a348a4(st_a348a4_0 *a0)
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
    sub_ad6020(a0->field_8);
    if (a0->field_10)
        sub_a32c78(a0->field_10, 0);
}
