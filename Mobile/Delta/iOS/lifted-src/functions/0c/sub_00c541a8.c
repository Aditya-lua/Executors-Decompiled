/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc541a8..0xc54250 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c541a8_0 {
    char padding_0[96];
    unsigned long long field_60;
    char padding_68[80];
    unsigned long long field_b8;
    long long field_c0;
    char padding_c8[8];
    unsigned long long field_d0;
    long long field_d8;
    char padding_e0[8];
    unsigned long long field_e8;
    long long field_f0;
    char padding_f8[8];
    unsigned long long field_100;
    char padding_108[104];
    long long field_170;
} st_c541a8_0;


st_c541a8_0 * sub_c541a8(st_c541a8_0 *a0)
{
    unsigned long long v2;  // 4102
    st_c541a8_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v2 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    v3 = a0;
    if (!(v2 & 1))
    {
        /* unsupported instruction */;
        v3 = sub_c53420(a0->field_170);
    }
    if (a0->field_60 == 47)
        return v3;
    if (a0->field_b8)
        v3 = _free(a0->field_c0);
    if (a0->field_d0)
        v3 = _free(a0->field_d8);
    if (a0->field_e8)
        v3 = _free(a0->field_f0);
    if (!a0->field_100)
        return v3;
    return _free();
}
