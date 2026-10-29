/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04184..0xa042ac (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04184_0 {
    char padding_0[16];
    struct st_a04184_1 *field_10;
    char padding_18[40];
    struct st_a04184_1 *field_40;
} st_a04184_0;

typedef struct st_a04184_2 {
    struct st_a04184_0 *field_0;
    long long field_8;
    char padding_10[4];
    char field_14;
    char padding_15[35];
    long long field_38;
    long long field_40;
} st_a04184_2;

typedef struct st_a04184_1 {
    char field_0;
} st_a04184_1;


unsigned int sub_a04184(st_a04184_2 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned int v8;  // w8
    unsigned long long v9;  // 4102
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    do
    {
        /* unsupported instruction */;
        v8 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v9 = arm64g_calculate_condition(19, v8, 1, 0);
    if (!(v9 & 1))
    {
        /* unsupported instruction */;
    }
    else if (1 < (int)v8)
    {
        return 1;
    }
    if (!(a0->field_14 >> 2 & 1) && a0->field_0->field_10)
        a0->field_0->field_10();
    if (!a0->field_0->field_40)
    {
        sub_ad6020(a0->field_8);
        sub_a6c2e4(a0->field_38, "crypto/dso/dso_lib.c", 75);
        sub_a6c2e4(a0->field_40, "crypto/dso/dso_lib.c", 76);
        sub_a6c2e4(a0, "crypto/dso/dso_lib.c", 78);
        return 1;
    }
    a0->field_0->field_40();
}
