/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb06638..0xb06674 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b06638_0 {
    char padding_0[128];
    struct st_b06638_0 *field_80;
} st_b06638_0;


void sub_b06638(st_b06638_0 *a0)
{
    unsigned long long v3;  // x30
    st_b06638_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return;
    v0 = &v2;
    v1 = v3;
    v4 = sub_a6dac4();
    if (!v4 || !v4->field_80)
        return;
    v4->field_80 = &v4[1].padding_0[16];
    return;
}
