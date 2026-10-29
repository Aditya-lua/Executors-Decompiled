/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97cfd8..0x97d118 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97cfd8_1 {
    unsigned long long field_0;
    struct st_97cfd8_0 *field_8;
} st_97cfd8_1;

typedef struct st_97cfd8_0 {
    unsigned int field_0;
    char padding_4[84];
    long long field_58;
} st_97cfd8_0;


st_97cfd8_0 * sub_97cfd8(st_97cfd8_0 *a0, st_97cfd8_1 *a1, st_97cfd8_0 **a2)
{
    unsigned long long v3;  // x20
    unsigned long long v4;  // 4114
    unsigned long long v5;  // x21
    st_97cfd8_0 *v7;  // x8
    unsigned long v8;  // x8
    unsigned long long v9;  // 4109
    unsigned long long v10;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && (a0->field_0 & 0xfffffffc) == 128)
    {
        sub_ad9384(sub_c4ba8(a0->field_58));
        v3 = sub_975ff4(sub_97b868(a0->field_58));
        v4 = arm64g_calculate_condition(2, v3, 1, 0);
        if (v4 & 1)
        {
            sub_ad93b4(sub_c4ba8(a0->field_58));
            *(unsigned int *)a2 = 1;
            a1->field_0 = 1000000;
            *(unsigned int *)&a1->field_8 = 0;
            return 1;
        }
        v5 = sub_97b870(a0->field_58);
        sub_ad93b4(sub_c4ba8(a0->field_58));
        v7 = v3 - v5;
        if (v3 < v5)
            v7 = 0;
        v8 = &v7[10].padding_4[35];
        v9 = arm64g_calculate_condition(50, v7, 999, 0);
        if (!(v9 & 1))
            v8 = 0xffffffffffffffff;
        v10 = (v8 >> 9) / 1953125;
        a1->field_0 = v10;
        a1->field_8 = ((unsigned int)v8 - 1000000000 * (unsigned int)v10) / 1000;
        *(unsigned int *)a2 = 0;
        return 1;
    }
    sub_97c738();
    return 0;
}
