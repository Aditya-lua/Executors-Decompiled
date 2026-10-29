/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x972a64..0x972ad8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_972a64_0 {
    char field_0;
    char padding_1[4];
    char field_5;
    char padding_6[10];
    char field_10;
    char padding_11[55];
    unsigned long long field_48;
} st_972a64_0;


st_972a64_0 * sub_972a64(st_972a64_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_972a64_0 *v12;  // x0
    unsigned long v13;  // x9
    unsigned long long v14;  // x8
    unsigned long long i;  // x21
    unsigned long long v16;  // 4119
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_10)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    a0->field_10 = 0;
    v12 = a0;
    if (v12->field_0 >> 1 & 1)
    {
        v12 = sub_9721c8(a0, 10);
        v13 = a0->field_5;
        v14 = a0->field_48 * 32;
        i = v14 + v13 * 4;
        v16 = arm64g_calculate_condition(2, v14, v13 * 4, 0);
        if (!(v16 & 1))
        {
            do
            {
                v17 = i;
                v12 = sub_972574(a0, "    ");
                i = v17 - 1;
            } while (i);
        }
    }
    return v12;
}
