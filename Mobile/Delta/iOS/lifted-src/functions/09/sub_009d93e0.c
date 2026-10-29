/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d93e0..0x9d9454 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d93e0_0 {
    char padding_0[8];
    long long field_8;
} st_9d93e0_0;


unsigned long long sub_9d93e0(st_9d93e0_0 *a0)
{
    unsigned long long v2;  // w8
    unsigned long long v3;  // 4102
    unsigned long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 1;
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
    else if (1 < v2)
    {
        return 1;
    }
    v4 = sub_9d3c28(a0->field_8);
    sub_a6c2e4(a0, "crypto/bio/ossl_core_bio.c", 50);
    return v4;
}
