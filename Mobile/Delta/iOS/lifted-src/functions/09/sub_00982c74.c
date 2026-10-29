/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x982c74..0x982cb8 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_982c74_0 {
    char padding_0[88];
    char field_58;
} st_982c74_0;


void sub_982c74(st_982c74_0 *a0)
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
    if (!(a0->field_58 >> 4 & 1))
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_99a5b8(&a0->padding_0[64]);
    a0->field_58 = a0->field_58 & 239;
}
