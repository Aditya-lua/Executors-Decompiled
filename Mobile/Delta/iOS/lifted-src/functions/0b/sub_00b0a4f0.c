/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a4f0..0xb0a52c (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0a4f0_0 {
    char padding_0[640];
    struct st_b0a4f0_0 *field_280;
} st_b0a4f0_0;


void sub_b0a4f0(st_b0a4f0_0 *a0)
{
    unsigned long long v3;  // x30
    st_b0a4f0_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return;
    v0 = &v2;
    v1 = v3;
    v4 = sub_a6dac4();
    if (!v4 || !v4->field_280)
        return;
    v4->field_280 = &v4[1].padding_0[56];
    return;
}
