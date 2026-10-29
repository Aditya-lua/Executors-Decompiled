/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb610bc..0xb611f4 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b610bc_0 {
    char padding_0[8];
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[4];
    unsigned int field_30;
    char padding_34[28];
    unsigned int field_50;
    char padding_54[4];
    unsigned int field_58;
    char padding_5c[12];
    unsigned long long field_68;
    unsigned long long field_70;
    char padding_78[24];
    unsigned long long field_90;
} st_b610bc_0;

typedef struct st_b610bc_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[20];
    unsigned int field_28;
    char padding_2c[4];
    unsigned int field_30;
    char padding_34[4];
    struct st_b610bc_0 *field_38;
    char padding_40[32];
    unsigned long long field_60;
} st_b610bc_1;


unsigned int sub_b610bc(st_b610bc_1 *a0)
{
    unsigned long v4;  // x9
    st_b610bc_0 *v0;  // [bp-0x28]
    unsigned int v1;  // [bp-0x14]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (sub_b611f4(a0))
    {
        v1 = 0xfffffffe;
        return v1;
    }
    v0 = a0->field_38;
    *(unsigned long long *)&v0->field_28 = 0;
    *(unsigned long long *)&a0->field_28 = 0;
    *(unsigned long long *)&a0->field_10 = 0;
    *(unsigned long long *)&a0->field_30 = 0;
    if (v0->field_10)
        a0->field_60 = v0->field_10 & 1;
    v0->field_8 = 16180;
    v0->field_c = 0;
    v0->field_14 = 0;
    v0->field_18 = 0xffffffff;
    v0->field_1c = 0x8000;
    *(unsigned long long *)&v0->field_30 = 0;
    *(unsigned long long *)&v0->field_50 = 0;
    v0->field_58 = 0;
    v4 = v0 + 9;
    v0->field_90 = v4;
    v0->field_70 = v4;
    v0->field_68 = v4;
    *(unsigned int *)&v0[47].padding_0[0] = 1;
    *(unsigned int *)&v0[47].padding_0[4] = 0xffffffff;
    v1 = 0;
    return v1;
}
