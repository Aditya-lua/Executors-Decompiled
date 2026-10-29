/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f5c4..0x3f684 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f5c4_2 {
    long long field_0;
    char padding_8[136];
    char field_90;
    char padding_91[1439];
    unsigned long long field_630;
    unsigned long long field_638;
} st_3f5c4_2;

typedef struct st_3f5c4_3 {
    char padding_0[8];
    char field_8;
    char field_9;
    char padding_a[2];
    unsigned int field_c;
    unsigned int field_10;
} st_3f5c4_3;

typedef struct st_3f5c4_0 {
    char field_0;
} st_3f5c4_0;


unsigned long long sub_3f5c4(st_3f5c4_2 *a0, unsigned long long *a1, char a2, unsigned int a3)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    st_3f5c4_3 *v17;  // x22
    unsigned long long v18;  // x0
    unsigned long long v19;  // 4118
    unsigned int v20;  // w8
    unsigned long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    st_3f5c4_0 **v2;  // [bp-0x48], Other Possible Types: char
    st_3f5c4_0 *v3;  // [bp-0x40]
    unsigned long long *v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    v3 = &v2;
    v4 = a1;
    v2 = &v3;
    if (1593 > a0->field_638 - a0->field_630)
    {
        sub_103a8(&a0->field_630, &v4);
        sub_3c0f0(&a0->field_90, &v4);
        v17 = sub_3f3c0(&a0->field_90, &v4);
        v17->field_8 = a2;
        v17->field_9 = 1;
        v18 = sub_2b4f8(a0->field_0);
        v19 = arm64g_calculate_condition(1, a3, 1, 0);
        if (v19 & 1)
            v20 = v18;
        else
            v20 = a3;
        v17->field_c = v18;
        v17->field_10 = v20;
        return v18;
    }
    v0 = *a1;
    v1 = 200;
    sub_45808(a1 + 1, "Out of local registers when trying to allocate %s: exceeded limit %d");
}
