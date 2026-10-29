/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95eea4..0x95ef3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95eea4_0 {
    unsigned long long field_0;
    long long field_8;
    char padding_10[8];
    struct st_95eea4_0 *field_18;
    char padding_20[8];
    long long field_28;
} st_95eea4_0;


void sub_95eea4(st_95eea4_0 *a0)
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
    if (a0->field_18)
        a0->field_18->field_18();
    sub_a6a9e8(0, a0, a0 + 1);
    sub_95e3b8(a0->field_8);
    sub_a7c1d0(a0->field_28);
}
