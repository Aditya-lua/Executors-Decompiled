/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d114..0xb3d1a8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d114_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    char field_20;
    char padding_21[23];
    long long field_38;
} st_b3d114_0;


void sub_b3d114(st_b3d114_0 *a0)
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
    sub_a6d4c0(a0->field_10, a0->field_18, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 96);
    sub_a6c2e4(a0->field_38, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 97);
    sub_afdddc(&a0->field_20);
    sub_a6c2e4();
    return;
}
