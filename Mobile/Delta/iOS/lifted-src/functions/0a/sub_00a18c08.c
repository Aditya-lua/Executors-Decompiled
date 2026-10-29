/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18c08..0xa18ce8 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18c08_0 {
    struct st_a18c08_0 *field_0;
    long long field_8;
    char padding_10[8];
    struct st_a18c08_0 *field_18;
    long long field_20;
    long long field_28;
    char padding_30[16];
    char field_40;
    char padding_41[23];
    long long field_58;
    char padding_60[264];
    struct st_a18c08_0 *field_168;
} st_a18c08_0;


void sub_a18c08(st_a18c08_0 *a0)
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
    if (a0->field_0 && a0->field_0->field_18)
        a0->field_0->field_18();
    sub_a32e7c(a0->field_8);
    if (a0->field_18 && a0->field_18->field_0->field_168)
        a0->field_18->field_0->field_168();
    sub_a6a9e8(8, a0, &a0->field_40);
    sub_a1a174(a0->field_18);
    sub_a1a254(a0->field_20);
    sub_9e4838(a0->field_28);
    sub_a6c2e4(a0->field_58, "crypto/ec/ec_key.c", 101);
}
