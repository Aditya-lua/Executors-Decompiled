/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ffb3c..0x9ffbf8 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ffb3c_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[31];
    struct st_9ffb3c_0 *field_28;
    char padding_30[64];
    long long field_70;
    long long field_78;
    char padding_80[24];
    char field_98;
    char padding_99[15];
    long long field_a8;
    char padding_b0[8];
    struct st_9ffb3c_0 *field_b8;
    long long field_c0;
} st_9ffb3c_0;


void sub_9ffb3c(st_9ffb3c_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v3 = arm64g_calculate_condition(19, v2, 1, 0);
    if (!(v3 & 1))
    {
        /* unsupported instruction */;
    }
    else if ((int)v2 > 1)
    {
        return;
    }
    if (a0->field_b8 && a0->field_b8->field_28)
        a0->field_b8->field_28();
    sub_a32e7c(a0->field_a8);
    sub_a6a9e8(6, a0, &a0->field_98);
    sub_a7c1d0(a0->field_c0);
    sub_a60c38(&a0->field_8);
    sub_9e4838(a0->field_70);
    sub_9e4838(a0->field_78);
}
