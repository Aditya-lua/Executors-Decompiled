/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa224e4..0xa22560 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a224e4_0 {
    char padding_0[24];
    long long field_18;
} st_a224e4_0;


void sub_a224e4(st_a224e4_0 *a0)
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
    sub_a6c2e4(a0->field_18, "crypto/ec/ecp_nistz256.c", 1231);
    sub_a6c2e4();
    return;
}
