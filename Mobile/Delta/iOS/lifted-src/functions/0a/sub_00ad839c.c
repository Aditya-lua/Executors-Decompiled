/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad839c..0xad8414 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad839c_0 {
    char padding_0[96];
    struct st_ad839c_0 *field_60;
} st_ad839c_0;


void sub_ad839c(st_ad839c_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a0->field_60)
    {
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
        sub_a78ccc(a0->field_60);
    }
}
