/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2134..0x9f21e0 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2134_0 {
    long long field_0;
    char field_8;
    char padding_9[31];
    char field_28;
    char padding_29[31];
    char field_48;
    char padding_49[31];
    char field_68;
    char padding_69[31];
    unsigned int field_88;
} st_9f2134_0;


unsigned long long sub_9f2134(st_9f2134_0 *a0, st_9f2134_0 *a1)
{
    unsigned long long v7;  // 4118
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long n;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = arm64g_calculate_condition(1, a1->field_88, 1, 0);
    if (v7 & 1)
        return 0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    v13 = sub_a50638(a1->field_0);
    if (!(unsigned int)v13)
        return v13;
    v14 = sub_a4de68(a0->field_0, a1->field_0);
    if (!(unsigned int)v14)
        return v14;
    n = (int)v13;
    _memcpy(&a0->field_8, &a1->field_8, n);
    _memcpy(&a0->field_28, &a1->field_28, n);
    _memcpy(&a0->field_48, &a1->field_48, n);
    _memcpy(&a0->field_68, &a1->field_68, n);
    a0->field_88 = a1->field_88;
    return 1;
}
