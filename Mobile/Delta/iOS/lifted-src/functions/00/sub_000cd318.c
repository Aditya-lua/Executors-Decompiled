/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd318..0xcd39c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd318_1 {
    char padding_0[128];
    struct st_cd318_1 *field_80;
    unsigned long long field_88;
    unsigned long long field_90;
    char padding_98[16];
    unsigned long long field_a8;
} st_cd318_1;

typedef struct st_cd318_0 {
    char field_0;
} st_cd318_0;


st_cd318_1 * sub_cd318(st_cd318_1 *a0)
{
    unsigned long v5;  // x8
    st_cd318_1 *v6;  // w0
    st_cd318_1 *v0;  // [bp-0x40]
    st_cd318_0 **v1;  // [bp-0x30], Other Possible Types: char
    st_cd318_0 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    if (!a0)
        return 0xffffff9a;
    v5 = a0->field_a8;
    a0->field_80 = 0;
    a0->field_88 = v5;
    v0 = 0;
    v6 = (st_cd318_1 *)(unsigned int)sub_cdd28();
    a0->field_90 = !v6;
    return v6;
}
