/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86ac8..0xb86bd0 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86ac8_0 {
    char padding_0[16];
    unsigned long long field_10;
    struct st_b86ac8_1 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    long long field_30;
    long long field_38;
    long long field_40;
    long long field_48;
} st_b86ac8_0;

typedef struct st_b86ac8_1 {
    long long field_0;
} st_b86ac8_1;


void sub_b86ac8(st_b86ac8_0 **a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v19;  // x22
    unsigned long long v20;  // 4102
    unsigned long v21;  // x22
    long long v22;  // x22
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_b86ac8_0 *v16;  // x19
    unsigned long long v17;  // x22
    unsigned long v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = *a0;
    if (v16->field_40 >= 1)
        _free(v16->field_48);
    v17 = 0;
    while (1)
    {
        v18 = v17;
        if (v18 == v16->field_20)
            break;
        v19 = v18 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v20 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v17 = v19;
        if (!(v20 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&v16->field_18[v18]);
            v17 = v19;
        }
    }
    if (v16->field_10)
        _free(v16->field_18);
    v21 = v16->field_38 + 1;
    while (1)
    {
        v22 = v21 - 1;
        if (v21 == 1)
            break;
        sub_b7854c();
        v21 = v22;
    }
    if (v16->field_28)
        _free(v16->field_30);
    _free();
    return;
}
