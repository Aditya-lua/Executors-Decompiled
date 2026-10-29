/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49450..0xb49498 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49450_0 {
    char padding_0[240];
    unsigned long long field_f0;
} st_b49450_0;


void sub_b49450(st_b49450_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_f0;
    sub_a66ec0(v8 + 40, 111);
    sub_a66ec0(v8 + 151, 111);
    sub_a66ec0(v8 + 262, 111);
}
