/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01fd4..0xa02090 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a01fd4_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[47];
    struct st_a01fd4_0 *field_38;
    char padding_40[40];
    long long field_68;
    long long field_70;
    char padding_78[24];
    char field_90;
    char padding_91[15];
    struct st_a01fd4_0 *field_a0;
    long long field_a8;
    long long field_b0;
} st_a01fd4_0;


void sub_a01fd4(st_a01fd4_0 *a0)
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
    if (a0->field_a0 && a0->field_a0->field_38)
        a0->field_a0->field_38();
    sub_a32e7c(a0->field_a8);
    sub_a6a9e8(7, a0, &a0->field_90);
    sub_a7c1d0(a0->field_b0);
    sub_a60c38(&a0->field_8);
    sub_9e4838(a0->field_68);
    sub_9e4838(a0->field_70);
}
