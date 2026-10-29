/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33034..0xa330d4 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a33034_0 {
    unsigned long long field_0;
    char padding_8[80];
    struct st_a33034_0 *field_58;
} st_a33034_0;


unsigned int sub_a33034(st_a33034_0 *a0, long long a1)
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
    sub_a35504(a0);
    sub_a34c44(a0);
    if (!a0->field_58)
    {
        sub_a334a0(a0, a1);
        sub_a6a9e8(10, a0, &a0[1].padding_8[64]);
        sub_a6c2e4(a0, "crypto/engine/eng_lib.c", 100);
        return 1;
    }
    a0->field_58();
}
