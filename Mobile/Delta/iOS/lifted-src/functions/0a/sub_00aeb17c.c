/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb17c..0xaeb264 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aeb17c_2 {
    unsigned int field_0;
    char padding_4[4];
    struct st_aeb17c_0 *field_8;
} st_aeb17c_2;

typedef struct st_aeb17c_0 {
    struct st_aeb17c_0 *field_0;
    struct st_aeb17c_0 *field_8;
    struct st_aeb17c_0 *field_10;
} st_aeb17c_0;

typedef struct st_aeb17c_1 {
    char padding_0[248];
    struct st_aeb17c_0 *field_f8;
} st_aeb17c_1;


st_aeb17c_0 * sub_aeb17c(st_aeb17c_1 *a0, st_aeb17c_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    long long v12;  // x0
    st_aeb17c_0 *v13;  // x20
    st_aeb17c_0 *v14;  // x21
    st_aeb17c_2 *v15;  // x0
    long long v16;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a1)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a1->field_0 && a0->field_f8 && sub_9c3654())
        return 30;
    if (a1->field_10 && (v12 = sub_12738(a0), sub_9c0ffc(sub_12738(a0), a1->field_10)))
    {
LABEL_aeb1d4:
        return 31;
    }
    v13 = a1->field_8;
    if (!v13 || (int)sub_ad69e4(v13) < 1)
        return 0;
    v14 = 0;
    while (1)
    {
        v15 = sub_ad69f8(v13, v14);
        if (v15->field_0 == 4)
            break;
        v14 = (unsigned int)v14 + 1;
        if ((int)(unsigned int)v14 >= (int)sub_ad69e4(v13))
            return 0;
    }
    if (v15->field_8 && (v16 = sub_97725c(a0), sub_af1860(v15->field_8, sub_97725c(a0))))
        goto LABEL_aeb1d4;
    return 0;
}
