/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa51ef0..0xa51fd0 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a51ef0_0 {
    char padding_0[56];
    struct st_a51ef0_1 *field_38;
} st_a51ef0_0;

typedef struct st_a51ef0_1 {
    unsigned long long field_0;
} st_a51ef0_1;


void sub_a51ef0(st_a51ef0_0 **a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned int v12;  // w8
    unsigned long long v13;  // 4102
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    do
    {
        /* unsupported instruction */;
        v12 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v13 = arm64g_calculate_condition(19, v12, 1, 0);
    if (!(v13 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < (int)v12)
    {
        return;
    }
    *a0->field_38();
}
