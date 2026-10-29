/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0439c..0xb043cc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0439c_0 {
    char padding_0[96];
    long long field_60;
} st_b0439c_0;


void sub_b0439c(st_b0439c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a97f88(&a0->padding_0[24]);
    sub_a4bbe4(a0->field_60);
    sub_a4bbe4();
    return;
}
