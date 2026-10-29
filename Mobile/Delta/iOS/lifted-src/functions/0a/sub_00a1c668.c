/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1c668..0xa1c704 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1c668_0 {
    struct st_a1c668_0 *field_0;
    struct st_a1c668_0 *field_8;
    char field_10;
    char padding_11[15];
    struct st_a1c668_0 *field_20;
} st_a1c668_0;


void sub_a1c668(st_a1c668_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    st_a1c668_0 *v4;  // x8
    st_a1c668_0 **v5;  // x20
    st_a1c668_0 **v6;  // x20
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
    v4 = a0->field_20;
    if (v4)
    {
        if (v4->field_0)
        {
            v5 = &v4->field_8;
            do
            {
                v6 = v5;
                sub_a1a254();
                v5 = v6 + 1;
            } while (*v6);
            v4 = a0->field_20;
        }
        sub_a6c2e4(v4, "crypto/ec/ec_mult.c", 98);
    }
    sub_a6c2e4();
    return;
}
