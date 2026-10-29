/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb665d8..0xb66664 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b665d8_1 {
    long long field_0;
} st_b665d8_1;

typedef struct st_b665d8_0 {
    unsigned long long field_0;
    struct st_b665d8_1 *field_8;
    unsigned long long field_10;
    char padding_18[72];
    long long field_60;
    long long field_68;
} st_b665d8_0;


void sub_b665d8(st_b665d8_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x22
    unsigned long v13;  // x22
    unsigned long v14;  // x22
    unsigned long long v15;  // 4102
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a0->field_60 >= 1)
        _free(a0->field_68);
    v12 = 0;
    while (1)
    {
        v13 = v12;
        if (v13 == a0->field_10)
            break;
        v14 = v13 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v15 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v12 = v14;
        if (!(v15 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&a0->field_8[v13]);
            v12 = v14;
        }
    }
    if (a0->field_0)
        _free(a0->field_8);
}
