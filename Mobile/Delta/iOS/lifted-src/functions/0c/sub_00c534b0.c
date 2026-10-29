/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc534b0..0xc53520 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c534b0_0 {
    unsigned long long field_0;
    char padding_8[80];
    unsigned long long field_58;
    long long field_60;
    char padding_68[8];
    unsigned long long field_70;
    long long field_78;
    char padding_80[8];
    unsigned long long field_88;
    long long field_90;
    char padding_98[8];
    unsigned long long field_a0;
} st_c534b0_0;


st_c534b0_0 * sub_c534b0(st_c534b0_0 *a0)
{
    st_c534b0_0 *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_0 == 47)
        return a0;
    v2 = a0;
    if (v2->field_58)
        v2 = _free(a0->field_60);
    if (a0->field_70)
        v2 = _free(a0->field_78);
    if (a0->field_88)
        v2 = _free(a0->field_90);
    if (!a0->field_a0)
        return v2;
    return _free();
}
