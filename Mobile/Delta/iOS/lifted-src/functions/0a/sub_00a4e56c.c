/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4e56c..0xa4e5f8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4e56c_0 {
    char padding_0[24];
    struct st_a4e56c_0 *field_18;
    char padding_20[72];
    long long field_68;
    char padding_70[8];
    long long field_78;
} st_a4e56c_0;


void sub_a4e56c(st_a4e56c_0 *a0)
{
    unsigned int v2;  // w8
    unsigned long long v3;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return;
    }
    else if ((int)a0->field_18)
    {
        return;
    }
    else
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
        else if (1 < (int)v2)
        {
            return;
        }
        sub_a6c2e4(a0->field_68, "crypto/evp/evp_enc.c", 2113);
        sub_a78ccc(a0->field_78);
        sub_a6c2e4();
        return;
    }
}
