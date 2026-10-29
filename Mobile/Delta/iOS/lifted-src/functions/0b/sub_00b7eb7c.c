/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7eb7c..0xb7ec1c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7eb7c_0 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_b7eb7c_1 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_b7eb7c_0;

typedef struct st_b7eb7c_1 {
    long long field_0;
} st_b7eb7c_1;


void sub_b7eb7c(st_b7eb7c_0 *a0)
{
    unsigned long v2;  // x20
    unsigned long v3;  // x20
    unsigned long v4;  // x20
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_28)
        _free(a0->field_20 - (a0->field_28 * 8 + 15 & 0xfffffffffffffff8));
    v2 = 0;
    while (1)
    {
        v3 = v2;
        if (v3 == a0->field_18)
            break;
        v4 = v3 + 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        v2 = v4;
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(*(long long *)&a0->field_10[2 * v3]);
            v2 = v4;
        }
    }
    if (!a0->field_8)
        return;
    _free();
    return;
}
